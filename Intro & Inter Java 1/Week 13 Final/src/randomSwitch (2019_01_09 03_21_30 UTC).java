
public class randomSwitch {
	public static void main(String args[]) {
		int random = (int) (Math.random() * 10 + 1);
		System.out.println("Our random number is " + random);
		
		switch (random) {
		case 10:
			System.out.println("Ten fingers");
			break;
		case 9:
			System.out.println("Nine planets counting Pluto");
			break;
		case 8:
			System.out.println("Eight corners on an octogon");
			break;
		case 7:
			System.out.println("Seven 11s");
			break;
		case 6:
			System.out.println("Six in a half dozen");
			break;
		case 5:
			System.out.println("Five olympic rings");
			break;
		case 4:
			System.out.println("Four in a quartet");
			break;
		case 3:
			System.out.println("Three in a trio");
			break;
		case 2:
			System.out.println("Two eyes");
			break;
		case 1:
			System.out.println("One sun in our system");
			break;
		}
		
		
	}
}
