
public class RecurClass2 {

	public static void main(String[] args) {

		// checkPalRecurCtl();
		// removeNeg();
		// removeNegRecCtl();
		// elementCountRecCtl();
		// valInArr();
		valInArrRecCtl();
	}
	
	public static void valInArrRecCtl() {
		int[] arr = {1,2,3,4,5,2,3,4,2,3,2};
		int val = 38;
		boolean result = valInArrRec(arr, 0, val);
		printBool(result);
	}
	
	public static boolean valInArrRec(int[] arr, int ind, int val) {
		if (arr.length == ind)
			return false;
		else if (arr[ind] == val)
			return true;
		else 
			return valInArrRec(arr, ind + 1, val);
	}
	
	public static void valInArr() {
		int [] test = {1,2,3,4,5};
		int val = 6;
		
		for(int i=0; i<test.length; i++)
		{
			if (test[i] == val)
			{
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");
		return;
	}
	
	public static void elementCountRecCtl() {
		int[] arr = {1,2,3,4,5,2,3,4,2,3,2};
		int val = 3;
		int result = elementCountRec(arr, 0, val);
		System.out.println(result);
	}
	
	public static int elementCountRec(int[] arr, int ind, int val) {
		if (arr.length == ind)
			return 0;
		else if (arr[ind] == val)
			return 1 + elementCountRec(arr, ind + 1, val);
		else 
			return elementCountRec(arr, ind + 1, val);
		
		
		
	}
	
	public static void removeNegRecCtl() {
		int[] A = {1,-12,5,12,-3,12,0};
		int[] result = new int[A.length];
		
		removeNegRec(A, result, 0);
		
		for (int i=0; i<A.length; i++)
		{
			System.out.print(result[i] + " ");
		}
			
		
		
		
	}
	
	public static void removeNegRec(int[] A, int[] result, int i) {
		if (i < A.length)
		{
			if (A[i]<0)
				result[i]=0;
			else
				result[i] = A[i];
			
			removeNegRec(A, result, i+1);
		}
			
		
	}
	
	public static void removeNeg() {
		int[] arr = {1,2,-1,-3,5,0};
		
		int[] result = new int[arr.length];
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] < 0)
				result[i] = 0;
			else
				result[i] = arr[i];
		}
		
		for (int i=0; i<result.length; i++)
		{
			System.out.print(result[i] + " ");
		}
	}

	public static void checkPalRecurCtl() {
		String test1 = "racecar";
		
		
		boolean result1 = checkPalRecur(test1);		
		printBool(result1);
		//printBool(true);
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

