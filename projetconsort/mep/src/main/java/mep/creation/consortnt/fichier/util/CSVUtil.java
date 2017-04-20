package mep.creation.consortnt.fichier.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import mep.creation.consortnt.fichier.GenericCSVFile;
import mep.creation.consortnt.fichier.FileAdam;
import mep.creation.consortnt.fichier.RFCFile;

/**
 * @author Moussa
 * @param Cette
 *            classe est conçue pour réaliser notre méthode lecture et
 *            d'écriture de notre fichier CSV
 * 
 * 
 */
public class CSVUtil {
	public final static int RFC = 1;
	public final static int FICHIERADAM = 2;
	public final static int DROPS = 3;
	public final static int FICAINJECTER = 4;

	/*
	 * @param chargerFichierCSV consiste à charger le fichier csv dans le
	 * programme et de réaliser la lecture de celui ci.
	 */
	public static List<GenericCSVFile> chargerFichierCSV(int typeFichier, String fileName) {
		List<GenericCSVFile> resultat = new ArrayList<GenericCSVFile>();
		File file = new File(fileName);

		/**
		 * @param chargerFichierCSV
		 * 
		 *            Lecture du fichier csv et découpage en colonne
		 */

		// Entry file reading if exist

		if (file.exists()) {
			try {
				Scanner scan = new Scanner(new FileInputStream(file));
				scan.nextLine();
				String line = "";

				// Execute programm if RFC file exist

				if (typeFichier == RFC) {
					while (scan.hasNext() && line.equals("")) {
						line = scan.next();

						if (!line.equals("")) {

							String[] tab = line.split(";");

							RFCFile ligneRFCFile = new RFCFile();
							ligneRFCFile.setCodeRFC(tab[0]);
							resultat.add(ligneRFCFile);
						}

					}
				}

				// Execute programm if adam file exist

				if (typeFichier == FICHIERADAM) {
					while (scan.hasNext()) {
						line = scan.next();
						if (!line.equals("")) {

							FileAdam adamFile = new FileAdam();
							String[] split = line.trim().split(";");
							adamFile.setLivrable(split[0]);
							adamFile.setType(split[1]);
							adamFile.setDateHeure(DateUtil.dateConvert(split[2]));
							adamFile.setCommentaire(split[3]);
							adamFile.setDropsOuiNon(split[4]);
							adamFile.setReleaseDrops(split[5]);
							adamFile.setEnvtProcessDrops(split[6]);
							adamFile.setdI(split[7]);
						 	adamFile.setpA(split[8]);
							adamFile.setCpi(split[9]);
							adamFile.setCpiBackup(split[10]);
							adamFile.setSitesDeDeploiement(split[11]);
							adamFile.setSitesDeDeploiement(split[12]);
							resultat.add(adamFile);

						}
					}
				}

				scan.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Le fichier donné n'existe pas");
			System.exit(1);
		}

		return resultat;

		/**
		 * @return le resultat renvoyé est de type liste qui contient l'objet
		 *         ligne CSV créé précedemment dans la classe @LigneCSV
		 */
	}

	public static void ecrireFichierCSV(List<FileAdam> collectionLignes) {

		try {
			// Date d = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			String newFileName = dateFormat.format(new Date());

			File file = new File(newFileName + ".csv");
			// file.toPath().toString();
			file.createNewFile();
			FileWriter writer = new FileWriter(file);

			writer.append("livrable;type;dateHeure;commentaire;dropsOuiNon;releaseDrops;envtProcess;dI;"
					+ "pA;cpi;cpiBackup;sitesDeDeploiement;iDConstructeur").append("\n");
			for (FileAdam ligneCSV : collectionLignes) {
				writer.append(ligneCSV.toString()).append("\n");

			}
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param ecrireFichierCSV
	 * 
	 *            Cette méthode permet d'écrire les différentes lignes du
	 *            fichier dans le CSV
	 * 
	 */
}
