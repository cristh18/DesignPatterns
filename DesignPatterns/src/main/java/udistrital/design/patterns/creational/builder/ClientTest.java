package udistrital.design.patterns.creational.builder;

public class ClientTest {
	
	private void buildMenuTest() {
		Kitchen kitchen = new Kitchen();
		kitchen.setMenuBuilder(new ItalianMenu());
		kitchen.buildMenu();
		
		kitchen.setMenuBuilder(new ChineseMenu());
		kitchen.buildMenu();
		
		Menu menu = kitchen.getMenu();
	}
	
	public static void main(String[] args) {
		new ClientTest().buildMenuTest();
	}

}
