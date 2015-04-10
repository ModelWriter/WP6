/**
 */
package eu.modelwriter.models.concepts.util;

import eu.modelwriter.models.concepts.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see eu.modelwriter.models.concepts.ConceptsPackage
 * @generated
 */
public class ConceptsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConceptsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptsSwitch() {
		if (modelPackage == null) {
			modelPackage = ConceptsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConceptsPackage.CONCEPTS_ROOT: {
				ConceptsRoot conceptsRoot = (ConceptsRoot)theEObject;
				T result = caseConceptsRoot(conceptsRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER: {
				JavaConceptsContainer javaConceptsContainer = (JavaConceptsContainer)theEObject;
				T result = caseJavaConceptsContainer(javaConceptsContainer);
				if (result == null) result = caseNamedElement(javaConceptsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.RESOURCES_CONCEPTS: {
				resourcesConcepts resourcesConcepts = (resourcesConcepts)theEObject;
				T result = caseresourcesConcepts(resourcesConcepts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.CONCEPT: {
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = caseNamedElement(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.CONTEXT_PACKAGE: {
				ContextPackage contextPackage = (ContextPackage)theEObject;
				T result = caseContextPackage(contextPackage);
				if (result == null) result = caseNamedElement(contextPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.CONCEPT_CLASS: {
				ConceptClass conceptClass = (ConceptClass)theEObject;
				T result = caseConceptClass(conceptClass);
				if (result == null) result = caseConcept(conceptClass);
				if (result == null) result = caseNamedElement(conceptClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.CONCEPT_VARIABLE: {
				ConceptVariable conceptVariable = (ConceptVariable)theEObject;
				T result = caseConceptVariable(conceptVariable);
				if (result == null) result = caseDerivedConcept(conceptVariable);
				if (result == null) result = caseConcept(conceptVariable);
				if (result == null) result = caseNamedElement(conceptVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.CONCEPT_METHOD: {
				ConceptMethod conceptMethod = (ConceptMethod)theEObject;
				T result = caseConceptMethod(conceptMethod);
				if (result == null) result = caseDerivedConcept(conceptMethod);
				if (result == null) result = caseConcept(conceptMethod);
				if (result == null) result = caseNamedElement(conceptMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.CONCEPT_PARAMETER: {
				ConceptParameter conceptParameter = (ConceptParameter)theEObject;
				T result = caseConceptParameter(conceptParameter);
				if (result == null) result = caseDerivedConcept(conceptParameter);
				if (result == null) result = caseConcept(conceptParameter);
				if (result == null) result = caseNamedElement(conceptParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConceptsPackage.DERIVED_CONCEPT: {
				DerivedConcept derivedConcept = (DerivedConcept)theEObject;
				T result = caseDerivedConcept(derivedConcept);
				if (result == null) result = caseConcept(derivedConcept);
				if (result == null) result = caseNamedElement(derivedConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptsRoot(ConceptsRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Concepts Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Concepts Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaConceptsContainer(JavaConceptsContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>resources Concepts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>resources Concepts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseresourcesConcepts(resourcesConcepts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextPackage(ContextPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptClass(ConceptClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptVariable(ConceptVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMethod(ConceptMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptParameter(ConceptParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
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
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedConcept(DerivedConcept object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ConceptsSwitch
