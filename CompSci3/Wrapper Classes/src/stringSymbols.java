/*
 * 
 * Write a program to extract the first symbol of a given string
 * 
 */
public class stringSymbols {
	
	private static String[] number0 = {
			" -- ", 
			"|  |",
			"|  |",
			"    ",
			"|  |",
			"|  |",
			" -- "
			};
	
	private static String[] number1 = {
			"    ",
			"   |",
			"   |",
			"    ",
			"   |",
			"   |",
			"    "
			};
	private static String[] number2 = {
			" -- ", 
			"   |",
			"   |",
			" -- ",
			"|   ",
			"|   ",
			" -- "
			};
	
	private static String[] number3 = {
			" -- ", 
			"   |",
			"   |",
			" -- ",
			"   |",
			"   |",
			" -- "
			};
	
	private static String[] number4 = {
			"   ", 
			"|  |",
			"|  |",
			" -- ",
			"   |",
			"   |",
			"    "
			};

	
	private static String[] number5 = {
			" -- ",
			"|   ",
			"|   ",
			" -- ",
			"   |",
			"   |",
			" -- "
			};
	
	private static String[] number6 = {
			" -- ",
			"|   ",
			"|   ",
			" -- ",
			"|  |",
			"|  |",
			" -- "
			};
	private static String[] number7 = {
			" -- ",
			"   |",
			"   |",
			"    ",
			"   |",
			"   |",
			"    "
			};
	
	private static String[] number8 = {
			" -- ", 
			"|  |",
			"|  |",
			" -- ",
			"|  |",
			"|  |",
			" -- "
			};
	
	private static String[] number9 = {
			" -- ", 
			"|  |",
			"|  |",
			" -- ",
			"   |",
			"   |",
			" -- "
			};
	
	private static String[] numberC = {
			"    ", 
			"  - ",
			" | |",
			"  - ",
			" | |",
			"  - "
			};
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String name = "Alex";
		// String swap = switchEnds(name);
		// System.out.println(swap);
		

		
		for (int i=0; i<number0.length; i++)
		{
			System.out.println(number0[i]);
		}
		
		
		

	}
	
	public static String extractFirst(String str) {
		
		String out = str.substring(0,1);
		
		return out;
	}
	
	/*
	 * Extract last symbol
	 */
	public static String extractLast(String str) {
		return str.substring(str.length()-1);
	}
	
	public static String switchEnds(String str) {
		String out = "";
		
		String temp ="";
		
		System.out.println(str.substring(str.length()));
		System.out.println(str.substring(1, str.length()-2));
		System.out.println(str.substring(0,1));
		
		out = str.substring(str.length()) + str.substring(1, str.length()-2) + str.substring(0,1);
		
		return out;
	}
		

}
