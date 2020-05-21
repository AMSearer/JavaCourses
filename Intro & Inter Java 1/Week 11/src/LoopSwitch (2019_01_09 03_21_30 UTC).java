import java.util.Scanner;

public class LoopSwitch {
	public static void main(String[] args) {
		
		int score;
		Scanner testScore = new Scanner(System.in);
		
		for (int test=1; test<6; test++) {
			
			System.out.println("Please enter a test score: ");
			score = testScore.nextInt();
			
			switch (score) {
				case 10:	System.out.println("Grade: A");
							break;
				case 9:	System.out.println("Grade: A");
				break;
				case 8:	System.out.println("Grade: B");
				break;
				case 7:	System.out.println("Grade: C");
				break;
				case 6:	System.out.println("Grade: D");
				break;
				default: System.out.println("Grade: F");
				break;			
			}

			
			
		}
		
	}

}
