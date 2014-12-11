/**
 * 
 */
package projetJava;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Thomas
 *	Cette classe sert � g�rer tout ce qui concerne le plateau de jeu.
 */
public class PanelJeu extends JPanel implements ActionListener {
	
	//Variables propres aux graphismes du panel 
	/*
	 * Plateau de jeu servant � effectuer les op�rations math�matiques.
	 */
	private Plateau p = new Plateau();
	/*
	 * Panel servant � contenir le plateau d'�chec
	 */
	private	JPanel plateau = new JPanel();
	/*
	 * Layout servant � la construction du plateau d'�chec.
	 */
	private GridLayout layout = new GridLayout();
	/**
	 * Tableau de boutons repr�sentant les cases du plateau.
	 */
	private JButton[][] tabButton;
	/**
	 * Tableau de label servant � r�cup�rer les pi�ces mortes.
	 */
	private JLabel[][] tabLabel;
	/**
	 * Panel servant � prendre les autres �l�ments graphiques, comme le nom du joueur en cours.
	 */
	private JPanel recup = new JPanel();
	/**
	 * Layout servant pour le tableau de r�cup�ration des pi�ces mortes.
	 */
	private GridLayout layoutRecup = new GridLayout();
	/**
	 * Label servant � indiquer le joueur en cours.
	 */
	private JLabel joueurEnCours = new JLabel();
	/**
	 * Nom du joueur en cours.
	 */
	private String joueur;
	/**
	 * Premier joueur de la partie.
	 */
	private String joueur1;
	/**
	 * Deuxi�me joueur de la partie.
	 */
	private String joueur2;
	
	//Variable propre aux �v�nements.
	/**
	 * Variable statiques servant � d�finir sur quelle ligne va aller la prochaine pi�ce morte.
	 */
	private static int ligneLabel = 0;
	/**
	 * Variable statiques servant � d�finir sur quelle colonne va aller la prochaine pi�ce morte.
	 */
	private static int colonneLabel = 0;
	/**
	 * Variable servant � conserver la valeur de la pi�ce faisant le mouvement.
	 */
	private Piece pieceTransition = null;
	/**
	 * Variable servant � conserver l'image graphique de la pi�ce faisant le mouvement.
	 */
	private ImageIcon imageTransition = null;
	/**
	 * Variable servant � conserver l'image graphique de la pi�ce morte.
	 */
	private ImageIcon imageDead;
	/**
	 * Couleur du premier joueur � jouer.
	 */
	private String couleurJoueur = "blanc";
	/**
	 * Constructeur initialisant toute l'interface graphique du jeu d'�chec.
	 */
	public PanelJeu() {
		// Mise en place de la grandeur du panel ainsi que du layout.
		setSize(500, 500);
		setLayout(null);
		// Initialisation du layout contenant le plateau d'�chec.
		layout.setColumns(8);
		layout.setRows(8);
		plateau.setLayout(layout);
		// Initialisation du tableau de boutons reproduisant les cases de l'�chiquier.
		tabButton = new JButton[8][8];
		for (int ligne = 0; ligne < 8; ligne ++) {
			for (int colonne = 0; colonne < 8; colonne ++) {
				// Pour chaque case, nous ajoutons un bouton ainsi que son ActionListener.
				tabButton[ligne][colonne] = new JButton();
				tabButton[ligne][colonne].addActionListener(this);
				// Ajout de la case (bouton) au JLabel plateau.
				plateau.add(tabButton[ligne][colonne]);
				// R�partition des couleurs de fond des cases.
				if (((ligne + colonne) % 2) == 0) {
					tabButton[ligne][colonne].setBackground(Color.WHITE);
				} else {
					tabButton[ligne][colonne].setBackground(Color.GRAY);
				}
			}
		}
		// Initialisation du layout de r�cuparation des pi�ces mortes.
		layoutRecup.setColumns(4);
		layoutRecup.setRows(8);
		recup.setLayout(layoutRecup);
		// Initialisation du tableau de label servant � r�cup�rer les images des pi�ces mortes.
		tabLabel = new JLabel[8][4];
		for (int ligne = 0; ligne < 8; ligne ++) {
			for (int colonne = 0; colonne < 4; colonne ++) {
				// Pour chaque case du tableau de label, nous ajoutons un nouveau label.
				tabLabel[ligne][colonne] = new JLabel();
				recup.add(tabLabel[ligne][colonne]);
			}
		}
		// Initialisation de la couleur de fond du tableau de label.
		recup.setBackground(Color.WHITE);
		// Initialisation des bordures ainsi que des positions des �l�ments sur la fen�tre de jeu.
		plateau.setBounds(2,2, 550, 550);
		this.add(plateau);
		joueurEnCours.setBounds(560,2, 225, 30);
		this.add(joueurEnCours);
		joueurEnCours.setBorder(BorderFactory.createLineBorder(Color.black));
		recup.setBounds(560, 40, 225, 508);
		recup.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(recup);
	}
	
