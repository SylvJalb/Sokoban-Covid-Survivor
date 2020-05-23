package com.sokoban;

/**
 * 
 */
public class Position {
 
    private int x;
    private int y;

	//GETTER AND SETTER//
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
     * @param x 
     * @param y
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param Position
     */
    public Position(Position pos) {
        this.x = pos.x;
        this.y = pos.y;
    }

    /**
     * @param Direction 
     * @return
     */
    public Position add(Direction dir) {
        Position res = new Position(this.x + dir.getDx(), this.y + dir.getDy());
        return res;
    }

    /**
     * @param Direction 
     * @return
     */
    public Position sub(Direction dir) {
    	Position res = new Position(this.x - dir.getDx(), this.y - dir.getDy());
        return res;
   }
    
    /**
     * @param Object 
     * @return
     */
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
    
    //TOSTRING//
    @Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}

}