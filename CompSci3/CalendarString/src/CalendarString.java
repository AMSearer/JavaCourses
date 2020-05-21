import java.util.Scanner; 

public class CalendarString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter an integer for the month(1-12): ");
		int month = in.nextInt();
		
		System.out.println("Please enter an integer for the year: ");
		int year = in.nextInt();
		
		int firstDay = firstDay(month, year);
		int lastDay = lastDay(month, year);
		String monthName = monthName(month);
		
		System.out.println(monthName + " " + year);
		System.out.println(" S  M Tu  W Th  F  S");
		System.out.println();
		
		int weekDay = 1;
		
		for (int currDay = 1; currDay < firstDay; currDay++)
		{
			System.out.print("   ");  // adds padding until first day
			weekDay = currDay +1;
		}
		
		for (int currDay = 1; currDay <= lastDay; currDay++, weekDay++)
		{
			if (currDay <= 9)
				System.out.print(" "); // adds padding for single digit days
			
			System.out.print(currDay + " ");
			
			if (weekDay == 7)
			{
				System.out.println();
				weekDay = 0;  // reset weekDay counter (it will be iterated to 1)
			}
		}
		
		


	}
	
	public static int lastDay(int month, int year) {
		
		int lastDay;
		
		switch(month) 
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				lastDay = 31;
				break;
			case 4: case 6: case 9: case 11:
				lastDay = 30;
				break;
			case 2:
			{
				if (year % 4 == 0) // leap year
					lastDay = 29;
				else
					lastDay = 28;
				break;
			}
			default:
				lastDay = 1;
		
		}
		
		return lastDay;

	}
	
	public static String monthName(int month) {
		String out = "";
		
		switch(month) 
		{
			case 1: out = "January"; break;
			case 2: out = "February"; break;
			case 3: out = "March"; break;
			case 4: out = "April"; break;
			case 5: out = "May"; break;
			case 6: out = "June"; break;
			case 7: out = "July"; break;
			case 8: out = "August"; break;
			case 9: out = "September"; break;
			case 10: out = "October"; break;
			case 11: out = "November"; break;
			case 12: out = "December"; break;
			default: out = "NoMonth";
		}
		
		return out;
	}
	
	public static int firstDay(int month, int year) {
		
		int day = 1;
		
		if (month == 1) 
        { 
            month = 13; 
            year--; 
        } 
        if (month == 2) 
        { 
            month = 14; 
            year--; 
        } 
        int q = day; 
        int m = month; 
        int k = year % 100; 
        int j = year / 100; 
        int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j; 
        h = h % 7; 
        
        if (h == 0)
        	h = 7; // Makes Saturday the last day of the week instead of first
		
		return h;
	}

}
