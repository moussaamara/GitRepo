package mep.consortnt;

/** @param Cette classe nous permet d'ajouter des lignes à notre fichier CSV
 * ainsi que les méthodes d'appels et de modification du contenu de ces lignes
 */

public class LigneCSV {
	private long Id;
	private String utilisateurCentre;
	private long assistant;
	private String codeStatutAppel;
	private Long statutAppelIsilog;
	private Long signature;
	private String titre;
	private String nomAssistantUtilisateur;
	private String emailAssistantUtilisateur;
	private String telephoneAssistantUtilisateur;
	private String utilisateurEquipePrivilegiee;
	
	public LigneCSV(long id) {
		super();
		Id = id;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getUtilisateurCentre() {
		return utilisateurCentre;
	}

	public void setUtilisateurCentre(String utilisateurCentre) {
		this.utilisateurCentre = utilisateurCentre;
	}

	public long getAssistant() {
		return assistant;
	}

	public void setAssistant(long assistant) {
		this.assistant = assistant;
	}

	public String getCodeStatutAppel() {
		return codeStatutAppel;
	}

	public void setCodeStatutAppel(String codeStatutAppel) {
		this.codeStatutAppel = codeStatutAppel;
	}

	public Long getStatutAppelIsilog() {
		return statutAppelIsilog;
	}

	public void setStatutAppelIsilog(Long statutAppelIsilog) {
		this.statutAppelIsilog = statutAppelIsilog;
	}

	public Long getSignature() {
		return signature;
	}

	public void setSignature(Long signature) {
		this.signature = signature;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getNomAssistantUtilisateur() {
		return nomAssistantUtilisateur;
	}

	public void setNomAssistantUtilisateur(String nomAssistantUtilisateur) {
		this.nomAssistantUtilisateur = nomAssistantUtilisateur;
	}

	public String getEmailAssistantUtilisateur() {
		return emailAssistantUtilisateur;
	}

	public void setEmailAssistantUtilisateur(String emailAssistantUtilisateur) {
		this.emailAssistantUtilisateur = emailAssistantUtilisateur;
	}

	public String getTelephoneAssistantUtilisateur() {
		return telephoneAssistantUtilisateur;
	}

	public void setTelephoneAssistantUtilisateur(
			String telephoneAssistantUtilisateur) {
		this.telephoneAssistantUtilisateur = telephoneAssistantUtilisateur;
	}

	public String getUtilisateurEquipePrivilegiee() {
		return utilisateurEquipePrivilegiee;
	}

	public void setUtilisateurEquipePrivilegiee(String utilisateurEquipePrivilegiee) {
		this.utilisateurEquipePrivilegiee = utilisateurEquipePrivilegiee;
	}

	@Override
	public String toString() {
		return Id + ";" + utilisateurCentre + ";" + assistant + ";" + codeStatutAppel + ";" + statutAppelIsilog + ";"
				+ signature + ";" + titre + ";" + nomAssistantUtilisateur + ";"
				+ emailAssistantUtilisateur + ";"
				+ telephoneAssistantUtilisateur + ";"
				+ utilisateurEquipePrivilegiee;
	}
	
	
}
