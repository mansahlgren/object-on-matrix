package model;

public class QuitCommand extends Command {

	public QuitCommand(Table table) {
		super(table);
	}

	@Override
	public boolean execute() {
		table.displayObjPos();
		return false;
	}

}
