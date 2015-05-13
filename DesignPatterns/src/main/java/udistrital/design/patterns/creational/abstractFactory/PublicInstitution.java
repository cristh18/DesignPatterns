package udistrital.design.patterns.creational.abstractFactory;

public class PublicInstitution extends Institution{
	
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
		return new Purifier();
	}
	
	@Override
	public Service createService() {		
		return new Health();
	}

}
