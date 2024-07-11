/**
 */
package org.nasdanika.models.architecture.c4.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;

import org.nasdanika.drawio.model.SemanticElement;

import org.nasdanika.graph.model.Connection;
import org.nasdanika.graph.model.ConnectionSource;
import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.graph.model.DocumentedNamedConnection;
import org.nasdanika.graph.model.DocumentedNamedConnectionSource;
import org.nasdanika.graph.model.DocumentedNamedConnectionTarget;
import org.nasdanika.graph.model.DocumentedNamedGraph;
import org.nasdanika.graph.model.DocumentedNamedGraphElement;
import org.nasdanika.graph.model.Graph;
import org.nasdanika.graph.model.GraphElement;

import org.nasdanika.models.architecture.ArchitectureDescription;
import org.nasdanika.models.architecture.ArchitectureDescriptionElement;
import org.nasdanika.models.architecture.ArchitectureElement;
import org.nasdanika.models.architecture.CompositeNode;
import org.nasdanika.models.architecture.Domain;
import org.nasdanika.models.architecture.Node;
import org.nasdanika.models.architecture.RelationshipSource;
import org.nasdanika.models.architecture.RelationshipTarget;
import org.nasdanika.models.architecture.Undergoer;

import org.nasdanika.models.architecture.c4.C4Package;
import org.nasdanika.models.architecture.c4.Code;
import org.nasdanika.models.architecture.c4.Component;
import org.nasdanika.models.architecture.c4.Container;
import org.nasdanika.models.architecture.c4.Context;
import org.nasdanika.models.architecture.c4.Person;

import org.nasdanika.models.architecture.c4.Relationship;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.StringIdentity;

import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.architecture.c4.C4Package
 * @generated
 */
