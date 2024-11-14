package org.nasdanika.models.architecture.processors.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.ecore.graph.processors.EAttributeNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EStructuralFeatureNodeProcessorFactory;

@EClassifierNodeProcessorFactory(classifierID = ArchitecturePackage.ARCHITECTURE_ELEMENT)
public class ArchitectureElementProcessorFactory {

	private Context context;

	public ArchitectureElementProcessorFactory(Context context) {
		this.context = context;
	}
	
	@EClassifierNodeProcessorFactory(
			label = "Architecture Element",
			description = "Base class for elements of architecture",
			documentation = """
					Base class for elements of architecture. 
					"""
//			icon = "..."
	)
	public EClassNodeProcessor createEClassNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
						
		};
	}

	@EStructuralFeatureNodeProcessorFactory(
			nsURI = ArchitecturePackage.eNS_URI,
			classID = ArchitecturePackage.ARCHITECTURE_ELEMENT,
			featureID = ArchitecturePackage.ARCHITECTURE_ELEMENT__ICON,
			description = "Architecture element icon",
			documentation = """
					Architecture element icon. 
					Treated as URL if contains ``/`` or as a CSS class otherwise. 
					E.g. ``fas fa-wrench`` would be treated as a CSS class. 
					If this attribute is blank then the type icon is used. 
					For example, a generic server icon defined at the Server type can be overridden by an icon defined at a server instance (e.g. Web Server).
					"""
	)
	public EAttributeNodeProcessor createIconProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	
	
} 
