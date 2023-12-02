/**
 */
package org.nasdanika.models.architecture.processors.doc;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.models.architecture.ArchitectureElement;
import org.nasdanika.models.ncore.processors.doc.DocumentedNamedElementNodeProcessorMixIn;
import org.nasdanika.models.ncore.processors.doc.PeriodNodeProcessorMixIn;

public interface ArchitectureElementNodeProcessorMixIn<T extends ArchitectureElement> extends DocumentedNamedElementNodeProcessorMixIn<T>, PeriodNodeProcessorMixIn<T> {
	
	default void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		T target = getTarget();
		String icon = target.getIcon();
		if (!Util.isBlank(icon)) {
			if (source == target && label instanceof Action) {
				String location = ((Action) label).getLocation();
				URI uri = getUri();
				if (uri != null && location != null && uri.toString().equals(location)) {
					label.setIcon(icon);
				}
			}
		}		
	}

} 
