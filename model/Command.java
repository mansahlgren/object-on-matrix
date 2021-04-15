package model;

public abstract class Command {
	protected Table table;

	public Command(Table table) {
		this.table = table;
	}

	public abstract boolean execute();

}
