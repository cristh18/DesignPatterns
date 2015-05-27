package udistrital.design.patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {
	
	private static List<String> songs;

	public static void main(String[] args) {
		HireFacade show1 = new HireFacade("Billy", "Joel", "Andres", "Perez",
				"3", getRepertory());
		show1.summaryPresentation();

	}
	
	private static List<String> getRepertory() {
		songs = new ArrayList<String>();
		songs.add("Moon");
		songs.add("Sun Day");
		return songs;
	}

}
