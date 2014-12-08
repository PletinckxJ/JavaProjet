package projetJava;

import java.awt.*;

import javax.swing.*;

public class Test extends JFrame {
	
	
	private JButton[][] tabButton;
	private JLabel[][] tabLabel;
	private JPanel recup = new JPanel();
	private GridLayout layoutRecup = new GridLayout();
	
	public Test() {
		
		super("coco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,  500);
		
		JPanel plateau = new JPanel();
		GridLayout layout = new GridLayout();
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
				/*tabButton[ligne][colonne].setIcon(new ImageIcon("Icone/FB.gif"));*/
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
		getContentPane().add(recup);
	}
	
	public static void main(String[] args) {
		Test frame = new Test();
		frame.setVisible(true);

	}

}
