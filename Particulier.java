import java.util.Scanner;

/* Programme permettant de créer une base de données a partir de messageBox
 Ce programme est destiné a détailler l'état de santé des animaux des particuliers
 Une amélioration possible de ce programme est de sauvegarder et charger les données sur disque dur

@author Arnaud
*/

public class Particulier {

	// Attributs
	private String nom;
	//private static int i;
	
	// Méthodes
	public void creer() {
		
	}
	
	// Getters and Setters
			
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	// Main
	public static void main(String[] args) {
		
/*		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		i=j;
		sc.close();
		System.out.println(j);
*/
		
		Fenetre fenetre = new Fenetre();
		fenetre.afficherParticulierDonnees();
		fenetre.afficherParticulierCoche();
		fenetre.afficherAnimalDonnees();
		fenetre.afficherAnimalEtat();
		
		
		
	}
}
