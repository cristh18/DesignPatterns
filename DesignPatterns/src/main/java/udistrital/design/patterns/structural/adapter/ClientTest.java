package udistrital.design.patterns.structural.adapter;

public class ClientTest {
	
	private void testAdapter() {
		new Skater(new Skate(new Wheel(4)));
	}
	
	public static void main(String[] args) {
		new ClientTest().testAdapter();
	}

}
