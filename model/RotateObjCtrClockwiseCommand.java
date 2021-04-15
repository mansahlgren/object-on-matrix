package model;

public class RotateObjCtrClockwiseCommand extends Command {

	public RotateObjCtrClockwiseCommand(Table table) {
		super(table);
	}

	@Override
	public boolean execute() {
		table.rotateObject(-90);
		return true;
	}

}
