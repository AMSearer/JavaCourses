import java.util.Scanner;

public class ThreeAve {
	
	public double ave(double num1, double num2, double num3) {
		
		double sum;
		double ave;
		
		sum = num1 + num2 + num3;
		ave = sum / 3;
		
		return ave;
	}
	
	public static void main(String args[]) {
		
		ThreeAve demo = new ThreeAve();
		
		double in1;
		double in2;
		double in3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This will display the average of three numbers.");
		System.out.println("Please enter the first number: ");
		in1 = input.nextDouble();
		System.out.println("Please enter the second number: ");
		in2 = input.nextDouble();
		System.out.println("Please enter the third number: ");
		in3 = input.nextDouble();
		
		double out;
		
		out = demo.ave(in1, in2, in3);
		System.out.println("The average of the numbers input is " + out);
	}
}
