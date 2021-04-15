package main;

import controller.Input;
import controller.NumberInput;
import model.Command;
import model.CommandFactory;
import model.CommandFactoryImplementation;
import model.RectangularTable;
import model.Table;
import view.Display;
import view.TextbasedDisplay;

public class CommandInvoker {

	public static void main(String[] args) {

		Input nbrInput = new NumberInput();

		int width = nbrInput.getNextInput();
		int height = nbrInput.getNextInput();
		int objX = nbrInput.getNextInput();
		int objY = nbrInput.getNextInput();

		Display display = new TextbasedDisplay();
		Table table = new RectangularTable(width, height, display, objX, objY);
		CommandFactory cmdFactory = new CommandFactoryImplementation(table);

		int n = nbrInput.getNextInput();
		Command cmd = null;
		Boolean res;
		do {
			switch (n) {
			case 0:
				cmd = cmdFactory.makeQuitCommand();
				break;

			case 1:
				cmd = cmdFactory.makeMoveForwardCommand();
				break;

			case 2:
				cmd = cmdFactory.makeMoveBackwardCommand();
				break;

			case 3:
				cmd = cmdFactory.makeRotateObjClockwiseCommand();
				break;

			case 4:
				cmd = cmdFactory.makeRotateObjCtrClockwiseCommand();
				break;

			default:
				break;
			}
			res = cmd.execute();
			n = nbrInput.getNextInput();

		} while (res);
	}

}
