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
	private Box main = Box.createVerticalBox();
	private BorderLayout layout = new BorderLayout(0, 0);
	
	public PanelInvite() {
		setSize(500, 500);
		setLayout(layout);
		JLabel invite1 = new JLabel("Joueur 1 :");
		joueur1.setMaximumSize(new Dimension(150, 30));
		Box boxJoueur1 = Box.createHorizontalBox();
		boxJoueur1.add(invite1);
		boxJoueur1.add(joueur1);
	
		JLabel invite2 = new JLabel("Joueur 2 :");
		joueur2.setMaximumSize(new Dimension(150, 30));
		Box boxJoueur2 = Box.createHorizontalBox();
		boxJoueur2.add(invite2);
		boxJoueur2.add(joueur2);
		
		JButton start = new JButton("Start");
		start.addActionListener(this);
		
		main.add(boxJoueur1);
		main.add(boxJoueur2);
		main.add(start);
		this.add(main);
	}
	

	public void actionPerformed(ActionEvent ev) {
		PanelJeu jeu = new PanelJeu();
		this.remove(main);
		
		this.add(jeu, BorderLayout.CENTER);
	}

}
