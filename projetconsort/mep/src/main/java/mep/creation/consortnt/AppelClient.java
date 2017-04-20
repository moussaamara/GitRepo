package mep.creation.consortnt;

import java.util.List;

import mep.creation.client.Appel;
import mep.creation.client.ItfAppelSvc;
import mep.creation.consortnt.fichier.FileAdam;
import mep.creation.consortnt.fichier.GenericCSVFile;
import mep.creation.consortnt.fichier.RFCFile;
import mep.creation.consortnt.fichier.util.CSVUtil;

public class AppelClient {

	// private AppelSvcImplService apService;
	private ItfAppelSvc svc;
	Appel ap = null;
	// static Long id;

	public AppelClient(ItfAppelSvc svc) {
		// this.apService = new AppelSvcImplService();
		this.svc = svc;
	}

	/**
	 * Will get the rfc code
	 * 
	 * @param rfcFileName
	 * @return
	 */

	/*
	 * this method will be return project code of RFC
	 */
	public String getProjectCode() {

		String projectCode = ap.getCodeProjet();
		return projectCode;

	}

	public String getRFCCode(String rfcFileName) {
		RFCFile rfc = (RFCFile) CSVUtil.chargerFichierCSV(CSVUtil.RFC, rfcFileName).get(0);
		return rfc.getCodeRFC();
	}

	/**
	 * will get the id of rfcCode
	 * 
	 * @param rfcCode
	 * @return
	 */
	public Long getIdClient(String rfcCode) {

		ap = svc.getAppelParCode(rfcCode);
		Long idClient = ap.getClient().getId();

		return idClient;
	}

	public void manageAdamFile(Long idClient, String adamFileName) {
		// List<GenericCSVFile> selectionLigne =
		// CSVUtil.chargerFichierCSV(CSVUtil.FICHIERADAM, adamFileName);

		List<FileAdam> selectionLigne = (List) CSVUtil.chargerFichierCSV(CSVUtil.FICHIERADAM, adamFileName);

		for (int i = 0; i < selectionLigne.size(); i++) {
			FileAdam nFileAdam = (FileAdam) selectionLigne.get(i);
			nFileAdam.setiDConstructeur(idClient);
		}

		CSVUtil.ecrireFichierCSV(selectionLigne);

	}

	public static void main(String[] args) {

		// AppelClient t = new AppelClient();
		// if (args.length == 0) {
		// System.out.println("Merci de rentrer le nom du fichier");
		// System.exit(2);
		// } else {
		//
		// t.gererGetAppelParCode(args[0]);
		// System.exit(0);
		// }

		// System.out.println("l'ID est: "+ id);
	}

}
