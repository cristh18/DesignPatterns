package udistrital.design.patterns.structural.decorator;

public class Shirt extends DressDecorator{
	
	public Shirt(Dress eveningDress, String dress) {
		super(eveningDress, dress);
	}
	
	@Override
	public void express() {		
		super.express();
		System.out.println(getDress());
	}

}
