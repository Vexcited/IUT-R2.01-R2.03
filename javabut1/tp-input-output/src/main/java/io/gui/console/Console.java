package io.gui.console;

import java.util.Scanner;

public class Console {

	protected static final String LINE = "---------------------------------------------";
	protected static final String LINE_BREAK = "\n";

	Scanner keyboard = new Scanner(System.in);

	public void message(String text) {
		System.out.println(text);
	}

	public void title(String title) {
		message(LINE);
		message(title);
		message(LINE);
	}

	public void line() {
		message(LINE);
	}

	public void lineBreak() {
		message(LINE_BREAK);
	}

	public void pause() {
		message("\n Press Enter to Continue ");
		keyboard.nextLine();
		message("");
	}
}
