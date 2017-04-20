
package mep.creation.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for utilisateur complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="utilisateur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateArchive" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="equipePrivilegiee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSite" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nomComplet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objetEquipePrivilegiee" type="{http://service.isiwebinterface.ass.inf.suo.fr/}equipe" minOccurs="0"/>
 *         &lt;element name="service" type="{http://service.isiwebinterface.ass.inf.suo.fr/}service" minOccurs="0"/>
 *         &lt;element name="strNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strPrenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "utilisateur", propOrder = {
    "adresseEmail",
    "centre",
    "dateArchive",
    "equipePrivilegiee",
    "id",
    "idService",
    "idSite",
    "nomComplet",
    "nomService",
    "numTelephone",
    "objetEquipePrivilegiee",
    "service",
    "strNom",
    "strPrenom"
})
public class Utilisateur {

    protected String adresseEmail;
    protected String centre;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateArchive;
    protected String equipePrivilegiee;
    protected long id;
    protected String idService;
    protected long idSite;
    protected String nomComplet;
    protected String nomService;
    protected String numTelephone;
    protected Equipe objetEquipePrivilegiee;
    protected Service service;
    protected String strNom;
    protected String strPrenom;

    /**
     * Gets the value of the adresseEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseEmail() {
        return adresseEmail;
    }

    /**
     * Sets the value of the adresseEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseEmail(String value) {
        this.adresseEmail = value;
    }

    /**
     * Gets the value of the centre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentre() {
        return centre;
    }

    /**
     * Sets the value of the centre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentre(String value) {
        this.centre = value;
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
     * Gets the value of the equipePrivilegiee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipePrivilegiee() {
        return equipePrivilegiee;
    }

    /**
     * Sets the value of the equipePrivilegiee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipePrivilegiee(String value) {
        this.equipePrivilegiee = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the idService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdService() {
        return idService;
    }

    /**
     * Sets the value of the idService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdService(String value) {
        this.idService = value;
    }

    /**
     * Gets the value of the idSite property.
     * 
     */
    public long getIdSite() {
        return idSite;
    }

    /**
     * Sets the value of the idSite property.
     * 
     */
    public void setIdSite(long value) {
        this.idSite = value;
    }

    /**
     * Gets the value of the nomComplet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomComplet() {
        return nomComplet;
    }

    /**
     * Sets the value of the nomComplet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomComplet(String value) {
        this.nomComplet = value;
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

    /**
     * Gets the value of the numTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTelephone() {
        return numTelephone;
    }

    /**
     * Sets the value of the numTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTelephone(String value) {
        this.numTelephone = value;
    }

    /**
     * Gets the value of the objetEquipePrivilegiee property.
     * 
     * @return
     *     possible object is
     *     {@link Equipe }
     *     
     */
    public Equipe getObjetEquipePrivilegiee() {
        return objetEquipePrivilegiee;
    }

    /**
     * Sets the value of the objetEquipePrivilegiee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipe }
     *     
     */
    public void setObjetEquipePrivilegiee(Equipe value) {
        this.objetEquipePrivilegiee = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Service }
     *     
     */
    public Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service }
     *     
     */
    public void setService(Service value) {
        this.service = value;
    }

    /**
     * Gets the value of the strNom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNom() {
        return strNom;
    }

    /**
     * Sets the value of the strNom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNom(String value) {
        this.strNom = value;
    }

    /**
     * Gets the value of the strPrenom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPrenom() {
        return strPrenom;
    }

    /**
     * Sets the value of the strPrenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPrenom(String value) {
        this.strPrenom = value;
    }

	@Override
	public String toString() {
		return adresseEmail + ";" + centre + ";" + dateArchive + ";"
				+ equipePrivilegiee + ";" + id + ";" + idService + ";" + idSite
				+ ";" + nomComplet + ";" + nomService + ";" + numTelephone
				+ ";" + objetEquipePrivilegiee + ";" + service + ";" + strNom
				+ ";" + strPrenom;
	}

    
}
