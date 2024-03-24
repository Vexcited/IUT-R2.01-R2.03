package honeybee.gui;

public class Console {

	public static void message (String text) {
		System.out.println(text);
	}

	public static final String SEPARATOR_LINE = "--------------------------------------------";

	public static void title(String text) {
		message(SEPARATOR_LINE);
		message(" " + text + " ");
		message(SEPARATOR_LINE);
	}

}
