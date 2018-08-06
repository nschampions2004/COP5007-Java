/**
This class sets the scene and runs the frame that makes the order calculation possible
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 6
File Name: OrderFrame.java
*/

import java.awt.*;
import javax.swing.*;


public class OrderFrame extends JFrame
{ 
  
  public static void main(String [] args )
  {
     //create a new JFrame
     JFrame myFrame = new JFrame("Order Calculator");
     
     //make a label for the top of the menu
     JLabel l = new JLabel("Welcome to Johnny's Sandwich Shop");
     
     //prepare a new grid bag layout, add it to my JFrame, set up the GridBagConstraints
     GridBagLayout gblPanel = new GridBagLayout();
     myFrame.setLayout(gblPanel);
     GridBagConstraints c = new GridBagConstraints();
          
     //add the label to the top of the frame
     c.gridx = 0; 
     c.gridy = 0;
     myFrame.add(l, c);
     
     //create a FrameList object in order to call all your different panes
     FrameList newOF = new FrameList();
     
     //call your bread, meat and cheese, and coffee panes and make it the 2nd row
     JPanel middleRow = new JPanel(new BorderLayout());
     middleRow.add(newOF.getBreadPanel(), BorderLayout.LINE_START);
     middleRow.add(newOF.getMeatCheesePanel(), BorderLayout.CENTER);
     middleRow.add(newOF.getCoffeePanel(), BorderLayout.LINE_END);
     c.gridx = 0;
     c.gridy = 1;
     myFrame.add(middleRow, c);
    
     
     //call your calculate button and add it below the meat and cheese panel
     JPanel bottomRow = new JPanel(new BorderLayout());
     bottomRow.add(newOF.getCalcButton(), BorderLayout.CENTER);
     bottomRow.add(newOF.getExitButton(), BorderLayout.LINE_END);
     c.gridx = 0;
     c.gridy = 2;
     myFrame.add(bottomRow, c);
          
     //give your frame default behavior
     myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     myFrame.setVisible(true);
     myFrame.pack();
  }

 
}
   
      