package model;

public interface CommandFactory {

	public Command makeQuitCommand();

	public Command makeMoveForwardCommand();

	public Command makeMoveBackwardCommand();

	public Command makeRotateObjClockwiseCommand();

	public Command makeRotateObjCtrClockwiseCommand();

}
