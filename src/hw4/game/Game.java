package hw4.game;

import java.util.ArrayList;

import hw4.maze.Cell;
import hw4.maze.Grid;
import hw4.player.Movement;
import hw4.player.Player;

public class Game {
	
	private Grid grid;
	
	public boolean play(Movement direction, Player player) {
		
		if (player == null || direction == null || grid == null) {
			return false;
		}
		
		// now i will find the player's position on the grid by looping through the whole grid 
		// and checking if the coordinates match the player's currentRow and currentCell
		
		int playerRowIndex = -1;
		int playerColIndex = -1;
		
		for (int i = 0; i < grid.getRows().size(); i++) {
	        ArrayList<Cell> row = grid.getRows().get(i).getCells();
	        for (int j = 0; j < row.size(); j++) {
	            if (row.get(j) == player.getCurrentCell()) {
	                playerRowIndex = i;
	                playerColIndex = j;
	                break;
	            }
	        }
	    }
		
		if (playerRowIndex == -1 || playerColIndex == -1) {
			System.out.println("Player not found");
	        return false;
	    }
		
		
		
		
		return false;
	}
	
	
	/**
	 * parameterized constructor, takes Grid object
	 * @param grid
	 */
	public Game(Grid grid) {
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
