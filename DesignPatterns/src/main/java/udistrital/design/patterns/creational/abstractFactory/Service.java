package udistrital.design.patterns.creational.abstractFactory;

public abstract class Service {
	
	public Service() {
		System.out.println("Create a " + getClass().getSimpleName());
	}

}
