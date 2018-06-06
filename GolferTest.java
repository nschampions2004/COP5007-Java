public class GolferTest 
{
   public static void main (String[] args)
   {
     System.out.println("***Tests Default Values***");
     Golfer rappa = new Golfer();
     System.out.println(rappa);
     System.out.println("Expect __ ID Number: 9999 Home Course: __");
     System.out.println("***Tests Passed Through Values***");
     Golfer hambag = new Golfer("Hambag", "Richmond");
     System.out.println(hambag);
     System.out.println("Expect: Hambag ID Number: 1000 Home Course: Richmond");
     System.out.println("Tests accessor methods for the Golfer name, Golfer homeCourse, Golfer idNum");
     System.out.println("***Tests getName(), getHomeCourse(), and getIdNum() Accessors***");
     Golfer hobby = new Golfer("Sherry B.", "Harry Hollow");
     System.out.println(hobby.getName() + " " + hobby.getHomeCourse() + " " + hobby.getIdNum());
     System.out.println("Expected: Sherry B. Harry Hollow 1001");
     System.out.println("***Tests setName(), setHomeCourse(), and setIdNum() Mutators***");
     Golfer harriet = new Golfer("Harriet Tubs", "August, AK");
     harriet.setName("TubsyWubsy");
     harriet.setHomeCourse("Maralago");
     harriet.getIdNum();
     System.out.println(harriet.toString());
     System.out.println("Expected: TubsyWubsy ID Number: 1002 Home Course: Maralago \n Score \t Date \t Course \t Course Rating \t Course Slope");
     System.out.println("***Testing setName and setCourseName with null values***");
     harriet.setName(null);
     harriet.setHomeCourse(null);
     System.out.println("Expected: Errors from both");
     
     
     
   }
}