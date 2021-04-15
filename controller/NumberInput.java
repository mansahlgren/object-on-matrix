package controller;

import java.util.Scanner;

public class NumberInput implements Input {
	private Scanner scan = new Scanner(System.in);

	@Override
	public int getNextInput() {
		return scan.nextInt();
	}

}
