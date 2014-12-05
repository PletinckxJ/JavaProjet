/**
 * 
 */
package projetJava;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
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
	private JLabel joueur = new JLabel("Joueur en cours : Joueur1 ");
	
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
		joueur.setBounds(560,2, 225, 30);
		this.add(joueur);
		joueur.setBorder(BorderFactory.createLineBorder(Color.black));
		recup.setBounds(560, 40, 225, 508);
		recup.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(recup);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

