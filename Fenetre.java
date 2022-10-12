import javax.swing.JOptionPane;

public class Fenetre {
	private String reponse;
	private String reponse2;
	
	Animal animal = new Animal();
	String erreur = "erreur";
	String erreur2 = "erreur2";
//	animal.setEspece(erreur);
//	animal.setEtatMaladie(erreur2);
	
	
	
	
	public void afficherParticulierDonnees() {
		JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
	    String nom2 = jop.showInputDialog(null, "Veuillez décliner votre identité : Prénom ", "Identification", JOptionPane.QUESTION_MESSAGE);
	    Particulier particulier = new Particulier();
		particulier.setNom(nom2);
	    jop2.showMessageDialog(null, "Votre prenom est " + particulier.getNom(), "Identité", JOptionPane.INFORMATION_MESSAGE);
	  	
	}
	public void afficherParticulierCoche() {
		String[] espece = {"chien", "chat", "lapin", "hamster", "tortue"};
		JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
		reponse = (String)jop.showInputDialog(null, 
		"Veuillez indiquer votre animal de compagnie",
		"Type de l'animal",
		JOptionPane.QUESTION_MESSAGE,
		null,
		espece,
		espece[2]);
		
		animal.setEspece(reponse);
		
		jop2.showMessageDialog(null, "Votre animal est un (une) " + animal.getEspece(), "Type d'animal", JOptionPane.INFORMATION_MESSAGE);
	
		String[] tableauEtatSante = {"tres mauvaise sante", "assez mauvaise sante", "sante moyenne", "assez bonne sante", "tres bonne sante"};
		JOptionPane jop3 = new JOptionPane(), jop4 = new JOptionPane();
		reponse2 = (String)jop3.showInputDialog(null, 
		"Veuillez indiquer l'etat de sante de votre "+animal.getEspece()+" ",
		"Etat de sante de l'animal",
		 JOptionPane.QUESTION_MESSAGE,
		 null,
		 tableauEtatSante,
		 tableauEtatSante[2]);
		 animal.setEtatMaladie(reponse2);
		 jop4.showMessageDialog(null, "Son état de santé est : " + animal.getEtatMaladie(), "Etat de sante", JOptionPane.INFORMATION_MESSAGE);
	}
	public void afficherAnimalDonnees() {
		JOptionPane jop = new JOptionPane();
		jop.showMessageDialog(null, "Votre animal est un (une) " + animal.getEspece() + " et son etat de sante est : " + animal.getEtatMaladie(), "Recapitulatif", JOptionPane.INFORMATION_MESSAGE);
	}
	public void afficherAnimalEtat() {
		JOptionPane jop = new JOptionPane();
		if (animal.getEtatMaladie().contentEquals("tres mauvaise sante")||animal.getEtatMaladie().contentEquals("assez mauvaise sante")) {
			jop.showMessageDialog(null, "Emmenez votre " + animal.getEspece() + " au veterinaire urgemment", "Recapitulatif", JOptionPane.WARNING_MESSAGE);
		}
		else if (animal.getEtatMaladie().contentEquals("sante moyenne")) {
			jop.showMessageDialog(null, "Surveillez bien l'etat de sante de votre " + animal.getEspece(), "Recapitulatif", JOptionPane.WARNING_MESSAGE);
		}
		else {
			jop.showMessageDialog(null, "Votre " + animal.getEspece() + " ne necessite pas d'observations", "Recapitulatif", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
