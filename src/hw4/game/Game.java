package hw4.game;

import hw4.maze.Grid;

public class Game {
	private Grid grid;
	
	
	/**
	 * parameterized constructor, takes Grid object
	 * @param grid
	 */
	public Game(Grid grid) {
		super();
		this.grid = grid;
	}

	/**
	 * returns grid
	 * @return
	 */
	public Grid getGrid() {
		return grid;
	}

	/**
	 * sets grid
	 * @param grid
	 */
	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
	
}
