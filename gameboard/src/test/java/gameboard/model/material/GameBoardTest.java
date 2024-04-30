package gameboard.model.material;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import gameboard.model.material.array2d.GameBoard2D;
import gameboard.model.material.hashmap.GameBoardHashMap;

class GameBoardTest {

	private static final Disc DISC_YELLOW = new Disc(Color.YELLOW);
	private static final Disc DISC_RED = new Disc(Color.RED);

	private static final Position _2_4 = new Position(2, 4);
	private static final Position FIRST_POSITION = new Position(1, 1);
	private static final Position LAST_POSITION = new Position(Constants.ROWS, Constants.COLUMNS);
	GameBoard2D gameBoard2D;
	GameBoardHashMap gameBoardHashMap;

	@BeforeEach
	public void cleanGameBoards() {
		gameBoard2D = new GameBoard2D();
		gameBoardHashMap = new GameBoardHashMap();
	}

	@Test
	void return_false_when_position_is_without_disc() {
		assertFalse(gameBoard2D.isDiscAt(FIRST_POSITION));
		assertFalse(gameBoardHashMap.isDiscAt(FIRST_POSITION));

		assertFalse(gameBoard2D.isDiscAt(_2_4));
		assertFalse(gameBoardHashMap.isDiscAt(_2_4));

		assertFalse(gameBoard2D.isDiscAt(LAST_POSITION));
		assertFalse(gameBoardHashMap.isDiscAt(LAST_POSITION));
	}

	@Test
	void the_gameBoard_is_empty_no_discs_at_the_beginning_of_game() {
		assertTrue(gameBoard2D.isEmpty());
		assertTrue(gameBoardHashMap.isEmpty());
	}

	@Test
	void return_true_when_a_disc_is_put_at_a_free_Position() {

		Position position = _2_4;

		assertFalse(gameBoard2D.isDiscAt(position));
		boolean discWellPut = gameBoard2D.put(position, DISC_YELLOW);
		assertTrue(discWellPut);
		assertFalse(gameBoard2D.isEmpty());
		assertTrue(gameBoard2D.isDiscAt(position));

		assertFalse(gameBoardHashMap.isDiscAt(position));
		discWellPut = gameBoardHashMap.put(position, DISC_YELLOW);
		assertTrue(discWellPut);
		assertFalse(gameBoardHashMap.isEmpty());
		assertTrue(gameBoardHashMap.isDiscAt(position));

	}

	@Test
	void return_false_when_a_tile_can_not_put_because_the_position_is_occupied() {

		Position position = _2_4;

		gameBoard2D.put(position, DISC_YELLOW);
		assertTrue(gameBoard2D.isDiscAt(position));

		boolean discWellPut = gameBoard2D.put(position, DISC_RED);
		assertFalse(discWellPut);
		assertTrue(gameBoard2D.isDiscAt(position));

		gameBoardHashMap.put(position, DISC_YELLOW);
		assertTrue(gameBoardHashMap.isDiscAt(position));

		discWellPut = gameBoardHashMap.put(position, DISC_RED);
		assertFalse(discWellPut);
		assertTrue(gameBoardHashMap.isDiscAt(position));

	}

	
	@Test
	void the_gameBoard_is_empty_when_it_is_cleared() {

		gameBoardHashMap.put(_2_4, DISC_YELLOW);
		gameBoardHashMap.put(FIRST_POSITION, DISC_RED);
		assertFalse(gameBoardHashMap.isEmpty());

		gameBoardHashMap.clear();
		assertTrue(gameBoardHashMap.isEmpty());
		
		gameBoard2D.put(_2_4, DISC_YELLOW);
		gameBoard2D.put(FIRST_POSITION, DISC_RED);
		assertFalse(gameBoard2D.isEmpty());

		gameBoard2D.clear();
		assertTrue(gameBoard2D.isEmpty());

	}

