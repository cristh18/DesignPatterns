package udistrital.design.patterns.structural.decorator;

public class EveningDress extends Dress {

	public EveningDress(String dress) {
		super(dress);
	}

	@Override
	public void express() {		
		System.out.println(getDress());
	}

}
