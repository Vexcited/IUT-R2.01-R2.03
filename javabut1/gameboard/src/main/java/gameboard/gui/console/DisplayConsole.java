package gameboard.gui.console;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import gameboard.exception.AccessFileException;

public class DisplayConsole extends Console {
    private static final String EXIT_KEY = "0";
    private static final String EXIT_TEXT = "Exit";
    private static final String EXIT_OPTION_LINE = EXIT_KEY + "." + EXIT_TEXT;

    public String menu(String... options) {
        StringBuilder menuBuilder = new StringBuilder();
        for (int i = 1; i <= options.length; i++) {
            String optionText = options[i - 1];
            String optionLine = i + "." + optionText + LINE_BREAK;
            menuBuilder.append(optionLine);
        }
        return menuBuilder.toString() + EXIT_OPTION_LINE + LINE_BREAK;
    }

    public String menu(Map<String, String> entranceMenu) {
        StringBuilder menuBuilder = new StringBuilder();
        for (Map.Entry<String, String> option : entranceMenu.entrySet()) {
            String key = option.getKey();
            String text = option.getValue();

            String optionLine = key + "." + text + LINE_BREAK;
            menuBuilder.append(optionLine);
        }
        return menuBuilder.toString() + EXIT_OPTION_LINE + LINE_BREAK;
    }

    public int exitKey() {
        return Integer.parseInt(EXIT_KEY);
    }

    public String showContentFile(String nameFile) throws AccessFileException {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(nameFile)) {
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
        } catch (IOException e) {
            throw new AccessFileException("you cannot access file:" + nameFile);
        }
        return content.toString();
    }
}