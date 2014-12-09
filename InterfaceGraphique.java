/**
 * Projet.
 */
package projetJava;



import javax.swing.*;


/**
 * @author Thomas
 *
 */
public class InterfaceGraphique extends JFrame {

	private PanelInvite menu = new PanelInvite();
	
	public InterfaceGraphique() {
		
		super("Jeu d'échec");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 810, 600);
		
		getContentPane().add(menu);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InterfaceGraphique frame = new InterfaceGraphique();
		frame.setVisible(true);

	}

}
