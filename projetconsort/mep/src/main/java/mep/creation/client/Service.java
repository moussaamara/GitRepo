
package mep.creation.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeBarre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeCentre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateArchive" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateMaj" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idServicePere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomCompletService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service", propOrder = {
    "code",
    "codeBarre",
    "codeCentre",
    "commentaire",
    "dateArchive",
    "dateCreation",
    "dateMaj",
    "idServicePere",
    "nomCompletService",
    "nomService"
})
public class Service {

    protected String code;
    protected String codeBarre;
    protected String codeCentre;
    protected String commentaire;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateArchive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateMaj;
    protected String idServicePere;
    protected String nomCompletService;
    protected String nomService;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeBarre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeBarre() {
        return codeBarre;
    }

    /**
     * Sets the value of the codeBarre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeBarre(String value) {
        this.codeBarre = value;
    }

    /**
     * Gets the value of the codeCentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCentre() {
        return codeCentre;
    }

    /**
     * Sets the value of the codeCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCentre(String value) {
        this.codeCentre = value;
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
     * Gets the value of the dateCreation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreation() {
        return dateCreation;
    }

    /**
     * Sets the value of the dateCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreation(XMLGregorianCalendar value) {
        this.dateCreation = value;
    }

    /**
     * Gets the value of the dateMaj property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateMaj() {
        return dateMaj;
    }

    /**
     * Sets the value of the dateMaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateMaj(XMLGregorianCalendar value) {
        this.dateMaj = value;
    }

    /**
     * Gets the value of the idServicePere property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdServicePere() {
        return idServicePere;
    }

    /**
     * Sets the value of the idServicePere property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdServicePere(String value) {
        this.idServicePere = value;
    }

    /**
     * Gets the value of the nomCompletService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCompletService() {
        return nomCompletService;
    }

    /**
     * Sets the value of the nomCompletService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCompletService(String value) {
        this.nomCompletService = value;
    }

    /**
     * Gets the value of the nomService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomService() {
        return nomService;
    }

    /**
     * Sets the value of the nomService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomService(String value) {
        this.nomService = value;
    }

}
