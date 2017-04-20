package mep.consortnt;

import java.io.File;
import java.util.List;

import client.Appel;
import client.AppelSvcImplService;
import client.GetAppelParCode;
import client.ItfAppelSvc;

public class AppelClient {

	private AppelSvcImplService apService;
	private static ItfAppelSvc svc;
	Appel ap = null;
//	static Long id;
	
	public AppelClient() {
		this.apService = new AppelSvcImplService();
		this.svc = apService.getAppelSvcImplPort();
	}
	
	
	public void gererGetAppelParCode(String recupCodeMEP) {

		
		FileRFC rfc = new FileRFC(recupCodeMEP);
		
		ap = svc.getAppelParCode(rfc.lireRFCfile());
		
		Long id = ap.getClient().getId();
		
		
		List<NewFileAdam> selectionLigne = CSVUtil
				.chargerFichierCSV(recupCodeMEP);

	for (int i = 0; i < selectionLigne.size(); i++) {
			NewFileAdam nFileAdam = selectionLigne.get(i);
			nFileAdam.setiDConstructeur(id);
	}

		CSVUtil.ecrireFichierCSV(selectionLigne);

	}
	

	public static void main(String[] args) {

		AppelClient t = new AppelClient();
		if (args.length == 0) {
			System.out.println("Merci de rentrer le nom du fichier");
			System.exit(2);
		} else {

			t.gererGetAppelParCode(args[0]);
			System.exit(0);
		}
		
//		System.out.println("l'ID est: "+ id);
	}

}
