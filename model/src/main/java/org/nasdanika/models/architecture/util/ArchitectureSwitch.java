/**
 */
package org.nasdanika.models.architecture.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;

import org.nasdanika.graph.model.Connection;
import org.nasdanika.graph.model.ConnectionSource;
import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.graph.model.DocumentedNamedConnection;
import org.nasdanika.graph.model.DocumentedNamedConnectionSource;
import org.nasdanika.graph.model.DocumentedNamedConnectionTarget;
import org.nasdanika.graph.model.DocumentedNamedGraph;
import org.nasdanika.graph.model.DocumentedNamedGraphElement;
import org.nasdanika.graph.model.DocumentedNamedTunnel;
import org.nasdanika.graph.model.Graph;
import org.nasdanika.graph.model.GraphElement;

import org.nasdanika.models.architecture.*;

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
 * @see org.nasdanika.models.architecture.ArchitecturePackage
 * @generated
 */
public class ArchitectureSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureSwitch() {
		if (modelPackage == null) {
			modelPackage = ArchitecturePackage.eINSTANCE;
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
			case ArchitecturePackage.ARCHITECTURE_ELEMENT: {
				ArchitectureElement architectureElement = (ArchitectureElement)theEObject;
				T1 result = caseArchitectureElement(architectureElement);
				if (result == null) result = caseDocumentedNamedElement(architectureElement);
				if (result == null) result = casePeriod(architectureElement);
				if (result == null) result = caseNamedElement(architectureElement);
				if (result == null) result = caseDocumented(architectureElement);
				if (result == null) result = caseModelElement(architectureElement);
				if (result == null) result = caseMarked(architectureElement);
				if (result == null) result = caseAdaptable(architectureElement);
				if (result == null) result = caseIMarked(architectureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T1 result = caseActor(actor);
				if (result == null) result = caseArchitectureElement(actor);
				if (result == null) result = caseStringIdentity(actor);
				if (result == null) result = caseDocumentedNamedElement(actor);
				if (result == null) result = casePeriod(actor);
				if (result == null) result = caseNamedElement(actor);
				if (result == null) result = caseDocumented(actor);
				if (result == null) result = caseModelElement(actor);
				if (result == null) result = caseMarked(actor);
				if (result == null) result = caseAdaptable(actor);
				if (result == null) result = caseIMarked(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.ROLE: {
				Role role = (Role)theEObject;
				T1 result = caseRole(role);
				if (result == null) result = caseArchitectureElement(role);
				if (result == null) result = caseStringIdentity(role);
				if (result == null) result = caseDocumentedNamedElement(role);
				if (result == null) result = casePeriod(role);
				if (result == null) result = caseNamedElement(role);
				if (result == null) result = caseDocumented(role);
				if (result == null) result = caseModelElement(role);
				if (result == null) result = caseMarked(role);
				if (result == null) result = caseAdaptable(role);
				if (result == null) result = caseIMarked(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.UNDERGOER: {
				Undergoer undergoer = (Undergoer)theEObject;
				T1 result = caseUndergoer(undergoer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.ARCHITECTURE_DESCRIPTION_ELEMENT: {
				ArchitectureDescriptionElement architectureDescriptionElement = (ArchitectureDescriptionElement)theEObject;
				T1 result = caseArchitectureDescriptionElement(architectureDescriptionElement);
				if (result == null) result = caseDocumentedNamedGraphElement(architectureDescriptionElement);
				if (result == null) result = caseArchitectureElement(architectureDescriptionElement);
				if (result == null) result = caseUndergoer(architectureDescriptionElement);
				if (result == null) result = caseGraphElement(architectureDescriptionElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(architectureDescriptionElement);
				if (result == null) result = casePeriod(architectureDescriptionElement);
				if (result == null) result = caseStringIdentity(architectureDescriptionElement);
				if (result == null) result = caseDocumentedNamedElement(architectureDescriptionElement);
				if (result == null) result = caseNamedElement(architectureDescriptionElement);
				if (result == null) result = caseDocumented(architectureDescriptionElement);
				if (result == null) result = caseModelElement(architectureDescriptionElement);
				if (result == null) result = caseMarked(architectureDescriptionElement);
				if (result == null) result = caseAdaptable(architectureDescriptionElement);
				if (result == null) result = caseIMarked(architectureDescriptionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.ARCHITECTURE_DESCRIPTION: {
				ArchitectureDescription architectureDescription = (ArchitectureDescription)theEObject;
				T1 result = caseArchitectureDescription(architectureDescription);
				if (result == null) result = caseDocumentedNamedGraph(architectureDescription);
				if (result == null) result = caseArchitectureElement(architectureDescription);
				if (result == null) result = caseGraph(architectureDescription);
				if (result == null) result = caseDocumentedNamedElement(architectureDescription);
				if (result == null) result = casePeriod(architectureDescription);
				if (result == null) result = caseNamedElement(architectureDescription);
				if (result == null) result = caseDocumented(architectureDescription);
				if (result == null) result = caseModelElement(architectureDescription);
				if (result == null) result = caseMarked(architectureDescription);
				if (result == null) result = caseAdaptable(architectureDescription);
				if (result == null) result = caseIMarked(architectureDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T1 result = caseDomain(domain);
				if (result == null) result = caseArchitectureDescriptionElement(domain);
				if (result == null) result = caseArchitectureDescription(domain);
				if (result == null) result = caseDocumentedNamedGraphElement(domain);
				if (result == null) result = caseArchitectureElement(domain);
				if (result == null) result = caseUndergoer(domain);
				if (result == null) result = caseDocumentedNamedGraph(domain);
				if (result == null) result = caseGraphElement(domain);
				if (result == null) result = caseDocumentedNamedStringIdentity(domain);
				if (result == null) result = casePeriod(domain);
				if (result == null) result = caseGraph(domain);
				if (result == null) result = caseStringIdentity(domain);
				if (result == null) result = caseDocumentedNamedElement(domain);
				if (result == null) result = caseNamedElement(domain);
				if (result == null) result = caseDocumented(domain);
				if (result == null) result = caseModelElement(domain);
				if (result == null) result = caseMarked(domain);
				if (result == null) result = caseAdaptable(domain);
				if (result == null) result = caseIMarked(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.RELATIONSHIP_TARGET: {
				RelationshipTarget relationshipTarget = (RelationshipTarget)theEObject;
				T1 result = caseRelationshipTarget(relationshipTarget);
				if (result == null) result = caseArchitectureDescriptionElement(relationshipTarget);
				if (result == null) result = caseDocumentedNamedConnectionTarget(relationshipTarget);
				if (result == null) result = caseDocumentedNamedGraphElement(relationshipTarget);
				if (result == null) result = caseArchitectureElement(relationshipTarget);
				if (result == null) result = caseUndergoer(relationshipTarget);
				if (result == null) result = caseConnectionTarget(relationshipTarget);
				if (result == null) result = caseGraphElement(relationshipTarget);
				if (result == null) result = caseDocumentedNamedStringIdentity(relationshipTarget);
				if (result == null) result = casePeriod(relationshipTarget);
				if (result == null) result = caseStringIdentity(relationshipTarget);
				if (result == null) result = caseDocumentedNamedElement(relationshipTarget);
				if (result == null) result = caseNamedElement(relationshipTarget);
				if (result == null) result = caseDocumented(relationshipTarget);
				if (result == null) result = caseModelElement(relationshipTarget);
				if (result == null) result = caseMarked(relationshipTarget);
				if (result == null) result = caseAdaptable(relationshipTarget);
				if (result == null) result = caseIMarked(relationshipTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.COMPOSITE_RELATIONSHIP_TARGET: {
				CompositeRelationshipTarget compositeRelationshipTarget = (CompositeRelationshipTarget)theEObject;
				T1 result = caseCompositeRelationshipTarget(compositeRelationshipTarget);
				if (result == null) result = caseDomain(compositeRelationshipTarget);
				if (result == null) result = caseRelationshipTarget(compositeRelationshipTarget);
				if (result == null) result = caseArchitectureDescriptionElement(compositeRelationshipTarget);
				if (result == null) result = caseArchitectureDescription(compositeRelationshipTarget);
				if (result == null) result = caseDocumentedNamedConnectionTarget(compositeRelationshipTarget);
				if (result == null) result = caseDocumentedNamedGraphElement(compositeRelationshipTarget);
				if (result == null) result = caseArchitectureElement(compositeRelationshipTarget);
				if (result == null) result = caseUndergoer(compositeRelationshipTarget);
				if (result == null) result = caseDocumentedNamedGraph(compositeRelationshipTarget);
				if (result == null) result = caseConnectionTarget(compositeRelationshipTarget);
				if (result == null) result = caseGraphElement(compositeRelationshipTarget);
				if (result == null) result = caseDocumentedNamedStringIdentity(compositeRelationshipTarget);
				if (result == null) result = casePeriod(compositeRelationshipTarget);
				if (result == null) result = caseGraph(compositeRelationshipTarget);
				if (result == null) result = caseStringIdentity(compositeRelationshipTarget);
				if (result == null) result = caseDocumentedNamedElement(compositeRelationshipTarget);
				if (result == null) result = caseNamedElement(compositeRelationshipTarget);
				if (result == null) result = caseDocumented(compositeRelationshipTarget);
				if (result == null) result = caseModelElement(compositeRelationshipTarget);
				if (result == null) result = caseMarked(compositeRelationshipTarget);
				if (result == null) result = caseAdaptable(compositeRelationshipTarget);
				if (result == null) result = caseIMarked(compositeRelationshipTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T1 result = caseRelationship(relationship);
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
			case ArchitecturePackage.RELATIONSHIP_SOURCE: {
				RelationshipSource relationshipSource = (RelationshipSource)theEObject;
				T1 result = caseRelationshipSource(relationshipSource);
				if (result == null) result = caseDocumentedNamedConnectionSource(relationshipSource);
				if (result == null) result = caseArchitectureDescriptionElement(relationshipSource);
				if (result == null) result = caseDocumentedNamedGraphElement(relationshipSource);
				if (result == null) result = caseConnectionSource(relationshipSource);
				if (result == null) result = caseArchitectureElement(relationshipSource);
				if (result == null) result = caseUndergoer(relationshipSource);
				if (result == null) result = caseGraphElement(relationshipSource);
				if (result == null) result = caseDocumentedNamedStringIdentity(relationshipSource);
				if (result == null) result = casePeriod(relationshipSource);
				if (result == null) result = caseStringIdentity(relationshipSource);
				if (result == null) result = caseDocumentedNamedElement(relationshipSource);
				if (result == null) result = caseNamedElement(relationshipSource);
				if (result == null) result = caseDocumented(relationshipSource);
				if (result == null) result = caseModelElement(relationshipSource);
				if (result == null) result = caseMarked(relationshipSource);
				if (result == null) result = caseAdaptable(relationshipSource);
				if (result == null) result = caseIMarked(relationshipSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.COMPOSITE_RELATIONSHIP_SOURCE: {
				CompositeRelationshipSource compositeRelationshipSource = (CompositeRelationshipSource)theEObject;
				T1 result = caseCompositeRelationshipSource(compositeRelationshipSource);
				if (result == null) result = caseDomain(compositeRelationshipSource);
				if (result == null) result = caseRelationshipSource(compositeRelationshipSource);
				if (result == null) result = caseArchitectureDescriptionElement(compositeRelationshipSource);
				if (result == null) result = caseArchitectureDescription(compositeRelationshipSource);
				if (result == null) result = caseDocumentedNamedConnectionSource(compositeRelationshipSource);
				if (result == null) result = caseDocumentedNamedGraphElement(compositeRelationshipSource);
				if (result == null) result = caseArchitectureElement(compositeRelationshipSource);
				if (result == null) result = caseUndergoer(compositeRelationshipSource);
				if (result == null) result = caseDocumentedNamedGraph(compositeRelationshipSource);
				if (result == null) result = caseConnectionSource(compositeRelationshipSource);
				if (result == null) result = caseGraphElement(compositeRelationshipSource);
				if (result == null) result = caseDocumentedNamedStringIdentity(compositeRelationshipSource);
				if (result == null) result = casePeriod(compositeRelationshipSource);
				if (result == null) result = caseGraph(compositeRelationshipSource);
				if (result == null) result = caseStringIdentity(compositeRelationshipSource);
				if (result == null) result = caseDocumentedNamedElement(compositeRelationshipSource);
				if (result == null) result = caseNamedElement(compositeRelationshipSource);
				if (result == null) result = caseDocumented(compositeRelationshipSource);
				if (result == null) result = caseModelElement(compositeRelationshipSource);
				if (result == null) result = caseMarked(compositeRelationshipSource);
				if (result == null) result = caseAdaptable(compositeRelationshipSource);
				if (result == null) result = caseIMarked(compositeRelationshipSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.NODE: {
				Node node = (Node)theEObject;
				T1 result = caseNode(node);
				if (result == null) result = caseRelationshipSource(node);
				if (result == null) result = caseRelationshipTarget(node);
				if (result == null) result = caseDocumentedNamedConnectionSource(node);
				if (result == null) result = caseArchitectureDescriptionElement(node);
				if (result == null) result = caseDocumentedNamedConnectionTarget(node);
				if (result == null) result = caseDocumentedNamedGraphElement(node);
				if (result == null) result = caseConnectionSource(node);
				if (result == null) result = caseArchitectureElement(node);
				if (result == null) result = caseUndergoer(node);
				if (result == null) result = caseConnectionTarget(node);
				if (result == null) result = caseGraphElement(node);
				if (result == null) result = caseDocumentedNamedStringIdentity(node);
				if (result == null) result = casePeriod(node);
				if (result == null) result = caseStringIdentity(node);
				if (result == null) result = caseDocumentedNamedElement(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseDocumented(node);
				if (result == null) result = caseModelElement(node);
				if (result == null) result = caseMarked(node);
				if (result == null) result = caseAdaptable(node);
				if (result == null) result = caseIMarked(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.COMPOSITE_NODE: {
				CompositeNode compositeNode = (CompositeNode)theEObject;
				T1 result = caseCompositeNode(compositeNode);
				if (result == null) result = caseDomain(compositeNode);
				if (result == null) result = caseNode(compositeNode);
				if (result == null) result = caseArchitectureDescription(compositeNode);
				if (result == null) result = caseRelationshipSource(compositeNode);
				if (result == null) result = caseRelationshipTarget(compositeNode);
				if (result == null) result = caseArchitectureDescriptionElement(compositeNode);
				if (result == null) result = caseArchitectureElement(compositeNode);
				if (result == null) result = caseUndergoer(compositeNode);
				if (result == null) result = caseDocumentedNamedGraph(compositeNode);
				if (result == null) result = caseDocumentedNamedConnectionSource(compositeNode);
				if (result == null) result = caseDocumentedNamedConnectionTarget(compositeNode);
				if (result == null) result = caseDocumentedNamedGraphElement(compositeNode);
				if (result == null) result = caseDocumentedNamedStringIdentity(compositeNode);
				if (result == null) result = casePeriod(compositeNode);
				if (result == null) result = caseGraph(compositeNode);
				if (result == null) result = caseConnectionSource(compositeNode);
				if (result == null) result = caseConnectionTarget(compositeNode);
				if (result == null) result = caseGraphElement(compositeNode);
				if (result == null) result = caseStringIdentity(compositeNode);
				if (result == null) result = caseDocumentedNamedElement(compositeNode);
				if (result == null) result = caseNamedElement(compositeNode);
				if (result == null) result = caseDocumented(compositeNode);
				if (result == null) result = caseModelElement(compositeNode);
				if (result == null) result = caseMarked(compositeNode);
				if (result == null) result = caseAdaptable(compositeNode);
				if (result == null) result = caseIMarked(compositeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitecturePackage.TUNNEL: {
				Tunnel tunnel = (Tunnel)theEObject;
				T1 result = caseTunnel(tunnel);
				if (result == null) result = caseDocumentedNamedTunnel(tunnel);
				if (result == null) result = caseRelationship(tunnel);
				if (result == null) result = caseModel_Tunnel(tunnel);
				if (result == null) result = caseDocumentedNamedConnection(tunnel);
				if (result == null) result = caseArchitectureElement(tunnel);
				if (result == null) result = caseUndergoer(tunnel);
				if (result == null) result = caseConnection(tunnel);
				if (result == null) result = caseDocumentedNamedStringIdentity(tunnel);
				if (result == null) result = casePeriod(tunnel);
				if (result == null) result = caseStringIdentity(tunnel);
				if (result == null) result = caseDocumentedNamedElement(tunnel);
				if (result == null) result = caseNamedElement(tunnel);
				if (result == null) result = caseDocumented(tunnel);
				if (result == null) result = caseModelElement(tunnel);
				if (result == null) result = caseMarked(tunnel);
				if (result == null) result = caseAdaptable(tunnel);
				if (result == null) result = caseIMarked(tunnel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRole(Role object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Composite Relationship Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Relationship Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositeRelationshipTarget(CompositeRelationshipTarget object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Composite Relationship Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Relationship Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositeRelationshipSource(CompositeRelationshipSource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Tunnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tunnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTunnel(Tunnel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Tunnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tunnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ConnectionTarget<?>, C extends Connection<?>> T1 caseModel_Tunnel(org.nasdanika.graph.model.Tunnel<T, C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Tunnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Tunnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ConnectionTarget<?>, C extends Connection<?>> T1 caseDocumentedNamedTunnel(DocumentedNamedTunnel<T, C> object) {
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

} //ArchitectureSwitch
