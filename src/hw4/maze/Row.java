package hw4.maze;

import java.util.ArrayList;

public class Row {
	
	private ArrayList<Cell> cells;

	/**
	 * parameterized constructor that takes in an arrayList of cells and turns it into a row
	 * @param cells
	 */
	public Row(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	/**
	 * returns arrayList of cells
	 * @return
	 */
	public ArrayList<Cell> getCells() {
		return cells;
	}

	/**
	 * can set the cells in a row
	 * @param cells
	 */
	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	/**
	 * simple toString()
	 */
	@Override
	public String toString() {
		return "Row [cells=" + cells + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
