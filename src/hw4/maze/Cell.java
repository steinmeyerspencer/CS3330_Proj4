package hw4.maze;

public class Cell {
	
	
	private CellComponents up;
	private CellComponents down;
	private CellComponents left;
	private CellComponents right;
	
	/**
	 * parameterized constructor for a Cell
	 * @param left
	 * @param right
	 * @param up
	 * @param down
	 */
	public Cell(CellComponents left, CellComponents right, CellComponents up, CellComponents down) {
		this.left = left;
		this.right = right;
		this.up = up;
		this.down = down;
	}
	
	/**
	 * returns value for up
	 * @return
	 */
	public CellComponents getUp() {
		return up;
	}
	
	/**
	 * sets value for up to parameter if not null, wall if null
	 * @param up
	 */
	public void setUp(CellComponents up) {
		if (up != null) {
	        this.up = up;
	    } else {
	        this.up = CellComponents.WALL;
	    }
	}
	
	/**
	 * returns value for down
	 * @return
	 */
	public CellComponents getDown() {
		return down;
	}
	
	/**
	 * sets value for down to parameter if not null, wall if null
	 * @param down
	 */
	public void setDown(CellComponents down) {
		if (down != null) {
	        this.down = down;
	    } else {
	        this.down = CellComponents.WALL;
	    }
	}
	
	/**
	 * returns value for left
	 * @return
	 */
	public CellComponents getLeft() {
		return left;
	}
	
	/**
	 * sets value for left to parameter if not null, wall if null
	 * @param left
	 */
	public void setLeft(CellComponents left) {
		if (left != null) {
	        this.left = left;
	    } else {
	        this.left = CellComponents.WALL;
	    }
	}
	
	/**
	 * returns value for right
	 * @return
	 */
	public CellComponents getRight() {
		return right;
	}
	
	/**
	 * sets value for right to parameter if not null, wall if null
	 * @param right
	 */
	public void setRight(CellComponents right) {
		if (right != null) {
	        this.right = right;
	    } else {
	        this.right = CellComponents.WALL;
	    }
	}
	
	/**
	 * returns string in form left, right, up, down
	 */
	@Override
	public String toString() {
		return "Cell [left=" + left + ", right=" + right + ", up=" + up + ", down=" + down + "]";
	}
	
	
}
