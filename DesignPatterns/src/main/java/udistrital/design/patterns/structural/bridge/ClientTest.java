package udistrital.design.patterns.structural.bridge;

public class ClientTest {
	
	public void bridgeTest() {
		MusicInstructor teacher = new MusicInstructor();
		teacher.setStudent(new MusicStudent());
		teacher.offeringClasses();

		// teacher.setStudent(()-> {System.out.println("usando un panfleto");});
		// teacher.offeringClasses();
		// teacher.setStudent(()-> {System.out.println("anunciar por radio");});
		// teacher.offeringClasses();
		// teacher.setStudent(new DrivingStudent());
		// teacher.offeringClasses();

	}
	
	public static void main(String[] args) {
		new ClientTest().bridgeTest();
	}

}
