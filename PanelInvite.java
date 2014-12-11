/**
 * Classe créée pour l'interface graphique de notre jeu d'échec pour le projet java 2014.
 */
package projetJava;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author Thomas
 *	Cette classe sert à créer un panel d'invitation ainsi qu'à créer le panel de jeu.
 */
public class PanelInvite extends JPanel implements ActionListener {
	/**
	 * Premier joueur à être encodé.
	 */
	private JTextField joueur1 = new JTextField();
	/**
	 * Deuxième joueur à être encodé.
	 */
	private JTextField joueur2 = new JTextField();
	/**
	 * Méthode initialisant l'interface graphique de la fenêtre d'invitation.
	 */
	public PanelInvite() {
		// Initialisation de la taille et du layout de la fenêtre d'invitation.
		setSize(500, 500);
		setLayout(null);
		// Iniatialisation du label servant à contenir le premier joueur.
		JLabel invite1 = new JLabel("Joueur 1 :");
		joueur1.setMaximumSize(new Dimension(150, 30));
		invite1.setBounds(250,100,100,50);
		joueur1.setBounds(350, 110, 150, 30);
		this.add(invite1);
		this.add(joueur1);
		// Iniatialisation du label servant à contenir le deuxième joueur.
		JLabel invite2 = new JLabel("Joueur 2 :");
		joueur2.setMaximumSize(new Dimension(150, 30));
		invite2.setBounds(250, 140, 100, 50);
		joueur2.setBounds(350, 150, 150, 30);
		this.add(invite2);
		this.add(joueur2);
		// Initialisation du bouton démarrer.
		JButton start = new JButton("Start");
		start.addActionListener(this);
		start.setBounds(300, 220, 150, 30);
		this.add(start);
		

	}
	
	/**
	 * Méthode servant à gérer les événements.
	 */
	public void actionPerformed(ActionEvent ev) {
		// Si l'on clique sur démarrer, la fenêtre est refaite pour accueillir le nouveau fond qui est le panel du plateau d'échec.
		PanelJeu jeu = new PanelJeu();
		this.removeAll();
		this.revalidate();
		this.repaint();
		jeu.setBounds(0,0, 810,600);
		// Initialisation du plateau mathématique servant aux opérations.
		jeu.getP().initialiser();
		// Initialisation du joueur en cours.
		JLabel joueurDebut = new JLabel("   Joueur en cours : " + getJoueur1().getText());
		jeu.setJoueur(joueurDebut);
		// Envoi des données de joueur 1 et 2 au panel de jeu.
		jeu.setJoueur1(joueur1.getText());
		jeu.setJoueur2(joueur2.getText());
		// Initialisation du plateau graphique.
		jeu.initialisation();
		// Ajout du panel de jeu.
		this.add(jeu);
		
		}

	/**
	 * Méthode renvoyant le nom du joueur 1.
	 * @return : le nom du joueur 1.
	 */
	public JTextField getJoueur1() {
		return joueur1;
	}
	/**
	 * Méthode renvoyant le nom du joueur 2.
	 * @return : le nom du joueur 2.
	 */
	public JTextField getJoueur2() {
		return joueur2;
	}

}
