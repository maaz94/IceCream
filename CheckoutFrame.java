package edu.cuny.csi.csc330.ProjectIceCream.Project;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.imageio.ImageIO;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class CheckoutFrame{

	MenuFrame menuframe = new MenuFrame();
	public static JFrame frame;
	public JTextField txtSize;
	public JTextField txtFlavor;
	private JTextField priceTxt;
	MenuFrame menuFrame = new MenuFrame();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckoutFrame window = new CheckoutFrame();
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
	public CheckoutFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 523, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		try{
			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:/Users/T430/Documents/GitHub/IceCream/Images/PolkaDot.png")))));
			
		}catch(IOException e){
			System.out.println("Image doesnt exist");
		}
		
		JList list_1 = new JList();
		list_1.setBounds(263, 195, 1, 1);
		frame.getContentPane().add(list_1);
		
		JButton confirmPictureButton = new JButton("New button");
		confirmPictureButton.setBounds(250, 5, 200, 225);
		frame.getContentPane().add(confirmPictureButton);
		setIceCreamConfirmIcon(confirmPictureButton);
		
		JButton continueButton = new JButton("Yes - Confirm Order");
		continueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReceiptFrame receipt = new ReceiptFrame();
				openWindow(receipt);
				
			}
		});
		continueButton.setBounds(209, 252, 151, 23);
		frame.getContentPane().add(continueButton);
		
		JButton backButton = new JButton("No - Go Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame menuFrame = new MenuFrame();
				//frame3 framey2 = new frame3();
				openWindow(menuFrame);		
			}
		});
		backButton.setBounds(370, 252, 127, 23);
		frame.getContentPane().add(backButton);
		
		txtSize = new JTextField();
		//txtSize.setText("null");
		txtSize.setBounds(66, 107, 152, 20);
		frame.getContentPane().add(txtSize);
		txtSize.setColumns(10);
		
		txtFlavor = new JTextField();
		//txtFlavor.setText("Mango");
		txtFlavor.setBounds(66, 138, 152, 20);
		frame.getContentPane().add(txtFlavor);
		txtFlavor.setColumns(10);
		
		priceTxt = new JTextField();
		priceTxt.setText("$" + String.format("%.02f", menuFrame.getPrice() + menuFrame.getCount()*.50));
		priceTxt.setBounds(66, 210, 86, 20);
		frame.getContentPane().add(priceTxt);
		priceTxt.setColumns(10);
		
		JLabel lblYouSelected = new JLabel("You selected :");
		lblYouSelected.setForeground(Color.BLACK);
		lblYouSelected.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblYouSelected.setBounds(83, 72, 102, 23);
		frame.getContentPane().add(lblYouSelected);
		
		JLabel lblPrice = new JLabel("PRICE:");
		lblPrice.setBounds(10, 216, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblEverythingSoundsGood = new JLabel("Everything sounds good ?");
		lblEverythingSoundsGood.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEverythingSoundsGood.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblEverythingSoundsGood.setBounds(10, 252, 175, 23);
		frame.getContentPane().add(lblEverythingSoundsGood);
		
		JLabel lblNewLabel = new JLabel("Size:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 110, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Flavor:");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 141, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(66, 169, 152, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(menuFrame.getCount() + " topping(s)");
		
		JLabel lblNewLabel_2 = new JLabel("Toppings:");
		lblNewLabel_2.setBounds(10, 172, 60, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
	
	private void setIceCreamConfirmIcon(JButton button){
		if(menuFrame.getFlavor() == "Chocolate"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmChocolate.jpg"));
		} else if(menuFrame.getFlavor() == "Vanilla"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmVanilla.jpg"));
		} else if(menuFrame.getFlavor() == "Black Cherry"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmBlackCherry.jpg"));
		} else if(menuFrame.getFlavor() == "Butter Pecan"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmButterPecan.jpg"));
		} else if(menuFrame.getFlavor() == "Chocolate Peanut Butter"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmChocolatePeanutButter.jpg"));
		} else if(menuFrame.getFlavor() == "Cookies & Cream"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmCookiesAndCream.jpg"));
		} else if(menuFrame.getFlavor() == "Green Tea"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmGreenTea.jpg"));
		} else if(menuFrame.getFlavor() == "*Special* Java Chip"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmJavaChip.jpg"));
		} else if(menuFrame.getFlavor() == "Mango"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmMango.jpg"));
		} else if(menuFrame.getFlavor() == "Pistachio"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmPistachio.jpg"));
		} else if(menuFrame.getFlavor() == "Strawberry"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmStrawberry.jpg"));
		} else if(menuFrame.getFlavor() == "Tiramisu"){
			button.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ConfirmPics\\ConfirmTiramisu.jpg"));
		}
			
	}
	
	
	public void openWindow(MenuFrame frameOpen){
		this.frame.setVisible(false);
		frameOpen.frame.setVisible(true);	
	}
	public void openWindow(ReceiptFrame receipt){
		this.frame.setVisible(false);
		receipt.frame.setVisible(true);
		
	}
}
