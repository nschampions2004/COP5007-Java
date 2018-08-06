/**
Coffee program that extends the ChoiceSection class.  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 6
File Name: Coffee.java
*/

import java.text.NumberFormat;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Dimension;

public class ResultFrame extends JFrame
{
   public ResultFrame()
   {
      setSize(300, 300);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      JFrame msgFrame = new JFrame("Order Total");
      
      Container msgPane = msgFrame.getContentPane();
      msgPane.setLayout(new GridBagLayout());
      GridBagConstraints place = new GridBagConstraints();
      
      msgFrame.add(getOkButton());            
   }
   
   public static JButton getOkButton()
   {
      //   the exit button for the order calculator
      JButton okButton = new JButton("OK");
      okButton.addActionListener(e -> System.exit(0));
         
      return okButton;
   }

}
