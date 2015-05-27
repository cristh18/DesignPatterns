package udistrital.design.patterns.structural.decorator;

public abstract class DressDecorator extends Dress{

	Dress eveningDress;
	
	public DressDecorator(Dress eveningDress, String dress) {
		super(dress);
		this.eveningDress=eveningDress;
	}

	@Override
	public void express() {
		System.out.println(eveningDress.getDress());		
	}

}
