//SAMPLE
import java.util.Scanner;
import java.util.Arrays;

/**
   This program measures how long it takes to sort an
   array of a user-specified size with the merge
   sort algorithm and with the heap sort algorithm.
*/
public class SorterTimer
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int n = in.nextInt();
      in.close();

      // Construct random array

      int[] mergeArray = ArrayUtil.randomIntArray(n, 100);
      int[] heapArray = new int[n];
      System.arraycopy(mergeArray, 0, heapArray, 0, n);

      // Use stopwatch to time merge sort
      StopWatch timer1 = new StopWatch();
      timer1.start();
      MergeSorter.sort(mergeArray);
      timer1.stop();
      
      System.out.println("MergeSorter time: "
            + timer1.getElapsedTime() + " milliseconds");

      // Use stopwajtch to time heap sort
      StopWatch timer2 = new StopWatch();
      timer2.start();
      HeapSorter.sort(heapArray);
      timer2.stop();
      
      System.out.println("Heapsorter time: "
            + timer2.getElapsedTime() + " milliseconds");
   }
}
