package edu.cuny.csi.csc330.ProjectIceCream.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class MenuFrame implements IceCream{

	public JFrame frame;
	private JTextField txtCscssd;
	private static String size = null, flavor = null, countString = null;
	private JTextField txtIceCreamSize;
	private JButton mediumSizeButton;
	private JButton largeSizeButton;
	private JTextField chooseAFlavorTxt;
	private JTextField txtToppings;
	private static int count;
	private static float price = 0f;
	private boolean selectedSize = false, selectedFlavor = false;
	SizeErrorFrame sizeErrorFrame = new SizeErrorFrame();
	private int click1 = 0, click2 = 0;
	/**
	 * @wbp.nonvisual location=217,619
	 */
	private  JButton resetToppingsButton;

	public boolean isSelectedSize() {
		return selectedSize;
	}

	public boolean isSelectedFlavor() {
		return selectedFlavor;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

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
	
	public float getSizePrice(String size){
		if(size == "Small"){
			return 1.50f;
		} else if(size == "Medium"){
			return 2.00f;
		} else if(size == "Large"){
			return 2.50f;
		}
		
		return -1;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFrame window = new MenuFrame();
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
	public MenuFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
		
		
		frame = new JFrame("Giuseppe's Ice Cream Parlor!");
		frame.setResizable(false);
		frame.setBackground(new Color(60, 179, 113));
		frame.setBounds(100, 100, 671, 862);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try{
			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:/Users/T430/Documents/GitHub/IceCream/Images/IceCreamBackground.jpg")))));
			
		}catch(IOException e){
			System.out.println("Image doesnt exist");
		}
		frame.getContentPane().setLayout(null);
		
		txtCscssd = new JTextField();
		txtCscssd.setForeground(new Color(0, 0, 128));
		txtCscssd.setHorizontalAlignment(SwingConstants.CENTER);
		txtCscssd.setEditable(false);
		txtCscssd.setBackground(Color.WHITE);
		txtCscssd.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 34));
		txtCscssd.setText("Giuseppe's Ice Cream Parlor");
		txtCscssd.setBounds(0, 0, 692, 67);
		frame.getContentPane().add(txtCscssd);
		txtCscssd.setColumns(10);
		
		JButton smallSizeButton = new JButton("");
		smallSizeButton.setBackground(new Color(255, 105, 180));
		smallSizeButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\iceCreamSmall.jpg"));
		//btnNewButton.setIcon
		smallSizeButton.setBounds(175, 124, 86, 73);
		frame.getContentPane().add(smallSizeButton);
		sizeButtonListener(smallSizeButton,"Small");
		
		txtIceCreamSize = new JTextField();
		txtIceCreamSize.setForeground(Color.BLACK);
		txtIceCreamSize.setHorizontalAlignment(SwingConstants.CENTER);
		txtIceCreamSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtIceCreamSize.setText("Ice Cream Size");
		txtIceCreamSize.setBounds(10, 145, 116, 35);
		frame.getContentPane().add(txtIceCreamSize);
		txtIceCreamSize.setColumns(10);
		
		mediumSizeButton = new JButton("");
		mediumSizeButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\iceCreamMed.jpg"));
		mediumSizeButton.setBounds(295, 100, 133, 117);
		frame.getContentPane().add(mediumSizeButton);
		sizeButtonListener(mediumSizeButton,"Medium");
		
		largeSizeButton = new JButton("");
		largeSizeButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\iceCreamLarge.jpg"));
		largeSizeButton.setBounds(465, 83, 160, 152);
		frame.getContentPane().add(largeSizeButton);
		sizeButtonListener(largeSizeButton,"Large");
		
		chooseAFlavorTxt = new JTextField();
		chooseAFlavorTxt.setForeground(Color.BLACK);
		chooseAFlavorTxt.setHorizontalAlignment(SwingConstants.CENTER);
		chooseAFlavorTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		chooseAFlavorTxt.setText("Choose  A Flavor");
		chooseAFlavorTxt.setBounds(226, 257, 202, 29);
		frame.getContentPane().add(chooseAFlavorTxt);
		chooseAFlavorTxt.setColumns(10);
		
		JButton chocolateButton = new JButton("");
		chocolateButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\Chocolate.jpg"));
		chocolateButton.setBounds(175, 297, 122, 76);
		frame.getContentPane().add(chocolateButton);
		flavorButtonListener(chocolateButton, "Chocolate");
		
		JButton blackCherryButton = new JButton("");
		blackCherryButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\BlackCherry.jpg"));
		blackCherryButton.setBounds(465, 297, 122, 76);
		frame.getContentPane().add(blackCherryButton);
		flavorButtonListener(blackCherryButton, "Black Cherry");
		
		JButton cookiesAndCreamButton = new JButton("");
		cookiesAndCreamButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\Cookies&Cream.jpg"));
		cookiesAndCreamButton.setBounds(319, 384, 122, 76);
		frame.getContentPane().add(cookiesAndCreamButton);
		flavorButtonListener(cookiesAndCreamButton, "Cookies & Cream");
		
		JButton vanillaButton = new JButton("");
		vanillaButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\Vanilla.jpg"));
		vanillaButton.setBounds(37, 297, 122, 76);
		frame.getContentPane().add(vanillaButton);
		flavorButtonListener(vanillaButton, "Vanilla");
		
		JButton tiramisuGelatoButton = new JButton("");
		tiramisuGelatoButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\TirmisuGelato.jpg"));
		tiramisuGelatoButton.setBounds(319, 297, 122, 76);
		frame.getContentPane().add(tiramisuGelatoButton);
		flavorButtonListener(tiramisuGelatoButton, "Tiramisu");
		
		JButton chocolatePeanutButterButton = new JButton("");
		chocolatePeanutButterButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ChocolatePeanutButter.jpg"));
		chocolatePeanutButterButton.setBounds(175, 384, 122, 76);
		frame.getContentPane().add(chocolatePeanutButterButton);
		flavorButtonListener(chocolatePeanutButterButton, "Chocolate Peanut Butter");
		
		JButton butterPecanButton = new JButton("");
		butterPecanButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\ButterPecan.jpg"));
		butterPecanButton.setBounds(37, 384, 122, 76);
		frame.getContentPane().add(butterPecanButton);
		flavorButtonListener(butterPecanButton, "Butter Pecan");
		
		JButton greenTeaButton = new JButton("");
		greenTeaButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\GreenTea.jpg"));
		greenTeaButton.setBounds(465, 385, 122, 76);
		frame.getContentPane().add(greenTeaButton);
		flavorButtonListener(greenTeaButton, "Green Tea");
		
		JButton pistachioButton = new JButton("");
		pistachioButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\Pistachio.jpg"));
		pistachioButton.setBounds(319, 469, 122, 76);
		frame.getContentPane().add(pistachioButton);
		flavorButtonListener(pistachioButton, "Pistachio");
		
		JButton strawberryButton = new JButton("");
		strawberryButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\StrawBerry.jpg"));
		strawberryButton.setBounds(465, 469, 122, 76);
		frame.getContentPane().add(strawberryButton);
		flavorButtonListener(strawberryButton, "Strawberry");
		
		JButton mangoButton = new JButton("");
		mangoButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\Mango.jpg"));
		mangoButton.setBounds(175, 467, 122, 76);
		frame.getContentPane().add(mangoButton);
		flavorButtonListener(mangoButton, "Mango");
		
		JButton javaChipButton = new JButton("");
		javaChipButton.setIcon(new ImageIcon("C:\\Users\\T430\\Documents\\GitHub\\IceCream\\IceCreamImages\\JavaChip.jpg"));
		javaChipButton.setBounds(37, 465, 122, 76);
		frame.getContentPane().add(javaChipButton);
		flavorButtonListener(javaChipButton, "*Special* Java Chip");
		
		txtToppings = new JTextField();
		txtToppings.setForeground(Color.BLACK);
		txtToppings.setText(" Toppings:");
		txtToppings.setHorizontalAlignment(SwingConstants.CENTER);
		txtToppings.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtToppings.setBounds(37, 571, 133, 35);
		frame.getContentPane().add(txtToppings);
		txtToppings.setColumns(10);
		
		
		/**********************************************************************************************************************/
		
		final JRadioButton wCreamRButton = new JRadioButton("Whipped Cream");
		wCreamRButton.setBackground(Color.LIGHT_GRAY);
		wCreamRButton.setBounds(37, 624, 116, 30);
		frame.getContentPane().add(wCreamRButton);
		radioButtonListener(wCreamRButton);
		
		JRadioButton chocoSyrupRButton = new JRadioButton("Chocolate Syrup");
		chocoSyrupRButton.setBackground(Color.LIGHT_GRAY);
		chocoSyrupRButton.setBounds(37, 657, 116, 30);
		frame.getContentPane().add(chocoSyrupRButton);
		radioButtonListener(chocoSyrupRButton);
		
		JRadioButton caramelSyrupRButton = new JRadioButton("Caramel Syrup");
		caramelSyrupRButton.setBackground(Color.LIGHT_GRAY);
		caramelSyrupRButton.setBounds(37, 690, 116, 30);
		frame.getContentPane().add(caramelSyrupRButton);
		radioButtonListener(caramelSyrupRButton);
		
		JRadioButton oreoRButton = new JRadioButton("Crushed Oreos");
		oreoRButton.setBackground(Color.LIGHT_GRAY);
		oreoRButton.setBounds(37, 723, 116, 30);
		frame.getContentPane().add(oreoRButton);
		radioButtonListener(oreoRButton);
		
		JRadioButton rainbowSprinklesRButton = new JRadioButton("Rainbow Sprinkles");
		rainbowSprinklesRButton.setBackground(Color.LIGHT_GRAY);
		rainbowSprinklesRButton.setBounds(200, 624, 116, 30);
		frame.getContentPane().add(rainbowSprinklesRButton);
		radioButtonListener(rainbowSprinklesRButton);

		JRadioButton chocoSprinklesRButton = new JRadioButton("Chocolate Sprinkles");
		chocoSprinklesRButton.setBackground(Color.LIGHT_GRAY);
		chocoSprinklesRButton.setBounds(200, 657, 129, 30);
		frame.getContentPane().add(chocoSprinklesRButton);
		radioButtonListener(chocoSprinklesRButton);

		JRadioButton marshmallowRButton = new JRadioButton("Marshmallows");
		marshmallowRButton.setBackground(Color.LIGHT_GRAY);
		marshmallowRButton.setBounds(200, 690, 116, 30);
		frame.getContentPane().add(marshmallowRButton);
		radioButtonListener(marshmallowRButton);

		JRadioButton cherryRButton = new JRadioButton("Maraschino Cherry");
		cherryRButton.setBackground(Color.LIGHT_GRAY);
		cherryRButton.setBounds(200, 723, 116, 30);
		frame.getContentPane().add(cherryRButton);
		radioButtonListener(cherryRButton);

		JRadioButton cChipRButton = new JRadioButton("Chocolate Chips");
		cChipRButton.setBackground(Color.LIGHT_GRAY);
		cChipRButton.setBounds(383, 624, 116, 30);
		frame.getContentPane().add(cChipRButton);
		radioButtonListener(cChipRButton);

		JRadioButton peanutsRButton = new JRadioButton("Peanuts");
		peanutsRButton.setBackground(Color.LIGHT_GRAY);
		peanutsRButton.setBounds(383, 657, 116, 30);
		frame.getContentPane().add(peanutsRButton);
		radioButtonListener(peanutsRButton);

		JRadioButton skittlesRButton = new JRadioButton("Skittles");
		skittlesRButton.setBackground(Color.LIGHT_GRAY);
		skittlesRButton.setBounds(383, 690, 116, 30);
		frame.getContentPane().add(skittlesRButton);
		radioButtonListener(skittlesRButton);

		JRadioButton mnmRButton = new JRadioButton("M&Ms");
		mnmRButton.setBackground(Color.LIGHT_GRAY);
		mnmRButton.setBounds(383, 723, 116, 30);
		frame.getContentPane().add(mnmRButton);
		radioButtonListener(mnmRButton);
		
		JButton resetToppingsButton  = new JButton("No Toppings!");
		resetToppingsButton.setBackground(new Color(0, 153, 0));
		resetToppingsButton.setBounds(180, 571, 133, 35);
		frame.getContentPane().add(resetToppingsButton);
		resetToppingsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count = 0;
				countString = Integer.toString(count);
				txtToppings.setText(countString);
			}
		});


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
				if(selectedSize == true && selectedFlavor == true){
					CheckoutFrame checkoutFrame = new CheckoutFrame();
					openCheckoutFrame(checkoutFrame);
				}
				else{
					ErrorFrame errorFrame = new ErrorFrame();
					  openWindow(errorFrame.frame);
					  if(selectedSize == false){
						  txtIceCreamSize.setForeground(Color.RED);
					  }
					  if(selectedFlavor == false){
						  chooseAFlavorTxt.setForeground(Color.RED);
					  }
				
				}
			 }
			
			
	});
}
		
