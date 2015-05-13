package udistrital.design.patterns.creational.methodFactory;

public class ClientTest {
	
	private void testFactory() {
		Product product1 = new SportGame().createGame();
		product1.play();
		product1.pause();
		
		Product product2 = new CarGame().createGame();
		product2.play();
		product2.pause();

	}
	
	public static void main(String[] args) {
		new ClientTest().testFactory();
	}

}
