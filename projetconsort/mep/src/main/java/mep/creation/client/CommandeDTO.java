
package mep.creation.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for commandeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commandeDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeAffaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeAssocie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compteSociete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCommande" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinSouhaite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datePrepaCible" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateRealisationCible" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateRealisationPrevue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateValidationDevis" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="demandeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinataire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifiantREQIWS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listeLigneCommande" type="{http://service.isiwebinterface.ass.inf.suo.fr/}ligneCommandeDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomAssocie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCommande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDevis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commandeDTO", propOrder = {
    "codeAffaire",
    "codeAssocie",
    "commentaire",
    "compteSociete",
    "dateCommande",
    "dateFinSouhaite",
    "datePrepaCible",
    "dateRealisationCible",
    "dateRealisationPrevue",
    "dateValidationDevis",
    "demandeur",
    "description",
    "destinataire",
    "identifiantREQIWS",
    "listeLigneCommande",
    "nature",
    "nomAssocie",
    "numeroCommande",
    "numeroDevis"
})
public class CommandeDTO {

    protected String codeAffaire;
    protected String codeAssocie;
    protected String commentaire;
    protected String compteSociete;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCommande;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinSouhaite;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePrepaCible;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRealisationCible;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRealisationPrevue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValidationDevis;
    protected String demandeur;
    protected String description;
    protected String destinataire;
    protected String identifiantREQIWS;
    @XmlElement(nillable = true)
    protected List<LigneCommandeDTO> listeLigneCommande;
    protected String nature;
    protected String nomAssocie;
    protected String numeroCommande;
    protected String numeroDevis;

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
     * Gets the value of the codeAssocie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAssocie() {
        return codeAssocie;
    }

    /**
     * Sets the value of the codeAssocie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAssocie(String value) {
        this.codeAssocie = value;
    }

    /**
     * Gets the value of the commentaire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * Sets the value of the commentaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaire(String value) {
        this.commentaire = value;
    }

    /**
     * Gets the value of the compteSociete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompteSociete() {
        return compteSociete;
    }

    /**
     * Sets the value of the compteSociete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompteSociete(String value) {
        this.compteSociete = value;
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
     * Gets the value of the dateFinSouhaite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinSouhaite() {
        return dateFinSouhaite;
    }

    /**
     * Sets the value of the dateFinSouhaite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinSouhaite(XMLGregorianCalendar value) {
        this.dateFinSouhaite = value;
    }

    /**
     * Gets the value of the datePrepaCible property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePrepaCible() {
        return datePrepaCible;
    }

    /**
     * Sets the value of the datePrepaCible property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePrepaCible(XMLGregorianCalendar value) {
        this.datePrepaCible = value;
    }

    /**
     * Gets the value of the dateRealisationCible property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRealisationCible() {
        return dateRealisationCible;
    }

    /**
     * Sets the value of the dateRealisationCible property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRealisationCible(XMLGregorianCalendar value) {
        this.dateRealisationCible = value;
    }

    /**
     * Gets the value of the dateRealisationPrevue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRealisationPrevue() {
        return dateRealisationPrevue;
    }

    /**
     * Sets the value of the dateRealisationPrevue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRealisationPrevue(XMLGregorianCalendar value) {
        this.dateRealisationPrevue = value;
    }

    /**
     * Gets the value of the dateValidationDevis property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValidationDevis() {
        return dateValidationDevis;
    }

    /**
     * Sets the value of the dateValidationDevis property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValidationDevis(XMLGregorianCalendar value) {
        this.dateValidationDevis = value;
    }

    /**
     * Gets the value of the demandeur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandeur() {
        return demandeur;
    }

    /**
     * Sets the value of the demandeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandeur(String value) {
        this.demandeur = value;
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
     * Gets the value of the destinataire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinataire() {
        return destinataire;
    }

    /**
     * Sets the value of the destinataire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinataire(String value) {
        this.destinataire = value;
    }

    /**
     * Gets the value of the identifiantREQIWS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifiantREQIWS() {
        return identifiantREQIWS;
    }

    /**
     * Sets the value of the identifiantREQIWS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifiantREQIWS(String value) {
        this.identifiantREQIWS = value;
    }

    /**
     * Gets the value of the listeLigneCommande property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeLigneCommande property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeLigneCommande().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LigneCommandeDTO }
     * 
     * 
     */
    public List<LigneCommandeDTO> getListeLigneCommande() {
        if (listeLigneCommande == null) {
            listeLigneCommande = new ArrayList<LigneCommandeDTO>();
        }
        return this.listeLigneCommande;
    }

    /**
     * Gets the value of the nature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNature() {
        return nature;
    }

    /**
     * Sets the value of the nature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNature(String value) {
        this.nature = value;
    }

    /**
     * Gets the value of the nomAssocie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomAssocie() {
        return nomAssocie;
    }

    /**
     * Sets the value of the nomAssocie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomAssocie(String value) {
        this.nomAssocie = value;
    }

    /**
     * Gets the value of the numeroCommande property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCommande() {
        return numeroCommande;
    }

    /**
     * Sets the value of the numeroCommande property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCommande(String value) {
        this.numeroCommande = value;
    }

    /**
     * Gets the value of the numeroDevis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDevis() {
        return numeroDevis;
    }

    /**
     * Sets the value of the numeroDevis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDevis(String value) {
        this.numeroDevis = value;
    }

}
