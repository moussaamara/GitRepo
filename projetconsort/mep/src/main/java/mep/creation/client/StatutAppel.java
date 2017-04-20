
package mep.creation.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for statutAppel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statutAppel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeStatutAppel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateArchive" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="externe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gelescal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="libelleStatutAppel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="majEnReg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recalculDefAppel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statutAppelIsilog" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statutAppel", propOrder = {
    "codeStatutAppel",
    "dateArchive",
    "dateCreation",
    "externe",
    "formMail",
    "gelescal",
    "libelleStatutAppel",
    "majEnReg",
    "recalculDefAppel",
    "signature",
    "statutAppelIsilog"
})
public class StatutAppel {

    protected String codeStatutAppel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateArchive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreation;
    protected String externe;
    protected String formMail;
    protected Long gelescal;
    protected String libelleStatutAppel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar majEnReg;
    protected Long recalculDefAppel;
    protected Long signature;
    protected Long statutAppelIsilog;

    /**
     * Gets the value of the codeStatutAppel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeStatutAppel() {
        return codeStatutAppel;
    }

    /**
     * Sets the value of the codeStatutAppel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeStatutAppel(String value) {
        this.codeStatutAppel = value;
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
     * Gets the value of the externe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExterne() {
        return externe;
    }

    /**
     * Sets the value of the externe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExterne(String value) {
        this.externe = value;
    }

    /**
     * Gets the value of the formMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormMail() {
        return formMail;
    }

    /**
     * Sets the value of the formMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormMail(String value) {
        this.formMail = value;
    }

    /**
     * Gets the value of the gelescal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGelescal() {
        return gelescal;
    }

    /**
     * Sets the value of the gelescal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGelescal(Long value) {
        this.gelescal = value;
    }

    /**
     * Gets the value of the libelleStatutAppel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleStatutAppel() {
        return libelleStatutAppel;
    }

    /**
     * Sets the value of the libelleStatutAppel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleStatutAppel(String value) {
        this.libelleStatutAppel = value;
    }

    /**
     * Gets the value of the majEnReg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMajEnReg() {
        return majEnReg;
    }

    /**
     * Sets the value of the majEnReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMajEnReg(XMLGregorianCalendar value) {
        this.majEnReg = value;
    }

    /**
     * Gets the value of the recalculDefAppel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecalculDefAppel() {
        return recalculDefAppel;
    }

    /**
     * Sets the value of the recalculDefAppel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecalculDefAppel(Long value) {
        this.recalculDefAppel = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSignature(Long value) {
        this.signature = value;
    }

    /**
     * Gets the value of the statutAppelIsilog property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatutAppelIsilog() {
        return statutAppelIsilog;
    }

    /**
     * Sets the value of the statutAppelIsilog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatutAppelIsilog(Long value) {
        this.statutAppelIsilog = value;
    }

	@Override
	public String toString() {
		return codeStatutAppel + ";" + dateArchive + ";" + dateCreation + ";"
				+ externe + ";" + formMail + ";" + gelescal + ";"
				+ libelleStatutAppel + ";" + majEnReg + ";" + recalculDefAppel
				+ ";" + signature + ";" + statutAppelIsilog;
	}

    
}
