
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
 * <p>Java class for appel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AContacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assistant" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assistantUtilisateur" type="{http://service.isiwebinterface.ass.inf.suo.fr/}utilisateur" minOccurs="0"/>
 *         &lt;element name="beneficiaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bilan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categorieRFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="causeIncident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changementReussi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargerIntegration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="chargerIntegrationUtilisateur" type="{http://service.isiwebinterface.ass.inf.suo.fr/}utilisateur" minOccurs="0"/>
 *         &lt;element name="chiffrageEuros" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="chiffrageJH" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="client" type="{http://service.isiwebinterface.ass.inf.suo.fr/}utilisateur" minOccurs="0"/>
 *         &lt;element name="clientREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeAffaireDivalto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeBlocage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeDossierDivalto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeEscalade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeObjet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codeObjetActivite" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codeObjetRemplacant" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codeProjet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeStatut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeSystemeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contratCou" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAppel" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateArchive" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateCab" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateCloture" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateClotureMainteneur" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateDebutIntervention" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateDebutRealSouhaitee" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateExpeditionPrevue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateExpeditionReelle" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinInstallation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinPrevue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinRealSouhaitee" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateInstallationRelle" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateLivraisonReelle" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateMaj" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datePrepaCible" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datePreparationReelle" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datePriseEnChargeMainteneur" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateRealisationPrevue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateValidationCommande" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateValidationDevis" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="demande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="demandeur" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="demandeurRFCDEP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="demandeurRFCDEPUtilisateur" type="{http://service.isiwebinterface.ass.inf.suo.fr/}utilisateur" minOccurs="0"/>
 *         &lt;element name="departementBeneficiaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diagnostic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailEquipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="environnement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipeProx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heureDebut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idPere" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="identifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intervenant" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="intervenantUtilisateur" type="{http://service.isiwebinterface.ass.inf.suo.fr/}utilisateur" minOccurs="0"/>
 *         &lt;element name="libelleProjet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modDiffNews" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motifCloture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natureInventaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomAlarme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numIncidentMainteneur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroBdcDivalto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDevisDivalto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLigneDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTracking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objet" type="{http://service.isiwebinterface.ass.inf.suo.fr/}objet" minOccurs="0"/>
 *         &lt;element name="objetActivite" type="{http://service.isiwebinterface.ass.inf.suo.fr/}objet" minOccurs="0"/>
 *         &lt;element name="pere" type="{http://service.isiwebinterface.ass.inf.suo.fr/}appel" minOccurs="0"/>
 *         &lt;element name="piecesJointes" type="{http://service.isiwebinterface.ass.inf.suo.fr/}pieceJointe" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plateForme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RFCdureePrevue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="raisonRFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceExterne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencePortail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="risqueRFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceDemandeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteDemandeur" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="siteDestinataire" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stPresta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statut" type="{http://service.isiwebinterface.ass.inf.suo.fr/}statutAppel" minOccurs="0"/>
 *         &lt;element name="symptome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="technicienAffecte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephoneAContacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephoneDemandeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephoneSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theme" type="{http://service.isiwebinterface.ass.inf.suo.fr/}theme" minOccurs="0"/>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titreNews" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDemande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDeploiement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeInstall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typePb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="typeRFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utilisateurAppelant" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="utilisateurDeCloture" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appel", propOrder = {
    "aContacter",
    "application",
    "assistant",
    "assistantUtilisateur",
    "beneficiaire",
    "bilan",
    "categorie",
    "categorieRFC",
    "causeIncident",
    "changementReussi",
    "chargerIntegration",
    "chargerIntegrationUtilisateur",
    "chiffrageEuros",
    "chiffrageJH",
    "client",
    "clientREQ",
    "codeAffaireDivalto",
    "codeBlocage",
    "codeDossierDivalto",
    "codeEscalade",
    "codeObjet",
    "codeObjetActivite",
    "codeObjetRemplacant",
    "codeProjet",
    "codeStatut",
    "codeSystemeU",
    "contratCou",
    "dateAppel",
    "dateArchive",
    "dateCab",
    "dateCloture",
    "dateClotureMainteneur",
    "dateCreation",
    "dateDebutIntervention",
    "dateDebutRealSouhaitee",
    "dateExpeditionPrevue",
    "dateExpeditionReelle",
    "dateFinInstallation",
    "dateFinPrevue",
    "dateFinRealSouhaitee",
    "dateInstallationRelle",
    "dateLivraisonReelle",
    "dateMaj",
    "datePrepaCible",
    "datePreparationReelle",
    "datePriseEnChargeMainteneur",
    "dateRealisationPrevue",
    "dateValidationCommande",
    "dateValidationDevis",
    "demande",
    "demandeur",
    "demandeurRFCDEP",
    "demandeurRFCDEPUtilisateur",
    "departementBeneficiaire",
    "descriptionClient",
    "diagnostic",
    "emailEquipe",
    "environnement",
    "equipe",
    "equipeProx",
    "etat",
    "heureDebut",
    "id",
    "idPere",
    "identifiant",
    "intervenant",
    "intervenantUtilisateur",
    "libelleProjet",
    "memo",
    "modDiffNews",
    "motifCloture",
    "nature",
    "natureInventaire",
    "nomAlarme",
    "numIncidentMainteneur",
    "numeroBdcDivalto",
    "numeroDI",
    "numeroDevisDivalto",
    "numeroLigneDI",
    "numeroTracking",
    "objet",
    "objetActivite",
    "pere",
    "piecesJointes",
    "plateForme",
    "priorite",
    "quantite",
    "rfCdureePrevue",
    "raisonRFC",
    "reference",
    "referenceExterne",
    "referencePortail",
    "risqueRFC",
    "serviceDemandeur",
    "severite",
    "siteDemandeur",
    "siteDestinataire",
    "solution",
    "stPresta",
    "statut",
    "symptome",
    "technicienAffecte",
    "telephoneAContacter",
    "telephoneDemandeur",
    "telephoneSite",
    "theme",
    "titre",
    "titreNews",
    "typeDemande",
    "typeDeploiement",
    "typeDossier",
    "typeInstall",
    "typePb",
    "typeRFC",
    "utilisateurAppelant",
    "utilisateurDeCloture",
    "version"
})
public class Appel {

    @XmlElement(name = "AContacter")
    protected String aContacter;
    protected String application;
    protected Long assistant;
    protected Utilisateur assistantUtilisateur;
    protected String beneficiaire;
    protected String bilan;
    protected String categorie;
    protected String categorieRFC;
    protected String causeIncident;
    protected String changementReussi;
    protected Long chargerIntegration;
    protected Utilisateur chargerIntegrationUtilisateur;
    protected Long chiffrageEuros;
    protected Long chiffrageJH;
    protected Utilisateur client;
    protected String clientREQ;
    protected String codeAffaireDivalto;
    protected String codeBlocage;
    protected String codeDossierDivalto;
    protected String codeEscalade;
    protected Long codeObjet;
    protected Long codeObjetActivite;
    protected Long codeObjetRemplacant;
    protected String codeProjet;
    protected String codeStatut;
    protected String codeSystemeU;
    protected String contratCou;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAppel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateArchive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCab;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCloture;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateClotureMainteneur;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebutIntervention;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebutRealSouhaitee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExpeditionPrevue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExpeditionReelle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinInstallation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinPrevue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinRealSouhaitee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateInstallationRelle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLivraisonReelle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateMaj;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePrepaCible;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePreparationReelle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePriseEnChargeMainteneur;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRealisationPrevue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValidationCommande;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValidationDevis;
    protected String demande;
    protected Long demandeur;
    protected Long demandeurRFCDEP;
    protected Utilisateur demandeurRFCDEPUtilisateur;
    protected String departementBeneficiaire;
    protected String descriptionClient;
    protected String diagnostic;
    protected String emailEquipe;
    protected String environnement;
    protected String equipe;
    protected String equipeProx;
    protected String etat;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar heureDebut;
    protected Long id;
    protected Long idPere;
    protected String identifiant;
    protected Long intervenant;
    protected Utilisateur intervenantUtilisateur;
    protected String libelleProjet;
    protected String memo;
    protected String modDiffNews;
    protected String motifCloture;
    protected String nature;
    protected String natureInventaire;
    protected String nomAlarme;
    protected String numIncidentMainteneur;
    protected String numeroBdcDivalto;
    protected String numeroDI;
    protected String numeroDevisDivalto;
    protected String numeroLigneDI;
    protected String numeroTracking;
    protected Objet objet;
    protected Objet objetActivite;
    protected Appel pere;
    @XmlElement(nillable = true)
    protected List<PieceJointe> piecesJointes;
    protected String plateForme;
    protected String priorite;
    protected Double quantite;
    @XmlElement(name = "RFCdureePrevue")
    protected Double rfCdureePrevue;
    protected String raisonRFC;
    protected String reference;
    protected String referenceExterne;
    protected String referencePortail;
    protected String risqueRFC;
    protected String serviceDemandeur;
    protected String severite;
    protected Long siteDemandeur;
    protected Long siteDestinataire;
    protected String solution;
    protected String stPresta;
    protected StatutAppel statut;
    protected String symptome;
    protected String technicienAffecte;
    protected String telephoneAContacter;
    protected String telephoneDemandeur;
    protected String telephoneSite;
    protected Theme theme;
    protected String titre;
    protected String titreNews;
    protected String typeDemande;
    protected String typeDeploiement;
    protected String typeDossier;
    protected String typeInstall;
    protected Long typePb;
    protected String typeRFC;
    protected Long utilisateurAppelant;
    protected Long utilisateurDeCloture;
    protected String version;

    /**
     * Gets the value of the aContacter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAContacter() {
        return aContacter;
    }

    /**
     * Sets the value of the aContacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAContacter(String value) {
        this.aContacter = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the assistant property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssistant() {
        return assistant;
    }

    /**
     * Sets the value of the assistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssistant(Long value) {
        this.assistant = value;
    }

    /**
     * Gets the value of the assistantUtilisateur property.
     * 
     * @return
     *     possible object is
     *     {@link Utilisateur }
     *     
     */
    public Utilisateur getAssistantUtilisateur() {
        return assistantUtilisateur;
    }

    /**
     * Sets the value of the assistantUtilisateur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utilisateur }
     *     
     */
    public void setAssistantUtilisateur(Utilisateur value) {
        this.assistantUtilisateur = value;
    }

    /**
     * Gets the value of the beneficiaire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaire() {
        return beneficiaire;
    }

    /**
     * Sets the value of the beneficiaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaire(String value) {
        this.beneficiaire = value;
    }

    /**
     * Gets the value of the bilan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilan() {
        return bilan;
    }

    /**
     * Sets the value of the bilan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilan(String value) {
        this.bilan = value;
    }

    /**
     * Gets the value of the categorie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * Sets the value of the categorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorie(String value) {
        this.categorie = value;
    }

    /**
     * Gets the value of the categorieRFC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorieRFC() {
        return categorieRFC;
    }

    /**
     * Sets the value of the categorieRFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorieRFC(String value) {
        this.categorieRFC = value;
    }

    /**
     * Gets the value of the causeIncident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseIncident() {
        return causeIncident;
    }

    /**
     * Sets the value of the causeIncident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseIncident(String value) {
        this.causeIncident = value;
    }

    /**
     * Gets the value of the changementReussi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangementReussi() {
        return changementReussi;
    }

    /**
     * Sets the value of the changementReussi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangementReussi(String value) {
        this.changementReussi = value;
    }

    /**
     * Gets the value of the chargerIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChargerIntegration() {
        return chargerIntegration;
    }

    /**
     * Sets the value of the chargerIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChargerIntegration(Long value) {
        this.chargerIntegration = value;
    }

    /**
     * Gets the value of the chargerIntegrationUtilisateur property.
     * 
     * @return
     *     possible object is
     *     {@link Utilisateur }
     *     
     */
    public Utilisateur getChargerIntegrationUtilisateur() {
        return chargerIntegrationUtilisateur;
    }

    /**
     * Sets the value of the chargerIntegrationUtilisateur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utilisateur }
     *     
     */
    public void setChargerIntegrationUtilisateur(Utilisateur value) {
        this.chargerIntegrationUtilisateur = value;
    }

    /**
     * Gets the value of the chiffrageEuros property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChiffrageEuros() {
        return chiffrageEuros;
    }

    /**
     * Sets the value of the chiffrageEuros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChiffrageEuros(Long value) {
        this.chiffrageEuros = value;
    }

    /**
     * Gets the value of the chiffrageJH property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChiffrageJH() {
        return chiffrageJH;
    }

    /**
     * Sets the value of the chiffrageJH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChiffrageJH(Long value) {
        this.chiffrageJH = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Utilisateur }
     *     
     */
    public Utilisateur getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utilisateur }
     *     
     */
    public void setClient(Utilisateur value) {
        this.client = value;
    }

    /**
     * Gets the value of the clientREQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientREQ() {
        return clientREQ;
    }

    /**
     * Sets the value of the clientREQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientREQ(String value) {
        this.clientREQ = value;
    }

    /**
     * Gets the value of the codeAffaireDivalto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAffaireDivalto() {
        return codeAffaireDivalto;
    }

    /**
     * Sets the value of the codeAffaireDivalto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAffaireDivalto(String value) {
        this.codeAffaireDivalto = value;
    }

    /**
     * Gets the value of the codeBlocage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeBlocage() {
        return codeBlocage;
    }

    /**
     * Sets the value of the codeBlocage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeBlocage(String value) {
        this.codeBlocage = value;
    }

    /**
     * Gets the value of the codeDossierDivalto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDossierDivalto() {
        return codeDossierDivalto;
    }

    /**
     * Sets the value of the codeDossierDivalto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDossierDivalto(String value) {
        this.codeDossierDivalto = value;
    }

    /**
     * Gets the value of the codeEscalade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeEscalade() {
        return codeEscalade;
    }

    /**
     * Sets the value of the codeEscalade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeEscalade(String value) {
        this.codeEscalade = value;
    }

    /**
     * Gets the value of the codeObjet property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeObjet() {
        return codeObjet;
    }

    /**
     * Sets the value of the codeObjet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeObjet(Long value) {
        this.codeObjet = value;
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
     * Gets the value of the codeObjetRemplacant property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeObjetRemplacant() {
        return codeObjetRemplacant;
    }

    /**
     * Sets the value of the codeObjetRemplacant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeObjetRemplacant(Long value) {
        this.codeObjetRemplacant = value;
    }

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
     * Gets the value of the codeStatut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeStatut() {
        return codeStatut;
    }

    /**
     * Sets the value of the codeStatut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeStatut(String value) {
        this.codeStatut = value;
    }

    /**
     * Gets the value of the codeSystemeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystemeU() {
        return codeSystemeU;
    }

    /**
     * Sets the value of the codeSystemeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemeU(String value) {
        this.codeSystemeU = value;
    }

    /**
     * Gets the value of the contratCou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContratCou() {
        return contratCou;
    }

    /**
     * Sets the value of the contratCou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContratCou(String value) {
        this.contratCou = value;
    }

    /**
     * Gets the value of the dateAppel property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAppel() {
        return dateAppel;
    }

    /**
     * Sets the value of the dateAppel property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAppel(XMLGregorianCalendar value) {
        this.dateAppel = value;
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
     * Gets the value of the dateCab property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCab() {
        return dateCab;
    }

    /**
     * Sets the value of the dateCab property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCab(XMLGregorianCalendar value) {
        this.dateCab = value;
    }

    /**
     * Gets the value of the dateCloture property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCloture() {
        return dateCloture;
    }

    /**
     * Sets the value of the dateCloture property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCloture(XMLGregorianCalendar value) {
        this.dateCloture = value;
    }

    /**
     * Gets the value of the dateClotureMainteneur property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateClotureMainteneur() {
        return dateClotureMainteneur;
    }

    /**
     * Sets the value of the dateClotureMainteneur property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateClotureMainteneur(XMLGregorianCalendar value) {
        this.dateClotureMainteneur = value;
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
     * Gets the value of the dateDebutIntervention property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebutIntervention() {
        return dateDebutIntervention;
    }

    /**
     * Sets the value of the dateDebutIntervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebutIntervention(XMLGregorianCalendar value) {
        this.dateDebutIntervention = value;
    }

    /**
     * Gets the value of the dateDebutRealSouhaitee property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebutRealSouhaitee() {
        return dateDebutRealSouhaitee;
    }

    /**
     * Sets the value of the dateDebutRealSouhaitee property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebutRealSouhaitee(XMLGregorianCalendar value) {
        this.dateDebutRealSouhaitee = value;
    }

    /**
     * Gets the value of the dateExpeditionPrevue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateExpeditionPrevue() {
        return dateExpeditionPrevue;
    }

    /**
     * Sets the value of the dateExpeditionPrevue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateExpeditionPrevue(XMLGregorianCalendar value) {
        this.dateExpeditionPrevue = value;
    }

    /**
     * Gets the value of the dateExpeditionReelle property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateExpeditionReelle() {
        return dateExpeditionReelle;
    }

    /**
     * Sets the value of the dateExpeditionReelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateExpeditionReelle(XMLGregorianCalendar value) {
        this.dateExpeditionReelle = value;
    }

    /**
     * Gets the value of the dateFinInstallation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinInstallation() {
        return dateFinInstallation;
    }

    /**
     * Sets the value of the dateFinInstallation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinInstallation(XMLGregorianCalendar value) {
        this.dateFinInstallation = value;
    }

    /**
     * Gets the value of the dateFinPrevue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinPrevue() {
        return dateFinPrevue;
    }

    /**
     * Sets the value of the dateFinPrevue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinPrevue(XMLGregorianCalendar value) {
        this.dateFinPrevue = value;
    }

    /**
     * Gets the value of the dateFinRealSouhaitee property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinRealSouhaitee() {
        return dateFinRealSouhaitee;
    }

    /**
     * Sets the value of the dateFinRealSouhaitee property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinRealSouhaitee(XMLGregorianCalendar value) {
        this.dateFinRealSouhaitee = value;
    }

    /**
     * Gets the value of the dateInstallationRelle property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateInstallationRelle() {
        return dateInstallationRelle;
    }

    /**
     * Sets the value of the dateInstallationRelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateInstallationRelle(XMLGregorianCalendar value) {
        this.dateInstallationRelle = value;
    }

    /**
     * Gets the value of the dateLivraisonReelle property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLivraisonReelle() {
        return dateLivraisonReelle;
    }

    /**
     * Sets the value of the dateLivraisonReelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLivraisonReelle(XMLGregorianCalendar value) {
        this.dateLivraisonReelle = value;
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
     * Gets the value of the datePreparationReelle property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePreparationReelle() {
        return datePreparationReelle;
    }

    /**
     * Sets the value of the datePreparationReelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePreparationReelle(XMLGregorianCalendar value) {
        this.datePreparationReelle = value;
    }

    /**
     * Gets the value of the datePriseEnChargeMainteneur property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePriseEnChargeMainteneur() {
        return datePriseEnChargeMainteneur;
    }

    /**
     * Sets the value of the datePriseEnChargeMainteneur property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePriseEnChargeMainteneur(XMLGregorianCalendar value) {
        this.datePriseEnChargeMainteneur = value;
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
     * Gets the value of the dateValidationCommande property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValidationCommande() {
        return dateValidationCommande;
    }

    /**
     * Sets the value of the dateValidationCommande property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValidationCommande(XMLGregorianCalendar value) {
        this.dateValidationCommande = value;
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
     * Gets the value of the demande property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemande() {
        return demande;
    }

    /**
     * Sets the value of the demande property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemande(String value) {
        this.demande = value;
    }

    /**
     * Gets the value of the demandeur property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDemandeur() {
        return demandeur;
    }

    /**
     * Sets the value of the demandeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDemandeur(Long value) {
        this.demandeur = value;
    }

    /**
     * Gets the value of the demandeurRFCDEP property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDemandeurRFCDEP() {
        return demandeurRFCDEP;
    }

    /**
     * Sets the value of the demandeurRFCDEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDemandeurRFCDEP(Long value) {
        this.demandeurRFCDEP = value;
    }

    /**
     * Gets the value of the demandeurRFCDEPUtilisateur property.
     * 
     * @return
     *     possible object is
     *     {@link Utilisateur }
     *     
     */
    public Utilisateur getDemandeurRFCDEPUtilisateur() {
        return demandeurRFCDEPUtilisateur;
    }

    /**
     * Sets the value of the demandeurRFCDEPUtilisateur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utilisateur }
     *     
     */
    public void setDemandeurRFCDEPUtilisateur(Utilisateur value) {
        this.demandeurRFCDEPUtilisateur = value;
    }

    /**
     * Gets the value of the departementBeneficiaire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartementBeneficiaire() {
        return departementBeneficiaire;
    }

    /**
     * Sets the value of the departementBeneficiaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartementBeneficiaire(String value) {
        this.departementBeneficiaire = value;
    }

    /**
     * Gets the value of the descriptionClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionClient() {
        return descriptionClient;
    }

    /**
     * Sets the value of the descriptionClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionClient(String value) {
        this.descriptionClient = value;
    }

    /**
     * Gets the value of the diagnostic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnostic() {
        return diagnostic;
    }

    /**
     * Sets the value of the diagnostic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnostic(String value) {
        this.diagnostic = value;
    }

    /**
     * Gets the value of the emailEquipe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEquipe() {
        return emailEquipe;
    }

    /**
     * Sets the value of the emailEquipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEquipe(String value) {
        this.emailEquipe = value;
    }

    /**
     * Gets the value of the environnement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironnement() {
        return environnement;
    }

    /**
     * Sets the value of the environnement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironnement(String value) {
        this.environnement = value;
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
     * Gets the value of the equipeProx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipeProx() {
        return equipeProx;
    }

    /**
     * Sets the value of the equipeProx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipeProx(String value) {
        this.equipeProx = value;
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
     * Gets the value of the heureDebut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHeureDebut() {
        return heureDebut;
    }

    /**
     * Sets the value of the heureDebut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHeureDebut(XMLGregorianCalendar value) {
        this.heureDebut = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the idPere property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPere() {
        return idPere;
    }

    /**
     * Sets the value of the idPere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPere(Long value) {
        this.idPere = value;
    }

    /**
     * Gets the value of the identifiant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifiant() {
        return identifiant;
    }

    /**
     * Sets the value of the identifiant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifiant(String value) {
        this.identifiant = value;
    }

    /**
     * Gets the value of the intervenant property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntervenant() {
        return intervenant;
    }

    /**
     * Sets the value of the intervenant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntervenant(Long value) {
        this.intervenant = value;
    }

    /**
     * Gets the value of the intervenantUtilisateur property.
     * 
     * @return
     *     possible object is
     *     {@link Utilisateur }
     *     
     */
    public Utilisateur getIntervenantUtilisateur() {
        return intervenantUtilisateur;
    }

    /**
     * Sets the value of the intervenantUtilisateur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utilisateur }
     *     
     */
    public void setIntervenantUtilisateur(Utilisateur value) {
        this.intervenantUtilisateur = value;
    }

    /**
     * Gets the value of the libelleProjet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleProjet() {
        return libelleProjet;
    }

    /**
     * Sets the value of the libelleProjet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleProjet(String value) {
        this.libelleProjet = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the modDiffNews property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModDiffNews() {
        return modDiffNews;
    }

    /**
     * Sets the value of the modDiffNews property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModDiffNews(String value) {
        this.modDiffNews = value;
    }

    /**
     * Gets the value of the motifCloture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotifCloture() {
        return motifCloture;
    }

    /**
     * Sets the value of the motifCloture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotifCloture(String value) {
        this.motifCloture = value;
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
     * Gets the value of the natureInventaire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureInventaire() {
        return natureInventaire;
    }

    /**
     * Sets the value of the natureInventaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureInventaire(String value) {
        this.natureInventaire = value;
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
     * Gets the value of the numIncidentMainteneur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIncidentMainteneur() {
        return numIncidentMainteneur;
    }

    /**
     * Sets the value of the numIncidentMainteneur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIncidentMainteneur(String value) {
        this.numIncidentMainteneur = value;
    }

    /**
     * Gets the value of the numeroBdcDivalto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBdcDivalto() {
        return numeroBdcDivalto;
    }

    /**
     * Sets the value of the numeroBdcDivalto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBdcDivalto(String value) {
        this.numeroBdcDivalto = value;
    }

    /**
     * Gets the value of the numeroDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDI() {
        return numeroDI;
    }

    /**
     * Sets the value of the numeroDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDI(String value) {
        this.numeroDI = value;
    }

    /**
     * Gets the value of the numeroDevisDivalto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDevisDivalto() {
        return numeroDevisDivalto;
    }

    /**
     * Sets the value of the numeroDevisDivalto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDevisDivalto(String value) {
        this.numeroDevisDivalto = value;
    }

    /**
     * Gets the value of the numeroLigneDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLigneDI() {
        return numeroLigneDI;
    }

    /**
     * Sets the value of the numeroLigneDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLigneDI(String value) {
        this.numeroLigneDI = value;
    }

    /**
     * Gets the value of the numeroTracking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTracking() {
        return numeroTracking;
    }

    /**
     * Sets the value of the numeroTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTracking(String value) {
        this.numeroTracking = value;
    }

    /**
     * Gets the value of the objet property.
     * 
     * @return
     *     possible object is
     *     {@link Objet }
     *     
     */
    public Objet getObjet() {
        return objet;
    }

    /**
     * Sets the value of the objet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Objet }
     *     
     */
    public void setObjet(Objet value) {
        this.objet = value;
    }

    /**
     * Gets the value of the objetActivite property.
     * 
     * @return
     *     possible object is
     *     {@link Objet }
     *     
     */
    public Objet getObjetActivite() {
        return objetActivite;
    }

    /**
     * Sets the value of the objetActivite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Objet }
     *     
     */
    public void setObjetActivite(Objet value) {
        this.objetActivite = value;
    }

    /**
     * Gets the value of the pere property.
     * 
     * @return
     *     possible object is
     *     {@link Appel }
     *     
     */
    public Appel getPere() {
        return pere;
    }

    /**
     * Sets the value of the pere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appel }
     *     
     */
    public void setPere(Appel value) {
        this.pere = value;
    }

    /**
     * Gets the value of the piecesJointes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the piecesJointes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPiecesJointes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PieceJointe }
     * 
     * 
     */
    public List<PieceJointe> getPiecesJointes() {
        if (piecesJointes == null) {
            piecesJointes = new ArrayList<PieceJointe>();
        }
        return this.piecesJointes;
    }

    /**
     * Gets the value of the plateForme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateForme() {
        return plateForme;
    }

    /**
     * Sets the value of the plateForme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateForme(String value) {
        this.plateForme = value;
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
     * Gets the value of the quantite property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantite() {
        return quantite;
    }

    /**
     * Sets the value of the quantite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantite(Double value) {
        this.quantite = value;
    }

    /**
     * Gets the value of the rfCdureePrevue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRFCdureePrevue() {
        return rfCdureePrevue;
    }

    /**
     * Sets the value of the rfCdureePrevue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRFCdureePrevue(Double value) {
        this.rfCdureePrevue = value;
    }

    /**
     * Gets the value of the raisonRFC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaisonRFC() {
        return raisonRFC;
    }

    /**
     * Sets the value of the raisonRFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaisonRFC(String value) {
        this.raisonRFC = value;
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
     * Gets the value of the referenceExterne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceExterne() {
        return referenceExterne;
    }

    /**
     * Sets the value of the referenceExterne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceExterne(String value) {
        this.referenceExterne = value;
    }

    /**
     * Gets the value of the referencePortail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePortail() {
        return referencePortail;
    }

    /**
     * Sets the value of the referencePortail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePortail(String value) {
        this.referencePortail = value;
    }

    /**
     * Gets the value of the risqueRFC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisqueRFC() {
        return risqueRFC;
    }

    /**
     * Sets the value of the risqueRFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisqueRFC(String value) {
        this.risqueRFC = value;
    }

    /**
     * Gets the value of the serviceDemandeur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDemandeur() {
        return serviceDemandeur;
    }

    /**
     * Sets the value of the serviceDemandeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDemandeur(String value) {
        this.serviceDemandeur = value;
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
     * Gets the value of the siteDemandeur property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteDemandeur() {
        return siteDemandeur;
    }

    /**
     * Sets the value of the siteDemandeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteDemandeur(Long value) {
        this.siteDemandeur = value;
    }

    /**
     * Gets the value of the siteDestinataire property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteDestinataire() {
        return siteDestinataire;
    }

    /**
     * Sets the value of the siteDestinataire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteDestinataire(Long value) {
        this.siteDestinataire = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolution(String value) {
        this.solution = value;
    }

    /**
     * Gets the value of the stPresta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStPresta() {
        return stPresta;
    }

    /**
     * Sets the value of the stPresta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStPresta(String value) {
        this.stPresta = value;
    }

    /**
     * Gets the value of the statut property.
     * 
     * @return
     *     possible object is
     *     {@link StatutAppel }
     *     
     */
    public StatutAppel getStatut() {
        return statut;
    }

    /**
     * Sets the value of the statut property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutAppel }
     *     
     */
    public void setStatut(StatutAppel value) {
        this.statut = value;
    }

    /**
     * Gets the value of the symptome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymptome() {
        return symptome;
    }

    /**
     * Sets the value of the symptome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymptome(String value) {
        this.symptome = value;
    }

    /**
     * Gets the value of the technicienAffecte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicienAffecte() {
        return technicienAffecte;
    }

    /**
     * Sets the value of the technicienAffecte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicienAffecte(String value) {
        this.technicienAffecte = value;
    }

    /**
     * Gets the value of the telephoneAContacter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneAContacter() {
        return telephoneAContacter;
    }

    /**
     * Sets the value of the telephoneAContacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneAContacter(String value) {
        this.telephoneAContacter = value;
    }

    /**
     * Gets the value of the telephoneDemandeur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneDemandeur() {
        return telephoneDemandeur;
    }

    /**
     * Sets the value of the telephoneDemandeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneDemandeur(String value) {
        this.telephoneDemandeur = value;
    }

    /**
     * Gets the value of the telephoneSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneSite() {
        return telephoneSite;
    }

    /**
     * Sets the value of the telephoneSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneSite(String value) {
        this.telephoneSite = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link Theme }
     *     
     */
    public Theme getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Theme }
     *     
     */
    public void setTheme(Theme value) {
        this.theme = value;
    }

    /**
     * Gets the value of the titre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Sets the value of the titre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

    /**
     * Gets the value of the titreNews property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitreNews() {
        return titreNews;
    }

    /**
     * Sets the value of the titreNews property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitreNews(String value) {
        this.titreNews = value;
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

    /**
     * Gets the value of the typeDeploiement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDeploiement() {
        return typeDeploiement;
    }

    /**
     * Sets the value of the typeDeploiement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDeploiement(String value) {
        this.typeDeploiement = value;
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

    /**
     * Gets the value of the typeInstall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInstall() {
        return typeInstall;
    }

    /**
     * Sets the value of the typeInstall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInstall(String value) {
        this.typeInstall = value;
    }

    /**
     * Gets the value of the typePb property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypePb() {
        return typePb;
    }

    /**
     * Sets the value of the typePb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypePb(Long value) {
        this.typePb = value;
    }

    /**
     * Gets the value of the typeRFC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRFC() {
        return typeRFC;
    }

    /**
     * Sets the value of the typeRFC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRFC(String value) {
        this.typeRFC = value;
    }

    /**
     * Gets the value of the utilisateurAppelant property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUtilisateurAppelant() {
        return utilisateurAppelant;
    }

    /**
     * Sets the value of the utilisateurAppelant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUtilisateurAppelant(Long value) {
        this.utilisateurAppelant = value;
    }

    /**
     * Gets the value of the utilisateurDeCloture property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUtilisateurDeCloture() {
        return utilisateurDeCloture;
    }

    /**
     * Sets the value of the utilisateurDeCloture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUtilisateurDeCloture(Long value) {
        this.utilisateurDeCloture = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

	@Override
	public String toString() {
		return aContacter + ";" + application + ";" + assistant + ";" + assistantUtilisateur + ";" + beneficiaire + ";"
				+ bilan + ";" + categorie + ";" + categorieRFC + ";" + causeIncident + ";" + changementReussi + ";"
				+ chargerIntegration + ";" + chargerIntegrationUtilisateur + ";" + chiffrageEuros + ";" + chiffrageJH
				+ ";" + client + ";" + clientREQ + ";" + codeAffaireDivalto + ";" + codeBlocage + ";"
				+ codeDossierDivalto + ";" + codeEscalade + ";" + codeObjet + ";" + codeObjetActivite + ";"
				+ codeObjetRemplacant + ";" + codeProjet + ";" + codeStatut + ";" + codeSystemeU + ";" + contratCou
				+ ";" + dateAppel + ";" + dateArchive + ";" + dateCab + ";" + dateCloture + ";" + dateClotureMainteneur
				+ ";" + dateCreation + ";" + dateDebutIntervention + ";" + dateDebutRealSouhaitee + ";"
				+ dateExpeditionPrevue + ";" + dateExpeditionReelle + ";" + dateFinInstallation + ";" + dateFinPrevue
				+ ";" + dateFinRealSouhaitee + ";" + dateInstallationRelle + ";" + dateLivraisonReelle + ";" + dateMaj
				+ ";" + datePrepaCible + ";" + datePreparationReelle + ";" + datePriseEnChargeMainteneur + ";"
				+ dateRealisationPrevue + ";" + dateValidationCommande + ";" + dateValidationDevis + ";" + demande + ";"
				+ demandeur + ";" + demandeurRFCDEP + ";" + demandeurRFCDEPUtilisateur + ";" + departementBeneficiaire
				+ ";" + descriptionClient + ";" + diagnostic + ";" + emailEquipe + ";" + environnement + ";" + equipe
				+ ";" + equipeProx + ";" + etat + ";" + heureDebut + ";" + id + ";" + idPere + ";" + identifiant + ";"
				+ intervenant + ";" + intervenantUtilisateur + ";" + libelleProjet + ";" + memo + ";" + modDiffNews
				+ ";" + motifCloture + ";" + nature + ";" + natureInventaire + ";" + nomAlarme + ";"
				+ numIncidentMainteneur + ";" + numeroBdcDivalto + ";" + numeroDI + ";" + numeroDevisDivalto + ";"
				+ numeroLigneDI + ";" + numeroTracking + ";" + objet + ";" + objetActivite + ";" + pere + ";"
				+ piecesJointes + ";" + plateForme + ";" + priorite + ";" + quantite + ";" + rfCdureePrevue + ";"
				+ raisonRFC + ";" + reference + ";" + referenceExterne + ";" + referencePortail + ";" + risqueRFC + ";"
				+ serviceDemandeur + ";" + severite + ";" + siteDemandeur + ";" + siteDestinataire + ";" + solution
				+ ";" + stPresta + ";" + statut + ";" + symptome + ";" + technicienAffecte + ";" + telephoneAContacter
				+ ";" + telephoneDemandeur + ";" + telephoneSite + ";" + theme + ";" + titre + ";" + titreNews + ";"
				+ typeDemande + ";" + typeDeploiement + ";" + typeDossier + ";" + typeInstall + ";" + typePb + ";"
				+ typeRFC + ";" + utilisateurAppelant + ";" + utilisateurDeCloture + ";" + version;
	}
    

}
