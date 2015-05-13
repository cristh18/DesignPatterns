package udistrital.design.patterns.creational.prototype;

public class CellDivision implements Cell {
	
	private String type;
	private String cellDivisionName;
	private int numberChildCells;
	
	public Object copyObject() {
		CellDivision cellCopy = new CellDivision();
		cellCopy.setNumberChildCells(2);
		cellCopy.setCellDivisionName("Mitosis");
		cellCopy.setType("Eukaryotic");
		return cellCopy;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the cellDivisionName
	 */
	public String getCellDivisionName() {
		return cellDivisionName;
	}

	/**
	 * @param cellDivisionName the cellDivisionName to set
	 */
	public void setCellDivisionName(String cellDivisionName) {
		this.cellDivisionName = cellDivisionName;
	}

	/**
	 * @return the numberChildCells
	 */
	public int getNumberChildCells() {
		return numberChildCells;
	}

	/**
	 * @param numberChildCells the numberChildCells to set
	 */
	public void setNumberChildCells(int numberChildCells) {
		this.numberChildCells = numberChildCells;
	}


}
