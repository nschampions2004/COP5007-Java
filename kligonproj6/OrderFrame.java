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
            
      //the calculate button for the frame
      calculateButton = new JButton("Calculate");
            
      //the exit button for the frame
      exitButton = new JButton("Exit");
   }


   public static void main(String [] args )
   {
      OrderFrame orderCalculatorFrame = new OrderFrame( );
      orderCalculatorFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE); 
   }
}

   
      