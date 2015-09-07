/**
 */
package eu.modelwriter.models.concepts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.modelwriter.models.concepts.ConceptsPackage
 * @generated
 */
public interface ConceptsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptsFactory eINSTANCE = eu.modelwriter.models.concepts.impl.ConceptsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	ConceptsRoot createConceptsRoot();

	/**
	 * Returns a new object of class '<em>Java Concepts Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Concepts Container</em>'.
	 * @generated
	 */
	JavaConceptsContainer createJavaConceptsContainer();

	/**
	 * Returns a new object of class '<em>resources Concepts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>resources Concepts</em>'.
	 * @generated
	 */
	resourcesConcepts createresourcesConcepts();

	/**
	 * Returns a new object of class '<em>Context Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Package</em>'.
	 * @generated
	 */
	ContextPackage createContextPackage();

	/**
	 * Returns a new object of class '<em>Concept Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Class</em>'.
	 * @generated
	 */
	ConceptClass createConceptClass();

	/**
	 * Returns a new object of class '<em>Concept Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Variable</em>'.
	 * @generated
	 */
	ConceptVariable createConceptVariable();

	/**
	 * Returns a new object of class '<em>Concept Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Method</em>'.
	 * @generated
	 */
	ConceptMethod createConceptMethod();

	/**
	 * Returns a new object of class '<em>Concept Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Parameter</em>'.
	 * @generated
	 */
	ConceptParameter createConceptParameter();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Derived Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Concept</em>'.
	 * @generated
	 */
	DerivedConcept createDerivedConcept();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConceptsPackage getConceptsPackage();

} //ConceptsFactory
