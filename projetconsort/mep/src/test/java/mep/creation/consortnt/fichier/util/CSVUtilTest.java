package mep.creation.consortnt.fichier.util;

import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import mep.creation.consortnt.fichier.FileAdam;
import mep.creation.consortnt.fichier.RFCFile;

public class CSVUtilTest {

	@SuppressWarnings("deprecation")
	@Test
	public void should_get_rfc_code(){
		
		RFCFile rfc = (RFCFile) CSVUtil.chargerFichierCSV(CSVUtil.RFC, "D:\\Files\\file.csv").get(0);
		Assert.assertEquals("RFC8039571", rfc.getCodeRFC());
	}
	
	@Test
	public void should_get_adam_files(){
		
		List<FileAdam> adamFiles = (List) CSVUtil.chargerFichierCSV(CSVUtil.FICHIERADAM, "D:\\Files\\adamFile.csv");
		Assert.assertTrue(adamFiles.get(0) instanceof FileAdam);
		Assert.assertEquals("liv1", adamFiles.get(0).getLivrable());
		Assert.assertEquals("REAL", adamFiles.get(0).getType());
	}
	
}
