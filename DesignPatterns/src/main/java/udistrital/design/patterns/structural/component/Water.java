package udistrital.design.patterns.structural.component;

import java.util.ArrayList;
import java.util.List;

public class Water extends Atom {

	List<Atom> atoms = new ArrayList<Atom>();
	
	private int mass;

	public Water(String name, int mass) {
		super(name, mass);
	}

	public void add(Atom atom) {
		if (atom != null) {
			atoms.add(atom);
		}
	}

	@Override
	public void listAtoms() {
		System.out.println("Water");
		for (Atom atom : atoms) {
			mass += atom.getMass();
		}
		super.listAtoms();
		for (Atom atom : atoms) {
			atom.listAtoms();
		}
	}

	@Override
	public int getMass() {
		int mass = 0;
		for (Atom atom : atoms) {
			mass += atom.getMass();
		}
		return mass;
	}

}
