import java.util.Scanner;

public class Smaller {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter Integer A: \n");
		int intA = input.nextInt();
		
		System.out.println("Please enter Integer B: \n");
		int intB = input.nextInt();
		
		if (intA == intB ) {
			System.out.println("The integers are equal. \n"); 
		
		}
		if (intA < intB) {
			System.out.println("Integer A is less than integer B. \n");
		}
		if ( intA > intB) {
			System.out.println("Integer B is less than integer A. \n");
			
		}
		
		
		
		
	}

}
