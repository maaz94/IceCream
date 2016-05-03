package edu.cuny.csi.csc330.ProjectIceCream.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;

public class ReceiptFrame extends CheckoutFrame{

	JFrame frame;

	GregorianCalendar calendar = new GregorianCalendar();
	 Date date = new Date();
	 Date now = calendar.getTime();	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceiptFrame window = new ReceiptFrame();
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
	public ReceiptFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 313, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel genInfo = new JLabel("<html>   Guiseppes Ice Cream<br>  2800 Richmond Ave<br>STATEN ISLAND, NY  10314<br><br>Guest Receipt<br>Thank You For Shopping<br>"
				+ "\r\n-------------------------------------------------------------<br>"
				+ "\r\nYour Server was IceCream Generator 2000-Z<br><br><br><br>-------------------------------------------------------------\n</html>");
		genInfo.setVerticalAlignment(SwingConstants.TOP);
		genInfo.setBounds(25, 43, 249, 166);
		genInfo.setHorizontalAlignment(SwingConstants.LEFT);
		genInfo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().add(genInfo);
		
		 String timeNow = now.toString();
		JLabel timeLabel = new JLabel("Time & Date: "+timeNow);
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		timeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		timeLabel.setBounds(25, 153, 249, 20);
		frame.getContentPane().add(timeLabel);
		
		JLabel itemLabel = new JLabel("ITEM                                              QTY   PRICE");
		itemLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		itemLabel.setVerticalAlignment(SwingConstants.TOP);
		itemLabel.setHorizontalAlignment(SwingConstants.LEFT);
		itemLabel.setBounds(25, 185, 242, 97);
		frame.getContentPane().add(itemLabel);
		
		
		
		
		
		
	}
	}

