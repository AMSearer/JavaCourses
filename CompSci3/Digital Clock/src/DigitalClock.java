import java.util.Date;

public class DigitalClock {

	public static void main(String[] args) {
		
		int[] time = getTime();
		
		Digit[] clock = new Digit[5];
		
		for (int i=0; i < clock.length; i++) 
		{
			if (i < 2)
			{
				clock[i] = new Digit(time[i]); // creates digit with corresponding integer from the time
			}
			
			else if (i == 2)
			{
				clock[i] = new Digit(10); // sets the colon
			}
			
			else
			{
				clock[i] = new Digit(time[i-1]); // creates digit with corresponding integer 
												// from the time adjusting for injecting colon
			}
		}
		
		System.out.println();
		
		for (int line=0; line<7; line++)
		{
			for (int dig=0; dig<clock.length; dig++) 
			{
				System.out.print( clock[dig].lineOut(line) + " ");

			}
			
			System.out.println();
		}
		

	}

	static class Digit {
		
		String[] display = new String[7]; 
	
		Digit() {
			
		}
		
		Digit(int dig) {
			
			switch (dig) {
			case 0:
				String[] toPass0 = {
						" -- ", 
						"|  |",
						"|  |",
						"    ",
						"|  |",
						"|  |",
						" -- "
						};
				setDisplay(toPass0);
				break;
			case 1:		
				String[] toPass1 = {
						"    ",
						"   |",
						"   |",
						"    ",
						"   |",
						"   |",
						"    "
						};
				setDisplay(toPass1);
				break;
			case 2:
				String[] toPass2 = {
						" -- ", 
						"   |",
						"   |",
						" -- ",
						"|   ",
						"|   ",
						" -- "
						};
				setDisplay(toPass2);
				break;
			case 3:
				String[] toPass3 = {
						" -- ", 
						"   |",
						"   |",
						" -- ",
						"   |",
						"   |",
						" -- "
						};
				setDisplay(toPass3);
				break;
			case 4:
				String[] toPass4 = {
						"   ", 
						"|  |",
						"|  |",
						" -- ",
						"   |",
						"   |",
						"    "
						};
				setDisplay(toPass4);
				break;
			case 5:
				String[] toPass5 = {
						" -- ",
						"|   ",
						"|   ",
						" -- ",
						"   |",
						"   |",
						" -- "
						};
				setDisplay(toPass5);
				break;
			case 6:
				String[] toPass6 = {
						" -- ",
						"|   ",
						"|   ",
						" -- ",
						"|  |",
						"|  |",
						" -- "
						};
				setDisplay(toPass6);
				break;
			case 7:
				String[] toPass7 = {
						" -- ",
						"   |",
						"   |",
						"    ",
						"   |",
						"   |",
						"    "
						};
				setDisplay(toPass7);
				break;
			case 8:
				String[] toPass8 = {
						" -- ", 
						"|  |",
						"|  |",
						" -- ",
						"|  |",
						"|  |",
						" -- "
						};
				setDisplay(toPass8);
				break;
			case 9:
				String[] toPass9 = {
						" -- ", 
						"|  |",
						"|  |",
						" -- ",
						"   |",
						"   |",
						" -- "
						};
				setDisplay(toPass9);
				break;
			default:
				String[] toPassC = {
						"    ", 
						"  - ",
						" | |",
						"  - ",
						" | |",
						"  - ",
						"    "
						};
				setDisplay(toPassC);
				break;
			}
			
		}
		
		public String lineOut (int line) {
			return display[line];
		}
		
		private void setDisplay(String[] toSet) {
			
			for (int i=0; i<toSet.length; i++) 
			{
				display[i] = toSet[i];
			}
			
		}
	}
	
	public static int[] getTime() {
	
		Date currentTime = new Date();
		String str = String.format("%tc", currentTime);
		System.out.println(str);
		
		int[] result = {
				Integer.parseInt(str.substring(11,12)),
				Integer.parseInt(str.substring(12,13)),
				Integer.parseInt(str.substring(14,15)),
				Integer.parseInt(str.substring(15,16)) };
		
		return result;
		
	}
}
