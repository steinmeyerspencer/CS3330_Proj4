package hw4.simulation;

import java.util.ArrayList;

import hw4.maze.CellComponents;
import hw4.maze.Grid;
import hw4.player.Player;

public class PrintBoard {
	
	/**
	 * takes grid and player, prints off board into terminal
	 * @param grid
	 * @param player
	 */
	public void printBoard(Grid grid, Player player) {
		
		ArrayList<ArrayList<String>> gridToPrint = new ArrayList<ArrayList<String>>();
		
		/**
		 * just printing out the grid in a readable way
		 * assigning left side value to value of cell
		 * if exit is on left, that cell will show E for exit
		 * if wall or aperture on left, assigns S for space
		 * if player is in that spot, assigns A for agent
		 */
		for (int i = 0; i < grid.getRows().size(); i++) {
		    ArrayList<String> row = new ArrayList<String>();
		    for (int j = 0; j < grid.getRows().get(i).getCells().size(); j++) {
		        CellComponents left = grid.getRows().get(i).getCells().get(j).getLeft();
		        if (left == CellComponents.EXIT) {
		            row.add("E");
		        } else {
		            row.add("S"); 
		        }
		    }
		    gridToPrint.add(row); 
		}

		// printing off grid in readable way
		for (int i = 0; i < gridToPrint.size(); i++) {
			System.out.println(gridToPrint.get(i));
		}
	}
	
}
