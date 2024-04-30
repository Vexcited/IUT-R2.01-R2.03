package gameboard.application;

import java.util.HashMap;
import java.util.Map;

import gameboard.model.material.Color;


public class MenuUtils {
    public static Map<String, String> createDataStructureMenu() {
        Map<String, String> menu = new HashMap<>();
        menu.put("1", "GameBoard implemented with a 2D Array Grid");
        menu.put("2", "GameBoard implemented with a HashMap");
        return menu;
    }

    public static Map<String, String> createGameBoardMenu() {
        Map<String, String> menu = new HashMap<>();
        menu.put("1", "Add Disc");
        menu.put("2", "Remove Disc");
        menu.put("3", "Clear gameBoard");
        menu.put("4", "Consult position");
        menu.put("5", "Total of discs");
        menu.put("6", "Display gameBoard");
        return menu;
    }

    public static Map<String, String> createColorDiscMenu() {
        Map<String, String> menu = new HashMap<>();
        menu = new HashMap<>();
        menu.put("1", Color.RED.toString());
        menu.put("2", Color.YELLOW.toString());
        return menu;
    }
}
