import java.util.Scanner;

public class IntFloat {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter an integer. \n");
		
		int intIn = in.nextInt();
		
		System.out.println("Please enter a float. \n");
		
		float floatIn = in.nextFloat();
		
		float sum = intIn + floatIn;
		
		System.out.printf("The sum of your entries is: %.2f", sum);		
		
	}

}
