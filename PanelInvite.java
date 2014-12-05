/**
 * 
 */
package projetJava;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author Thomas
 *
 */
public class PanelInvite extends JPanel implements ActionListener {
	
	private JTextField joueur1 = new JTextField();
	private JTextField joueur2 = new JTextField();
	
	public PanelInvite() {
		setSize(500, 500);
		setLayout(null);
		JLabel invite1 = new JLabel("Joueur 1 :");
		joueur1.setMaximumSize(new Dimension(150, 30));
		invite1.setBounds(250,100,100,50);
		joueur1.setBounds(350, 110, 150, 30);
		this.add(invite1);
		this.add(joueur1);
		JLabel invite2 = new JLabel("Joueur 2 :");
		joueur2.setMaximumSize(new Dimension(150, 30));
		invite2.setBounds(250, 140, 100, 50);
		joueur2.setBounds(350, 150, 150, 30);
		this.add(invite2);
		this.add(joueur2);
		
		JButton start = new JButton("Start");
		start.addActionListener(this);
		start.setBounds(300, 220, 150, 30);
		this.add(start);
		

	}
	

	public void actionPerformed(ActionEvent ev) {
		PanelJeu jeu = new PanelJeu();
		String c = new String();
		c = "B";
		this.removeAll();
		this.revalidate();
		this.repaint();
		jeu.setBounds(0,0, 810,600);
		jeu.getP().initialiser();
		JLabel joueurDebut = new JLabel("    Joueur en cours : " + getJoueur1().getText());
		jeu.setJoueur(joueurDebut);
		jeu.setJoueur1(joueur1.getText());
		jeu.setJoueur2(joueur2.getText());
		for(int i = 0; i < 8; i++) {
			jeu.getTabButton()[1][i].setIcon(new ImageIcon("Icone/PB.gif"));
			jeu.getTabButton()[6][i].setIcon(new ImageIcon("Icone/PN.gif"));
			}
		for (int j = 0; j < 8; j = j + 7) {
			jeu.getTabButton()[j][0].setIcon(new ImageIcon("Icone/T" + c + ".gif"));
			jeu.getTabButton()[j][1].setIcon(new ImageIcon("Icone/C" + c + ".gif"));
			jeu.getTabButton()[j][2].setIcon(new ImageIcon("Icone/F" + c + ".gif"));
			jeu.getTabButton()[j][3].setIcon(new ImageIcon("Icone/Q" + c + ".gif"));
			jeu.getTabButton()[j][4].setIcon(new ImageIcon("Icone/R" + c + ".gif"));
			jeu.getTabButton()[j][5].setIcon(new ImageIcon("Icone/F" + c + ".gif"));
			jeu.getTabButton()[j][6].setIcon(new ImageIcon("Icone/C" + c + ".gif"));
			jeu.getTabButton()[j][7].setIcon(new ImageIcon("Icone/T" + c + ".gif"));
			c = "N";
		}
		this.add(jeu);
		}


	public JTextField getJoueur1() {
		return joueur1;
	}


	public JTextField getJoueur2() {
		return joueur2;
	}

	}
