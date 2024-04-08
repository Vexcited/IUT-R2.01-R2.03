package io.gui.console;

public class ReadConsole extends Console {
	
	public int ensureInteger() {
    try {
      return Integer.parseInt(keyboard.nextLine());
    } catch (NumberFormatException e) {
      this.message("It must be an integer");
      return ensureInteger();
    }
	}
	
	public int ensureIntegerBetween(int minimum, int maximum) {
		while (true) {
			int value = ensureInteger();
			if (minimum <= value && value <= maximum)
				return value;
			else {
				this.message("The value must be between " + minimum + " and " + maximum);
			}
		}
	}
}
