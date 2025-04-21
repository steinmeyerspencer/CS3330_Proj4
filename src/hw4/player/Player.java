package hw4.player;

import hw4.maze.Cell;
import hw4.maze.Row;

public class Player {
	
	private Cell currentCell;
	private Row currentRow;
	
	/** 
	 * parameterized constructor, row, cell
	 * @param currentRow
	 * @param currentCell
	 */
	public Player(Row currentRow, Cell currentCell) {
		this.currentCell = currentCell;
		this.currentRow = currentRow;
	}
	
	/**
	 * returns current cell as a Cell object
	 * @return
	 */
	public Cell getCurrentCell() {
		return currentCell;
	}
	
	/**
	 * sets current cell
	 * @param currentCell
	 */
	public void setCurrentCell(Cell currentCell) {
		this.currentCell = currentCell;
	}
	
	/**
	 * returns currentRow as a Row object
	 * @return
	 */
	public Row getCurrentRow() {
		return currentRow;
	}
	
	/**
	 * sets current row
	 * @param currentRow
	 */
	public void setCurrentRow(Row currentRow) {
		this.currentRow = currentRow;
	}

	/**
	 * simple toString()
	 */
	@Override
	public String toString() {
		return "Player [currentCell=" + currentCell + ", currentRow=" + currentRow + "]";
	}
	
	
}
