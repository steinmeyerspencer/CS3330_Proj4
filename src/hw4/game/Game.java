package hw4.game;

import hw4.maze.Grid;

public class Game {
	
	private Grid grid;
	
	// need a play function
	// i think it takes two params, the movement direction and the player
	// so example would be play(Movement.UP, player) changes row to row before it if Cell["up"] is aperture
	// and then left would change the cell number to the left
	
	
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
