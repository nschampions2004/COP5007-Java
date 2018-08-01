/**
This class sets the scene and runs the frame that makes the order calculation possible
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 6
File Name: OrderFrame.java
*/

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Container;

public class OrderFrame extends JFrame //implements ActionListener 
{
   //holder for the pane
   private Container contents;
   private JButton calculateButton;
   private JButton exitButton;   
   public OrderFrame( )
   {
      setTitle("Order Calculator");
      contents = getContentPane( );
      setSize( 600, 600);
      setVisible( true );
      GridBagConstraints layoutConst = null; 
      //the welcome message for the order calculator      
      JLabel l = new JLabel("Welcome to Johnny's Sandwich Shop");
      calculateButton = new JButton("Calculate");
      exitButton = new JButton("Exit");
      
      setLayout(new GridBagLayout());
      
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 1, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      layoutConst.gridwidth = 6;
      add(l, layoutConst);
            
      //the calculate button for the frame
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(1, 10, 0, 0);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      add(calculateButton, layoutConst);      
      //the exit button for the frame
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.fill = GridBagConstraints.HORIZONTAL;
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      add(exitButton);
   }


   public static void main(String [] args )
   {
      OrderFrame orderCalculatorFrame = new OrderFrame( );
      orderCalculatorFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE); 
   }
}

   
      