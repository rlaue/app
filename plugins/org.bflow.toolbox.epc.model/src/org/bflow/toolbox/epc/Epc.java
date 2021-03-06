/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bflow.toolbox.epc;

import org.bflow.toolbox.bflow.Connection;
import org.bflow.toolbox.bflow.Element;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Epc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bflow.toolbox.epc.Epc#getElements <em>Elements</em>}</li>
 *   <li>{@link org.bflow.toolbox.epc.Epc#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bflow.toolbox.epc.EpcPackage#getEpc()
 * @model
 * @generated
 */
public interface Epc extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.bflow.toolbox.bflow.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.bflow.toolbox.epc.EpcPackage#getEpc_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.bflow.toolbox.bflow.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.bflow.toolbox.epc.EpcPackage#getEpc_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // Epc
