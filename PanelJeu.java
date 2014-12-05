/**
 * 
 */
package projetJava;

import java.awt.Color;
import java.awt.GridLayout;

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
	private JLabel joueur = new JLabel("Joueur en cours : ");
	
	public PanelJeu() {
		setSize(500, 500);
		layout.setColumns(8);
		layout.setRows(8);
		plateau.setLayout(layout);
		plateau.setBounds(0, 0, 550, 550);
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
		
		Box jeu = Box.createHorizontalBox();
		Box info = Box.createVerticalBox();
		info.add(joueur);
		info.add(recup);
		jeu.add(plateau);
		jeu.add(info);
		this.add(jeu);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
