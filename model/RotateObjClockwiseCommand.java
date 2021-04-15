package model;

public class RotateObjClockwiseCommand extends Command {

	public RotateObjClockwiseCommand(Table table) {
		super(table);
	}

	@Override
	public boolean execute() {
		table.rotateObject(90);
		return true;
	}

}
