package udistrital.design.patterns.structural.component;

public class Molecule extends Atom {

	public Molecule(String name, int mass) {
		super(name, mass);		
	}
	
	@Override
	public void listAtoms() {
		System.out.println("Molecule");
		super.listAtoms();
	}

}
