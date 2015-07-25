/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bflow.toolbox.vc.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.bflow.toolbox.vc.util.VcAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VcItemProviderAdapterFactory extends VcAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VcItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bflow.toolbox.vc.ValueChain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueChainItemProvider valueChainItemProvider;

	/**
	 * This creates an adapter for a {@link org.bflow.toolbox.vc.ValueChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueChainAdapter() {
		if (valueChainItemProvider == null) {
			valueChainItemProvider = new ValueChainItemProvider(this);
		}

		return valueChainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bflow.toolbox.vc.ValueChain2} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueChain2ItemProvider valueChain2ItemProvider;

	/**
	 * This creates an adapter for a {@link org.bflow.toolbox.vc.ValueChain2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueChain2Adapter() {
		if (valueChain2ItemProvider == null) {
			valueChain2ItemProvider = new ValueChain2ItemProvider(this);
		}

		return valueChain2ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bflow.toolbox.vc.TechnicalTerm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnicalTermItemProvider technicalTermItemProvider;

	/**
	 * This creates an adapter for a {@link org.bflow.toolbox.vc.TechnicalTerm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechnicalTermAdapter() {
		if (technicalTermItemProvider == null) {
			technicalTermItemProvider = new TechnicalTermItemProvider(this);
		}

		return technicalTermItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bflow.toolbox.vc.Cluster} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterItemProvider clusterItemProvider;

	/**
	 * This creates an adapter for a {@link org.bflow.toolbox.vc.Cluster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClusterAdapter() {
		if (clusterItemProvider == null) {
			clusterItemProvider = new ClusterItemProvider(this);
		}

		return clusterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bflow.toolbox.vc.Objective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveItemProvider objectiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.bflow.toolbox.vc.Objective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectiveAdapter() {
		if (objectiveItemProvider == null) {
			objectiveItemProvider = new ObjectiveItemProvider(this);
		}

		return objectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bflow.toolbox.vc.Product} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This creates an adapter for a {@link org.bflow.toolbox.vc.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductAdapter() {
		if (productItemProvider == null) {
			productItemProvider = new ProductItemProvider(this);
		}

		return productItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bflow.toolbox.vc.PredecessorConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredecessorConnectionItemProvider predecessorConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.bflow.toolbox.vc.PredecessorConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredecessorConnectionAdapter() {
		if (predecessorConnectionItemProvider == null) {
			predecessorConnectionItemProvider = new PredecessorConnectionItemProvider(this);
		}

		return predecessorConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bflow.toolbox.vc.ProcessSuperiority} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessSuperiorityItemProvider processSuperiorityItemProvider;

	/**
	 * This creates an adapter for a {@link org.bflow.toolbox.vc.ProcessSuperiority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessSuperiorityAdapter() {
		if (processSuperiorityItemProvider == null) {
			processSuperiorityItemProvider = new ProcessSuperiorityItemProvider(this);
		}

		return processSuperiorityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bflow.toolbox.vc.Vc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VcItemProvider vcItemProvider;

	/**
	 * This creates an adapter for a {@link org.bflow.toolbox.vc.Vc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVcAdapter() {
		if (vcItemProvider == null) {
			vcItemProvider = new VcItemProvider(this);
		}

		return vcItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.bflow.toolbox.vc.Relation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationItemProvider relationItemProvider;

	/**
	 * This creates an adapter for a {@link org.bflow.toolbox.vc.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationAdapter() {
		if (relationItemProvider == null) {
			relationItemProvider = new RelationItemProvider(this);
		}

		return relationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (valueChainItemProvider != null) valueChainItemProvider.dispose();
		if (valueChain2ItemProvider != null) valueChain2ItemProvider.dispose();
		if (technicalTermItemProvider != null) technicalTermItemProvider.dispose();
		if (clusterItemProvider != null) clusterItemProvider.dispose();
		if (objectiveItemProvider != null) objectiveItemProvider.dispose();
		if (productItemProvider != null) productItemProvider.dispose();
		if (predecessorConnectionItemProvider != null) predecessorConnectionItemProvider.dispose();
		if (processSuperiorityItemProvider != null) processSuperiorityItemProvider.dispose();
		if (vcItemProvider != null) vcItemProvider.dispose();
		if (relationItemProvider != null) relationItemProvider.dispose();
	}

}