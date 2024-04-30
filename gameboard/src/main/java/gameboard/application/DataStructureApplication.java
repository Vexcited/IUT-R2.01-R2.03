package gameboard.application;

import java.util.Map;

import gameboard.gui.console.Console;
import gameboard.gui.console.DisplayConsole;
import gameboard.gui.console.GameBoardDisplay;
import gameboard.gui.console.ReadConsole;
import gameboard.model.material.Color;
import gameboard.model.material.Constants;
import gameboard.model.material.Disc;
import gameboard.model.material.IGameBoard;
import gameboard.model.material.Position;
import gameboard.model.material.array2d.GameBoard2D;
import gameboard.model.material.hashmap.GameBoardHashMap;

public class DataStructureApplication {
    Console console;
    DisplayConsole display;
    ReadConsole read;

    Map<String, String> dataStructureMenu;
    Map<String, String> gameBoardMenu;
    Map<String, String> colorDiscMenu;

    IGameBoard gameBoard;


    public DataStructureApplication() {
        this.console = new Console();
        this.display = new DisplayConsole();
        this.read = new ReadConsole();

        dataStructureMenu=MenuUtils.createDataStructureMenu();
        gameBoardMenu = MenuUtils.createGameBoardMenu();
        colorDiscMenu = MenuUtils.createColorDiscMenu();
    }

    public static void main(String[] args) {
        DataStructureApplication dataStructureApplication = new DataStructureApplication();
        dataStructureApplication.aboutYourFavoriteDataStructure();
    }

    private void aboutYourFavoriteDataStructure() {
        console.title("Welcome ! Let's Play with design...");

        int option = chooseAnOptionOfMenu(dataStructureMenu);
        answerDataStructureMenuFor(option);
        String designName = designName(gameBoard);

        while (option != display.exitKey()) {
            console.title(" Let's play with "+ designName + " design  !");
            option = chooseAnOptionOfMenu(gameBoardMenu);
            answerGameBoardMenuFor(option);
        }
    }

    private void answerDataStructureMenuFor(int option) {
        switch (option) {
            case 1:
                gameBoard = new GameBoard2D();
                break;
            case 2:
                gameBoard = new GameBoardHashMap();
                break;
            default:
                console.message(" See you soon ...");
                break;
        }
    }

    private void answerGameBoardMenuFor(int option) {
        Disc disc;
        Position position;
        Color color;

        if (option!= display.exitKey()) {
            console.title(gameBoardMenu.get(String.valueOf(option)));
        }

        switch (option) {
            case 1:
                position = chooseValidPosition();
                color = chooseColorDisc(colorDiscMenu);
                if (color==null){
                    console.message("No color, no discs added");
                }
                else
                {
                    disc = new Disc(color);
                    gameBoard.put(position,disc);
                }
                break;
            case 2:
                position = chooseValidPosition();
                gameBoard.removeDiscAt(position);
                break;
            case 3:
                gameBoard.clear();
                break;
            case 4:
                position = chooseValidPosition();
                gameBoard.discAt(position);
                break;
            case 5:
                console.message("Actually, we have "+gameBoard.howManyDiscsOnBoard()+ "discs");
                break;
            case 6:
                console.message(gameBoard.toAscii());
                console.line();
                GameBoardDisplay displayGameBoard = new GameBoardDisplay(gameBoard);
                console.message(displayGameBoard.show());

                break;
            default:
                console.message(" See you soon ...");
                break;
        }
    }

    private Color chooseColorDisc(Map<String, String> menu) {
        console.title("Choose a color for the disc");
        int option = chooseAnOptionOfMenu(menu);

        if (option==display.exitKey()) return null;

        Color[] colors = Color.values();
        return colors[option-1];
    }

    private Position chooseValidPosition() {
        int min=1;
        console.title("Choose a position on gameboard");

        int max = Constants.ROWS;
        console.title("Choose a row (between "+min+" and "+max+ ") : ");
        int row = read.ensureIntegerBetween(min,max);

        max = Constants.COLUMNS;
        console.title("Choose a column (between "+min+" and "+max+ ") : ");
        int column = read.ensureIntegerBetween(min,max);

        return new Position(row, column);
    }

    private int chooseAnOptionOfMenu(Map<String, String> menu) {
        console.message(display.menu(menu));
        console.message(" Your choice: ");
        console.lineBreak();
        return read.ensureIntegerBetween(display.exitKey(), menu.size());
    }

    private String designName(IGameBoard gameBoard) {
        return gameBoard.discs().getClass().getSimpleName();
    }
}