package udistrital.design.patterns.structural.adapter;

public class Wheel {
	
	int wheelNumber;
	
	public Wheel(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}
	
	public void roll() {
		if (wheelNumber >= 4) {
			System.out.println("roll");
		}

	}

}
