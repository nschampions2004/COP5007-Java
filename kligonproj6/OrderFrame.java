/**
This class sets the scene and runs the frame that makes the order calculation possible
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 6
File Name: OrderFrame.java
*/

import java.text.NumberFormat;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class OrderFrame extends JFrame //implements ActionListener, Border
{
   //holder for the pane
   private Container contents;
   private JButton calculateButton;
   private JButton exitButton;
   private JRadioButton whiteBread;
   private JRadioButton  wheatBread;
   private JPanel breadPanel = new JPanel();
   private JLabel breadPanelLabel = new JLabel("Bread");
   private JRadioButton noCoffee;
   private JRadioButton regCoffee;
   private JRadioButton decafCoffee;
   private JRadioButton cappuccino;
   private JPanel coffeePanel = new JPanel();
   private JLabel coffeePanelLabel = new JLabel("Coffee");
   
   public OrderFrame( )
   {
      setTitle("Order Calculator");
      contents = getContentPane( );
      setSize( 600, 600);
      setVisible( true );
      setLayout(new GridBagLayout());
      GridBagConstraints layoutConst = null; 
      //the welcome message for the order calculator      
      JLabel l = new JLabel("Welcome to Johnny's Sandwich Shop");
      //the calculcate button for the order calculator
      calculateButton = new JButton("Calculate");
      //the exit button for the order calculator
      exitButton = new JButton("Exit");
      
      //the white bread radio button
      whiteBread = new JRadioButton("White");
      //the wheat bread radio button
      wheatBread = new JRadioButton("Wheat");
      //the bread button group
      ButtonGroup bg = new ButtonGroup();
      //adding them bread buttons to the button group
      bg.add(whiteBread);
      bg.add(wheatBread);
      //adding the bread section to the pane
      breadPanel.setLayout(new GridLayout(2, 0, 2, 2));
      Border breadBorder = BorderFactory.createTitledBorder("Bread");
      breadPanel.setBorder(breadBorder);
      breadPanel.add(whiteBread);
      breadPanel.add(wheatBread);
      
      //the no coffee radio button
      noCoffee = new JRadioButton("None");
      //the reg Coffee radio button
      regCoffee = new JRadioButton("Regular Coffee");
      //the decaf coffee radio button
      decafCoffee = new JRadioButton("Decaf Coffee");
      //the cappuccion radio button
      cappuccino = new JRadioButton("Cappuccino");
      //the button group holding them altogether
      ButtonGroup bg1 = new ButtonGroup();
      bg1.add(noCoffee);
      bg1.add(regCoffee);
      bg1.add(decafCoffee);
      bg1.add(cappuccino);
      //the layout for the coffee section
      coffeePanel.setLayout(new GridLayout(4, 0, 2, 2));
      Border coffeeBorder = BorderFactory.createTitledBorder("Coffee");
      coffeePanel.setBorder(coffeeBorder);
      coffeePanel.add(noCoffee);
      coffeePanel.add(regCoffee);
      coffeePanel.add(decafCoffee);
      coffeePanel.add(cappuccino);
      //the 
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 0, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      add(coffeePanel, layoutConst);
      
                  
      /*layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      add(l, layoutConst);
           
      //the calculate button for the frame
      layoutConst = new GridBagConstraints();
      //layoutConst.insets = new Insets(1, 10, 0, 0);
      //layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 2;
      layoutConst.gridy = 2;
      add(calculateButton, layoutConst);      
      //the exit button for the frame
      layoutConst = new GridBagConstraints();
      //layoutConst.insets = new Insets(10, 10, 10, 10);
      //layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 2;
      add(exitButton, layoutConst);
      
      //the bread panel 
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 0, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      add(breadPanel, layoutConst);
      */
      //the coffee panel
      
}


   public static void main(String [] args )
   {
      OrderFrame orderCalculatorFrame = new OrderFrame( );
      orderCalculatorFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE); 
   }
}

   
      