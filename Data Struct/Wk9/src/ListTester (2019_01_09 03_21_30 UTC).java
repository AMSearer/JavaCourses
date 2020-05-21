/**
   Test the removeLast method.
*/
public class ListTester
{
   public static void main(String[] args)
   {
      ArrayList names = new ArrayList();
      names.addLast("Dick");
      names.addLast("Harry");
      names.addLast("Romeo");
      names.addLast("Tom");
      names.removeLast();
      names.removeLast();

      for (int i = 0; i < names.size(); i++)
      {
         System.out.print(names.get(i) + " ");
      }
      System.out.println();
      System.out.println("Expected: Dick Harry");
      System.out.println("Length: " + names.length());
      System.out.println("Expected: 5");
   }
}
