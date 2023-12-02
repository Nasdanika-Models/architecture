/**
 */
package org.nasdanika.models.architecture.processors.doc;

import org.nasdanika.models.architecture.Role;
import org.nasdanika.models.ncore.processors.doc.StringIdentityNodeProcessorMixIn;

public interface RoleNodeProcessorMixIn<T extends Role> extends ArchitectureElementNodeProcessorMixIn<T>, StringIdentityNodeProcessorMixIn<T> {

//	EList<Actor> getActors();

} 
