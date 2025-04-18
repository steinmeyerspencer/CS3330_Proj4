package hw4.simulation;

import java.util.ArrayList;

import hw4.game.Game;
import hw4.maze.Cell;
import hw4.maze.CellComponents;
import hw4.maze.Grid;
import hw4.maze.Row;
import hw4.player.Movement;
import hw4.player.Player;

public class Main {

	public static void main(String[] args) {
		
		// create the three by three board
		CreateBoard creator = new CreateBoard();
		Grid grid = creator.createBoardThreeByThree();

		// starting player in spot 3,3 (bottom left)
		Player player = new Player(grid.getRows().get(2), grid.getRows().get(2).getCells().get(2));
		
		// start up game
		Game game = new Game(grid);
		
		// set up printer
		PrintBoard printer = new PrintBoard();
		
		// initialize the playerLocation to null
		ArrayList<Integer> playerLocation = null;
		
		// initial board
		playerLocation = game.findPlayerLocation(grid, player);
		printer.printBoard(grid, playerLocation);

		// creates list of moves
		ArrayList<Movement> moves = new ArrayList<Movement>();
		moves.add(Movement.UP);
		moves.add(Movement.LEFT);
		moves.add(Movement.UP);
		moves.add(Movement.LEFT);
		moves.add(Movement.LEFT);
		
		// run through moves
		for (int i = 0; i < moves.size(); i++) {
			System.out.println();
			System.out.println("Move: " + moves.get(i).toString());
			game.play(moves.get(i), player);
			playerLocation = game.findPlayerLocation(grid, player);
			printer.printBoard(grid, playerLocation);
		}
		
		
		
	
		
		
		
	}

}
