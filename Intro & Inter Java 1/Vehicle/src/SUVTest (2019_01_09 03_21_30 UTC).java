class Vehicle {
	private int CupHolders;
	
	public Vehicle() {
		CupHolders = 3;
	}
	public int getCupHolders () {
		return CupHolders;
	}
	public void setCupHolders(int newCupHolders ) {
		CupHolders = newCupHolders;
	}

}


public class SUVTest extends Vehicle{
	boolean thirdRow;
	
	public SUVTest() {
		super();
		thirdRow = false; 
	}
	public boolean getThirdRow() {
		return thirdRow;
	}
	public void setThirdRow(boolean newThirdRow) {
		thirdRow = newThirdRow;
	}
	
	

	public static void main(String args[]) {
		Vehicle car1 = new Vehicle();
		SUVTest car2 = new SUVTest();
		System.out.println(car1.getCupHolders() + " cupholders in car1 ");
		System.out.println(car2.getCupHolders() + " cupholders in car2 ");
		System.out.println("Car2 has a third row." + car2.getThirdRow());
		
		car1.setCupHolders(4);
		car2.setCupHolders(7);
		car2.setThirdRow(true);
		System.out.println(car1.getCupHolders() + " cupholders in car1 ");
		System.out.println(car2.getCupHolders() + " cupholders in car2 ");
		System.out.println("Car2 has a third row." + car2.getThirdRow());
		
	}
}