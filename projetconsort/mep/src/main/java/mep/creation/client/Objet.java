
package mep.creation.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for objet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeBarre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeObjetActivite" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codeSU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentaires" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAcquisition" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateDebutGarantie" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinVie" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateMaj" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateMiseEnService" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="domaine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dureeGarantie" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="estSupervise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idObjetFils" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idObjetPret" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idSite" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="motif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbPartageMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="niveauSupervision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCommande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numLigneDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proprietaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refDivalto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensibilite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="stAcquisition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNumSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utilisateur" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objet", propOrder = {
    "adresseIP",
    "codeBarre",
    "codeObjetActivite",
    "codeSU",
    "commentaires",
    "dateAcquisition",
    "dateCreation",
    "dateDebutGarantie",
    "dateFinVie",
    "dateMaj",
    "dateMiseEnService",
    "domaine",
    "dureeGarantie",
    "estSupervise",
    "id",
    "idObjetFils",
    "idObjetPret",
    "idSite",
    "motif",
    "nbPartageMax",
    "niveauSupervision",
    "numCommande",
    "numDI",
    "numLigneDI",
    "proprietaire",
    "refDivalto",
    "sensibilite",
    "stAcquisition",
    "statut",
    "strNumSerie",
    "strRef",
    "utilisateur"
})
public class Objet {

    protected String adresseIP;
    protected String codeBarre;
    protected Long codeObjetActivite;
    protected String codeSU;
    protected String commentaires;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAcquisition;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebutGarantie;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinVie;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateMaj;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateMiseEnService;
    protected String domaine;
    protected Long dureeGarantie;
    protected Boolean estSupervise;
    protected long id;
    protected Long idObjetFils;
    protected Long idObjetPret;
    protected Long idSite;
    protected String motif;
    protected Long nbPartageMax;
    protected String niveauSupervision;
    protected String numCommande;
    protected String numDI;
    protected String numLigneDI;
    protected String proprietaire;
    protected String refDivalto;
    protected Integer sensibilite;
    protected String stAcquisition;
    protected String statut;
    protected String strNumSerie;
    protected String strRef;
    protected Long utilisateur;

