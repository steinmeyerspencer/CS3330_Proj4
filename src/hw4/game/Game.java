package hw4.game;

import java.util.ArrayList;

import hw4.maze.Cell;
import hw4.maze.CellComponents;
import hw4.maze.Grid;
import hw4.player.Movement;
import hw4.player.Player;

public class Game {
	
	private Grid grid;
	
	public ArrayList<Integer> findPlayerLocation(Grid grid, Player player){
		
		// will find the player's position on the grid by looping through the whole grid 
		// and checking if the coordinates match the player's currentRow and currentCell
		
		ArrayList<Integer> indices = new ArrayList<Integer>();
		
		int playerRow = -1;
		int playerColumn = -1;
		
		for (int i = 0; i < grid.getRows().size(); i++) {
	        ArrayList<Cell> row = grid.getRows().get(i).getCells();
	        for (int j = 0; j < row.size(); j++) {
	            if (row.get(j) == player.getCurrentCell()) {
	                playerRow = i;
	                playerColumn = j;
	                break;
	            }
	        }
	    }
		indices.add(playerRow);
		indices.add(playerColumn);
		
		return indices;
	}
	
	public boolean play(Movement direction, Player player) {
		
		if (player == null || direction == null || grid == null) {
			return false;
		}
		
		
		
		ArrayList<Integer> indices = findPlayerLocation(grid, player);
		int playerRow = indices.get(0);
		int playerColumn = indices.get(1);
		
		// if values haven't changed, function is messed up somewhere
		// because player is instantiated using the grid.get()
		if (playerRow == -1 || playerColumn == -1) {
			System.out.println("Player not found");
	        return false;
	    }
		
		
		// handle movement
		
		// UP
		if (direction == Movement.UP) {
			// if the player is in the top row, the .get(playerRow - 1) will throw an error
	        if (playerRow > 0) {
	            Cell current = grid.getRows().get(playerRow).getCells().get(playerColumn);
	            Cell above = grid.getRows().get(playerRow - 1).getCells().get(playerColumn);
	            if (current.getUp() == CellComponents.APERTURE) {
	            	// set the current cell to the one above so it takes on its attributes
	                player.setCurrentCell(above);
	                // set current row to one above it / decrementing row index by 1
	                player.setCurrentRow(grid.getRows().get(playerRow - 1));
	                return true;
	            }
	        }
	        return false;
	    }
		
		// DOWN
		if (direction == Movement.DOWN) {
			// if the row the player is in is not the last row
	        if (playerRow < grid.getRows().size() - 1) {
	            Cell current = grid.getRows().get(playerRow).getCells().get(playerColumn);
	            Cell below = grid.getRows().get(playerRow + 1).getCells().get(playerColumn);
	            if (current.getDown() == CellComponents.APERTURE) {
	            	// set player cell to the cell below it, so it will take on its parameters
	                player.setCurrentCell(below);
	                // set the row to the one below it / incrementing the row index by 1
	                player.setCurrentRow(grid.getRows().get(playerRow + 1));
	                return true;
	            }
	        }
	        return false;
	    }
		
		// LEFT
		if (direction == Movement.LEFT) {
            Cell current = grid.getRows().get(playerRow).getCells().get(playerColumn);
            
			// if the cell is already right next to the exit, no need to move at all, the game is over
			if (current.getLeft() == CellComponents.EXIT) {
            	System.out.println("You won the game.");
            	return true;
            }
			// if player is not already in left most column and not next to the exit
	        if (playerColumn > 0) {
	            Cell left = grid.getRows().get(playerRow).getCells().get(playerColumn - 1);
	            if (current.getLeft() == CellComponents.APERTURE) {
	            	// set cell to one on the left
	                player.setCurrentCell(left);
	                return true;
	            }
	        }
	        return false;
	    }
		
		// RIGHT
		if (direction == Movement.RIGHT) {			
			// if player is not already in left most column and not next to the exit
	        if (playerColumn < grid.getRows().get(playerRow).getCells().size() - 1) {
	            Cell current = grid.getRows().get(playerRow).getCells().get(playerColumn);
	            Cell right = grid.getRows().get(playerRow).getCells().get(playerColumn + 1);
	            if (current.getRight() == CellComponents.APERTURE) {
	            	// set cell to one on the right
	                player.setCurrentCell(right);
	                return true;
	            }
	        }
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


	@Override
	public String toString() {
		return "Game [grid=" + grid + "]";
	}
	
	
	
	
}
