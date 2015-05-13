package udistrital.design.patterns.creational.prototype;

public class ClientTest {
	
	public void testPrototype() {
		new Tissue().makeCopies();
	}
	
	public static void main(String[] args) {
		new ClientTest().testPrototype();
	}

}
