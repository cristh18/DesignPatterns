package udistrital.design.patterns.creational.methodFactory;

public class FormulaEGPrix implements Product {

	public FormulaEGPrix() {
		System.out.println("Creating a " + this.getClass().getSimpleName()
				+ " Game");
	}

	public void play() {
		System.out.println("Play the game " + this.getClass().getSimpleName());
	}

	public void pause() {
		System.out.println("Pause the game " + this.getClass().getSimpleName());

	}

	public void stop() {
		System.out.println("Stop the game " + this.getClass().getSimpleName());

	}

	public void restart() {
		System.out.println("Restart the game "
				+ this.getClass().getSimpleName());

	}

}
