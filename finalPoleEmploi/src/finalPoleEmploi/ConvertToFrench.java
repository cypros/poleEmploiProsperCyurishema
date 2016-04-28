package finalPoleEmploi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertToFrench {
	
	static Scanner sc = new Scanner(System.in);

	public static void tradEnFrancais() {
		
		System.out.println("entrer votre mot en javanais:");
		String valeur = sc.nextLine(); //-------->récuperation du string saisi par l'utilisateur
		
		String regexVoyelle = "av";
		
		Pattern patternVoyelle = Pattern.compile(regexVoyelle); //-------->création du pattern qui permet de trouver les caractères qui se trouve dans le string saisi
			
		Matcher matcherVoyelle = patternVoyelle.matcher(valeur);
		String francais=null;

		while (matcherVoyelle.find()) {  						//-------->chercher dans les matchers s'il y a des caractères qui matchent avec le pattern créé précédement
			francais= valeur.replaceAll(regexVoyelle, "");		//-------->remplacement des caractères trouvé par un vide
		}
		System.out.println("La traduction en français du javanais " + valeur + " est " + francais );
	}
}

