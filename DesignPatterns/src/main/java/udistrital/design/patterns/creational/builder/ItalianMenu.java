package udistrital.design.patterns.creational.builder;

public class ItalianMenu extends MenuBuilder{
	
	@Override
	public void buildMainDish() {
		menu.setMainDish("Chiken al mattone");
		
	}

	@Override
	public void buildDessert() {
		menu.setDessert("Epic brownie");
		
	}

	@Override
	public void buildBeverage() {
		menu.setBeverage("Martini");
		
	}

	

	

}
