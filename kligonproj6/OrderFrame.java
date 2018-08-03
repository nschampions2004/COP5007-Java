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
import java.awt.Dimension;

public class OrderFrame extends JFrame //implements ActionListener, Border
{
   //holder for the pane
   private Container contents;
   private JRadioButton whiteBread;
   private JRadioButton  wheatBread;
   private JPanel breadPanel = new JPanel();
   private JLabel breadPanelLabel = new JLabel("Bread");
   private JRadioButton noCoffee;
   private JRadioButton regCoffee;
   private JRadioButton decafCoffee;
   private JRadioButton cappuccino;
   
   private JLabel coffeePanelLabel = new JLabel("Coffee");
   
   
  public static void main(String [] args )
  {
     JFrame myFrame = new JFrame("Order Calculator");
     myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //myFrame.setPreferredSize(new Dimension(400, 300));
     myFrame.setSize(450, 275);
     Container myPane = myFrame.getContentPane();
     JLabel l = new JLabel("Welcome to Johnny's Sandwich Shop");
     myPane.setLayout(new GridBagLayout());
     GridBagConstraints c = new GridBagConstraints();
     
     c.gridx = 1;
     c.gridy = 0;
     myFrame.add(l, c);
     
     c.gridx = 0;
     c.gridy = 1;
     myFrame.add(getBreadPanel(), c);
     
     c.gridx = 1;
     c.gridy = 1;
     myFrame.add(getMeatCheesePanel(), c);
     
     c.gridx = 2;
     c.gridy = 1;
     myFrame.add(getCoffeePanel(), c);
     
     c.gridx = 1;
     c.gridy = 2;
     myFrame.add(getCalculateButton(), c);
     
     c.gridx = 2;
     c.gridy = 2;
     myFrame.add(getExitButton(), c);
          
     myFrame.setVisible(true);
  }

   private static JPanel getBreadPanel()
   {
     //   the white bread radio button
     JRadioButton whiteBread = new JRadioButton("White");
     //  the wheat bread radio button
     JRadioButton wheatBread = new JRadioButton("Wheat");
     //  the bread button group
     ButtonGroup bg = new ButtonGroup();
     //  adding them bread buttons to the button group
     bg.add(whiteBread);
     bg.add(wheatBread);
     //  adding the bread section to the pane
     JPanel breadPanel = new JPanel(new GridBagLayout());
     Box breadBox = Box.createVerticalBox();
     breadBox.setBorder(BorderFactory.createTitledBorder("Bread"));
     breadBox.add(whiteBread);
     breadBox.add(wheatBread);
     breadPanel.add(breadBox);
     
     return breadPanel;
   }
      
   private static JPanel getMeatCheesePanel()
   {
      //cheese checkbox
      JCheckBox cheese = new JCheckBox("Cheese");
      //roast beef checkbox
      JCheckBox roastBeef = new JCheckBox("Roast Beef");
      //turkey checkbox
      JCheckBox turkey = new JCheckBox("Turkey");
      //ham checkbox
      JCheckBox ham = new JCheckBox("Ham");
      JPanel meatCheesePanel = new JPanel(new GridBagLayout());
      Box meatCheeseBox = Box.createVerticalBox();
      meatCheeseBox.setBorder(BorderFactory.createTitledBorder("Meat/Cheese"));
      meatCheeseBox.add(cheese);
      meatCheeseBox.add(roastBeef);
      meatCheeseBox.add(turkey);
      meatCheeseBox.add(ham);
      meatCheesePanel.add(meatCheeseBox);
               
      return meatCheesePanel;
   }
      
   private static JPanel getCoffeePanel()
   {
      //the no coffee radio button
      JRadioButton noCoffee = new JRadioButton("None");
      //the reg Coffee radio button
      JRadioButton regCoffee = new JRadioButton("Regular Coffee");
      //the decaf coffee radio button
      JRadioButton decafCoffee = new JRadioButton("Decaf Coffee");
      //the cappuccion radio button
      JRadioButton cappuccino = new JRadioButton("Cappuccino");
      //the button group holding them altogether
      ButtonGroup bg1 = new ButtonGroup();
      bg1.add(noCoffee);
      bg1.add(regCoffee);
      bg1.add(decafCoffee);
      bg1.add(cappuccino);
      JPanel coffeePanel = new JPanel(new GridBagLayout());
      Box coffeeBox = Box.createVerticalBox();
      coffeeBox.add(noCoffee);
      coffeeBox.add(regCoffee);
      coffeeBox.add(decafCoffee);
      coffeeBox.add(cappuccino);
      coffeeBox.setBorder(BorderFactory.createTitledBorder("Coffee"));
      coffeePanel.add(coffeeBox);
      
      return coffeePanel;
   }
      
   private static JButton getCalculateButton()
   {
      //   the calculcate button for the order calculator
         JButton calculateButton = new JButton("Calculate");
         
         return calculateButton;
   }
      
   private static JButton getExitButton()
   {
      //   the exit button for the order calculator
         JButton exitButton = new JButton("Exit"); 
         return exitButton;
   }
  
}

   
      