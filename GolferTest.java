public class GolferTest 
{
   public static void main (String[] args)
   {
     System.out.println("***Tests Default Values***");
     Golfer rappa = new Golfer();
     System.out.println(rappa);
     System.out.println("Expect __ ID Number: 9999 Home Course: __ \n Score \t Date \t Course \t Course Rating \t Course Slope");
     System.out.println("***Tests Passed Through Values***");
     Golfer hambag = new Golfer("Hambag", "Richmond");
     System.out.println(hambag);
     System.out.println("Expect: Hambag ID Number: 1000 Home Course: Richmond \n Score \t Date \t Course \t Course Rating \t Course Slope");
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
     System.out.println("***Test for addScore Method***");
     hambag.addScore("Hell's Hole", 70, "06/06/06", 66.6, 144);
     hambag.addScore("Jimmyozer's", 65, "05/05/05", 55.5, 145);
     System.out.println(hambag.toString());
     System.out.println("Expected: \n Hambag ID Number: 1000 Home Course: Richmond \n Score  \t  Date  \t  Course  \t  Course Rating  \t  Course Slope  \n 70  \t  06/06/06  \t  Hell's Hole  \t  66.6  \t  144  \n  65  \t 05/05/05  \t  Jimyozer's  \t  55.5  \t  145");
     System.out.println("***Test for toString on the Score Method***");
     Score balla = new Score("Hell's Hole", 70, "06/06/06", 66.6, 144);
     System.out.println(balla.toString());
   }
}