package udistrital.design.patterns.creational.builder;

public abstract class MenuBuilder {

	protected Menu menu;

	public abstract void buildMainDish();

	public abstract void buildDessert();

	public abstract void buildBeverage();

	public void createNewMenu() {
		menu = new Menu();
	}

	public Menu getMenu() {
		return menu;
	}

}