	public void initialisation() {
		// Cr�ation d'un string servant � d�finir la couleur choisie pour l'initialisation des boutons.
		String c = new String();
		c = "N";
		for (int i = 0; i < 8; i++) {
			// Pour chaque colonne de pion, ajout des images des pi�ces aux couleurs correspondantes.
			getTabButton()[1][i].setIcon(new ImageIcon("Icone/PN.gif"));
			getTabButton()[6][i].setIcon(new ImageIcon("Icone/PB.gif"));
		}
		for (int j = 0; j < 8; j = j + 7) {
			// Ajout des images des pi�ces principales pour les deux couleurs de la partie.
			getTabButton()[j][0].setIcon(new ImageIcon("Icone/T" + c + ".gif"));
			getTabButton()[j][1].setIcon(new ImageIcon("Icone/C" + c + ".gif"));
			getTabButton()[j][2].setIcon(new ImageIcon("Icone/F" + c + ".gif"));
			getTabButton()[j][3].setIcon(new ImageIcon("Icone/Q" + c + ".gif"));
			getTabButton()[j][4].setIcon(new ImageIcon("Icone/R" + c + ".gif"));
			getTabButton()[j][5].setIcon(new ImageIcon("Icone/F" + c + ".gif"));
			getTabButton()[j][6].setIcon(new ImageIcon("Icone/C" + c + ".gif"));
			getTabButton()[j][7].setIcon(new ImageIcon("Icone/T" + c + ".gif"));
			c = "B";
		}
	}

