
package mep.creation.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for alarme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alarme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeProjet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAlarme" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duplicateCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailCreateur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAlarme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomAlarme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomMachine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serveur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solutionTechnique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alarme", propOrder = {
    "codeProjet",
    "dateAlarme",
    "description",
    "duplicateCount",
    "emailCreateur",
    "equipe",
    "etat",
    "idAlarme",
    "nomAlarme",
    "nomMachine",
    "priorite",
    "serveur",
    "severite",
    "solutionTechnique",
    "theme",
    "typeDossier"
})
public class Alarme {

    protected String codeProjet;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAlarme;
    protected String description;
    protected String duplicateCount;
    protected String emailCreateur;
    protected String equipe;
    protected String etat;
    protected String idAlarme;
    protected String nomAlarme;
    protected String nomMachine;
    protected String priorite;
    protected String serveur;
    protected String severite;
    protected String solutionTechnique;
    protected String theme;
    protected String typeDossier;

    /**
     * Gets the value of the codeProjet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeProjet() {
        return codeProjet;
    }

    /**
     * Sets the value of the codeProjet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeProjet(String value) {
        this.codeProjet = value;
    }

    /**
     * Gets the value of the dateAlarme property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAlarme() {
        return dateAlarme;
    }

    /**
     * Sets the value of the dateAlarme property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAlarme(XMLGregorianCalendar value) {
        this.dateAlarme = value;
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
     * Gets the value of the duplicateCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateCount() {
        return duplicateCount;
    }

    /**
     * Sets the value of the duplicateCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateCount(String value) {
        this.duplicateCount = value;
    }

    /**
     * Gets the value of the emailCreateur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailCreateur() {
        return emailCreateur;
    }

    /**
     * Sets the value of the emailCreateur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailCreateur(String value) {
        this.emailCreateur = value;
    }

    /**
     * Gets the value of the equipe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipe() {
        return equipe;
    }

    /**
     * Sets the value of the equipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipe(String value) {
        this.equipe = value;
    }

    /**
     * Gets the value of the etat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Sets the value of the etat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtat(String value) {
        this.etat = value;
    }

    /**
     * Gets the value of the idAlarme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAlarme() {
        return idAlarme;
    }

    /**
     * Sets the value of the idAlarme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAlarme(String value) {
        this.idAlarme = value;
    }

    /**
     * Gets the value of the nomAlarme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomAlarme() {
        return nomAlarme;
    }

    /**
     * Sets the value of the nomAlarme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomAlarme(String value) {
        this.nomAlarme = value;
    }

    /**
     * Gets the value of the nomMachine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomMachine() {
        return nomMachine;
    }

    /**
     * Sets the value of the nomMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomMachine(String value) {
        this.nomMachine = value;
    }

    /**
     * Gets the value of the priorite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorite() {
        return priorite;
    }

    /**
     * Sets the value of the priorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorite(String value) {
        this.priorite = value;
    }

    /**
     * Gets the value of the serveur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServeur() {
        return serveur;
    }

    /**
     * Sets the value of the serveur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServeur(String value) {
        this.serveur = value;
    }

    /**
     * Gets the value of the severite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverite() {
        return severite;
    }

    /**
     * Sets the value of the severite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverite(String value) {
        this.severite = value;
    }

    /**
     * Gets the value of the solutionTechnique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionTechnique() {
        return solutionTechnique;
    }

    /**
     * Sets the value of the solutionTechnique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionTechnique(String value) {
        this.solutionTechnique = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * Gets the value of the typeDossier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDossier() {
        return typeDossier;
    }

    /**
     * Sets the value of the typeDossier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDossier(String value) {
        this.typeDossier = value;
    }

}
