
public class RecurClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int summationTot = summation(10);
		System.out.println(summationTot);
		
		for (int i=1; i<=10; i++)
		{
			System.out.print(fib(i) + " ");
		}
		int[] arr = {1,2,3,4,5};
		revArrayIt(arr);
		
		int[] A = {1,2,3,4,5,6};
		revArrayAns(A,0);
		
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]);
		}

		//checkPalindrome();
		checkPalRecurCtl();
	}
	
	public static void checkPalRecurCtl() {
		String test1 = "raceecar";
		
		
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
	
	public static void checkPalindrome() {
		String test = "testtset";
		boolean result = true;
		
		char[] arr = test.toCharArray();
		for (int i=0; i<= arr.length; i++)
		{
			if(arr[i] != arr[arr.length -1 -i])
				result = false;
		}
	}
	
	/*
	 * Did not work, was passing the wrong
	 * 
	public static int[] revArray (int[] arr) {
		if (arr.length == 1) 
		{
			return arr;
		}
		else if (arr.length ==2) 
		{
			int[] result = new int[2];
			int temp = arr[1];
			result[1] = result [0];
			result[0] = temp;
			return result;
		}
		else
		{
			
		}
	}
	*/
	public static void revArrayAns (int[] A, int i) {
		if (i<A.length/2)
		{
			int temp=A[i];
			A[i]=A[A.length-1-i];
			A[A.length-1-i] = temp;
			
			revArrayAns(A, i+1);
			
		}
	}
	
	public static void revArrayIt (int[] arr) {
		for (int i = 0; i < arr.length / 2; i++)
		{
			int hold = arr[arr.length -1 -i];
			arr[arr.length -1 -i] = arr[i];
			arr[i] = hold;
		}
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
	}
	
	public static int fib(int n) {
		if ((n == 1) || (n == 2))
			return 1;
		
		else
			return fib(n-1) + fib(n-2);
	}
	
	public static int summation(int in) {
		if (in ==1)
			return 1;
		else
			return in + summation(in-1);
	}
	
	public static void printBool(boolean result) {
		if (result == true)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
