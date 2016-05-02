package edu.cuny.csi.csc330.ProjectIceCream.Project;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Frame3 {

	public JFrame frame;
	private JTextField txtYouHaveSelected;
	public JTextField txtSize;
	public JTextField txtFlavor;
	private JTextField txtPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 window = new Frame3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 725, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list_1 = new JList();
		list_1.setBounds(263, 195, 1, 1);
		frame.getContentPane().add(list_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Tiffany Vacirca\\Desktop\\confirm order\\fl_gelato_blackcherryamarettogelato_hero2.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(222, 11, 225, 225);
		frame.getContentPane().add(btnNewButton);
		
		JButton Continue = new JButton("Continuey");
		Continue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Continue.setBounds(393, 333, 89, 23);
		frame.getContentPane().add(Continue);
		
		JButton btnChangeYourFlavor = new JButton("Go Back");
		btnChangeYourFlavor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame1 frameey = new Frame1();
				openWindow(frameey);		
			}
		});
		btnChangeYourFlavor.setBounds(175, 333, 102, 23);
		frame.getContentPane().add(btnChangeYourFlavor);
		
		txtYouHaveSelected = new JTextField();
		txtYouHaveSelected.setText("You selected:");
		txtYouHaveSelected.setBounds(282, 247, 87, 20);
		frame.getContentPane().add(txtYouHaveSelected);
		txtYouHaveSelected.setColumns(10);
		
		txtSize = new JTextField();
		txtSize.setText("Small");
		txtSize.setBounds(282, 265, 86, 20);
		frame.getContentPane().add(txtSize);
		txtSize.setColumns(10);
		
		txtFlavor = new JTextField();
		txtFlavor.setText("Mango");
		txtFlavor.setBounds(282, 287, 86, 20);
		frame.getContentPane().add(txtFlavor);
		txtFlavor.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setText("Price: $6.50");
		txtPrice.setBounds(282, 308, 86, 20);
		frame.getContentPane().add(txtPrice);
		txtPrice.setColumns(10);
	}
	
	
	public void openWindow(Frame1 frameOpen){
		this.frame.setVisible(false);
		frameOpen.frame.setVisible(true);	
	}
}
