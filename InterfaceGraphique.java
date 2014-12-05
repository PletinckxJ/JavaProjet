/**
 * Projet.
 */
package projetJava;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

/**
 * @author Thomas
 *
 */
public class InterfaceGraphique extends JFrame {

	private Plateau echiquier;
	private PanelInvite menu = new PanelInvite();
	private PanelJeu jeu = new PanelJeu();
	
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
