import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

/**
   A program to add, remove, modify or print
   student names and grades.
*/
public class Gradebook
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      Map<String, String> grades = new TreeMap<>();
      Set<String> gradesKeySet = grades.keySet();
      
      String student;
      String grade;      

      boolean done = false;
      while(!done)
      {
         System.out.println("A)dd R)emove M)odify P)rint Q)uit");
         String input = in.next().toUpperCase();
         if (input.equals("Q"))
         {
            done = true;
            
            System.out.println("\nGoodbye! \n");
         }
         /**
          * Adds a student to the gradebook.
          */
         else if (input.equals("A"))
         {
            System.out.println("\nPlease enter the name of the student you would like to add:  \n");
            student = in.next();
   
            System.out.println("Please enter the student's grade:  \n");
            grade = in.next().toUpperCase();
            
            grades.put(student, grade);

         }
         /**
          * Removes a student to the gradebook.
          */
         else if (input.equals("R"))
         {
             System.out.println("\nPlease enter the name of the student you would like to remove:  \n");
             student = in.next();
             
             grades.remove(student);
             
         }
         /**
          * Changes the grade of a student in the gradebook.
          */
         else if (input.equals("M"))
         {
             System.out.println("\nPlease enter the name of the student whose grade you would like to modify:  \n");
             student = in.next();
             
             System.out.println("Please enter the student's grade:  \n");
             grade = in.next().toUpperCase();
             
             grades.put(student, grade);
         }
         /**
          * Prints out the entire gradebook.
          */
         else if (input.equalsIgnoreCase("P"))
         {
            for (String k : gradesKeySet)
            {
            	System.out.println(k + ":  " + grades.get(k));
            }
         }
         /**
          * Catch-all case.
          */
         else
         {
            done = true;
         }
      }
   }
}