    /**
     * Gets the value of the adresseIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseIP() {
        return adresseIP;
    }

    /**
     * Sets the value of the adresseIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseIP(String value) {
        this.adresseIP = value;
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
     * Gets the value of the codeObjetActivite property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeObjetActivite() {
        return codeObjetActivite;
    }

    /**
     * Sets the value of the codeObjetActivite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeObjetActivite(Long value) {
        this.codeObjetActivite = value;
    }

    /**
     * Gets the value of the codeSU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSU() {
        return codeSU;
    }

    /**
     * Sets the value of the codeSU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSU(String value) {
        this.codeSU = value;
    }

    /**
     * Gets the value of the commentaires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaires() {
        return commentaires;
    }

    /**
     * Sets the value of the commentaires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaires(String value) {
        this.commentaires = value;
    }

    /**
     * Gets the value of the dateAcquisition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAcquisition() {
        return dateAcquisition;
    }

    /**
     * Sets the value of the dateAcquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAcquisition(XMLGregorianCalendar value) {
        this.dateAcquisition = value;
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
     * Gets the value of the dateDebutGarantie property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebutGarantie() {
        return dateDebutGarantie;
    }

    /**
     * Sets the value of the dateDebutGarantie property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebutGarantie(XMLGregorianCalendar value) {
        this.dateDebutGarantie = value;
    }

    /**
     * Gets the value of the dateFinVie property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinVie() {
        return dateFinVie;
    }

    /**
     * Sets the value of the dateFinVie property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinVie(XMLGregorianCalendar value) {
        this.dateFinVie = value;
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
     * Gets the value of the dateMiseEnService property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateMiseEnService() {
        return dateMiseEnService;
    }

    /**
     * Sets the value of the dateMiseEnService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateMiseEnService(XMLGregorianCalendar value) {
        this.dateMiseEnService = value;
    }

    /**
     * Gets the value of the domaine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomaine() {
        return domaine;
    }

    /**
     * Sets the value of the domaine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomaine(String value) {
        this.domaine = value;
    }

    /**
     * Gets the value of the dureeGarantie property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDureeGarantie() {
        return dureeGarantie;
    }

    /**
     * Sets the value of the dureeGarantie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDureeGarantie(Long value) {
        this.dureeGarantie = value;
    }

    /**
     * Gets the value of the estSupervise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstSupervise() {
        return estSupervise;
    }

    /**
     * Sets the value of the estSupervise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstSupervise(Boolean value) {
        this.estSupervise = value;
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
     * Gets the value of the idObjetFils property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdObjetFils() {
        return idObjetFils;
    }

    /**
     * Sets the value of the idObjetFils property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdObjetFils(Long value) {
        this.idObjetFils = value;
    }

    /**
     * Gets the value of the idObjetPret property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdObjetPret() {
        return idObjetPret;
    }

    /**
     * Sets the value of the idObjetPret property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdObjetPret(Long value) {
        this.idObjetPret = value;
    }

    /**
     * Gets the value of the idSite property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSite() {
        return idSite;
    }

    /**
     * Sets the value of the idSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSite(Long value) {
        this.idSite = value;
    }

    /**
     * Gets the value of the motif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotif() {
        return motif;
    }

    /**
     * Sets the value of the motif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotif(String value) {
        this.motif = value;
    }

    /**
     * Gets the value of the nbPartageMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNbPartageMax() {
        return nbPartageMax;
    }

    /**
     * Sets the value of the nbPartageMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNbPartageMax(Long value) {
        this.nbPartageMax = value;
    }

    /**
     * Gets the value of the niveauSupervision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiveauSupervision() {
        return niveauSupervision;
    }

    /**
     * Sets the value of the niveauSupervision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiveauSupervision(String value) {
        this.niveauSupervision = value;
    }

    /**
     * Gets the value of the numCommande property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCommande() {
        return numCommande;
    }

    /**
     * Sets the value of the numCommande property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCommande(String value) {
        this.numCommande = value;
    }

    /**
     * Gets the value of the numDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDI() {
        return numDI;
    }

    /**
     * Sets the value of the numDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDI(String value) {
        this.numDI = value;
    }

    /**
     * Gets the value of the numLigneDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumLigneDI() {
        return numLigneDI;
    }

    /**
     * Sets the value of the numLigneDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumLigneDI(String value) {
        this.numLigneDI = value;
    }

    /**
     * Gets the value of the proprietaire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaire() {
        return proprietaire;
    }

    /**
     * Sets the value of the proprietaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaire(String value) {
        this.proprietaire = value;
    }

    /**
     * Gets the value of the refDivalto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDivalto() {
        return refDivalto;
    }

    /**
     * Sets the value of the refDivalto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDivalto(String value) {
        this.refDivalto = value;
    }

    /**
     * Gets the value of the sensibilite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSensibilite() {
        return sensibilite;
    }

    /**
     * Sets the value of the sensibilite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSensibilite(Integer value) {
        this.sensibilite = value;
    }

    /**
     * Gets the value of the stAcquisition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStAcquisition() {
        return stAcquisition;
    }

    /**
     * Sets the value of the stAcquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStAcquisition(String value) {
        this.stAcquisition = value;
    }

    /**
     * Gets the value of the statut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatut() {
        return statut;
    }

    /**
     * Sets the value of the statut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatut(String value) {
        this.statut = value;
    }

    /**
     * Gets the value of the strNumSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNumSerie() {
        return strNumSerie;
    }

    /**
     * Sets the value of the strNumSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNumSerie(String value) {
        this.strNumSerie = value;
    }

    /**
     * Gets the value of the strRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrRef() {
        return strRef;
    }

    /**
     * Sets the value of the strRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrRef(String value) {
        this.strRef = value;
    }

    /**
     * Gets the value of the utilisateur property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUtilisateur() {
        return utilisateur;
    }

    /**
     * Sets the value of the utilisateur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUtilisateur(Long value) {
        this.utilisateur = value;
    }

}
