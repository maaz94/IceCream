package edu.cuny.csi.csc330.ProjectIceCream.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SizeErrorFrame {

	public JFrame frame;
	private JTextField txtMustSelectSize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SizeErrorFrame window = new SizeErrorFrame();
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
	public SizeErrorFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 293, 212);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtMustSelectSize = new JTextField();
		txtMustSelectSize.setHorizontalAlignment(SwingConstants.CENTER);
		txtMustSelectSize.setEditable(false);
		txtMustSelectSize.setText("Must Select SIZE first !!");
		txtMustSelectSize.setBounds(53, 52, 168, 30);
		frame.getContentPane().add(txtMustSelectSize);
		txtMustSelectSize.setColumns(10);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(95, 113, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
