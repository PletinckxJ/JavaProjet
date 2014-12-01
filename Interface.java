package projetJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Interface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnNewButton_56 = new JButton("New button");
		btnNewButton_56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_56.setIcon(new ImageIcon("C:\\Users\\JulienTour\\Desktop\\caseblanche.png"));
		btnNewButton_56.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_btnNewButton_56 = new GridBagConstraints();
		gbc_btnNewButton_56.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_56.gridx = 3;
		gbc_btnNewButton_56.gridy = 2;
		contentPane.add(btnNewButton_56, gbc_btnNewButton_56);
		
		JButton btnNewButton_24 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_24 = new GridBagConstraints();
		gbc_btnNewButton_24.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_24.gridx = 4;
		gbc_btnNewButton_24.gridy = 2;
		contentPane.add(btnNewButton_24, gbc_btnNewButton_24);
		
		JButton btnNewButton_8 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_8.gridx = 5;
		gbc_btnNewButton_8.gridy = 2;
		contentPane.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 2;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_16 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_16 = new GridBagConstraints();
		gbc_btnNewButton_16.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_16.gridx = 7;
		gbc_btnNewButton_16.gridy = 2;
		contentPane.add(btnNewButton_16, gbc_btnNewButton_16);
		
		JButton btnNewButton_32 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_32 = new GridBagConstraints();
		gbc_btnNewButton_32.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_32.gridx = 8;
		gbc_btnNewButton_32.gridy = 2;
		contentPane.add(btnNewButton_32, gbc_btnNewButton_32);
		
		JButton btnNewButton_40 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_40 = new GridBagConstraints();
		gbc_btnNewButton_40.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_40.gridx = 9;
		gbc_btnNewButton_40.gridy = 2;
		contentPane.add(btnNewButton_40, gbc_btnNewButton_40);
		
		JButton btnNewButton_48 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_48 = new GridBagConstraints();
		gbc_btnNewButton_48.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_48.gridx = 10;
		gbc_btnNewButton_48.gridy = 2;
		contentPane.add(btnNewButton_48, gbc_btnNewButton_48);
		
		JButton btnNewButton_57 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_57 = new GridBagConstraints();
		gbc_btnNewButton_57.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_57.gridx = 3;
		gbc_btnNewButton_57.gridy = 3;
		contentPane.add(btnNewButton_57, gbc_btnNewButton_57);
		
		JButton btnNewButton_25 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_25 = new GridBagConstraints();
		gbc_btnNewButton_25.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_25.gridx = 4;
		gbc_btnNewButton_25.gridy = 3;
		contentPane.add(btnNewButton_25, gbc_btnNewButton_25);
		
		JButton btnNewButton_9 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_9.gridx = 5;
		gbc_btnNewButton_9.gridy = 3;
		contentPane.add(btnNewButton_9, gbc_btnNewButton_9);
		
		JButton btnNewButton_1 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 6;
		gbc_btnNewButton_1.gridy = 3;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_17 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_17 = new GridBagConstraints();
		gbc_btnNewButton_17.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_17.gridx = 7;
		gbc_btnNewButton_17.gridy = 3;
		contentPane.add(btnNewButton_17, gbc_btnNewButton_17);
		
		JButton btnNewButton_33 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_33 = new GridBagConstraints();
		gbc_btnNewButton_33.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_33.gridx = 8;
		gbc_btnNewButton_33.gridy = 3;
		contentPane.add(btnNewButton_33, gbc_btnNewButton_33);
		
		JButton btnNewButton_41 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_41 = new GridBagConstraints();
		gbc_btnNewButton_41.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_41.gridx = 9;
		gbc_btnNewButton_41.gridy = 3;
		contentPane.add(btnNewButton_41, gbc_btnNewButton_41);
		
		JButton btnNewButton_49 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_49 = new GridBagConstraints();
		gbc_btnNewButton_49.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_49.gridx = 10;
		gbc_btnNewButton_49.gridy = 3;
		contentPane.add(btnNewButton_49, gbc_btnNewButton_49);
		
		JButton btnNewButton_58 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_58 = new GridBagConstraints();
		gbc_btnNewButton_58.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_58.gridx = 3;
		gbc_btnNewButton_58.gridy = 4;
		contentPane.add(btnNewButton_58, gbc_btnNewButton_58);
		
		JButton btnNewButton_26 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_26 = new GridBagConstraints();
		gbc_btnNewButton_26.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_26.gridx = 4;
		gbc_btnNewButton_26.gridy = 4;
		contentPane.add(btnNewButton_26, gbc_btnNewButton_26);
		
		JButton btnNewButton_10 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10.gridx = 5;
		gbc_btnNewButton_10.gridy = 4;
		contentPane.add(btnNewButton_10, gbc_btnNewButton_10);
		
		JButton btnNewButton_2 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 6;
		gbc_btnNewButton_2.gridy = 4;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_18 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_18 = new GridBagConstraints();
		gbc_btnNewButton_18.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_18.gridx = 7;
		gbc_btnNewButton_18.gridy = 4;
		contentPane.add(btnNewButton_18, gbc_btnNewButton_18);
		
		JButton btnNewButton_34 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_34 = new GridBagConstraints();
		gbc_btnNewButton_34.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_34.gridx = 8;
		gbc_btnNewButton_34.gridy = 4;
		contentPane.add(btnNewButton_34, gbc_btnNewButton_34);
		
		JButton btnNewButton_42 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_42 = new GridBagConstraints();
		gbc_btnNewButton_42.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_42.gridx = 9;
		gbc_btnNewButton_42.gridy = 4;
		contentPane.add(btnNewButton_42, gbc_btnNewButton_42);
		
		JButton btnNewButton_50 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_50 = new GridBagConstraints();
		gbc_btnNewButton_50.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_50.gridx = 10;
		gbc_btnNewButton_50.gridy = 4;
		contentPane.add(btnNewButton_50, gbc_btnNewButton_50);
		
		JButton btnNewButton_59 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_59 = new GridBagConstraints();
		gbc_btnNewButton_59.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_59.gridx = 3;
		gbc_btnNewButton_59.gridy = 5;
		contentPane.add(btnNewButton_59, gbc_btnNewButton_59);
		
		JButton btnNewButton_27 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_27 = new GridBagConstraints();
		gbc_btnNewButton_27.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_27.gridx = 4;
		gbc_btnNewButton_27.gridy = 5;
		contentPane.add(btnNewButton_27, gbc_btnNewButton_27);
		
		JButton btnNewButton_11 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_11.gridx = 5;
		gbc_btnNewButton_11.gridy = 5;
		contentPane.add(btnNewButton_11, gbc_btnNewButton_11);
		
		JButton btnNewButton_3 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 6;
		gbc_btnNewButton_3.gridy = 5;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_19 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_19 = new GridBagConstraints();
		gbc_btnNewButton_19.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_19.gridx = 7;
		gbc_btnNewButton_19.gridy = 5;
		contentPane.add(btnNewButton_19, gbc_btnNewButton_19);
		
		JButton btnNewButton_35 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_35 = new GridBagConstraints();
		gbc_btnNewButton_35.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_35.gridx = 8;
		gbc_btnNewButton_35.gridy = 5;
		contentPane.add(btnNewButton_35, gbc_btnNewButton_35);
		
		JButton btnNewButton_43 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_43 = new GridBagConstraints();
		gbc_btnNewButton_43.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_43.gridx = 9;
		gbc_btnNewButton_43.gridy = 5;
		contentPane.add(btnNewButton_43, gbc_btnNewButton_43);
		
		JButton btnNewButton_51 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_51 = new GridBagConstraints();
		gbc_btnNewButton_51.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_51.gridx = 10;
		gbc_btnNewButton_51.gridy = 5;
		contentPane.add(btnNewButton_51, gbc_btnNewButton_51);
		
		JButton btnNewButton_60 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_60 = new GridBagConstraints();
		gbc_btnNewButton_60.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_60.gridx = 3;
		gbc_btnNewButton_60.gridy = 6;
		contentPane.add(btnNewButton_60, gbc_btnNewButton_60);
		
		JButton btnNewButton_28 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_28 = new GridBagConstraints();
		gbc_btnNewButton_28.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_28.gridx = 4;
		gbc_btnNewButton_28.gridy = 6;
		contentPane.add(btnNewButton_28, gbc_btnNewButton_28);
		
		JButton btnNewButton_12 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
		gbc_btnNewButton_12.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_12.gridx = 5;
		gbc_btnNewButton_12.gridy = 6;
		contentPane.add(btnNewButton_12, gbc_btnNewButton_12);
		
		JButton btnNewButton_4 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 6;
		gbc_btnNewButton_4.gridy = 6;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_20 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_20 = new GridBagConstraints();
		gbc_btnNewButton_20.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_20.gridx = 7;
		gbc_btnNewButton_20.gridy = 6;
		contentPane.add(btnNewButton_20, gbc_btnNewButton_20);
		
		JButton btnNewButton_36 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_36 = new GridBagConstraints();
		gbc_btnNewButton_36.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_36.gridx = 8;
		gbc_btnNewButton_36.gridy = 6;
		contentPane.add(btnNewButton_36, gbc_btnNewButton_36);
		
		JButton btnNewButton_44 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_44 = new GridBagConstraints();
		gbc_btnNewButton_44.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_44.gridx = 9;
		gbc_btnNewButton_44.gridy = 6;
		contentPane.add(btnNewButton_44, gbc_btnNewButton_44);
		
		JButton btnNewButton_52 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_52 = new GridBagConstraints();
		gbc_btnNewButton_52.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_52.gridx = 10;
		gbc_btnNewButton_52.gridy = 6;
		contentPane.add(btnNewButton_52, gbc_btnNewButton_52);
		
		JButton btnNewButton_61 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_61 = new GridBagConstraints();
		gbc_btnNewButton_61.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_61.gridx = 3;
		gbc_btnNewButton_61.gridy = 7;
		contentPane.add(btnNewButton_61, gbc_btnNewButton_61);
		
		JButton btnNewButton_29 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_29 = new GridBagConstraints();
		gbc_btnNewButton_29.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_29.gridx = 4;
		gbc_btnNewButton_29.gridy = 7;
		contentPane.add(btnNewButton_29, gbc_btnNewButton_29);
		
		JButton btnNewButton_13 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_13 = new GridBagConstraints();
		gbc_btnNewButton_13.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_13.gridx = 5;
		gbc_btnNewButton_13.gridy = 7;
		contentPane.add(btnNewButton_13, gbc_btnNewButton_13);
		
		JButton btnNewButton_5 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 6;
		gbc_btnNewButton_5.gridy = 7;
		contentPane.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_21 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_21 = new GridBagConstraints();
		gbc_btnNewButton_21.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_21.gridx = 7;
		gbc_btnNewButton_21.gridy = 7;
		contentPane.add(btnNewButton_21, gbc_btnNewButton_21);
		
		JButton btnNewButton_37 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_37 = new GridBagConstraints();
		gbc_btnNewButton_37.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_37.gridx = 8;
		gbc_btnNewButton_37.gridy = 7;
		contentPane.add(btnNewButton_37, gbc_btnNewButton_37);
		
		JButton btnNewButton_45 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_45 = new GridBagConstraints();
		gbc_btnNewButton_45.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_45.gridx = 9;
		gbc_btnNewButton_45.gridy = 7;
		contentPane.add(btnNewButton_45, gbc_btnNewButton_45);
		
		JButton btnNewButton_53 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_53 = new GridBagConstraints();
		gbc_btnNewButton_53.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_53.gridx = 10;
		gbc_btnNewButton_53.gridy = 7;
		contentPane.add(btnNewButton_53, gbc_btnNewButton_53);
		
		JButton btnNewButton_62 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_62 = new GridBagConstraints();
		gbc_btnNewButton_62.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_62.gridx = 3;
		gbc_btnNewButton_62.gridy = 8;
		contentPane.add(btnNewButton_62, gbc_btnNewButton_62);
		
		JButton btnNewButton_30 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_30 = new GridBagConstraints();
		gbc_btnNewButton_30.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_30.gridx = 4;
		gbc_btnNewButton_30.gridy = 8;
		contentPane.add(btnNewButton_30, gbc_btnNewButton_30);
		
		JButton btnNewButton_14 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_14 = new GridBagConstraints();
		gbc_btnNewButton_14.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_14.gridx = 5;
		gbc_btnNewButton_14.gridy = 8;
		contentPane.add(btnNewButton_14, gbc_btnNewButton_14);
		
		JButton btnNewButton_6 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 6;
		gbc_btnNewButton_6.gridy = 8;
		contentPane.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_22 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_22 = new GridBagConstraints();
		gbc_btnNewButton_22.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_22.gridx = 7;
		gbc_btnNewButton_22.gridy = 8;
		contentPane.add(btnNewButton_22, gbc_btnNewButton_22);
		
		JButton btnNewButton_38 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_38 = new GridBagConstraints();
		gbc_btnNewButton_38.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_38.gridx = 8;
		gbc_btnNewButton_38.gridy = 8;
		contentPane.add(btnNewButton_38, gbc_btnNewButton_38);
		
		JButton btnNewButton_46 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_46 = new GridBagConstraints();
		gbc_btnNewButton_46.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_46.gridx = 9;
		gbc_btnNewButton_46.gridy = 8;
		contentPane.add(btnNewButton_46, gbc_btnNewButton_46);
		
		JButton btnNewButton_54 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_54 = new GridBagConstraints();
		gbc_btnNewButton_54.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_54.gridx = 10;
		gbc_btnNewButton_54.gridy = 8;
		contentPane.add(btnNewButton_54, gbc_btnNewButton_54);
		
		JButton btnNewButton_63 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_63 = new GridBagConstraints();
		gbc_btnNewButton_63.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_63.gridx = 3;
		gbc_btnNewButton_63.gridy = 9;
		contentPane.add(btnNewButton_63, gbc_btnNewButton_63);
		
		JButton btnNewButton_31 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_31 = new GridBagConstraints();
		gbc_btnNewButton_31.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_31.gridx = 4;
		gbc_btnNewButton_31.gridy = 9;
		contentPane.add(btnNewButton_31, gbc_btnNewButton_31);
		
		JButton btnNewButton_15 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_15 = new GridBagConstraints();
		gbc_btnNewButton_15.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_15.gridx = 5;
		gbc_btnNewButton_15.gridy = 9;
		contentPane.add(btnNewButton_15, gbc_btnNewButton_15);
		
		JButton btnNewButton_7 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 6;
		gbc_btnNewButton_7.gridy = 9;
		contentPane.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_23 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_23 = new GridBagConstraints();
		gbc_btnNewButton_23.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_23.gridx = 7;
		gbc_btnNewButton_23.gridy = 9;
		contentPane.add(btnNewButton_23, gbc_btnNewButton_23);
		
		JButton btnNewButton_39 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_39 = new GridBagConstraints();
		gbc_btnNewButton_39.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_39.gridx = 8;
		gbc_btnNewButton_39.gridy = 9;
		contentPane.add(btnNewButton_39, gbc_btnNewButton_39);
		
		JButton btnNewButton_47 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_47 = new GridBagConstraints();
		gbc_btnNewButton_47.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_47.gridx = 9;
		gbc_btnNewButton_47.gridy = 9;
		contentPane.add(btnNewButton_47, gbc_btnNewButton_47);
		
		JButton btnNewButton_55 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_55 = new GridBagConstraints();
		gbc_btnNewButton_55.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_55.gridx = 10;
		gbc_btnNewButton_55.gridy = 9;
		contentPane.add(btnNewButton_55, gbc_btnNewButton_55);
		
		JButton btnDemarrer = new JButton("Lancer");
		GridBagConstraints gbc_btnDemarrer = new GridBagConstraints();
		gbc_btnDemarrer.insets = new Insets(0, 0, 0, 5);
		gbc_btnDemarrer.gridx = 6;
		gbc_btnDemarrer.gridy = 12;
		contentPane.add(btnDemarrer, gbc_btnDemarrer);
		
		JButton btnArret = new JButton("Arr\u00EAter");
		GridBagConstraints gbc_btnArret = new GridBagConstraints();
		gbc_btnArret.insets = new Insets(0, 0, 0, 5);
		gbc_btnArret.gridx = 7;
		gbc_btnArret.gridy = 12;
		contentPane.add(btnArret, gbc_btnArret);
	} boby biby baba

}
