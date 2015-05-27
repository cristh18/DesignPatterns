package udistrital.design.patterns.structural.decorator;

public class ClientTest {
	public static void main(String[] args) {
		EveningDress eveningDress = new EveningDress("Minimalist dress");
		Jacket jacket = new Jacket(eveningDress, "Black Jacket");
		jacket.express();
		eveningDress.setDress("");
		Hat hat = new Hat(eveningDress, "Gray hat");
		hat.express();
	}
}
