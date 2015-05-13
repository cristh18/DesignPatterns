package udistrital.design.patterns.creational.methodFactory;

public class SportGame extends GameFactory{

	@Override
	public Product createGame() {
		return new SoccerLigue();
	}

	

}