	/**
	 * M�thode servant � g�rer les �v�nements.
	 */
	public void actionPerformed(ActionEvent ev) {
		// Variables servant � d�finir la ligne ainsi que la colonne sur lesquelles on a cliqu�.
		int ligneSelect = 0;
		int colonneSelect = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				// Recherche du bouton en question.
				if (ev.getSource() == tabButton[i][j]) {
					ligneSelect = i;
					colonneSelect = j;
				}
			}
		}
		// Si on reclique sur la pi�ce que l'on a choisie, cela annule son choix et permet de cliquer sur une autre pi�ce � la place.
		if (pieceTransition != null && ((pieceTransition.getLigne() == ligneSelect) && (pieceTransition.getColonne() == colonneSelect))) {
			tabButton[pieceTransition.getLigne()][pieceTransition.getColonne()].setBorder(null);
			pieceTransition = null;
			imageTransition = null;
		// Si l'on vient de cliquer sur une nouvelle pi�ce sans avoir fait d'autres choix avant, la pi�ce choisie est enregistr�e pour les prochaines actions et cela la met en �vidence.
		} else if (p.getEchiquier()[ligneSelect][colonneSelect].estPrise() && p.getEchiquier()[ligneSelect][colonneSelect].getPiece().getCouleur().equals(couleurJoueur) 
			&& pieceTransition == null) {
				pieceTransition = p.getEchiquier()[ligneSelect][colonneSelect].getPiece();
				imageTransition = (ImageIcon)tabButton[ligneSelect][colonneSelect].getIcon();
				tabButton[ligneSelect][colonneSelect].setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
		
		} else
				// Si l'on veut faire un d�placement de la pi�ce vers un autre endroit.
				if (pieceTransition != null && (p.chemin(pieceTransition.getLigne(), pieceTransition.getColonne(), ligneSelect, colonneSelect) 
					|| p.capturePion(pieceTransition.getLigne(), pieceTransition.getColonne(), ligneSelect, colonneSelect)) ) {
						// Si la case d'arriv�e est prise.
						if (p.getEchiquier()[ligneSelect][colonneSelect].estPrise()) {
							// La pi�ce qui va �tre prise se met dans le tableau de label pr�vu � cet effet.
							imageDead = (ImageIcon)tabButton[ligneSelect][colonneSelect].getIcon();
							tabLabel[ligneLabel][colonneLabel].setIcon(imageDead);
							// Incr�mentation automatique de la position de la prochaine pi�ce morte.
							if (colonneLabel == 3) {
								ligneLabel++;
								colonneLabel = 0;
							} else {
								colonneLabel++;
							}
							// Si la pi�ce qui va �tre prise est un roi, le jeu s'arr�te.
							if (p.getEchiquier()[ligneSelect][colonneSelect].getPiece() instanceof Roi) {
								JOptionPane.showMessageDialog(null, "Echec et Mat !", "Fin de la partie", JOptionPane.INFORMATION_MESSAGE);
								System.exit(0);
							// Si ce n'est pas un roi, la pi�ce d'arriv�e est prise et la pi�ce choisie prend sa place.
							} else {
								p.getEchiquier()[ligneSelect][colonneSelect].setPiece(pieceTransition);
								tabButton[ligneSelect][colonneSelect].setIcon(imageTransition);
							}
						// Si la case est vide, la pi�ce prend sa place.
						} else {
							p.getEchiquier()[ligneSelect][colonneSelect].setPiece(pieceTransition);
							tabButton[ligneSelect][colonneSelect].setIcon(imageTransition);
						}
						// Suppression de l'ancienne position de la pi�ce qui a fait un d�placement.
						p.getEchiquier()[pieceTransition.getLigne()][pieceTransition.getColonne()].setPiece(null);
						tabButton[pieceTransition.getLigne()][pieceTransition.getColonne()].setIcon(null);
						tabButton[pieceTransition.getLigne()][pieceTransition.getColonne()].setBorder(null);
						// Changement des coordonn�es de position de la pi�ce ayant boug�e.
						p.getEchiquier()[ligneSelect][colonneSelect].getPiece().setLigne(ligneSelect);
						p.getEchiquier()[ligneSelect][colonneSelect].getPiece().setColonne(colonneSelect);
						// Remise � nul des variables servant � faire les d�placements.
						pieceTransition = null;
						imageTransition = null;
						// Changement de la couleur en cours.
						couleurJoueur = couleurJoueur.equals("blanc") ? "noir" : "blanc";
						// Changement du joueur en cours.
						joueur = couleurJoueur.equals("blanc") ? joueur1 : joueur2;
						joueurEnCours.setText("   Joueur en cours : " + joueur);
				}
	}
	
	
	
	
	/**
	 * M�thode servant � avoir la valeur du tableau de boutons (l'�chiquier).
	 * @return l'�chiquier graphique.
	 */
	public JButton[][] getTabButton() {
		return tabButton;
	}
	/**
	 * M�thode servant � changer la valeur du tableau de boutons (l'�chiquier).
	 * @param tabButton : l'�chiquier graphique.
	 */
	public void setTabButton(JButton[][] tabButton) {
		this.tabButton = tabButton;
	}
	/**
	 * M�thode Renvoyant la plateau servant � faire les op�rations math�matique.
	 * @return l'�chiquier propre � la machine (servant aux op�rations de mouvement).
	 */
	public Plateau getP() {
		return p;
	}
	/**
	 * M�thode servant � d�finir la valeur de plateau math�matique.
	 * @param echiquier : l'�chiquier propre � la machine (servant aux op�rations de mouvement).
	 */
	public void setP(Plateau echiquier) {
		this.p = echiquier;
	}
	/**
	 * M�thode renvoyant le joueur en cours.
	 * @return : le joueur en cours.
	 */
	public JLabel getJoueur() {
		return joueurEnCours;
	}
	/**
	 * M�thode d�finissant le joueur en cours.
	 * @param joueur : le joueur en cours.
	 */
	public void setJoueur(JLabel joueur) {
		this.joueurEnCours.setText(joueur.getText());
	}
	/**
	 * M�thode renvoyant le joueur 1 de la partie.
	 * @return : le premier joueur de la partie.
	 */
	public String getJoueur1() {
		return joueur1;
	}
	/**
	 * M�thode d�finissant le premier joueur de la partie.
	 * @param joueur1 : le premier joueur de la partie.
	 */
	public void setJoueur1(String joueur1) {
		this.joueur1 = joueur1;
	}
	/**
	 * M�thode renvoyant le joueur 2 de la partie.
	 * @return : le deuxi�me joueur de la partie.
	 */
	public String getJoueur2() {
		return joueur2;
	}
	/**
	 * M�thode d�finissant le deuxi�me joueur de la partie.
	 * @param joueur1 : le deuxi�me joueur de la partie.
	 */
	public void setJoueur2(String joueur2) {
		this.joueur2 = joueur2;
	}

}

