
public class charCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//capitalize();
		name();
		
		
	}
	
	
	public static void name() {
		
		String test ="ABCD";
		
		int length = test.length();
		
		for (int i = 0; i < length; i++) 
		{
			System.out.println(   test.substring(i) + test.substring(0,i));
			
			
			
			
			
		}
		
	}
	
	public static void stringSum() {
		String in = "1234";
		
		String[] numbers = new String[in.length()];;
		
		for (int i=0; i < in.length(); i++)
		{
			numbers[i] = in.substring(i, i+1);
		}
		
		int total = 0;
		
		for (int i=0; i < in.length(); i++)
		{
			total += Integer.parseInt(numbers[i]);
		}
		
		System.out.println(total);
	}
	
	public static void addSpace() {
		
		String test = "WestChesterUniveristy";
		
		String out = test.substring(0,1);
		
		for (int i=1; i<test.length(); i++)
		{	
			char currentChar = test.charAt(i);
			if ( Character.isUpperCase(currentChar) == true)
				out += " ";
				out += test.charAt(i);
	
		}
		
		System.out.println(out);
		
		
	}
	
	public static boolean subset() {
		String first = "afghb";
		String second = "ab";
		
		int firstLen = first.length();
		int secondLen = second.length();
		
		int i = 0;
		
		for (int j=0; j<secondLen; j++)
		{
			if (first.charAt(i) == second.charAt(j)) i++;
			if (i==firstLen) return true;
		}
		return false;
			
		}
		
	
	
	public static void capitalize() {
		String test = "zAdBDsse";
		String temp = test.toLowerCase();
		String out = temp.substring(0,1).toUpperCase() + temp.substring(1);
		System.out.println(out);
		
	}

}
