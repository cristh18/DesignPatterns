package udistrital.design.patterns.creational.abstractFactory;

public abstract class Product {
	
	public Product() {
		System.out.println("Create a " + getClass().getSimpleName());
	}

}
