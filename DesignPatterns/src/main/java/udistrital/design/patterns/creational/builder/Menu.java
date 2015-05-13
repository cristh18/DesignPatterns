package udistrital.design.patterns.creational.builder;

public class Menu {
	
	private String mainDish;
	
	private String dessert;
	
	private String beverage;
	
	/**
	 * Default constrcuctor
	 */
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the mainDish
	 */
	public String getMainDish() {
		return mainDish;
	}

	/**
	 * @param mainDish the mainDish to set
	 */
	public void setMainDish(String mainDish) {
		this.mainDish = mainDish;
	}

	/**
	 * @return the dessert
	 */
	public String getDessert() {
		return dessert;
	}

	/**
	 * @param dessert the dessert to set
	 */
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	/**
	 * @return the beverage
	 */
	public String getBeverage() {
		return beverage;
	}

	/**
	 * @param beverage the beverage to set
	 */
	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}

}
