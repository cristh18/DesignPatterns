package udistrital.design.patterns.creational.builder;

public class Kitchen {

	private MenuBuilder menuBuilder;

	public void setMenuBuilder(MenuBuilder menuBuilder) {
		this.menuBuilder = menuBuilder;
	}

	public Menu getMenu() {
		return menuBuilder.getMenu();
	}

	public void buildMenu() {
		menuBuilder.createNewMenu();
		menuBuilder.buildMainDish();
		menuBuilder.buildBeverage();
		menuBuilder.buildDessert();
		System.out.println("Your menu is: Main Dish: "
				+ menuBuilder.getMenu().getMainDish() + " Beverage: "
				+ menuBuilder.getMenu().getBeverage() + " Dessert: "
				+ menuBuilder.getMenu().getDessert());
	}

}
