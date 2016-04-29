package edu.cuny.csi.csc330.ProjectIceCream.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class Frame1 {

	public JFrame frame;
	private JTextField txtCscssd;
	private String size = null, flavor = null, countString = null;
	private JTextField txtIceCreamSize;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField chooseAFlavorTxt;
	private JTextField txtToppings;
	private int count;
	private float price;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(60, 179, 113));
		frame.setBounds(100, 100, 671, 862);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtCscssd = new JTextField();
		txtCscssd.setForeground(new Color(0, 0, 128));
		txtCscssd.setHorizontalAlignment(SwingConstants.CENTER);
		txtCscssd.setEditable(false);
		txtCscssd.setBackground(new Color(127, 255, 0));
		txtCscssd.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 30));
		txtCscssd.setText("Giuseppe's Ice Cream Parlor");
		txtCscssd.setBounds(0, 0, 692, 67);
		frame.getContentPane().add(txtCscssd);
		txtCscssd.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 105, 180));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\iceCreamSmall.jpg"));
		//btnNewButton.setIcon
		btnNewButton.setBounds(175, 124, 86, 73);
		frame.getContentPane().add(btnNewButton);
		
		txtIceCreamSize = new JTextField();
		txtIceCreamSize.setHorizontalAlignment(SwingConstants.CENTER);
		txtIceCreamSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtIceCreamSize.setText("Ice Cream Size");
		txtIceCreamSize.setBounds(10, 145, 116, 35);
		frame.getContentPane().add(txtIceCreamSize);
		txtIceCreamSize.setColumns(10);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\iceCreamMed.jpg"));
		btnNewButton_1.setBounds(295, 100, 133, 117);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\iceCreamLarge.jpg"));
		btnNewButton_2.setBounds(465, 83, 160, 152);
		frame.getContentPane().add(btnNewButton_2);
		
		chooseAFlavorTxt = new JTextField();
		chooseAFlavorTxt.setHorizontalAlignment(SwingConstants.CENTER);
		chooseAFlavorTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		chooseAFlavorTxt.setText("Choose  A Flavor");
		chooseAFlavorTxt.setBounds(226, 257, 202, 29);
		frame.getContentPane().add(chooseAFlavorTxt);
		chooseAFlavorTxt.setColumns(10);
		
		JButton chocolateButton = new JButton("");
		chocolateButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\Chocolate.jpg"));
		chocolateButton.setBounds(175, 297, 122, 76);
		frame.getContentPane().add(chocolateButton);
		chocolateButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Chocolate");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});	
		
		JButton blackCherryButton = new JButton("");
		blackCherryButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\BlackCherry.jpg"));
		blackCherryButton.setBounds(465, 297, 122, 76);
		frame.getContentPane().add(blackCherryButton);
		blackCherryButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Black Cherry");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		JButton cookiesAndCreamButton = new JButton("");
		cookiesAndCreamButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\Cookies&Cream.jpg"));
		cookiesAndCreamButton.setBounds(319, 384, 122, 76);
		frame.getContentPane().add(cookiesAndCreamButton);
		cookiesAndCreamButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Cookies & Cream");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		JButton vanillaButton = new JButton("");
		vanillaButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\Vanilla.jpg"));
		vanillaButton.setBounds(37, 297, 122, 76);
		frame.getContentPane().add(vanillaButton);
		vanillaButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Vanilla");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		JButton tiramisuGelatoButton = new JButton("");
		tiramisuGelatoButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\TirmisuGelato.jpg"));
		tiramisuGelatoButton.setBounds(319, 297, 122, 76);
		frame.getContentPane().add(tiramisuGelatoButton);
		tiramisuGelatoButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Tiramisu");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		JButton chocolatePeanutButterButton = new JButton("");
		chocolatePeanutButterButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\ChocolatePeanutButter.jpg"));
		chocolatePeanutButterButton.setBounds(175, 384, 122, 76);
		frame.getContentPane().add(chocolatePeanutButterButton);
		chocolatePeanutButterButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Chocolate Peanut Butter");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		JButton butterPecanButton = new JButton("");
		butterPecanButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\ButterPecan.jpg"));
		butterPecanButton.setBounds(37, 384, 122, 76);
		frame.getContentPane().add(butterPecanButton);
		butterPecanButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Butter Pecan");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		JButton greenTeaButton = new JButton("");
		greenTeaButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\GreenTea.jpg"));
		greenTeaButton.setBounds(465, 385, 122, 76);
		frame.getContentPane().add(greenTeaButton);
		greenTeaButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Green Tea");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		JButton pistachioButton = new JButton("");
		pistachioButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\Pistachio.jpg"));
		pistachioButton.setBounds(319, 469, 122, 76);
		frame.getContentPane().add(pistachioButton);
		pistachioButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Pistachio");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		JButton strawberryButton = new JButton("");
		strawberryButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\StrawBerry.jpg"));
		strawberryButton.setBounds(465, 469, 122, 76);
		frame.getContentPane().add(strawberryButton);
		strawberryButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Strawberry");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		JButton mangoButton = new JButton("");
		mangoButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\Mango.jpg"));
		mangoButton.setBounds(175, 467, 122, 76);
		frame.getContentPane().add(mangoButton);
		mangoButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("Mango");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		JButton javaChipButton = new JButton("");
		javaChipButton.setIcon(new ImageIcon("C:\\Users\\Maaz\\Desktop\\Images_IceCream\\JavaChip.jpg"));
		javaChipButton.setBounds(37, 465, 122, 76);
		frame.getContentPane().add(javaChipButton);
		javaChipButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   setFlavor("*Special* Java Chip");
			   chooseAFlavorTxt.setText(getFlavor());
			 }
		});
		
		txtToppings = new JTextField();
		txtToppings.setText(" Toppings:");
		txtToppings.setHorizontalAlignment(SwingConstants.CENTER);
		txtToppings.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtToppings.setBounds(37, 571, 133, 35);
		frame.getContentPane().add(txtToppings);
		txtToppings.setColumns(10);
		
		
		/**********************************************************************************************************************/
		
		final JRadioButton wCreamRButton = new JRadioButton("Whipped Cream");
		wCreamRButton.setBounds(37, 624, 116, 30);
		frame.getContentPane().add(wCreamRButton);
		radioButtonListener(wCreamRButton);
		
		JRadioButton chocoSyrupRButton = new JRadioButton("Chocolate Syrup");
		chocoSyrupRButton.setBounds(37, 657, 116, 30);
		frame.getContentPane().add(chocoSyrupRButton);
		radioButtonListener(chocoSyrupRButton);
		
		JRadioButton caramelSyrupRButton = new JRadioButton("Caramel Syrup");
		caramelSyrupRButton.setBounds(37, 690, 116, 30);
		frame.getContentPane().add(caramelSyrupRButton);
		radioButtonListener(caramelSyrupRButton);
		
		JRadioButton oreoRButton = new JRadioButton("Crushed Oreos");
		oreoRButton.setBounds(37, 723, 116, 30);
		frame.getContentPane().add(oreoRButton);
		radioButtonListener(oreoRButton);
		
		JRadioButton rainbowSprinklesRButton = new JRadioButton("Rainbow Sprinkles");
		rainbowSprinklesRButton.setBounds(200, 624, 116, 30);
		frame.getContentPane().add(rainbowSprinklesRButton);
		radioButtonListener(rainbowSprinklesRButton);

		JRadioButton chocoSprinklesRButton = new JRadioButton("Chocolate Sprinkles");
		chocoSprinklesRButton.setBounds(200, 657, 129, 30);
		frame.getContentPane().add(chocoSprinklesRButton);
		radioButtonListener(chocoSprinklesRButton);

		JRadioButton marshmallowRButton = new JRadioButton("Marshmallows");
		marshmallowRButton.setBounds(200, 690, 116, 30);
		frame.getContentPane().add(marshmallowRButton);
		radioButtonListener(marshmallowRButton);

		JRadioButton cherryRButton = new JRadioButton("Maraschino Cherry");
		cherryRButton.setBounds(200, 723, 116, 30);
		frame.getContentPane().add(cherryRButton);
		radioButtonListener(cherryRButton);

		JRadioButton cChipRButton = new JRadioButton("Chocolate Chips");
		cChipRButton.setBounds(383, 624, 116, 30);
		frame.getContentPane().add(cChipRButton);
		radioButtonListener(cChipRButton);

		JRadioButton peanutsRButton = new JRadioButton("Peanuts");
		peanutsRButton.setBounds(383, 657, 116, 30);
		frame.getContentPane().add(peanutsRButton);
		radioButtonListener(peanutsRButton);

		JRadioButton skittlesRButton = new JRadioButton("Skittles");
		skittlesRButton.setBounds(383, 690, 116, 30);
		frame.getContentPane().add(skittlesRButton);
		radioButtonListener(skittlesRButton);

		JRadioButton mnmRButton = new JRadioButton("M&Ms");
		mnmRButton.setBounds(383, 723, 116, 30);
		frame.getContentPane().add(mnmRButton);
		radioButtonListener(mnmRButton);

		JButton finalizeButton = new JButton("Finalize ");
		finalizeButton.setForeground(new Color(0, 0, 0));
		finalizeButton.setBackground(new Color(255, 0, 0));
		finalizeButton.setToolTipText("");
		finalizeButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		finalizeButton.setBounds(0, 767, 655, 45);
		frame.getContentPane().add(finalizeButton);
		
		finalizeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			 {
				if(size == null || flavor == null){
				  ErrorFrame framey = new ErrorFrame();
				  openWindow(framey.frame);
				}
				else{
					
				Frame3 framey = new Frame3();
				openFrame3(framey);
				
				}
			 }
			
			
	});
		
		javaChipButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   flavor = "*Special* Java Chip";
			   chooseAFlavorTxt.setText(flavor);
			 }
		});
		
		btnNewButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   size = "Small";
			   txtIceCreamSize.setText(size);
			 }
		});	
		
		btnNewButton_1.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   size = "Medium";
			   txtIceCreamSize.setText(size);
			 }
		});	
		
		btnNewButton_2.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
			   size = "Large";
			   txtIceCreamSize.setText(size);
			 }
		});	
	}
private void radioButtonListener(final JRadioButton button){
	button.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			 if(button.isSelected()){
				   
				   count++;
				   countString = Integer.toString(count);
				   txtToppings.setText(countString);
			 }else if(!button.isSelected()){
				 		count--;
				 		countString = Integer.toString(count);
						txtToppings.setText(countString);
				 }
			 }

	});
}

public void openWindow(JFrame openFrame){
	openFrame.setVisible(true);
	this.frame.setVisible(false);
	
}

public void openFrame3(Frame3 openFrame){
	openFrame.frame.setVisible(true);
	openFrame.txtSize.setText(this.getSize());
	openFrame.txtFlavor.setText(this.getFlavor());
	this.frame.setVisible(false);
	
}
}
