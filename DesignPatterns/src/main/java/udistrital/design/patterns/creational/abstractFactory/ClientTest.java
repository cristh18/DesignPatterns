package udistrital.design.patterns.creational.abstractFactory;

public class ClientTest {
	
	private void testFactory() {
		Enterprise ecopetrol = new Enterprise();
		ecopetrol.setFactory(new PrivateInstitution());
		ecopetrol.loadInstitution();
		
		Enterprise seguroSocial = new Enterprise();
		seguroSocial.setFactory(new PublicInstitution());
		seguroSocial.loadInstitution();
	}
	
	public static void main(String[] args) {
		ClientTest clientTest = new ClientTest();
		clientTest.testFactory();
	}

}
