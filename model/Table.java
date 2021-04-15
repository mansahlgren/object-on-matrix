package model;

import view.Display;

public abstract class Table {

	protected static final int NORTH = 0;
	protected static final int EAST = 1;
	protected static final int SOUTH = 2;
	protected static final int WEST = 3;

	private int objX = 1;
	private int objY = 1;
	private int objDir = NORTH;
	private Display display;

	public Table(Display display, int objX, int objY) {
		this.display = display;
		this.objX = objX;
		this.objY = objY;
	}

	public void rotateObject(int deg) {
		if (deg > 0) {
			objDir = (objDir + (deg / 90)) % 4;
		} else {
			objDir = (objDir + 4 + (deg / 90)) % 4; // Ex north to west: 0 + 4 + (-90 / 90)) % 4 = 3 (west)
		}
	}

	public void displayObjPos() {
		display.displayObjPos(objX, objY);
	}

	protected int getObjX() {
		return objX;
	}

	protected int getObjY() {
		return objY;
	}

	protected void setObjX(int objX) {
		this.objX = objX;
	}

	protected void setObjY(int objY) {
		this.objY = objY;
	}

	protected int getObjDir() {
		return objDir;
	}

	// Depends on the table size and shape, so delegate the task to the subclass.
	public abstract boolean moveObject(int dX, int dY);

}
