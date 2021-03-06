package org.bflow.toolbox.hive.interchange.mif.impl;

import java.util.HashMap;
import java.util.Map;

import org.bflow.toolbox.hive.interchange.mif.core.IInterchangePropertyProvider;
import org.bflow.toolbox.hive.interchange.mif.core.IModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;

/**
 * Implements {@link IModel}.
 * 
 * @author Arian Storch
 * @since 01/10/12
 * @version 02/05/13
 */
public class ModelAdapter implements IModel {
	
	/** The diagram edit part. */
	private DiagramEditPart diagramEditPart;
	
	/** The eobject. */
	private EObject eObject;
	
	/** The attribute map. */
	private Map<String, String> attributeMap;
	
	/** The property provider. */
	private IInterchangePropertyProvider propertyProvider;
	
	/**
	 * Instantiates a new model adapter.
	 *
	 * @param diagramEditPart the diagram edit part
	 * @param attributes the attributes
	 * @param propertyProvider the property provider
	 */
	public ModelAdapter(DiagramEditPart diagramEditPart, Map<String, String> attributes, IInterchangePropertyProvider propertyProvider) {
		super();
		this.diagramEditPart = diagramEditPart;
		this.eObject = diagramEditPart.resolveSemanticElement();
		this.attributeMap = (attributes == null ? new HashMap<String, String>() : attributes);
		this.propertyProvider = propertyProvider;
	}

	/* (non-Javadoc)
	 * @see org.bflow.toolbox.interchange.mif.core.IAttributeContainer#getAttributes()
	 */
	@Override
	public Map<String, String> getAttributes() {
		return attributeMap;
	}

	/* (non-Javadoc)
	 * @see org.bflow.toolbox.interchange.mif.core.IIdentifiable#getId()
	 */
	@Override
	public String getId() {
		String proxyId = EMFCoreUtil.getProxyID(eObject);
		return proxyId;
	}

	/* (non-Javadoc)
	 * @see org.bflow.toolbox.interchange.mif.core.IIdentifiable#getType()
	 */
	@Override
	public Object getType() {
		// this is a string at the moment but can change it the future
		Object obj = eObject.eClass().getInstanceTypeName(); 
		return obj;
	}
	
	/* (non-Javadoc)
	 * @see org.bflow.toolbox.interchange.mif.core.IVelocityValueProvider#get(java.lang.String)
	 */
	@Override
	public Object get(String propertyName) {
		if(propertyProvider == null) {
			return null;
		}
		
		Object value = propertyProvider.getPropertyValue(propertyName, eObject, diagramEditPart, null);
		return value;
	}

}
