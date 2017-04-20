
package mep.creation.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetListeAppelParId_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "getListeAppelParId");
    private final static QName _EnregistrerDEPUlis_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerDEPUlis");
    private final static QName _EnregistrerLigneCommandeDivaltoResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerLigneCommandeDivaltoResponse");
    private final static QName _EnregistrerRFCUlis_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerRFCUlis");
    private final static QName _GetAppelParCode_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "getAppelParCode");
    private final static QName _EnregistrerAlarmeHyperviseurResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerAlarmeHyperviseurResponse");
    private final static QName _RechercherAppelParDIObjetResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "rechercherAppelParDI_ObjetResponse");
    private final static QName _GetListeAppelParIdPere_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "getListeAppelParIdPere");
    private final static QName _RechercherAppelParSolutionResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "rechercherAppelParSolutionResponse");
    private final static QName _RechercherAppelPortail_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "rechercherAppelPortail");
    private final static QName _RechercherAppelPortailResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "rechercherAppelPortailResponse");
    private final static QName _EnregistrerRFCUlisResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerRFCUlisResponse");
    private final static QName _GetAppelParId_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "getAppelParId");
    private final static QName _EnregistrerDEPUlisResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerDEPUlisResponse");
    private final static QName _RechercherParDateDeMiseAJourMinimumResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "rechercherParDateDeMiseAJourMinimumResponse");
    private final static QName _RechercherIncidentParDateClotureAlarmeRenseigne_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "rechercherIncidentParDateClotureAlarmeRenseigne");
    private final static QName _RechercherParDateDeMiseAJourMinimum_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "rechercherParDateDeMiseAJourMinimum");
    private final static QName _EnregistrerLigneCommandeDivalto_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerLigneCommandeDivalto");
    private final static QName _GetListeAppelParIdResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "getListeAppelParIdResponse");
    private final static QName _RechercherIncidentParDateClotureAlarmeRenseigneResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "rechercherIncidentParDateClotureAlarmeRenseigneResponse");
    private final static QName _ObtenirListeAppelParNatureEtDatesResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "obtenirListeAppelParNatureEtDatesResponse");
    private final static QName _GetEmailEquipeDeploiementAppel_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "getEmailEquipeDeploiementAppel");
    private final static QName _TechniqueException_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "TechniqueException");
    private final static QName _GetListeAppelParIdPereResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "getListeAppelParIdPereResponse");
    private final static QName _GetEmailEquipeDeploiementAppelResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "getEmailEquipeDeploiementAppelResponse");
    private final static QName _ObtenirListeAppelParNatureEtDates_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "obtenirListeAppelParNatureEtDates");
    private final static QName _RechercherAppelParSolution_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "rechercherAppelParSolution");
    private final static QName _RechercherAppelParDIObjet_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "rechercherAppelParDI_Objet");
    private final static QName _EnregistrerAppel_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerAppel");
    private final static QName _EnregistrerAlarmeHyperviseur_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerAlarmeHyperviseur");
    private final static QName _GetAppelParCodeResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "getAppelParCodeResponse");
    private final static QName _EnregistrerAppelResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerAppelResponse");
    private final static QName _GetAppelParIdResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "getAppelParIdResponse");
    private final static QName _EnregistrerDEPDivaltoResponse_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerDEPDivaltoResponse");
    private final static QName _EnregistrerDEPDivalto_QNAME = new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "enregistrerDEPDivalto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TechniqueException }
     * 
     */
    public TechniqueException createTechniqueException() {
        return new TechniqueException();
    }

    /**
     * Create an instance of {@link EnregistrerAlarmeHyperviseurResponse }
     * 
     */
    public EnregistrerAlarmeHyperviseurResponse createEnregistrerAlarmeHyperviseurResponse() {
        return new EnregistrerAlarmeHyperviseurResponse();
    }

    /**
     * Create an instance of {@link EnregistrerDEPUlisResponse }
     * 
     */
    public EnregistrerDEPUlisResponse createEnregistrerDEPUlisResponse() {
        return new EnregistrerDEPUlisResponse();
    }

    /**
     * Create an instance of {@link Appel }
     * 
     */
    public Appel createAppel() {
        return new Appel();
    }

    /**
     * Create an instance of {@link EnregistrerAppelResponse }
     * 
     */
    public EnregistrerAppelResponse createEnregistrerAppelResponse() {
        return new EnregistrerAppelResponse();
    }

    /**
     * Create an instance of {@link GetEmailEquipeDeploiementAppel }
     * 
     */
    public GetEmailEquipeDeploiementAppel createGetEmailEquipeDeploiementAppel() {
        return new GetEmailEquipeDeploiementAppel();
    }

    /**
     * Create an instance of {@link RechercherIncidentParDateClotureAlarmeRenseigne }
     * 
     */
    public RechercherIncidentParDateClotureAlarmeRenseigne createRechercherIncidentParDateClotureAlarmeRenseigne() {
        return new RechercherIncidentParDateClotureAlarmeRenseigne();
    }

    /**
     * Create an instance of {@link GetEmailEquipeDeploiementAppelResponse }
     * 
     */
    public GetEmailEquipeDeploiementAppelResponse createGetEmailEquipeDeploiementAppelResponse() {
        return new GetEmailEquipeDeploiementAppelResponse();
    }

    /**
     * Create an instance of {@link CommandeDTO }
     * 
     */
    public CommandeDTO createCommandeDTO() {
        return new CommandeDTO();
    }

    /**
     * Create an instance of {@link EnregistrerDEPDivalto }
     * 
     */
    public EnregistrerDEPDivalto createEnregistrerDEPDivalto() {
        return new EnregistrerDEPDivalto();
    }

    /**
     * Create an instance of {@link RechercherAppelParSolutionResponse }
     * 
     */
    public RechercherAppelParSolutionResponse createRechercherAppelParSolutionResponse() {
        return new RechercherAppelParSolutionResponse();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link RechercherIncidentParDateClotureAlarmeRenseigneResponse }
     * 
     */
    public RechercherIncidentParDateClotureAlarmeRenseigneResponse createRechercherIncidentParDateClotureAlarmeRenseigneResponse() {
        return new RechercherIncidentParDateClotureAlarmeRenseigneResponse();
    }

    /**
     * Create an instance of {@link RechercherParDateDeMiseAJourMinimumResponse }
     * 
     */
    public RechercherParDateDeMiseAJourMinimumResponse createRechercherParDateDeMiseAJourMinimumResponse() {
        return new RechercherParDateDeMiseAJourMinimumResponse();
    }

    /**
     * Create an instance of {@link EnregistrerAlarmeHyperviseur }
     * 
     */
    public EnregistrerAlarmeHyperviseur createEnregistrerAlarmeHyperviseur() {
        return new EnregistrerAlarmeHyperviseur();
    }

    /**
     * Create an instance of {@link StatutAppel }
     * 
     */
    public StatutAppel createStatutAppel() {
        return new StatutAppel();
    }

    /**
     * Create an instance of {@link Theme }
     * 
     */
    public Theme createTheme() {
        return new Theme();
    }

    /**
     * Create an instance of {@link EnregistrerDEPUlis }
     * 
     */
    public EnregistrerDEPUlis createEnregistrerDEPUlis() {
        return new EnregistrerDEPUlis();
    }

    /**
     * Create an instance of {@link LigneCommandeDTO }
     * 
     */
    public LigneCommandeDTO createLigneCommandeDTO() {
        return new LigneCommandeDTO();
    }

    /**
     * Create an instance of {@link GetListeAppelParId }
     * 
     */
    public GetListeAppelParId createGetListeAppelParId() {
        return new GetListeAppelParId();
    }

    /**
     * Create an instance of {@link PieceJointe }
     * 
     */
    public PieceJointe createPieceJointe() {
        return new PieceJointe();
    }

    /**
     * Create an instance of {@link GetAppelParIdResponse }
     * 
     */
    public GetAppelParIdResponse createGetAppelParIdResponse() {
        return new GetAppelParIdResponse();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link GetListeAppelParIdPereResponse }
     * 
     */
    public GetListeAppelParIdPereResponse createGetListeAppelParIdPereResponse() {
        return new GetListeAppelParIdPereResponse();
    }

    /**
     * Create an instance of {@link RechercherAppelPortailResponse }
     * 
     */
    public RechercherAppelPortailResponse createRechercherAppelPortailResponse() {
        return new RechercherAppelPortailResponse();
    }

    /**
     * Create an instance of {@link Alarme }
     * 
     */
    public Alarme createAlarme() {
        return new Alarme();
    }

    /**
     * Create an instance of {@link GetAppelParCode }
     * 
     */
    public GetAppelParCode createGetAppelParCode() {
        return new GetAppelParCode();
    }

    /**
     * Create an instance of {@link Equipe }
     * 
     */
    public Equipe createEquipe() {
        return new Equipe();
    }

    /**
     * Create an instance of {@link RechercherAppelParDIObjetResponse }
     * 
     */
    public RechercherAppelParDIObjetResponse createRechercherAppelParDIObjetResponse() {
        return new RechercherAppelParDIObjetResponse();
    }

    /**
     * Create an instance of {@link RechercherParDateDeMiseAJourMinimum }
     * 
     */
    public RechercherParDateDeMiseAJourMinimum createRechercherParDateDeMiseAJourMinimum() {
        return new RechercherParDateDeMiseAJourMinimum();
    }

    /**
     * Create an instance of {@link EnregistrerLigneCommandeDivalto }
     * 
     */
    public EnregistrerLigneCommandeDivalto createEnregistrerLigneCommandeDivalto() {
        return new EnregistrerLigneCommandeDivalto();
    }

    /**
     * Create an instance of {@link RechercherAppelParSolution }
     * 
     */
    public RechercherAppelParSolution createRechercherAppelParSolution() {
        return new RechercherAppelParSolution();
    }

    /**
     * Create an instance of {@link Objet }
     * 
     */
    public Objet createObjet() {
        return new Objet();
    }

    /**
     * Create an instance of {@link RechercherAppelParDIObjet }
     * 
     */
    public RechercherAppelParDIObjet createRechercherAppelParDIObjet() {
        return new RechercherAppelParDIObjet();
    }

    /**
     * Create an instance of {@link GetAppelParCodeResponse }
     * 
     */
    public GetAppelParCodeResponse createGetAppelParCodeResponse() {
        return new GetAppelParCodeResponse();
    }

    /**
     * Create an instance of {@link GetListeAppelParIdResponse }
     * 
     */
    public GetListeAppelParIdResponse createGetListeAppelParIdResponse() {
        return new GetListeAppelParIdResponse();
    }

    /**
     * Create an instance of {@link EnregistrerRFCUlis }
     * 
     */
    public EnregistrerRFCUlis createEnregistrerRFCUlis() {
        return new EnregistrerRFCUlis();
    }

    /**
     * Create an instance of {@link GetListeAppelParIdPere }
     * 
     */
    public GetListeAppelParIdPere createGetListeAppelParIdPere() {
        return new GetListeAppelParIdPere();
    }

    /**
     * Create an instance of {@link GetAppelParId }
     * 
     */
    public GetAppelParId createGetAppelParId() {
        return new GetAppelParId();
    }

    /**
     * Create an instance of {@link EnregistrerLigneCommandeDivaltoResponse }
     * 
     */
    public EnregistrerLigneCommandeDivaltoResponse createEnregistrerLigneCommandeDivaltoResponse() {
        return new EnregistrerLigneCommandeDivaltoResponse();
    }

    /**
     * Create an instance of {@link RechercherAppelPortail }
     * 
     */
    public RechercherAppelPortail createRechercherAppelPortail() {
        return new RechercherAppelPortail();
    }

    /**
     * Create an instance of {@link ObtenirListeAppelParNatureEtDates }
     * 
     */
    public ObtenirListeAppelParNatureEtDates createObtenirListeAppelParNatureEtDates() {
        return new ObtenirListeAppelParNatureEtDates();
    }

    /**
     * Create an instance of {@link EnregistrerRFCUlisResponse }
     * 
     */
    public EnregistrerRFCUlisResponse createEnregistrerRFCUlisResponse() {
        return new EnregistrerRFCUlisResponse();
    }

    /**
     * Create an instance of {@link EnregistrerDEPDivaltoResponse }
     * 
     */
    public EnregistrerDEPDivaltoResponse createEnregistrerDEPDivaltoResponse() {
        return new EnregistrerDEPDivaltoResponse();
    }

    /**
     * Create an instance of {@link EnregistrerAppel }
     * 
     */
    public EnregistrerAppel createEnregistrerAppel() {
        return new EnregistrerAppel();
    }

    /**
     * Create an instance of {@link ObtenirListeAppelParNatureEtDatesResponse }
     * 
     */
    public ObtenirListeAppelParNatureEtDatesResponse createObtenirListeAppelParNatureEtDatesResponse() {
        return new ObtenirListeAppelParNatureEtDatesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeAppelParId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "getListeAppelParId")
    public JAXBElement<GetListeAppelParId> createGetListeAppelParId(GetListeAppelParId value) {
        return new JAXBElement<GetListeAppelParId>(_GetListeAppelParId_QNAME, GetListeAppelParId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerDEPUlis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerDEPUlis")
    public JAXBElement<EnregistrerDEPUlis> createEnregistrerDEPUlis(EnregistrerDEPUlis value) {
        return new JAXBElement<EnregistrerDEPUlis>(_EnregistrerDEPUlis_QNAME, EnregistrerDEPUlis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerLigneCommandeDivaltoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerLigneCommandeDivaltoResponse")
    public JAXBElement<EnregistrerLigneCommandeDivaltoResponse> createEnregistrerLigneCommandeDivaltoResponse(EnregistrerLigneCommandeDivaltoResponse value) {
        return new JAXBElement<EnregistrerLigneCommandeDivaltoResponse>(_EnregistrerLigneCommandeDivaltoResponse_QNAME, EnregistrerLigneCommandeDivaltoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerRFCUlis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerRFCUlis")
    public JAXBElement<EnregistrerRFCUlis> createEnregistrerRFCUlis(EnregistrerRFCUlis value) {
        return new JAXBElement<EnregistrerRFCUlis>(_EnregistrerRFCUlis_QNAME, EnregistrerRFCUlis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppelParCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "getAppelParCode")
    public JAXBElement<GetAppelParCode> createGetAppelParCode(GetAppelParCode value) {
        return new JAXBElement<GetAppelParCode>(_GetAppelParCode_QNAME, GetAppelParCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerAlarmeHyperviseurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerAlarmeHyperviseurResponse")
    public JAXBElement<EnregistrerAlarmeHyperviseurResponse> createEnregistrerAlarmeHyperviseurResponse(EnregistrerAlarmeHyperviseurResponse value) {
        return new JAXBElement<EnregistrerAlarmeHyperviseurResponse>(_EnregistrerAlarmeHyperviseurResponse_QNAME, EnregistrerAlarmeHyperviseurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherAppelParDIObjetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "rechercherAppelParDI_ObjetResponse")
    public JAXBElement<RechercherAppelParDIObjetResponse> createRechercherAppelParDIObjetResponse(RechercherAppelParDIObjetResponse value) {
        return new JAXBElement<RechercherAppelParDIObjetResponse>(_RechercherAppelParDIObjetResponse_QNAME, RechercherAppelParDIObjetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeAppelParIdPere }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "getListeAppelParIdPere")
    public JAXBElement<GetListeAppelParIdPere> createGetListeAppelParIdPere(GetListeAppelParIdPere value) {
        return new JAXBElement<GetListeAppelParIdPere>(_GetListeAppelParIdPere_QNAME, GetListeAppelParIdPere.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherAppelParSolutionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "rechercherAppelParSolutionResponse")
    public JAXBElement<RechercherAppelParSolutionResponse> createRechercherAppelParSolutionResponse(RechercherAppelParSolutionResponse value) {
        return new JAXBElement<RechercherAppelParSolutionResponse>(_RechercherAppelParSolutionResponse_QNAME, RechercherAppelParSolutionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherAppelPortail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "rechercherAppelPortail")
    public JAXBElement<RechercherAppelPortail> createRechercherAppelPortail(RechercherAppelPortail value) {
        return new JAXBElement<RechercherAppelPortail>(_RechercherAppelPortail_QNAME, RechercherAppelPortail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherAppelPortailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "rechercherAppelPortailResponse")
    public JAXBElement<RechercherAppelPortailResponse> createRechercherAppelPortailResponse(RechercherAppelPortailResponse value) {
        return new JAXBElement<RechercherAppelPortailResponse>(_RechercherAppelPortailResponse_QNAME, RechercherAppelPortailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerRFCUlisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerRFCUlisResponse")
    public JAXBElement<EnregistrerRFCUlisResponse> createEnregistrerRFCUlisResponse(EnregistrerRFCUlisResponse value) {
        return new JAXBElement<EnregistrerRFCUlisResponse>(_EnregistrerRFCUlisResponse_QNAME, EnregistrerRFCUlisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppelParId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "getAppelParId")
    public JAXBElement<GetAppelParId> createGetAppelParId(GetAppelParId value) {
        return new JAXBElement<GetAppelParId>(_GetAppelParId_QNAME, GetAppelParId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerDEPUlisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerDEPUlisResponse")
    public JAXBElement<EnregistrerDEPUlisResponse> createEnregistrerDEPUlisResponse(EnregistrerDEPUlisResponse value) {
        return new JAXBElement<EnregistrerDEPUlisResponse>(_EnregistrerDEPUlisResponse_QNAME, EnregistrerDEPUlisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherParDateDeMiseAJourMinimumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "rechercherParDateDeMiseAJourMinimumResponse")
    public JAXBElement<RechercherParDateDeMiseAJourMinimumResponse> createRechercherParDateDeMiseAJourMinimumResponse(RechercherParDateDeMiseAJourMinimumResponse value) {
        return new JAXBElement<RechercherParDateDeMiseAJourMinimumResponse>(_RechercherParDateDeMiseAJourMinimumResponse_QNAME, RechercherParDateDeMiseAJourMinimumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherIncidentParDateClotureAlarmeRenseigne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "rechercherIncidentParDateClotureAlarmeRenseigne")
    public JAXBElement<RechercherIncidentParDateClotureAlarmeRenseigne> createRechercherIncidentParDateClotureAlarmeRenseigne(RechercherIncidentParDateClotureAlarmeRenseigne value) {
        return new JAXBElement<RechercherIncidentParDateClotureAlarmeRenseigne>(_RechercherIncidentParDateClotureAlarmeRenseigne_QNAME, RechercherIncidentParDateClotureAlarmeRenseigne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherParDateDeMiseAJourMinimum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "rechercherParDateDeMiseAJourMinimum")
    public JAXBElement<RechercherParDateDeMiseAJourMinimum> createRechercherParDateDeMiseAJourMinimum(RechercherParDateDeMiseAJourMinimum value) {
        return new JAXBElement<RechercherParDateDeMiseAJourMinimum>(_RechercherParDateDeMiseAJourMinimum_QNAME, RechercherParDateDeMiseAJourMinimum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerLigneCommandeDivalto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerLigneCommandeDivalto")
    public JAXBElement<EnregistrerLigneCommandeDivalto> createEnregistrerLigneCommandeDivalto(EnregistrerLigneCommandeDivalto value) {
        return new JAXBElement<EnregistrerLigneCommandeDivalto>(_EnregistrerLigneCommandeDivalto_QNAME, EnregistrerLigneCommandeDivalto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeAppelParIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "getListeAppelParIdResponse")
    public JAXBElement<GetListeAppelParIdResponse> createGetListeAppelParIdResponse(GetListeAppelParIdResponse value) {
        return new JAXBElement<GetListeAppelParIdResponse>(_GetListeAppelParIdResponse_QNAME, GetListeAppelParIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherIncidentParDateClotureAlarmeRenseigneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "rechercherIncidentParDateClotureAlarmeRenseigneResponse")
    public JAXBElement<RechercherIncidentParDateClotureAlarmeRenseigneResponse> createRechercherIncidentParDateClotureAlarmeRenseigneResponse(RechercherIncidentParDateClotureAlarmeRenseigneResponse value) {
        return new JAXBElement<RechercherIncidentParDateClotureAlarmeRenseigneResponse>(_RechercherIncidentParDateClotureAlarmeRenseigneResponse_QNAME, RechercherIncidentParDateClotureAlarmeRenseigneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenirListeAppelParNatureEtDatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "obtenirListeAppelParNatureEtDatesResponse")
    public JAXBElement<ObtenirListeAppelParNatureEtDatesResponse> createObtenirListeAppelParNatureEtDatesResponse(ObtenirListeAppelParNatureEtDatesResponse value) {
        return new JAXBElement<ObtenirListeAppelParNatureEtDatesResponse>(_ObtenirListeAppelParNatureEtDatesResponse_QNAME, ObtenirListeAppelParNatureEtDatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailEquipeDeploiementAppel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "getEmailEquipeDeploiementAppel")
    public JAXBElement<GetEmailEquipeDeploiementAppel> createGetEmailEquipeDeploiementAppel(GetEmailEquipeDeploiementAppel value) {
        return new JAXBElement<GetEmailEquipeDeploiementAppel>(_GetEmailEquipeDeploiementAppel_QNAME, GetEmailEquipeDeploiementAppel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechniqueException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "TechniqueException")
    public JAXBElement<TechniqueException> createTechniqueException(TechniqueException value) {
        return new JAXBElement<TechniqueException>(_TechniqueException_QNAME, TechniqueException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeAppelParIdPereResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "getListeAppelParIdPereResponse")
    public JAXBElement<GetListeAppelParIdPereResponse> createGetListeAppelParIdPereResponse(GetListeAppelParIdPereResponse value) {
        return new JAXBElement<GetListeAppelParIdPereResponse>(_GetListeAppelParIdPereResponse_QNAME, GetListeAppelParIdPereResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmailEquipeDeploiementAppelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "getEmailEquipeDeploiementAppelResponse")
    public JAXBElement<GetEmailEquipeDeploiementAppelResponse> createGetEmailEquipeDeploiementAppelResponse(GetEmailEquipeDeploiementAppelResponse value) {
        return new JAXBElement<GetEmailEquipeDeploiementAppelResponse>(_GetEmailEquipeDeploiementAppelResponse_QNAME, GetEmailEquipeDeploiementAppelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenirListeAppelParNatureEtDates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "obtenirListeAppelParNatureEtDates")
    public JAXBElement<ObtenirListeAppelParNatureEtDates> createObtenirListeAppelParNatureEtDates(ObtenirListeAppelParNatureEtDates value) {
        return new JAXBElement<ObtenirListeAppelParNatureEtDates>(_ObtenirListeAppelParNatureEtDates_QNAME, ObtenirListeAppelParNatureEtDates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherAppelParSolution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "rechercherAppelParSolution")
    public JAXBElement<RechercherAppelParSolution> createRechercherAppelParSolution(RechercherAppelParSolution value) {
        return new JAXBElement<RechercherAppelParSolution>(_RechercherAppelParSolution_QNAME, RechercherAppelParSolution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherAppelParDIObjet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "rechercherAppelParDI_Objet")
    public JAXBElement<RechercherAppelParDIObjet> createRechercherAppelParDIObjet(RechercherAppelParDIObjet value) {
        return new JAXBElement<RechercherAppelParDIObjet>(_RechercherAppelParDIObjet_QNAME, RechercherAppelParDIObjet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerAppel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerAppel")
    public JAXBElement<EnregistrerAppel> createEnregistrerAppel(EnregistrerAppel value) {
        return new JAXBElement<EnregistrerAppel>(_EnregistrerAppel_QNAME, EnregistrerAppel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerAlarmeHyperviseur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerAlarmeHyperviseur")
    public JAXBElement<EnregistrerAlarmeHyperviseur> createEnregistrerAlarmeHyperviseur(EnregistrerAlarmeHyperviseur value) {
        return new JAXBElement<EnregistrerAlarmeHyperviseur>(_EnregistrerAlarmeHyperviseur_QNAME, EnregistrerAlarmeHyperviseur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppelParCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "getAppelParCodeResponse")
    public JAXBElement<GetAppelParCodeResponse> createGetAppelParCodeResponse(GetAppelParCodeResponse value) {
        return new JAXBElement<GetAppelParCodeResponse>(_GetAppelParCodeResponse_QNAME, GetAppelParCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerAppelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerAppelResponse")
    public JAXBElement<EnregistrerAppelResponse> createEnregistrerAppelResponse(EnregistrerAppelResponse value) {
        return new JAXBElement<EnregistrerAppelResponse>(_EnregistrerAppelResponse_QNAME, EnregistrerAppelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppelParIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "getAppelParIdResponse")
    public JAXBElement<GetAppelParIdResponse> createGetAppelParIdResponse(GetAppelParIdResponse value) {
        return new JAXBElement<GetAppelParIdResponse>(_GetAppelParIdResponse_QNAME, GetAppelParIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerDEPDivaltoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerDEPDivaltoResponse")
    public JAXBElement<EnregistrerDEPDivaltoResponse> createEnregistrerDEPDivaltoResponse(EnregistrerDEPDivaltoResponse value) {
        return new JAXBElement<EnregistrerDEPDivaltoResponse>(_EnregistrerDEPDivaltoResponse_QNAME, EnregistrerDEPDivaltoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnregistrerDEPDivalto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.isiwebinterface.ass.inf.suo.fr/", name = "enregistrerDEPDivalto")
    public JAXBElement<EnregistrerDEPDivalto> createEnregistrerDEPDivalto(EnregistrerDEPDivalto value) {
        return new JAXBElement<EnregistrerDEPDivalto>(_EnregistrerDEPDivalto_QNAME, EnregistrerDEPDivalto.class, null, value);
    }

}
