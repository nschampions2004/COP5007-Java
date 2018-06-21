/** Die class
*    Anderson, Franceschi
*/

public class Die
{
  private int face;

  /** rolls the die
  *  @return  the value of the roll: 1 - 6
  */
  public int roll( )
  {
    face =  1 + (int)( Math.random( ) * 6 );
    return face;
  }
}
