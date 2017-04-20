package mep.consortnt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileRFC {
	
	private String fileName;
	
	public FileRFC(String nameFile){
		this.fileName = nameFile;
	}
	
	public String lireRFCfile (){
		
		File file = new File(fileName);
		String codeMEP = "" ;
		
		if(file.exists()){
			try {
				Scanner scan = new Scanner(new FileInputStream(file));
				scan.nextLine();
				String line = "";

				while (scan.hasNext() && line.equals("")) {
					line = scan.next();
					
					if(!line.equals("")){
						codeMEP = line.split(";")[0];
					}
				}
				//codeMEP = line;
				scan.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Le fichier donné n'existe pas");
			System.exit(1);
		}
		
		return codeMEP;
		}
	}

