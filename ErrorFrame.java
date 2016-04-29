package edu.cuny.csi.csc330.ProjectIceCream.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ErrorFrame {

	public JFrame frame;
	private JTextField errorField;

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
		
		errorField = new JTextField();
		errorField.setFont(new Font("Tahoma", Font.BOLD, 13));
		errorField.setBackground(new Color(255, 0, 0));
		errorField.setText("ERROR!! You Left A Field Blank, \r\n");
		errorField.setBounds(10, 11, 228, 23);
		frame.getContentPane().add(errorField);
		errorField.setColumns(10);
		
		JButton btnClickHereTo = new JButton("Click HERE To Go Back to Ice Cream Parlor");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame1 framey = new Frame1();
				openWindow(framey);
			}
		});
		btnClickHereTo.setBounds(28, 67, 235, 23);
		frame.getContentPane().add(btnClickHereTo);
	}
	
	public void openWindow(Frame1 frameOpen){
		frameOpen.frame.setVisible(true);
		this.frame.setVisible(false);
		
	}
	

}
