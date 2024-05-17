package gameboard.gui.console;

public class ReadConsole extends Console {

    public int ensureInteger() {
        while (true) {
            try {
                return Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                message("It must be an integer");
            }
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