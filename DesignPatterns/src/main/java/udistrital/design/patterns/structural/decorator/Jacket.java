package udistrital.design.patterns.structural.decorator;

public class Jacket extends DressDecorator{
	
	public Jacket(Dress eveningDress, String dress) {
		super(eveningDress, dress);
	}
	
	@Override
	public void express() {		
		super.express();
		System.out.println(getDress());
	}

}
