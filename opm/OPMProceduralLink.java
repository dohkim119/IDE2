/**
 */
package opm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPM Procedural Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link opm.OPMProceduralLink#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see opm.OpmPackage#getOPMProceduralLink()
 * @model
 * @generated
 */
public interface OPMProceduralLink extends OPMLink {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link opm.OPMProceduralLinkKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see opm.OPMProceduralLinkKind
	 * @see #setKind(OPMProceduralLinkKind)
	 * @see opm.OpmPackage#getOPMProceduralLink_Kind()
	 * @model
	 * @generated
	 */
	OPMProceduralLinkKind getKind();

	/**
	 * Sets the value of the '{@link opm.OPMProceduralLink#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see opm.OPMProceduralLinkKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(OPMProceduralLinkKind value);

} // OPMProceduralLink
