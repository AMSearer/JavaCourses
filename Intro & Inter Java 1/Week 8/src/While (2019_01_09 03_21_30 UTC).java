import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		int sum = 0;
		int newInt;
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Please enter an integer: \n");
		newInt = entry.nextInt();
		
		while (newInt >= 0) {	
			sum += newInt;	
			newInt = entry.nextInt();
			System.out.println("Please enter an integer: \n");
		}
		
		sum += newInt;
		
		System.out.printf("The sum of your entries is: %d", sum);
		
	}

}
