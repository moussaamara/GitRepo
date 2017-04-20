package mep.creation.consortnt.fichier;

import java.util.Date;

public class FileAdam extends GenericCSVFile {
	private String livrable;
	private String type;
	private Date dateHeure;
	private String commentaire;
	private String DropsOuiNon;
	private String releaseDrops;
	private String envtProcessDrops;
	private String dI;
	private String pA;
	private String cpi;
	private String cpiBackup;
	private String sitesDeDeploiement;
	private Long iDConstructeur;

	public FileAdam() {

	}

	public String getLivrable() {
		return livrable;
	}

	public void setLivrable(String livrable) {
		this.livrable = livrable;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateHeure() {
		return dateHeure;
	}

	public void setDateHeure(Date dateHeure) {
		this.dateHeure = dateHeure;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getDropsOuiNon() {
		return DropsOuiNon;
	}

	public void setDropsOuiNon(String dropsOuiNon) {
		DropsOuiNon = dropsOuiNon;
	}

	public String getReleaseDrops() {
		return releaseDrops;
	}

	public void setReleaseDrops(String releaseDrops) {
		this.releaseDrops = releaseDrops;
	}

	public String getEnvtProcessDrops() {
		return envtProcessDrops;
	}

	public void setEnvtProcessDrops(String envtProcessDrops) {
		this.envtProcessDrops = envtProcessDrops;
	}

	public String getdI() {
		return dI;
	}

	public void setdI(String dI) {
		this.dI = dI;
	}

	public String getpA() {
		return pA;
	}

	public void setpA(String pA) {
		this.pA = pA;
	}

	public String getCpi() {
		return cpi;
	}

	public void setCpi(String cpi) {
		this.cpi = cpi;
	}

	public String getCpiBackup() {
		return cpiBackup;
	}

	public void setCpiBackup(String cpiBackup) {
		this.cpiBackup = cpiBackup;
	}

	public String getSitesDeDeploiement() {
		return sitesDeDeploiement;
	}

	public void setSitesDeDeploiement(String sitesDeDeploiement) {
		this.sitesDeDeploiement = sitesDeDeploiement;
	}

	public Long getiDConstructeur() {
		return iDConstructeur;
	}

	public void setiDConstructeur(Long iDConstructeur) {
		this.iDConstructeur = iDConstructeur;
	}

	@Override
	public String toString() {
		return livrable + ";" + type + ";" + dateHeure + ";" + commentaire + ";" + DropsOuiNon + ";" + releaseDrops
				+ ";" + envtProcessDrops + ";" + dI + ";" + pA + ";" + cpi + ";" + cpiBackup + ";" + sitesDeDeploiement
				+ ";" + iDConstructeur;
	}

}