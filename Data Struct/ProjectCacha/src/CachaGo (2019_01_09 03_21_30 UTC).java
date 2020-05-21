import java.util.Scanner;

public class CachaGo {

	public static void main(String[] args) {
		boolean GRASS, PATH, BOULDER, CLIFF, CREEK;
	      
	    GRASS = true;
	    PATH = true;
	    BOULDER = false;
	    CLIFF = false;
	    CREEK = false;
	    Scanner in = new Scanner(System.in);
	      
	    System.out.println("Enter \"quit\" to end. \n");
	    System.out.println("What is in front of Cacha1? \n");
	      
	    String input = (String) in.nextLine();
	    System.out.println(input);
	      
	    String out = "";
	      
	    while (true)
	    {

	    	if (input == "quit")
	        {
	    		break;
	        }
	          
	        else
	        {
	          
	        	switch (input) {
	                  
	        		case "grass": {
	        			if (GRASS)
	                    out = input;}
	                      
	                case "path":{
	                	if (PATH)
	                		out = input;}
	                      
	                  case "boulder":{
	                      if (BOULDER)
	                          out = input;}
	                      
	                  case "cliff":{
	                       if (CLIFF)
	                          out = input;}
	                      
	                  case "creek":{
	                       if (CREEK)
	                          out = input;}
	                      
	                  default:{
	                      System.out.println("That doesn't make any sense!! \n");}
	        	}
	           
	          
	      
	      
	          System.out.println("Cacha is now on " + out + "!!\n\n");
	      
	          System.out.println("What is in front of Cacha2? \n");
	        }
	   
	 }
}
}