	@Test
	void return_the_number_of_discs_on_the_gameboard() {

		assertTrue(gameBoard2D.isEmpty());
		gameBoard2D.put(FIRST_POSITION, DISC_RED);
		gameBoard2D.put(_2_4, DISC_YELLOW);
		gameBoard2D.put(LAST_POSITION, DISC_RED);
		assertFalse(gameBoard2D.isEmpty());

		int nbDiscs = gameBoard2D.howManyDiscsOnBoard();
		assertEquals(3, nbDiscs);
		gameBoard2D.clear();
		nbDiscs = gameBoard2D.howManyDiscsOnBoard();
		assertEquals(0, nbDiscs);

		assertTrue(gameBoardHashMap.isEmpty());
		gameBoardHashMap.put(FIRST_POSITION, DISC_RED);
		gameBoardHashMap.put(_2_4, DISC_YELLOW);
		gameBoardHashMap.put(LAST_POSITION, DISC_RED);
		assertFalse(gameBoardHashMap.isEmpty());

		nbDiscs = gameBoardHashMap.howManyDiscsOnBoard();
		assertEquals(3, nbDiscs);
		gameBoardHashMap.clear();
		nbDiscs = gameBoardHashMap.howManyDiscsOnBoard();
		assertEquals(0, nbDiscs);

	}

	@Test
	void return_the_value_of_disc_at_position_when_the_position_has_a_disc() {

		gameBoard2D.put(_2_4, DISC_YELLOW);
		assertFalse(gameBoard2D.isEmpty());
		Disc disc = gameBoard2D.discAt(_2_4);
		assertEquals(DISC_YELLOW, disc);
		assertFalse(gameBoard2D.isEmpty());

		gameBoardHashMap.put(_2_4, DISC_YELLOW);
		assertFalse(gameBoardHashMap.isEmpty());
		disc = gameBoardHashMap.discAt(_2_4);
		assertEquals(DISC_YELLOW, disc);
		assertFalse(gameBoardHashMap.isEmpty());

	}

	@Test
	void return_NO_as_value_of_disc_at_position_when_the_position_has_no_discs() {

		gameBoard2D.clear();
		assertTrue(gameBoard2D.isEmpty());
		Disc disc = gameBoard2D.discAt(_2_4);
		assertEquals(Disc.NO, disc);

		gameBoardHashMap.clear();
		assertTrue(gameBoardHashMap.isEmpty());
		disc = gameBoardHashMap.discAt(_2_4);
		assertEquals(Disc.NO, disc);

	}

	@Test
	void return_the_disc_removed_when_the_position_has_a_disc() {

		assertTrue(gameBoard2D.isEmpty());
		gameBoard2D.put(_2_4, DISC_YELLOW);
		assertFalse(gameBoard2D.isEmpty());
		assertEquals(1, gameBoard2D.howManyDiscsOnBoard());

		Disc disc = gameBoard2D.removeDiscAt(_2_4);
		assertEquals(DISC_YELLOW, disc);
		assertTrue(gameBoard2D.isEmpty());

		assertTrue(gameBoardHashMap.isEmpty());
		gameBoardHashMap.put(_2_4, DISC_YELLOW);
		assertFalse(gameBoardHashMap.isEmpty());
		assertEquals(1, gameBoardHashMap.howManyDiscsOnBoard());

		disc = gameBoardHashMap.removeDiscAt(_2_4);
		assertEquals(DISC_YELLOW, disc);
		assertTrue(gameBoardHashMap.isEmpty());

	}

	@Test
	void return_NO_when_remove_a_position_where_no_discs() {

		assertTrue(gameBoard2D.isEmpty());
		Disc disc = gameBoard2D.removeDiscAt(_2_4);
		assertEquals(Disc.NO, disc);
		assertTrue(gameBoard2D.isEmpty());

		assertTrue(gameBoardHashMap.isEmpty());
		disc = gameBoardHashMap.removeDiscAt(_2_4);
		assertEquals(Disc.NO, disc);
		assertTrue(gameBoardHashMap.isEmpty());
	}

}
