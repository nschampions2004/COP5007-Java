/**   BankAccount class, version 2
*     Constructors and toString method only
*     Anderson, Franceschi
*     Represents a generic bank account
*/

import java.text.DecimalFormat;

public class BankAccount
{
   public final DecimalFormat MONEY
                  = new DecimalFormat( "$#,##0.00" );
   private double balance;

   /** Default constructor
   *   sets balance to 0.0
   */
   public BankAccount( )
   {
     balance = 0.0;
     System.out.println( "In BankAccount default constructor" );
   }

   /** Overloaded constructor
   *   @param startBalance  beginning balance
   */
   public BankAccount( double startBalance )
   {
     if ( balance >= 0.0 )
         balance = startBalance;
     else
         balance = 0.0;
     System.out.println( "In BankAccount overloaded constructor" );
   }

   /** toString
   *  @return  the balance formatted as money
   */
   public String toString( )
   {
     return ( "balance is " + MONEY.format( balance ) );
   }
}