public class C4Switch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static C4Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4Switch() {
		if (modelPackage == null) {
			modelPackage = C4Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case C4Package.CONTEXT: {
				Context context = (Context)theEObject;
				T1 result = caseContext(context);
				if (result == null) result = caseDomain(context);
				if (result == null) result = caseArchitectureDescriptionElement(context);
				if (result == null) result = caseArchitectureDescription(context);
				if (result == null) result = caseDocumentedNamedGraphElement(context);
				if (result == null) result = caseArchitectureElement(context);
				if (result == null) result = caseUndergoer(context);
				if (result == null) result = caseDocumentedNamedGraph(context);
				if (result == null) result = caseGraphElement(context);
				if (result == null) result = caseDocumentedNamedStringIdentity(context);
				if (result == null) result = casePeriod(context);
				if (result == null) result = caseGraph(context);
				if (result == null) result = caseStringIdentity(context);
				if (result == null) result = caseSemanticElement(context);
				if (result == null) result = caseDocumentedNamedElement(context);
				if (result == null) result = caseNamedElement(context);
				if (result == null) result = caseDocumented(context);
				if (result == null) result = caseModelElement(context);
				if (result == null) result = caseMarked(context);
				if (result == null) result = caseAdaptable(context);
				if (result == null) result = caseIMarked(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.PERSON: {
				Person person = (Person)theEObject;
				T1 result = casePerson(person);
				if (result == null) result = caseNode(person);
				if (result == null) result = caseRelationshipSource(person);
				if (result == null) result = caseRelationshipTarget(person);
				if (result == null) result = caseDocumentedNamedConnectionSource(person);
				if (result == null) result = caseArchitectureDescriptionElement(person);
				if (result == null) result = caseDocumentedNamedConnectionTarget(person);
				if (result == null) result = caseDocumentedNamedGraphElement(person);
				if (result == null) result = caseConnectionSource(person);
				if (result == null) result = caseArchitectureElement(person);
				if (result == null) result = caseUndergoer(person);
				if (result == null) result = caseConnectionTarget(person);
				if (result == null) result = caseGraphElement(person);
				if (result == null) result = caseDocumentedNamedStringIdentity(person);
				if (result == null) result = casePeriod(person);
				if (result == null) result = caseStringIdentity(person);
				if (result == null) result = caseSemanticElement(person);
				if (result == null) result = caseDocumentedNamedElement(person);
				if (result == null) result = caseNamedElement(person);
				if (result == null) result = caseDocumented(person);
				if (result == null) result = caseModelElement(person);
				if (result == null) result = caseMarked(person);
				if (result == null) result = caseAdaptable(person);
				if (result == null) result = caseIMarked(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.SYSTEM: {
				org.nasdanika.models.architecture.c4.System system = (org.nasdanika.models.architecture.c4.System)theEObject;
				T1 result = caseSystem(system);
				if (result == null) result = caseCompositeNode(system);
				if (result == null) result = caseDomain(system);
				if (result == null) result = caseNode(system);
				if (result == null) result = caseArchitectureDescription(system);
				if (result == null) result = caseRelationshipSource(system);
				if (result == null) result = caseRelationshipTarget(system);
				if (result == null) result = caseArchitectureDescriptionElement(system);
				if (result == null) result = caseArchitectureElement(system);
				if (result == null) result = caseUndergoer(system);
				if (result == null) result = caseDocumentedNamedGraph(system);
				if (result == null) result = caseDocumentedNamedConnectionSource(system);
				if (result == null) result = caseDocumentedNamedConnectionTarget(system);
				if (result == null) result = caseDocumentedNamedGraphElement(system);
				if (result == null) result = caseDocumentedNamedStringIdentity(system);
				if (result == null) result = casePeriod(system);
				if (result == null) result = caseGraph(system);
				if (result == null) result = caseConnectionSource(system);
				if (result == null) result = caseConnectionTarget(system);
				if (result == null) result = caseGraphElement(system);
				if (result == null) result = caseStringIdentity(system);
				if (result == null) result = caseSemanticElement(system);
				if (result == null) result = caseDocumentedNamedElement(system);
				if (result == null) result = caseNamedElement(system);
				if (result == null) result = caseDocumented(system);
				if (result == null) result = caseModelElement(system);
				if (result == null) result = caseMarked(system);
				if (result == null) result = caseAdaptable(system);
				if (result == null) result = caseIMarked(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.CONTAINER: {
				Container container = (Container)theEObject;
				T1 result = caseContainer(container);
				if (result == null) result = caseCompositeNode(container);
				if (result == null) result = caseDomain(container);
				if (result == null) result = caseNode(container);
				if (result == null) result = caseArchitectureDescription(container);
				if (result == null) result = caseRelationshipSource(container);
				if (result == null) result = caseRelationshipTarget(container);
				if (result == null) result = caseArchitectureDescriptionElement(container);
				if (result == null) result = caseArchitectureElement(container);
				if (result == null) result = caseUndergoer(container);
				if (result == null) result = caseDocumentedNamedGraph(container);
				if (result == null) result = caseDocumentedNamedConnectionSource(container);
				if (result == null) result = caseDocumentedNamedConnectionTarget(container);
				if (result == null) result = caseDocumentedNamedGraphElement(container);
				if (result == null) result = caseDocumentedNamedStringIdentity(container);
				if (result == null) result = casePeriod(container);
				if (result == null) result = caseGraph(container);
				if (result == null) result = caseConnectionSource(container);
				if (result == null) result = caseConnectionTarget(container);
				if (result == null) result = caseGraphElement(container);
				if (result == null) result = caseStringIdentity(container);
				if (result == null) result = caseSemanticElement(container);
				if (result == null) result = caseDocumentedNamedElement(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = caseDocumented(container);
				if (result == null) result = caseModelElement(container);
				if (result == null) result = caseMarked(container);
				if (result == null) result = caseAdaptable(container);
				if (result == null) result = caseIMarked(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.COMPONENT: {
				Component component = (Component)theEObject;
				T1 result = caseComponent(component);
				if (result == null) result = caseCompositeNode(component);
				if (result == null) result = caseDomain(component);
				if (result == null) result = caseNode(component);
				if (result == null) result = caseArchitectureDescription(component);
				if (result == null) result = caseRelationshipSource(component);
				if (result == null) result = caseRelationshipTarget(component);
				if (result == null) result = caseArchitectureDescriptionElement(component);
				if (result == null) result = caseArchitectureElement(component);
				if (result == null) result = caseUndergoer(component);
				if (result == null) result = caseDocumentedNamedGraph(component);
				if (result == null) result = caseDocumentedNamedConnectionSource(component);
				if (result == null) result = caseDocumentedNamedConnectionTarget(component);
				if (result == null) result = caseDocumentedNamedGraphElement(component);
				if (result == null) result = caseDocumentedNamedStringIdentity(component);
				if (result == null) result = casePeriod(component);
				if (result == null) result = caseGraph(component);
				if (result == null) result = caseConnectionSource(component);
				if (result == null) result = caseConnectionTarget(component);
				if (result == null) result = caseGraphElement(component);
				if (result == null) result = caseStringIdentity(component);
				if (result == null) result = caseSemanticElement(component);
				if (result == null) result = caseDocumentedNamedElement(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = caseDocumented(component);
				if (result == null) result = caseModelElement(component);
				if (result == null) result = caseMarked(component);
				if (result == null) result = caseAdaptable(component);
				if (result == null) result = caseIMarked(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.CODE: {
				Code code = (Code)theEObject;
				T1 result = caseCode(code);
				if (result == null) result = caseCompositeNode(code);
				if (result == null) result = caseDomain(code);
				if (result == null) result = caseNode(code);
				if (result == null) result = caseArchitectureDescription(code);
				if (result == null) result = caseRelationshipSource(code);
				if (result == null) result = caseRelationshipTarget(code);
				if (result == null) result = caseArchitectureDescriptionElement(code);
				if (result == null) result = caseArchitectureElement(code);
				if (result == null) result = caseUndergoer(code);
				if (result == null) result = caseDocumentedNamedGraph(code);
				if (result == null) result = caseDocumentedNamedConnectionSource(code);
				if (result == null) result = caseDocumentedNamedConnectionTarget(code);
				if (result == null) result = caseDocumentedNamedGraphElement(code);
				if (result == null) result = caseDocumentedNamedStringIdentity(code);
				if (result == null) result = casePeriod(code);
				if (result == null) result = caseGraph(code);
				if (result == null) result = caseConnectionSource(code);
				if (result == null) result = caseConnectionTarget(code);
				if (result == null) result = caseGraphElement(code);
				if (result == null) result = caseStringIdentity(code);
				if (result == null) result = caseSemanticElement(code);
				if (result == null) result = caseDocumentedNamedElement(code);
				if (result == null) result = caseNamedElement(code);
				if (result == null) result = caseDocumented(code);
				if (result == null) result = caseModelElement(code);
				if (result == null) result = caseMarked(code);
				if (result == null) result = caseAdaptable(code);
				if (result == null) result = caseIMarked(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4Package.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T1 result = caseRelationship(relationship);
				if (result == null) result = caseArchitecture_Relationship(relationship);
				if (result == null) result = caseDocumentedNamedConnection(relationship);
				if (result == null) result = caseArchitectureElement(relationship);
				if (result == null) result = caseUndergoer(relationship);
				if (result == null) result = caseConnection(relationship);
				if (result == null) result = caseDocumentedNamedStringIdentity(relationship);
				if (result == null) result = casePeriod(relationship);
				if (result == null) result = caseStringIdentity(relationship);
				if (result == null) result = caseDocumentedNamedElement(relationship);
				if (result == null) result = caseNamedElement(relationship);
				if (result == null) result = caseDocumented(relationship);
				if (result == null) result = caseModelElement(relationship);
				if (result == null) result = caseMarked(relationship);
				if (result == null) result = caseAdaptable(relationship);
				if (result == null) result = caseIMarked(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSystem(org.nasdanika.models.architecture.c4.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSemanticElement(SemanticElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphElement(GraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMarked(org.nasdanika.ncore.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocumentedNamedElement(DocumentedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocumentedNamedStringIdentity(DocumentedNamedStringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Graph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocumentedNamedGraphElement(DocumentedNamedGraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArchitectureElement(ArchitectureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undergoer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undergoer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUndergoer(Undergoer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArchitectureDescriptionElement(ArchitectureDescriptionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E extends GraphElement> T1 caseGraph(Graph<E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E extends GraphElement> T1 caseDocumentedNamedGraph(DocumentedNamedGraph<E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArchitectureDescription(ArchitectureDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends Connection<?>> T1 caseConnectionSource(ConnectionSource<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Connection Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Connection Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends Connection<?>> T1 caseDocumentedNamedConnectionSource(DocumentedNamedConnectionSource<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationshipSource(RelationshipSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends Connection<?>> T1 caseConnectionTarget(ConnectionTarget<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Connection Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Connection Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends Connection<?>> T1 caseDocumentedNamedConnectionTarget(DocumentedNamedConnectionTarget<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationshipTarget(RelationshipTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositeNode(CompositeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ConnectionTarget<?>> T1 caseConnection(Connection<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ConnectionTarget<?>> T1 caseDocumentedNamedConnection(DocumentedNamedConnection<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArchitecture_Relationship(org.nasdanika.models.architecture.Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //C4Switch
