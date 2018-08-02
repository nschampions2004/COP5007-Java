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
   
   private JLabel coffeePanelLabel = new JLabel("Coffee");
   
   
  public static void main(String [] args )
  {
     JFrame myFrame = new JFrame("Order Calculator");
     myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     myFrame.setPreferredSize(new Dimension(400, 300));
     Container myPane = myFrame.getContentPane();
     JLabel l = new JLabel("Welcome to Johnny's Sandwich Shop");
     myPane.setLayout(new GridBagLayout());
     GridBagConstraints c = new GridBagConstraints();
     
     myFrame.add(l, c);
     myFrame.add(getCoffeePanel(), c);
     
     myFrame.add(getBreadPanel(), c);
     myFrame.setVisible(true);
  }
  
//   setTitle("Order Calculator");
//   contents = getContentPane( );
//   setSize( 600, 600);
//   setVisible( true );
//   setLayout(new GridBagLayout());
//   GridBagConstraints layoutConst = null; 
//   the welcome message for the order calculator      
//   
//   the calculcate button for the order calculator
//   calculateButton = new JButton("Calculate");
//   the exit button for the order calculator
//   exitButton = new JButton("Exit");
//       
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
}

   
      