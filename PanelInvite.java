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
		this.removeAll();
		this.revalidate();
		this.repaint();
		jeu.setBounds(0,0, 810,600);
		this.add(jeu);
		}

}
