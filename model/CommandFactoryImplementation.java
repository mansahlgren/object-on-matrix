package model;

public class CommandFactoryImplementation implements CommandFactory {

	private Table table;

	public CommandFactoryImplementation(Table table) {
		this.table = table;
	}

	@Override
	public Command makeQuitCommand() {
		return new QuitCommand(table);
	}

	@Override
	public Command makeMoveForwardCommand() {
		return new MoveForwardCommand(table);
	}

	@Override
	public Command makeMoveBackwardCommand() {
		return new MoveBackwardCommand(table);
	}

	@Override
	public Command makeRotateObjClockwiseCommand() {
		return new RotateObjClockwiseCommand(table);
	}

	@Override
	public Command makeRotateObjCtrClockwiseCommand() {
		return new RotateObjCtrClockwiseCommand(table);
	}

}
