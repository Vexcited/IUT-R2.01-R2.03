package gameboard.gui.console;

import gameboard.model.material.Constants;
import gameboard.model.material.Disc;
import gameboard.model.material.IGameBoard;
import gameboard.model.material.Position;

public class GameBoardDisplay {

    private static final String END_OF_COLUMN = "||";
    private static final String SPACE = " ";
    private static final String EMPTY_LINE_BLOCK = SPACE + SPACE + SPACE + SPACE;
    private static final String BOTTOM_LINE_BLOCK = "_  _";
    private static final String TOP_LINE_BLOCK = EMPTY_LINE_BLOCK;
    private static final String LINE_BREAK = "\n";

    private final IGameBoard gameBoard;

    public GameBoardDisplay(IGameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public String show() {

        StringBuilder gameBoardAscii = new StringBuilder(displayColumnHeadersFirstLine());

        for (int row = 1; row <= Constants.ROWS; row++) {
            gameBoardAscii.append(displayRowLine(row));
        }

        return gameBoardAscii.toString();
    }

    private String displayColumnHeadersFirstLine() {

        return EMPTY_LINE_BLOCK + BOTTOM_LINE_BLOCK.repeat(Constants.COLUMNS) +
                LINE_BREAK;
    }

    private String displayRowLine(Integer row) {
        return displayBlockLine(TOP_LINE_BLOCK) + displayDataLineOnRow(row) + displayBlockLine(BOTTOM_LINE_BLOCK);
    }

    private String displayBlockLine(String patternBlockLine) {
        StringBuilder topLine = new StringBuilder();
        String block = SPACE + END_OF_COLUMN;
        topLine.append(block);

        block = patternBlockLine + END_OF_COLUMN;
        topLine.append(block.repeat(Constants.COLUMNS));
        topLine.append(LINE_BREAK);
        return topLine.toString();
    }

    private String displayDataLineOnRow(Integer row) {
        Position position;
        Disc disc;

        StringBuilder dataLine = new StringBuilder();
        String block = row + END_OF_COLUMN;
        dataLine.append(block);

        for (int column = 1; column <= Constants.COLUMNS; column++) {

            position = new Position(row, column);
            disc = gameBoard.discAt(position);

            if (disc == Disc.NO) {
                block = EMPTY_LINE_BLOCK + END_OF_COLUMN;
            } else {
                block = SPACE + disc.ascii() + SPACE + SPACE + END_OF_COLUMN;
            }
            dataLine.append(block);
        }
        dataLine.append(LINE_BREAK);
        return dataLine.toString();
    }
}