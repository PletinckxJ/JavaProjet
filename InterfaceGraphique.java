/**
 * Projet.
 */
package projetJava;



import javax.swing.*;


/**
 * @author Thomas
 *	Cette classe sert � cr�er la fen�tre du programme ainsi qu'� contenir les panel d'invitation et de jeu.
 */
public class InterfaceGraphique extends JFrame {
	/**
	 * Variable d�finissant un panel d'invitation.
	 */
	private PanelInvite menu = new PanelInvite();
	/**
	 * M�thode initialisant la fen�tre graphique et y ajoutant le panel d'invitation.
	 */
	public InterfaceGraphique() {
		
		super("Jeu d'�chec");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 810, 600);
		
		getContentPane().add(menu);
	}
	
	/**
	 * @param args : param�tres de la ligne de commande.
	 */
	public static void main(String[] args) {
		// Initialisation de la fen�tre du programme.
		InterfaceGraphique frame = new InterfaceGraphique();
		frame.setVisible(true);

	}

}
