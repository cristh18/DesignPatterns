package udistrital.design.patterns.creational.abstractFactory;

public class Enterprise {
	
	Product product;
	Service service;
	Institution factory;
	
	public Institution getFactory() {
		return factory;
	}
	
	public void setFactory(Institution factory) {
		this.factory = factory;
	}
	
	public void loadInstitution() {
		product = factory.createProduct();
		service = factory.createService();

	}

}
