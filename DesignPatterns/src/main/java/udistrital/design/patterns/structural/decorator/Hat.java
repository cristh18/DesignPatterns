package udistrital.design.patterns.structural.decorator;

public class Hat extends DressDecorator {

	public Hat(Dress eveningDress, String dress) {
		super(eveningDress, dress);
	}
	
	@Override
	public void express() {		
		super.express();
		System.out.println(getDress());
	}

}
