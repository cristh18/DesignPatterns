package udistrital.design.patterns.creational.prototype;

public class Tissue {
	Cell cell;

	public void makeCopies() {
		CellDivision mitosis = new CellDivision();
		mitosis.setCellDivisionName("Mitosis");
		mitosis.setNumberChildCells(2);
		mitosis.setType("eukaryotic");
		CellDivision cellCopy = (CellDivision) mitosis.copyObject();
		System.out.println("Division Name: "+cellCopy.getCellDivisionName()+"\ncc....: "+cellCopy.getNumberChildCells());

	}

}
