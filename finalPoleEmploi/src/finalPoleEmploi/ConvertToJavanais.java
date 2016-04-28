package finalPoleEmploi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertToJavanais {
	

	private static Scanner sc;

	public static void tradEnJavanais() {
		
		final String INCREMENT_JAVANAI = "av";
		sc = new Scanner(System.in);
		
		System.out.println("entrer votre mot:");
		String valeur = sc.nextLine(); //-------->récuperation du string saisi par l'utilisateur 
		
		String regexVoyelle = "[aeiouAEIOU]";
		
		StringBuffer javanais = new StringBuffer();
		Pattern patternVoyelle = Pattern.compile(regexVoyelle);   //-------->création du pattern qui permet de trouver les caractères qui se trouve dans le string saisi
			
		Matcher matcherVoyelle = patternVoyelle.matcher(valeur);

		while (matcherVoyelle.find()) { //-------->chercher dans les matchers s'il y a des caractères qui matchent avec le pattern créé précédement
			Matcher matcherNex = null;
			if (matcherVoyelle.start() > 0) {
				matcherNex = patternVoyelle.matcher(String.valueOf(valeur.charAt(matcherVoyelle.start()-1)));
			} 
			
			if (matcherNex == null || (matcherNex != null && !matcherNex.find())) {
				String rep = matcherVoyelle.group();
				matcherVoyelle.appendReplacement(javanais, INCREMENT_JAVANAI+rep); //-------->remplacer les caractères qui matchent avec le pattern
			}
			
		}
		
		System.out.println("Le javanais du " + valeur + " est " + javanais);
	}

}
