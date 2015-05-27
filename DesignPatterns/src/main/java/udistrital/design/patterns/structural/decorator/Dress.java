package udistrital.design.patterns.structural.decorator;

public abstract class Dress {
	
	private String dress;
	
	public Dress(String dress) {
		super();
		this.setDress(dress);
	}
	
	public abstract void express();

	/**
	 * @return the dress
	 */
	public String getDress() {
		return dress;
	}

	/**
	 * @param dress the dress to set
	 */
	public void setDress(String dress) {
		this.dress = dress;
	}

	
}
