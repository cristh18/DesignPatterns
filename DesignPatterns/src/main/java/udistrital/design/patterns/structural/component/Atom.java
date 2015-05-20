package udistrital.design.patterns.structural.component;

public abstract class Atom {

	private String name;
	private int mass;

	public Atom(String name, int mass) {
		super();
		this.name = name;
		this.mass = mass;

	}

	public void listAtoms() {
		System.out.println("Name: " + name + " Mass: " + mass);
	}

	public int getMass() {
		return mass;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMass(int mass) {
		this.mass = mass;
	}

}
