/**
 * 
 */
package projetJava;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Thomas
 *
 */
public class PanelJeu extends JPanel {
	
	private	JPanel plateau = new JPanel();
	private GridLayout layout = new GridLayout();
	private JButton[][] tabButton;
	private JLabel[][] tabLabel;
	private JPanel recup = new JPanel();
	private GridLayout layoutRecup = new GridLayout();
	private JLabel joueurEnCours = new JLabel("Joueur en cours : ");
	private Plateau p = new Plateau();
	private String joueur1;
	private String joueur2;
	
	public PanelJeu() {
		setSize(500, 500);
		setLayout(null);
		layout.setColumns(8);
		layout.setRows(8);
		plateau.setLayout(layout);
		tabButton = new JButton[8][8];
		for (int ligne = 0; ligne < 8; ligne ++) {
			for (int colonne = 0; colonne < 8; colonne ++) {
				tabButton[ligne][colonne] = new JButton();
				plateau.add(tabButton[ligne][colonne]);
				if (((ligne + colonne) % 2) == 0) {
					tabButton[ligne][colonne].setBackground(Color.WHITE);
				} else {
					tabButton[ligne][colonne].setBackground(Color.GRAY);
				}
			}
		}
		
		layoutRecup.setColumns(4);
		layoutRecup.setRows(8);
		recup.setLayout(layoutRecup);
		tabLabel = new JLabel[8][4];
		for (int ligne = 0; ligne < 8; ligne ++) {
			for (int colonne = 0; colonne < 4; colonne ++) {
				tabLabel[ligne][colonne] = new JLabel();
				recup.add(tabLabel[ligne][colonne]);
			}
		}
		recup.setBackground(Color.WHITE);
		
		plateau.setBounds(2,2, 550, 550);
		this.add(plateau);
		joueurEnCours.setBounds(560,2, 225, 30);
		this.add(joueurEnCours);
		joueurEnCours.setBorder(BorderFactory.createLineBorder(Color.black));
		recup.setBounds(560, 40, 225, 508);
		recup.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(recup);
	}

	public void actionPerformed(ActionEvent ev) {
		Piece pieceTransition = null;
		ImageIcon imageTransition;
		int ligneDepart = 0;
		int colonneDepart = 0;
		int ligneArrivee = 0;
		int colonneArrivee = 0;
		String couleurJoueur = "blanc";
		
		if (ev.getSource() instanceof JButton) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (ev.getSource() == tabButton[i][j]);
						ligneDepart = i;
						colonneDepart = j;
				}
			}
		}
		
	}

	public JButton[][] getTabButton() {
		return tabButton;
	}

	public void setTabButton(JButton[][] tabButton) {
		this.tabButton = tabButton;
	}

	public Plateau getP() {
		return p;
	}

	public void setP(Plateau echiquier) {
		this.p = echiquier;
	}

	public JLabel getJoueur() {
		return joueurEnCours;
	}

	public void setJoueur(JLabel joueur) {
		this.joueurEnCours.setText(joueur.getText());
	}

	public String getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(String joueur1) {
		this.joueur1 = joueur1;
	}

	public String getJoueur2() {
		return joueur2;
	}

	public void setJoueur2(String joueur2) {
		this.joueur2 = joueur2;
	}

}

