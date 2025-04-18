package hw4.simulation;

import java.util.ArrayList;

import hw4.maze.Cell;
import hw4.maze.CellComponents;
import hw4.maze.Grid;
import hw4.maze.Row;
import hw4.player.Player;

public class Main {

	public static void main(String[] args) {
		
		CreateBoard creator = new CreateBoard();
		Grid grid = creator.createBoardThreeByThree();
		
		
		
		// starting player in spot 3,3 (bottom left)
		Player player = new Player(grid.getRows().get(2), grid.getRows().get(2).getCells().get(2));
		
		System.out.println(player.getCurrentCell());
		System.out.println(player.getCurrentRow());

		// need a way to identify cells by an integer, because rows and cells could look the exact same
		// for example, in a 5x5 grid, rows 2-4 will all look identical
		
		// will first just make a grid that displays 1-n and then advance it
		ArrayList<ArrayList<Integer>> intList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < grid.getRows().size(); i++) {
		    ArrayList<Integer> row = new ArrayList<Integer>();
		    for (int j = 0; j < grid.getRows().get(i).getCells().size(); j++) {
		    	Integer value = i * 3 + j + 1;
		        row.add(value);
		    }
		    intList.add(row); 
		}
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		
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
		
		
		
		
		// MOVEMENT
		
		
		// Movement.UP
		// 
		
		
		
	}

}
