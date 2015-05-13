package udistrital.design.patterns.creational.methodFactory;

public class CarGame extends GameFactory{

	@Override
	public Product createGame() {
		return new FormulaEGPrix();
	}
	
	

}
