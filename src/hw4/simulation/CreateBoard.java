package hw4.simulation;

import java.util.ArrayList;

import hw4.maze.Cell;
import hw4.maze.CellComponents;
import hw4.maze.Grid;
import hw4.maze.Row;

public class CreateBoard {
	
	// constructor so i can use the function
	public CreateBoard() {}

	
	// the grid he gave us in GridTest
	// i just put it here so the main was less bogged down
	public Grid createBoardThreeByThree() {
		Cell cell00 = new Cell(CellComponents.EXIT, CellComponents.APERTURE,
				CellComponents.WALL, CellComponents.APERTURE);
		
		Cell cell01 = new Cell(CellComponents.APERTURE, CellComponents.WALL,
				CellComponents.WALL, CellComponents.APERTURE);
		
		Cell cell02 = new Cell(CellComponents.APERTURE, CellComponents.WALL,
				CellComponents.WALL, CellComponents.APERTURE);
		
		Cell cell10 = new Cell(CellComponents.WALL, CellComponents.WALL,
				CellComponents.APERTURE, CellComponents.APERTURE);
		
		Cell cell11 = new Cell(CellComponents.WALL, CellComponents.APERTURE,
				CellComponents.APERTURE, CellComponents.APERTURE);
		
		Cell cell12 = new Cell(CellComponents.APERTURE, CellComponents.WALL,
				CellComponents.APERTURE, CellComponents.APERTURE);
		
		Cell cell20 = new Cell(CellComponents.WALL, CellComponents.WALL,
				CellComponents.APERTURE, CellComponents.WALL);
		
		Cell cell21 = new Cell(CellComponents.WALL, CellComponents.WALL,
				CellComponents.APERTURE, CellComponents.WALL);
		
		Cell cell22 = new Cell(CellComponents.APERTURE, CellComponents.WALL,
				CellComponents.APERTURE, CellComponents.WALL);
		
		
		ArrayList<Cell> cells = new ArrayList<Cell>();
		cells.add(0, cell00);
		cells.add(1, cell01);
		cells.add(2, cell02);
		Row row0 = new Row(cells);
		
		cells = new ArrayList<Cell>();
		cells.add(0, cell10);
		cells.add(1, cell11);
		cells.add(2, cell12);
		Row row1 = new Row(cells);
		
		cells = new ArrayList<Cell>();
		cells.add(0, cell20);
		cells.add(1, cell21);
		cells.add(2, cell22);
		Row row2 = new Row(cells);
		
		ArrayList<Row> rows = new ArrayList<Row>();
		rows.add(0, row0);
		rows.add(1, row1);
		rows.add(2, row2);
		ArrayList<Row> rowList = new ArrayList<>();
		rowList = rows;
		Grid grid = new Grid(rows);
		
		return grid;
	}
}
