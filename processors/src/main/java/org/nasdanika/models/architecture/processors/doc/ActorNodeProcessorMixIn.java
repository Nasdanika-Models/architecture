/**
 */
package org.nasdanika.models.architecture.processors.doc;

import org.nasdanika.models.architecture.Actor;
import org.nasdanika.models.ncore.processors.doc.StringIdentityNodeProcessorMixIn;

public interface ActorNodeProcessorMixIn<T extends Actor> extends ArchitectureElementNodeProcessorMixIn<T>, StringIdentityNodeProcessorMixIn<T> {

//	EList<Role> getRoles();

} 
