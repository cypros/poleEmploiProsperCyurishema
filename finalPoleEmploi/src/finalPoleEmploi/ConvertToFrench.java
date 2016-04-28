package finalPoleEmploi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertToFrench {
	
	static Scanner sc = new Scanner(System.in);

	public static void tradEnFrancais() {
		
		System.out.println("entrer votre mot en javanais:");
		String valeur = sc.nextLine(); //-------->r�cuperation du string saisi par l'utilisateur
		
		String regexVoyelle = "av";
		
		Pattern patternVoyelle = Pattern.compile(regexVoyelle); //-------->cr�ation du pattern qui permet de trouver les caract�res qui se trouve dans le string saisi
			
		Matcher matcherVoyelle = patternVoyelle.matcher(valeur);
		String francais=null;

		while (matcherVoyelle.find()) {  						//-------->chercher dans les matchers s'il y a des caract�res qui matchent avec le pattern cr�� pr�c�dement
			francais= valeur.replaceAll(regexVoyelle, "");		//-------->remplacement des caract�res trouv� par un vide
		}
		System.out.println("La traduction en fran�ais du javanais " + valeur + " est " + francais );
	}
}

