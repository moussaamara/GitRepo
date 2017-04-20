package mep.consortnt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author Moussa
 * @param Cette
 *            classe est conçue pour réaliser notre méthode lecture et
 *            d'écriture de notre fichier CSV
 * 
 * 
 */
public class CSVUtil {

	/*
	 * @param chargerFichierCSV consiste à charger le fichier csv dans le
	 * programme et de réaliser la lecture de celui ci.
	 */
	public static List<NewFileAdam> chargerFichierCSV(String fileName) {
		List<NewFileAdam> resultat = new ArrayList<>();
		File file = new File(fileName);

		/**
		 * @param chargerFichierCSV
		 * 
		 *            Lecture du fichier csv et découpage en colonne
		 */

		if (file.exists()) {
			try {
				Scanner scan = new Scanner(new FileInputStream(file));
				scan.nextLine();
				String line = "";

				while (scan.hasNext()) {
					line = scan.next();

					if (!line.equals("")) {

						String[] tab = line.split(";");
						long idLigne = Long.parseLong(tab[0]);
						NewFileAdam ligneFile = new NewFileAdam(idLigne);
						resultat.add(ligneFile);
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

	public static void ecrireFichierCSV(List<NewFileAdam> collectionLignes) {

		try {
			// Date d = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat(
					"dd-MM-yyyy hh:mm:ss");
			String newFileName = dateFormat.format(new Date());

			File file = new File(newFileName + ".csv");
			// file.toPath().toString();
			file.createNewFile();
			FileWriter writer = new FileWriter(file);

			writer.append(
					"livrable;type;dateHeure;commentaire;dropsOuiNon;releaseDrops;envtProcess;dI;"
							+ "pA;cpi;cpiBackup;sitesDeDeploiement;iDConstructeur")
					.append("\n");
			for (NewFileAdam ligneCSV : collectionLignes) {
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
