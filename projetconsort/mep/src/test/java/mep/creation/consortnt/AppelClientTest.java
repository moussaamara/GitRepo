package mep.creation.consortnt;

import org.junit.Test;

import mep.creation.client.Appel;
import mep.creation.client.AppelSvcImplService;
import mep.creation.client.ItfAppelSvc;
import mep.creation.client.Utilisateur;

import static org.mockito.Mockito.*;

public class AppelClientTest {

	@Test
	public void should_test_gererGetAppelParCode() {
		
		Appel app = new Appel();
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setId(1L);
		app.setClient(utilisateur);
		ItfAppelSvc itfmock = mock(ItfAppelSvc.class);
		when(itfmock.getAppelParCode(anyString())).thenReturn(app);
		
		//AppelSvcImplService apService= new AppelSvcImplService();
		
		AppelClient appel = new AppelClient(itfmock);
		appel.getRFCCode("C:\\Users\\Mtraore\\Documents\\Outils_dev\\RFC_file.csv");
		
	}
}
