import java.util.Scanner;

/**
   This class tests the Person class.
*/
public class PersonDemo
{
   public static void main(String[] args)
   {
      int count = 0;
      Scanner in = new Scanner(System.in);

      Person first = null;
      Person last = null;
	  System.out.println("Please enter first names of ten persons: ");
      for (int i=1; i<=4; i++)
	  {
         String name = in.nextLine();
         Person p = new Person(name);
         if (first == null) 
		    first = last = p;
         else
         {
            if (first.compareTo(p) > 0) first = p;
            if (last.compareTo(p) < 0) last = p;
         }
      }
      System.out.println("First: " + first.name);
      System.out.println("Last: " + last.name);
   }
}
