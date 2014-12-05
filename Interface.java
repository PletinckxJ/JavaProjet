/**
 * 
 */
package projetJava;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

/**
 * @author Thomas
 *
 */
public class Interface extends JFrame {

	private Plateau echiquier;
	private JButton[][] tabButton;
	private JLabel[][] tabLabel;
	private JLabel joueur = new JLabel("popito");
	private	JPanel plateau = new JPanel();
	private GridLayout layout = new GridLayout();
	private JTextField joueur1 = new JTextField();
	private JTextField joueur2 = new JTextField();
	private JButton start = new JButton("Start");
	private JPanel recup = new JPanel();
	private GridLayout layoutRecup = new GridLayout();
	
	public Interface() {
		
		super("Jeu d'échec");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 700, 500);
		
		JLabel invite1 = new JLabel("Joueur 1 :");
		joueur1.setMaximumSize(new Dimension(70, 20));
		Box boxJoueur1 = Box.createHorizontalBox();
		boxJoueur1.add(invite1);
		boxJoueur1.add(joueur1);
		
		JLabel invite2 = new JLabel("Joueur 2 :");
		joueur2.setMaximumSize(new Dimension(70, 20));
		Box boxJoueur2 = Box.createHorizontalBox();
		boxJoueur2.add(invite2);
		boxJoueur2.add(joueur2);
		
		Box main = Box.createVerticalBox();
		main.add(boxJoueur1);
		main.add(boxJoueur2);
		main.add(start);
		
		getContentPane().add(main);
		
		Box jeu = Box.createHorizontalBox();
		Box info = Box.createVerticalBox();
		
		layout.setColumns(8);
		layout.setRows(8);
		plateau.setLayout(layout);
		plateau.setBounds(0, 0, 550, 100);
		
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
		
		info.add(joueur);
		info.add(recup);
		
		jeu.add(plateau);
		jeu.add(info);
		
		getContentPane().add(jeu);
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Interface frame = new Interface();
		frame.setVisible(true);

	}

}
