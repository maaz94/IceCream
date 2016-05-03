package edu.cuny.csi.csc330.ProjectIceCream.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class ErrorFrame {

	public JFrame frame;
	private JLabel errorLabel;
	private JLabel missingLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorFrame window = new ErrorFrame();
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
	public ErrorFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 304, 182);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClickHereTo = new JButton("Close");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnClickHereTo.setBounds(94, 82, 99, 23);
		frame.getContentPane().add(btnClickHereTo);
		
		errorLabel = new JLabel("You left a field blank.");
		errorLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		errorLabel.setBounds(53, 11, 183, 36);
		frame.getContentPane().add(errorLabel);
		
		missingLabel = new JLabel("(Fields left blank are highlighted in red)");
		missingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		missingLabel.setForeground(Color.RED);
		missingLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		missingLabel.setBounds(10, 46, 268, 25);
		frame.getContentPane().add(missingLabel);
	}
	
	public void openWindow(MenuFrame frameOpen){
		frameOpen.frame.setVisible(true);
		this.frame.setVisible(false);
		
	}
	

}
