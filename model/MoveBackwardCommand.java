package model;

public class MoveBackwardCommand extends Command {

	public MoveBackwardCommand(Table table) {
		super(table);
	}

	@Override
	public boolean execute() {

		switch (table.getObjDir()) {
		case Table.NORTH:
			return table.moveObject(0, 1);
		case Table.EAST:
			return table.moveObject(-1, 0);
		case Table.SOUTH:
			return table.moveObject(0, -1);
		case Table.WEST:
			return table.moveObject(1, 0);
		default:
			break;
		}

		return false;
	}

}
