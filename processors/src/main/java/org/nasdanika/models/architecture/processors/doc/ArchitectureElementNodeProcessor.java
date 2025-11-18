package org.nasdanika.models.architecture.processors.doc;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.EObjectNodeProcessor;
import org.nasdanika.models.architecture.ArchitectureElement;

public class ArchitectureElementNodeProcessor<T extends ArchitectureElement> extends EObjectNodeProcessor<T> implements ArchitectureElementNodeProcessorMixIn<T> {
	
	public ArchitectureElementNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider) {
		
		super(config, context, prototypeProvider);
	}
		
	/**
	* Suppressing default behavior, explicit specification of how to build.
	*/	
	@Override
	protected void addReferenceChildren(
		EReference eReference, 
		Collection<Label> labels, 
		Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
		ProgressMonitor progressMonitor) {
	}	
	
	@Override
	public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		super.configureLabel(source, label, progressMonitor);
		ArchitectureElementNodeProcessorMixIn.super.configureLabel(source, label, progressMonitor);
	}
	
	// Period

}
