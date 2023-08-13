package study.unit.code;

import java.util.Scanner;

public class StringCalculator {

	private static final Scanner scanner = new Scanner(System.in);

	public String[] read() {
		return scanner.nextLine().split(" ");
	}

}
