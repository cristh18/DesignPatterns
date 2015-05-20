package udistrital.design.patterns.structural.component;

public class ClientTest {
	
	private void componentTest() {
		Molecule a1 = new Molecule("Hydrogen", 1);
		Molecule a2 = new Molecule("Hydrogen", 2);
		Molecule a3 = new Molecule("Oxygen", 3);
		
		Water water = new Water("Water", 4);
		
		water.add(a1);
		water.add(a2);
		water.add(a3);
		
		water.listAtoms();

	}
	
	public static void main(String[] args) {
		new ClientTest().componentTest();
	}

}
