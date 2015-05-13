package udistrital.design.patterns.creational.builder;

public class ChineseMenu extends MenuBuilder {

	@Override
	public void buildMainDish() {
		menu.setMainDish("Pad Thai");
	}

	@Override
	public void buildDessert() {
		menu.setDessert("Tiramissu");

	}

	@Override
	public void buildBeverage() {
		menu.setBeverage("Soda");

	}

}
