
public class Array {
	public static void main(String args[]) {
		int[] integerList = new int[10];
		
		for (int element: integerList) {
			element = (int) (Math.random() * 10 + 1);
		
			System.out.println(element);
		}
	}

}
