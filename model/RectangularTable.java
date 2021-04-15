package model;

import view.Display;

public class RectangularTable extends Table {
	private int width;
	private int height;

	public RectangularTable(int width, int height, Display display, int objX, int objY) {
		super(display, objX, objY);
		this.width = width;
		this.height = height;

	}

	@Override
	public boolean moveObject(int dX, int dY) {

		int objX = getObjX();
		int objY = getObjY();
		int newObjX = objX + dX;
		int newObjY = objY + dY;

		if (newObjX > width - 1 || newObjX < 0 || newObjY > height - 1 || newObjY < 0) {
			setObjX(-1);
			setObjY(-1);
			// System.out.println("Outside table...");
			displayObjPos();
			return false;
		} else {
			setObjX(newObjX);
			setObjY(newObjY);
			// System.out.println("New position: " + newObjX + ", " + newObjY);
			return true;
		}
	}

}
