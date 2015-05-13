package udistrital.design.patterns.creational.abstractFactory;

public abstract class Institution {
	
	public abstract String getName();
	public abstract String getNIT();
	public abstract Service createService();
	public abstract Product createProduct();
}
