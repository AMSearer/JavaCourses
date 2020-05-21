import java.util.Scanner;

public class intsFloatToo {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int integerIn;
		float floatIn, sum;
		
		System.out.println("Please enter an integer ");
		integerIn = input.nextInt();
		
		System.out.println("Please enter a float ");
		floatIn = input.nextFloat();
		
		sum = integerIn + floatIn;
		System.out.printf("The sum of your entries is: %.2f", sum);
		
	}
}
