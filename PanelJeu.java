/**
 * 
 */
package projetJava;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Thomas
 *
 */
public class PanelJeu extends JPanel implements ActionListener {
	
	//
	private Plateau p = new Plateau();
	private	JPanel plateau = new JPanel();
	private GridLayout layout = new GridLayout();
	private JButton[][] tabButton;
	private JLabel[][] tabLabel;
	private JPanel recup = new JPanel();
	private GridLayout layoutRecup = new GridLayout();
	private JLabel joueurEnCours = new JLabel();
	private String joueur;
	private String joueur1;
	private String joueur2;
	
	//
	private static int ligneLabel = 0;
	private static int colonneLabel = 0;
	private Piece pieceTransition = null;
	private ImageIcon imageTransition = null;
	private ImageIcon imageDead;
	
	private String couleurJoueur = "blanc";
	
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
				tabButton[ligne][colonne].addActionListener(this);
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
	
	public void initialisation() {
		String c = new String();
		c = "N";
		for (int i = 0; i < 8; i++) {
			getTabButton()[1][i].setIcon(new ImageIcon("Icone/PN.gif"));
			getTabButton()[6][i].setIcon(new ImageIcon("Icone/PB.gif"));
		}
		for (int j = 0; j < 8; j = j + 7) {
			getTabButton()[j][0].setIcon(new ImageIcon("Icone/T" + c + ".gif"));
			getTabButton()[j][1].setIcon(new ImageIcon("Icone/C" + c + ".gif"));
			getTabButton()[j][2].setIcon(new ImageIcon("Icone/F" + c + ".gif"));
			getTabButton()[j][3].setIcon(new ImageIcon("Icone/D" + c + ".gif"));
			getTabButton()[j][4].setIcon(new ImageIcon("Icone/R" + c + ".gif"));
			getTabButton()[j][5].setIcon(new ImageIcon("Icone/F" + c + ".gif"));
			getTabButton()[j][6].setIcon(new ImageIcon("Icone/C" + c + ".gif"));
			getTabButton()[j][7].setIcon(new ImageIcon("Icone/T" + c + ".gif"));
			c = "B";
		}
	}

	
	public void actionPerformed(ActionEvent ev) {
		int ligneSelect = 0;
		int colonneSelect = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (ev.getSource() == tabButton[i][j]) {
					ligneSelect = i;
					colonneSelect = j;
				}
			}
		}
		if (pieceTransition != null && ((pieceTransition.getLigne() == ligneSelect) && (pieceTransition.getColonne() == colonneSelect))) {
			tabButton[pieceTransition.getLigne()][pieceTransition.getColonne()].setBorder(null);
			pieceTransition = null;
			imageTransition = null;
		} else if (p.getEchiquier()[ligneSelect][colonneSelect].estPrise() && p.getEchiquier()[ligneSelect][colonneSelect].getPiece().getCouleur().equals(couleurJoueur) 
			&& pieceTransition == null) {
				pieceTransition = p.getEchiquier()[ligneSelect][colonneSelect].getPiece();
				imageTransition = (ImageIcon)tabButton[ligneSelect][colonneSelect].getIcon();
				tabButton[ligneSelect][colonneSelect].setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
		} else
			try {
				if (p.chemin(pieceTransition.getLigne(), pieceTransition.getColonne(), ligneSelect, colonneSelect) 
					|| p.capturePion(pieceTransition.getLigne(), pieceTransition.getColonne(), ligneSelect, colonneSelect)) {
						if (p.getEchiquier()[ligneSelect][colonneSelect].estPrise()) {
							imageDead = (ImageIcon)tabButton[ligneSelect][colonneSelect].getIcon();
							tabLabel[ligneLabel][colonneLabel].setIcon(imageDead);
							if (colonneLabel == 3) {
								ligneLabel++;
								colonneLabel = 0;
							} else {
								colonneLabel++;
							}
							if (p.getEchiquier()[ligneSelect][colonneSelect].getPiece() instanceof Roi) {
								JOptionPane.showMessageDialog(null, "Echec et Mat !", "Fin de la partie", JOptionPane.INFORMATION_MESSAGE);
								System.exit(0);
							} else {
								p.getEchiquier()[ligneSelect][colonneSelect].setPiece(pieceTransition);
								tabButton[ligneSelect][colonneSelect].setIcon(imageTransition);
							}
						} else {
							p.getEchiquier()[ligneSelect][colonneSelect].setPiece(pieceTransition);
							tabButton[ligneSelect][colonneSelect].setIcon(imageTransition);
						}
						p.getEchiquier()[pieceTransition.getLigne()][pieceTransition.getColonne()].setPiece(null);
						tabButton[pieceTransition.getLigne()][pieceTransition.getColonne()].setIcon(null);
						tabButton[pieceTransition.getLigne()][pieceTransition.getColonne()].setBorder(null);
						p.getEchiquier()[ligneSelect][colonneSelect].getPiece().setLigne(ligneSelect);
						p.getEchiquier()[ligneSelect][colonneSelect].getPiece().setColonne(colonneSelect);
						pieceTransition = null;
						imageTransition = null;
						couleurJoueur = couleurJoueur.equals("blanc") ? "noir" : "blanc";
						joueur = couleurJoueur.equals("blanc") ? joueur1 : joueur2;
						joueurEnCours.setText("   Joueur en cours : " + joueur);
				}
			} catch (Exception e) {
				
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

