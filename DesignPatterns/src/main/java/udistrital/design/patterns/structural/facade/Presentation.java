package udistrital.design.patterns.structural.facade;

import java.util.List;

public class Presentation {
	
	private String hourQuantity;
	
	private List<String> songs;
	
	public Presentation(String hourQuantity, List<String> songs) {
		this.hourQuantity=hourQuantity;
		this.songs=songs;
	}

	/**
	 * @return the hourQuantity
	 */
	public String getHourQuantity() {
		return hourQuantity;
	}

	/**
	 * @param hourQuantity the hourQuantity to set
	 */
	public void setHourQuantity(String hourQuantity) {
		this.hourQuantity = hourQuantity;
	}

	/**
	 * @return the songs
	 */
	public List<String> getSongs() {
		return songs;
	}

	/**
	 * @param songs the songs to set
	 */
	public void setSongs(List<String> songs) {
		this.songs = songs;
	}

}
