package hw4.simulation;

import java.util.ArrayList;

import hw4.game.Game;
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
		
		Game game = new Game(grid);
		
		
		game.play(null, player);
		
		
		
	}

}
