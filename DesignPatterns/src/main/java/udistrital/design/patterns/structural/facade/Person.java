package udistrital.design.patterns.structural.facade;

public abstract class Person {

	private String name;

	private String lastName;

	

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 */
	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
