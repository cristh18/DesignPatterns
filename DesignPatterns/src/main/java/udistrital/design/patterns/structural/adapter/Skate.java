package udistrital.design.patterns.structural.adapter;

public class Skate implements Shoe {

	Wheel wheel;

	public Skate(Wheel wheel) {
		this.wheel = wheel;
	}

	public void use() {
		System.out.println("use");
		wheel.roll();

	}

}
