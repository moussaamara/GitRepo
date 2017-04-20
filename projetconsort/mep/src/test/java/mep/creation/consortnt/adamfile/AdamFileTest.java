package mep.creation.consortnt.adamfile;

import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

import mep.creation.client.Appel;
import mep.creation.client.ItfAppelSvc;
import mep.creation.client.Utilisateur;
import mep.creation.consortnt.AppelClient;
import mep.creation.consortnt.fichier.FileAdam;
import mep.creation.consortnt.fichier.util.CSVUtil;

public class AdamFileTest {

	@Test
	
	public void should_get_adam_file(){
		
		FileAdam file = new FileAdam();
		String inputFile = "";
		Appel app = new Appel();
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setId(1L);
		
		
		ItfAppelSvc itfmock = mock(ItfAppelSvc.class);
//		when(itfmock.getAppelParCode(anyString())).thenReturn(app);
		
		//AppelSvcImplService apService= new AppelSvcImplService();
		
		
		
	}
}
