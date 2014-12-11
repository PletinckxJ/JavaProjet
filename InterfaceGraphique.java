/**
 * Projet.
 */
package projetJava;



import javax.swing.*;


/**
 * @author Thomas
 * Cette classe sert à créer la fenêtre du programme ainsi qu'à contenir les panel d'invitation et de jeu.
 *
 */
public class InterfaceGraphique extends JFrame {

	/**
	 * Variable définissant un panel d'invitation.
	 */
	private PanelInvite menu = new PanelInvite();
	
	/**
	 * Méthode initialisant la fenêtre graphique et y ajoutant le panel d'invitation.
	 */
	public InterfaceGraphique() {
		
		super("Jeu d'échec");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 810, 600);
		
		getContentPane().add(menu);
	}
	
	/**
	 * @param args : paramètres de la ligne de commande.
	 */
	public static void main(String[] args) {
		// Initialisation de la fenêtre du programme.
		InterfaceGraphique frame = new InterfaceGraphique();
		frame.setVisible(true);

	}

}
