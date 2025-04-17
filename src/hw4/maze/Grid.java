package hw4.maze;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Row> rows;

	/**
	 * parameterized constructor. takes arrayList of rows and makes into a grid
	 * @param rows
	 */
	public Grid(ArrayList<Row> rows) {
		this.rows = rows;
	}

	/**
	 * returns rows
	 * @return
	 */
	public ArrayList<Row> getRows() {
		return rows;
	}

	/**
	 * sets rows, parameter is an arrayList<Rows>
	 * @param rows
	 */
	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}

	/**
	 * simple toString()
	 */
	@Override
	public String toString() {
		return "Grid [rows=" + rows + "]";
	}
	
	
	

}
