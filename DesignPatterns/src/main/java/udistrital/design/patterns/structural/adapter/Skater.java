package udistrital.design.patterns.structural.adapter;

public class Skater {
	
	Shoe shoe;
	
	public Skater(Shoe shoe) {
		this.shoe = shoe;
		shoe.use();
	}

}
