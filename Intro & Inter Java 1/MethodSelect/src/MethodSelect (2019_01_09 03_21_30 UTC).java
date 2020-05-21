import java.lang.Math;

public class MethodSelect {
	public void Meth1() {
		System.out.println("We have invoked method #1!");
	}
	
	public void Meth2() {
		System.out.println("We have invoked method #2!");
	}
	
	public void Meth3() {
		System.out.println("We have invoked method #3!");
	}
	
	public static void main(String args[]) {
		
		MethodSelect demo = new MethodSelect();
		
		int choice = (int) (Math.random() * 3 + 1);
		
		switch (choice) {
			case 1: demo.Meth1(); break;
			case 2:	demo.Meth2(); break;
			case 3: demo.Meth3(); break;
		}
	}
}
