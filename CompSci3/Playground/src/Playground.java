
public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playground pg = new Playground();
		
		Playground.number testNum = pg.new number(0);
		
		Playground.Digit testDig = pg.new Digit();
		
		//Playground.free testFree = pg.new free();
		
		Playground.free testFree = new free();
		Playground.free testFreeInt = new free(1);

		
		System.out.println(testNum.out);
		System.out.println(testDig.out);
		System.out.println(testFree.out);
		System.out.println(testFreeInt.out);

	}
	
	public class Digit {
		String out = "out";
		
	}
	
	public class number extends Playground.Digit{
		String out = "numOut";
		
		number(int a) {
			out = "set";
		}
		
	
		
		number() {
			
		}
	}
	
	static class free {
		String out = "freeOut";
		//String[] arrOut;
		
		free() {
			
		}
		
		free(int a) {
			//out = Integer.toString(a);
			
			switch (a) {
			case 1:
				out = Integer.toString(a);
				String[] arrOut = {"arr", "out"};
				break;
			default:
				out = "not one";
				String[] arrOut = {"arr", "out"};
				break;
			}
		}
	}

}


