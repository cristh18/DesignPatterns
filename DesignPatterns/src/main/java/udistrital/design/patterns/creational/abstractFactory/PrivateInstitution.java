package udistrital.design.patterns.creational.abstractFactory;

public class PrivateInstitution extends Institution {
	
	@Override
	public String getName() {
		return new String();
	}
	
	@Override
	public String getNIT() {
		return new String();
	}
	
	@Override
	public Product createProduct() {
		return new InformationSystem();
	}
	
	@Override
	public Service createService() {		
		return new Exploration();
	}

}
