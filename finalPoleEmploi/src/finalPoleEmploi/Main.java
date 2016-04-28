package finalPoleEmploi;
import java.util.Scanner;
import finalPoleEmploi.ConvertToFrench;
import finalPoleEmploi.ConvertToJavanais;




	public class Main {
		static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			System.out.println("appuyer sur 1 pour choisir la traduction en javanais ou 2 pour la traduction en français");
			
			
/////////////systeme qui permet l'utilisateur de choisir le type de traduction souhaité		
			
			try {
				int choix =sc.nextInt();
				switch (choix) {
				case 1:
					ConvertToJavanais.tradEnJavanais();
				break;
			
				case 2:
					ConvertToFrench.tradEnFrancais();
				break;
				
				default: System.out.println("vous n'avez pas saisi 1 ou 2");
					break;
				}
				
			} 
			
			catch (Exception e) {
				System.out.println("Erreur de saisi");
			}
		}

	}
