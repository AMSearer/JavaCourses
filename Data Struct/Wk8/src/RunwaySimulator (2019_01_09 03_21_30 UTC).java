import java.util.LinkedList;
import java.util.Queue;

/**
   Class for simulating a runway.
*/
public class RunwaySimulator
{
   private Queue<String> landingQueue = new LinkedList();
   private Queue<String> takeoffQueue = new LinkedList();
   
   /**
      Constructor.
   */
   public RunwaySimulator()
   {


   }

   /**
      Add a flight symbol to the taking off queue.
      @param flightSymbol the flight symbol.
   */
   public void addTakeOff(String flightSymbol)
   {
      takeoffQueue.add(flightSymbol);
   }
   

   /**
      Add a flight symbol to the landing queue.
      @param flightSymbol the flight symbol.
   */
   public void addLanding(String flightSymbol)
   {
      landingQueue.add(flightSymbol);
   }
   	

   /**
      Handle the next action.
   */
   public void handleNextAction()
   {
	   	String next;
	   	
	   	if (landingQueue.peek() != null)
	   	{
	   		next = landingQueue.remove();
	   		System.out.println("Flight " + next + " landing.");
	   	}
	   	
	   	else if (takeoffQueue.peek() != null)
	   	{
	   		next = takeoffQueue.remove();
	   		System.out.println("Flight " + next + " taking off.");
	   	}
	   	
	   	else
	   	{
	   		next = "No Flights";
	   		System.out.println("There are no flights waiting.");
	   	}
	   	
	   	
     }


}
