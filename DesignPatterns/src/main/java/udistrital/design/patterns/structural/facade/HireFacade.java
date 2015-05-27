package udistrital.design.patterns.structural.facade;

import java.io.Serializable;
import java.util.List;

public class HireFacade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Artist artist;

	private Manager manager;

	private Presentation presentation;	
	

	public HireFacade(String artistName, String artistLastName,
			String managerName, String managerLastName, String hourQuantity, List<String> songs) {
		artist = new Artist(artistName, artistLastName);
		manager = new Manager(managerName, managerName);		
		presentation = new Presentation(hourQuantity, songs);
	}
	

	
	/**
	 * summaryOrder
	 */
	public void summaryPresentation() {

		for (String song : presentation.getSongs()) {
			System.out.println("Songs sung: " + song);
		}
		System.out.println("||================================Presentation Succesfull=====================================||");
	}



	/**
	 * @return the artist
	 */
	public Artist getArtist() {
		return artist;
	}



	/**
	 * @param artist the artist to set
	 */
	public void setArtist(Artist artist) {
		this.artist = artist;
	}



	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}



	/**
	 * @param manager the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}



	/**
	 * @return the presentation
	 */
	public Presentation getPresentation() {
		return presentation;
	}



	/**
	 * @param presentation the presentation to set
	 */
	public void setPresentation(Presentation presentation) {
		this.presentation = presentation;
	}

}
