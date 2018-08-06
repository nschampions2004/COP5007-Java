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
import java.awt.event.*;
//import java.swing.JOptionPane;

public class CalculateButton extends JPanel implements ActionListener
{
      public CalculateButton()
      { 
            //the calculcate button for the order calculator
            calculateButton = new JButton("Calculate");
            calculateButton.addActionListener(this);
      }
            
      @Override
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == calculateButton)
         {
            
            JOptionPane.showMessageDialog(null, "Hello, subtotal: ");
         }   
               
       }
       
       public JButton getCalcBtn()
       {
         return calculateButton;
       }
       
}
