public class QueueDemo
{
   public static void main(String[] args)
   {
      CircularArrayQueue q = new CircularArrayQueue();
      q.add("Tom");
      q.add("Diana");
      q.add("Harry");
      for (int i = 1; i < 4; i++)
      {
         System.out.println(q.remove());
         System.out.println(q.getHeadAndTail());
      }
      
      q.add("Mary");
      System.out.println(q.getHeadAndTail());
      q.add("Tom");
      q.add("Diana");
      q.add("Harry");
      q.add("Tom");
      q.add("Diana");
      q.add("Harry");
      
      System.out.println(q.getHeadAndTail());
   }
}
