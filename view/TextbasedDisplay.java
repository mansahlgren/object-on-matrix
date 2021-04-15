package view;

public class TextbasedDisplay implements Display {

	@Override
	public void displayObjPos(int x, int y) {
		System.out.println("[" + x + "," + y + "]");
	}

}
