package gameboard.model.material;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gameboard.model.material.array2d.GameBoard2D;
import gameboard.model.material.hashmap.GameBoardHashMap;

class GameBoardSimpleAsciiDisplayTest {
    GameBoard2D gameBoard2D;
    GameBoardHashMap gameBoardHashMap;

    @BeforeEach
    public void cleanGameBoards() {
        gameBoard2D = new GameBoard2D();
        gameBoardHashMap = new GameBoardHashMap();
    }

    @Test
    void displaySimpleAscii_aGameBoardFulledWith15Discs_() {
        fillWith15Discs(gameBoard2D);
        fillWith15Discs(gameBoardHashMap);

        String expecteDisplay = expectedSimpleAsciiGameBoardFulledWith15Discs();
        assertEquals(expecteDisplay, gameBoardHashMap.toAscii());
        assertEquals(expecteDisplay, gameBoard2D.toAscii());
    }

    private void fillWith15Discs(IGameBoard gameBoard) {

        gameBoard.clear();
        gameBoard.put(new Position(3, 1), new Disc(Color.YELLOW));
        gameBoard.put(new Position(4, 2), new Disc(Color.YELLOW));
        gameBoard.put(new Position(6, 3), new Disc(Color.YELLOW));
        gameBoard.put(new Position(2, 4), new Disc(Color.YELLOW));
        gameBoard.put(new Position(1, 6), new Disc(Color.YELLOW));
        gameBoard.put(new Position(5, 6), new Disc(Color.YELLOW));
        gameBoard.put(new Position(5, 7), new Disc(Color.YELLOW));

        gameBoard.put(new Position(5, 1), new Disc(Color.RED));
        gameBoard.put(new Position(6, 2), new Disc(Color.RED));
        gameBoard.put(new Position(2, 3), new Disc(Color.RED));
        gameBoard.put(new Position(3, 3), new Disc(Color.RED));
        gameBoard.put(new Position(4, 4), new Disc(Color.RED));
        gameBoard.put(new Position(1, 5), new Disc(Color.RED));
        gameBoard.put(new Position(6, 6), new Disc(Color.RED));
        gameBoard.put(new Position(2, 7), new Disc(Color.RED));
    }

    private String expectedSimpleAsciiGameBoardFulledWith15Discs() {
        String asciiGameBoard = "";
        asciiGameBoard = asciiGameBoard + "    RY " + "\n";
        asciiGameBoard = asciiGameBoard + "  RY  R" + "\n";
        asciiGameBoard = asciiGameBoard + "Y R    " + "\n";
        asciiGameBoard = asciiGameBoard + " Y R   " + "\n";
        asciiGameBoard = asciiGameBoard + "R    YY" + "\n";
        asciiGameBoard = asciiGameBoard + " RY  R " + "\n";

        return asciiGameBoard;
    }

}