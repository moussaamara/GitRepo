
package mep.creation.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for equipe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equipe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeDepot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeEquipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeSociete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateArchive" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="libelleEquipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageTypeMaintenance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeCommunicationDeploiement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeCommunicationMaintenance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeEquipePresta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipe", propOrder = {
    "adresseMail",
    "codeDepot",
    "codeEquipe",
    "codeSociete",
    "dateArchive",
    "libelleEquipe",
    "messageTypeMaintenance",
    "typeCommunicationDeploiement",
    "typeCommunicationMaintenance",
    "typeEquipePresta"
})
public class Equipe {

    protected String adresseMail;
    protected String codeDepot;
    protected String codeEquipe;
    protected String codeSociete;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateArchive;
    protected String libelleEquipe;
    protected String messageTypeMaintenance;
    protected String typeCommunicationDeploiement;
    protected String typeCommunicationMaintenance;
    protected String typeEquipePresta;

    /**
     * Gets the value of the adresseMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseMail() {
        return adresseMail;
    }

    /**
     * Sets the value of the adresseMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseMail(String value) {
        this.adresseMail = value;
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
     * Gets the value of the codeEquipe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeEquipe() {
        return codeEquipe;
    }

    /**
     * Sets the value of the codeEquipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeEquipe(String value) {
        this.codeEquipe = value;
    }

    /**
     * Gets the value of the codeSociete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSociete() {
        return codeSociete;
    }

    /**
     * Sets the value of the codeSociete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSociete(String value) {
        this.codeSociete = value;
    }

    /**
     * Gets the value of the dateArchive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateArchive() {
        return dateArchive;
    }

    /**
     * Sets the value of the dateArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateArchive(XMLGregorianCalendar value) {
        this.dateArchive = value;
    }

    /**
     * Gets the value of the libelleEquipe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleEquipe() {
        return libelleEquipe;
    }

    /**
     * Sets the value of the libelleEquipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleEquipe(String value) {
        this.libelleEquipe = value;
    }

    /**
     * Gets the value of the messageTypeMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTypeMaintenance() {
        return messageTypeMaintenance;
    }

    /**
     * Sets the value of the messageTypeMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTypeMaintenance(String value) {
        this.messageTypeMaintenance = value;
    }

    /**
     * Gets the value of the typeCommunicationDeploiement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCommunicationDeploiement() {
        return typeCommunicationDeploiement;
    }

    /**
     * Sets the value of the typeCommunicationDeploiement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCommunicationDeploiement(String value) {
        this.typeCommunicationDeploiement = value;
    }

    /**
     * Gets the value of the typeCommunicationMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCommunicationMaintenance() {
        return typeCommunicationMaintenance;
    }

    /**
     * Sets the value of the typeCommunicationMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCommunicationMaintenance(String value) {
        this.typeCommunicationMaintenance = value;
    }

    /**
     * Gets the value of the typeEquipePresta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeEquipePresta() {
        return typeEquipePresta;
    }

    /**
     * Sets the value of the typeEquipePresta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeEquipePresta(String value) {
        this.typeEquipePresta = value;
    }

}
