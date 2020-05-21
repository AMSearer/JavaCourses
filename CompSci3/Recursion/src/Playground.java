
public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String word = "racecar";
		int last = word.length() - 1;
		
		System.out.println( word );
		System.out.println( word.substring(0,1) );
		System.out.println( word.substring(last) );
		System.out.println( word.substring(1,last) );

		checkPalRecurCtl();
		
		//printBool( word.substring(0,1).contentEquals(cs)word.substring(last) );
		
		//printBool(word.equals(word));


	}
	
	public static void elementCountRecCtl() {
		int[] arr = {1,2,3,4,5,2,3,4,2,3,2};
		int val = 2;
		int result = elementCountRec(arr, val);
		System.out.println(result);
	}
	
		public static int elementCountRec(int[] arr, int val) {
			int result;
			
			
			
		}
	
	public static void checkPalRecurCtl() {
		String test1 = "racecar";
		
		
		boolean result1 = checkPalRecur(test1);		
		printBool(result1);
	}
	
	
	public static boolean checkPalRecur(String word) {
		int last = word.length() - 1;
		if (word.length() == 1)
			return true;
		else if (word.length() == 2)
			return (word.substring(0,1).contentEquals(word.substring(last)));
		else
			return ( (word.substring(0,1).contentEquals(word.substring(last))) && checkPalRecur(word.substring(1,last)));
	}
	
	public static void printBool(boolean result) {
		if (result == true)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
