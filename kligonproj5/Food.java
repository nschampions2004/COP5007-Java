/**
Vehicle Class that makes the type, number of miles driven per week, and fuel efficiency in mpg

@author Kyle Ligon
@version 1.0
@filename Food.java

*/
public class Food
{
/**
   the name of the food item
*/
   private String name;
/**
   dollars spent on food
*/
   private double dollars;
/**
   the category of food
*/
   private String category;
/**
   the default constructor for our Food object
*/
   public Food()
   {
      setName("Error");
      setDollars(9999.99);
      setCategory("Error");
   }
/**
   the parameterized constructor for the out Food Class
   @param name the name of the food
   @param dollars the dollars spent on food
   @param category the category of the food
*/
   public Food(String name, double dollars, String category)
   {
      setName(name);
      setDollars(dollars);
      setCategory(category);
   }
   
/**
   the accessor for the name of the Food
*/
   public String getName()
   {
      return name;
   }
/**
   the mutator for the name of the Food
*/
   public void setName(String name)
   {
      this.name = name;
   }
/**
   the accessor for the dollars spent on the Food
*/
   public double getDollars()
   {
      return dollars;
   }
/**
   the mutator for the dollars spent on the Food
*/
   public void setDollars(double dollars)
   {
      this.dollars = dollars;
   }
/**
   the accessor for the category of the Food
*/
   public String getCategory()
   {
      return category;
   }
/**
   the mutator for the category of the Food
*/
   public void setCategory(String category)
   {
      this.category = category;
   }
}