
package mep.creation.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ligneCommandeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ligneCommandeDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeAffaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeAssociee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeDepot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCommande" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natureProduit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noAppel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="noCommande" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="noLigneCommande" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traitementOperationnel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDemande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ligneCommandeDTO", propOrder = {
    "codeAffaire",
    "codeAssociee",
    "codeDepot",
    "codeDossier",
    "dateCommande",
    "description",
    "natureProduit",
    "noAppel",
    "noCommande",
    "noLigneCommande",
    "quantite",
    "reference",
    "traitementOperationnel",
    "typeDemande"
})
public class LigneCommandeDTO {

    protected String codeAffaire;
    protected String codeAssociee;
    protected String codeDepot;
    protected String codeDossier;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCommande;
    protected String description;
    protected String natureProduit;
    protected Integer noAppel;
    protected Integer noCommande;
    protected Integer noLigneCommande;
    protected Integer quantite;
    protected String reference;
    protected String traitementOperationnel;
    protected String typeDemande;

    /**
     * Gets the value of the codeAffaire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAffaire() {
        return codeAffaire;
    }

    /**
     * Sets the value of the codeAffaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAffaire(String value) {
        this.codeAffaire = value;
    }

    /**
     * Gets the value of the codeAssociee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAssociee() {
        return codeAssociee;
    }

    /**
     * Sets the value of the codeAssociee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAssociee(String value) {
        this.codeAssociee = value;
    }

    /**
     * Gets the value of the codeDepot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDepot() {
        return codeDepot;
    }

    /**
     * Sets the value of the codeDepot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDepot(String value) {
        this.codeDepot = value;
    }

    /**
     * Gets the value of the codeDossier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDossier() {
        return codeDossier;
    }

    /**
     * Sets the value of the codeDossier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDossier(String value) {
        this.codeDossier = value;
    }

    /**
     * Gets the value of the dateCommande property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCommande() {
        return dateCommande;
    }

    /**
     * Sets the value of the dateCommande property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCommande(XMLGregorianCalendar value) {
        this.dateCommande = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the natureProduit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureProduit() {
        return natureProduit;
    }

    /**
     * Sets the value of the natureProduit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureProduit(String value) {
        this.natureProduit = value;
    }

    /**
     * Gets the value of the noAppel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoAppel() {
        return noAppel;
    }

    /**
     * Sets the value of the noAppel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoAppel(Integer value) {
        this.noAppel = value;
    }

    /**
     * Gets the value of the noCommande property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoCommande() {
        return noCommande;
    }

    /**
     * Sets the value of the noCommande property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoCommande(Integer value) {
        this.noCommande = value;
    }

    /**
     * Gets the value of the noLigneCommande property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoLigneCommande() {
        return noLigneCommande;
    }

    /**
     * Sets the value of the noLigneCommande property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoLigneCommande(Integer value) {
        this.noLigneCommande = value;
    }

    /**
     * Gets the value of the quantite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantite() {
        return quantite;
    }

    /**
     * Sets the value of the quantite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantite(Integer value) {
        this.quantite = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the traitementOperationnel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraitementOperationnel() {
        return traitementOperationnel;
    }

    /**
     * Sets the value of the traitementOperationnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraitementOperationnel(String value) {
        this.traitementOperationnel = value;
    }

    /**
     * Gets the value of the typeDemande property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDemande() {
        return typeDemande;
    }

    /**
     * Sets the value of the typeDemande property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDemande(String value) {
        this.typeDemande = value;
    }

}