/*********************************************************************************************************************/
		
		
	//Radio button Listener
	private void radioButtonListener(final JRadioButton button){
		button.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			 if(selectedSize){
				 if(button.isSelected()){
				   
				   count++;
				   countString = Integer.toString(count);
				   txtToppings.setText(countString);
				 }else if(!button.isSelected() && count != 0){
				 		count--;
				 		countString = Integer.toString(count);
						txtToppings.setText(countString);
				 }
			 } else {
				 openSizeErrorFrame(sizeErrorFrame);
				 button.setSelected(false);
			 }
		 }

	});
	}
//Flavor button Listener
	private void flavorButtonListener(JButton button, final String flavorText){
		button.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			 if(selectedSize){
				 if(flavorText == "*Special* Java Chip" && click2 == 0 && click1 == 1){
					 price += 1.00f;
					 setFlavor(flavorText);
					 chooseAFlavorTxt.setText(getFlavor());
					 chooseAFlavorTxt.setForeground(Color.black);
					 selectedFlavor = true;
					 click2 = 1;
				 } else if(flavorText == "*Special* Java Chip" && click2 == 0){
					 price += 1.99f;
					 setFlavor(flavorText);
					 chooseAFlavorTxt.setText(getFlavor());
					 chooseAFlavorTxt.setForeground(Color.black);
					 selectedFlavor = true;
					 click2 = 1;
				 } else if(flavorText == "*Special* Java Chip" && click2 == 1){
					 setFlavor(flavorText);
					 chooseAFlavorTxt.setText(getFlavor());
					 chooseAFlavorTxt.setForeground(Color.black);
					 selectedFlavor = true;
				 } else if(click1 == 0 && click2 == 1){
					 price = .99f + getSizePrice(getSize());
					 setFlavor(flavorText);
					 chooseAFlavorTxt.setText(getFlavor());
					 chooseAFlavorTxt.setForeground(Color.black);
					 selectedFlavor = true;
					 click1 = 1;
				 } else if(click1 == 0){
					 price += .99f;
					 setFlavor(flavorText);
					 chooseAFlavorTxt.setText(getFlavor());
					 chooseAFlavorTxt.setForeground(Color.black);
					 selectedFlavor = true;
					 click1 = 1;
				 }
				 else if(click1 == 1){
					 setFlavor(flavorText);
					 chooseAFlavorTxt.setText(getFlavor());
					 chooseAFlavorTxt.setForeground(Color.black);
					 selectedFlavor = true;
				 } 
			 } else {
				 openSizeErrorFrame(sizeErrorFrame);
			 	}
		 	}
		});
	}

//Size Button Listener
	private void sizeButtonListener(JButton button, final String size){
		
		button.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae)
		 {
			 setPrice(getSizePrice(size));
			 setSize(size);
			 txtIceCreamSize.setText(getSize());
			 txtIceCreamSize.setForeground(Color.black);
			 selectedSize = true;
		 }
	});	
	
	}

	public void openWindow(JFrame openFrame){
		openFrame.setVisible(true);
	
	}
	
	public void openSizeErrorFrame(SizeErrorFrame sizeErrorFrame){
		sizeErrorFrame.frame.setVisible(true);
	}

	public void openCheckoutFrame(CheckoutFrame openFrame){
	openFrame.frame.setVisible(true);
	openFrame.txtSize.setText(this.getSize());
	openFrame.txtFlavor.setText(this.getFlavor());
	this.frame.setVisible(false);
	
	}

	}
