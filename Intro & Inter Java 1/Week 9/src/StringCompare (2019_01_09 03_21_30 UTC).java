import java.util.Scanner;

public class StringCompare {
	public static void main (String[] args) {
	
	Scanner stringIn = new Scanner(System.in);
	String string1;
	String stringA;
	
	System.out.println("Please enter a string: \n");
	string1 = stringIn.nextLine();
	
	System.out.println("Please enter another string: \n");
	stringA = stringIn.nextLine();
	
	if( string1.equals(stringA)) {
		System.out.println("The strings are the same. \n");
	}
	
	else {
		System.out.println("The strings are not the same. \n");
	}
	}
	
	
}
