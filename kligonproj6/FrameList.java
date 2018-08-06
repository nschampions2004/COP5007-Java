/**
This class sets up the frames to be used in the display class
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 6
File Name: FrameList.java
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.border.TitledBorder;

public class FrameList extends JFrame 
{
   //the white bread radio button
   private JRadioButton whiteBread = new JRadioButton("White");
   //the wheat bread radio button
   private JRadioButton wheatBread = new JRadioButton("Wheat");
   //cheese checkbox
   private JCheckBox cheese = new JCheckBox("Cheese");
   //roast beef checkbox
   private JCheckBox roastBeef = new JCheckBox("Roast Beef");
   //turkey checkbox
   private JCheckBox turkey = new JCheckBox("Turkey");
   //ham checkbox
   private JCheckBox ham = new JCheckBox("Ham");
   //the no coffee radio button
   private JRadioButton noCoffee = new JRadioButton("None");
   //the reg Coffee radio button
   private JRadioButton regCoffee = new JRadioButton("Regular Coffee");
   //the decaf coffee radio button
   private JRadioButton decafCoffee = new JRadioButton("Decaf Coffee");
   //the cappuccion radio button
   private JRadioButton cappuccino = new JRadioButton("Cappuccino");
   //initialized subtotal for the order
   private double subtotal = 0.00;
   //the tax rate, equal to 8%
   private final double TAX_RATE = 0.08;
   //the tax double
   private double tax;
   //the total = tax + subtotal
   private double total;
   
   //the FrameList object that allows us to get the various frames from this class
   public FrameList()
   {
   
   }
   
   /**
   the bread panel
   @return breadPanel the bread panel we'll use in our OrderFrame Menu
   */
   public JPanel getBreadPanel()
   {
      //  the bread button group
      ButtonGroup bg = new ButtonGroup();
      //  adding them bread buttons to the button group
      bg.add(whiteBread);
      bg.add(wheatBread);
      //  adding the bread section to the pane
      JPanel breadPanel = new JPanel(new BorderLayout());
      Box breadBox = Box.createVerticalBox();
      breadBox.setBorder(BorderFactory.createTitledBorder("Bread"));
      TitledBorder border = new TitledBorder("Bread");
      border.setTitlePosition(TitledBorder.TOP);
      
      
      //add the buttons to the vertical box
      breadBox.add(whiteBread);
      breadBox.add(wheatBread);
      //add the box to the pane
      breadPanel.add(whiteBread, BorderLayout.CENTER);
      breadPanel.add(wheatBread, BorderLayout.CENTER);
      breadPanel.setBorder(border);
      return breadPanel;
   }
   /**
   the meat and cheese panel
   @return meatCheesePanel the meat and cheese panel we'll use in our OrderFrame Menu
   */      
   public JPanel getMeatCheesePanel()
   {
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
   /**
   the coffee panel
   @return coffeePanel the coffee panel we'll use in our OrderFrame Menu
   */   
   public JPanel getCoffeePanel()
   {
      //the button group holding them altogether
      ButtonGroup bg1 = new ButtonGroup();
      bg1.add(noCoffee);
      bg1.add(regCoffee);
      bg1.add(decafCoffee);
      bg1.add(cappuccino);
      JPanel coffeePanel = new JPanel(new GridBagLayout());
      Box coffeeBox = Box.createVerticalBox();
      //add the buttons to the box
      coffeeBox.add(noCoffee);
      coffeeBox.add(regCoffee);
      coffeeBox.add(decafCoffee);
      coffeeBox.add(cappuccino);
      //put a border around the box
      coffeeBox.setBorder(BorderFactory.createTitledBorder("Coffee"));
      coffeePanel.add(coffeeBox);
      return coffeePanel;
   }
   /**
   the calculator button
   @return calcButton the calculate button we'll use in out OrderFrame Menu
   */
   public JButton getCalcButton()
   {
      JButton calcButton = new JButton("Calculate");
      calcButton.addActionListener(
         new CalculateButtonActionListener());
      
      return calcButton;
   }
   
         
   /**
   the exit panel
   @return exitButton the exit button we'll use in out OrderFrame Menu
   */      
   public JButton getExitButton()
   {
      //   the exit button for the order calculator
         JButton exitButton = new JButton("Exit");
         exitButton.addActionListener(e -> System.exit(0));
          
         return exitButton;
   }
   /**
   the class defining actions from the Calculate button
   */
   public class CalculateButtonActionListener implements ActionListener
   {
      @Override
      /**
      the action performed when the Calculate button gets pushed
      @param e the Calculate being clicked
      */
      public void actionPerformed(ActionEvent e)
      {
         
         //bread subtotal
         if(whiteBread.isSelected())
         {
            subtotal = subtotal + 3.50;
         }
         else if(wheatBread.isSelected())
         {
            subtotal = subtotal + 3.75;
         }
         //meat and cheese subtotal
         if(cheese.isSelected())
         {
            subtotal = subtotal + 1.00;
         }
         if(roastBeef.isSelected())
         {
            subtotal = subtotal + 3.75;
         }
         if(turkey.isSelected())
         {
            subtotal = subtotal + 3.25;
         }
         if(ham.isSelected())
         {
            subtotal = subtotal + 3.00;
         }
         //coffee selection subtotal
         if(regCoffee.isSelected())
         {
            subtotal = subtotal + 1.00;
         }
         else if(decafCoffee.isSelected())
         {
            subtotal = subtotal + 1.00;
         }
         else if(cappuccino.isSelected())
         {
            subtotal = subtotal + 3.75;
         }
         
         
         //decimal format to 2 places
         DecimalFormat dF = new DecimalFormat("#.00");
         //subtotal format
         String subTotalString = String.valueOf(dF.format(subtotal));
         
         //tax calculation and format
         tax = subtotal * TAX_RATE;
         String taxString = String.valueOf(dF.format(tax));
         
         //total calculation and format
         total = Double.valueOf(dF.format(subtotal + tax));
         String totalString = String.valueOf(dF.format(total));
         
         //the message the pop up will display upon the Calculate button being clicked
         JOptionPane.showMessageDialog(null, "Subtotal: $" + subTotalString
            + "\nTax: $" + taxString + "\nTotal: $" + totalString);
         
      }
    }  
}