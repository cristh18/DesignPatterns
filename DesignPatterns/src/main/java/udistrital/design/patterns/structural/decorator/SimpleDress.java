package udistrital.design.patterns.structural.decorator;

public class SimpleDress extends Dress {

	public SimpleDress(String dress) {
		super(dress);
	}

	@Override
	public void express() {
		System.out.println(getDress());		
	}

}
