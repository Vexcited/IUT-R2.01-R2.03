package gameboard.model.material.hashmap;

import java.util.HashMap;
import java.util.Map;

import gameboard.model.material.Constants;
import gameboard.model.material.Disc;
import gameboard.model.material.IGameBoard;
import gameboard.model.material.Position;

public class GameBoardHashMap implements IGameBoard {

	private final Map<Position, Disc> discs;

	public GameBoardHashMap() {
		this.discs = new HashMap<>();
	}

	public Map<Position, Disc> discs() {
		return discs;
	}

	public boolean isDiscAt(Position position) {
		return this.discs.containsKey(position);
	}

	public boolean isEmpty() {
		return this.discs.isEmpty();
	}

	public boolean put(Position position, Disc disc) {
		if (isDiscAt(position)) return false;
		this.discs.put(position, disc);
		return true;
	}

	public void clear() {
		this.discs.clear();
	}

	public int howManyDiscsOnBoard() {
		return this.discs.size();
	}

	public Disc discAt(Position position) {
		return this.discs.get(position);
	}

	public Disc removeDiscAt(Position position) {
		return this.discs.remove(position);
	}

	public String toAscii() {
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < Constants.ROWS; i++) {
			for (int j = 0; j < Constants.COLUMNS; j++) {
				Position position = new Position(i + 1, j + 1);
				Disc disc = this.discAt(position);
				if (disc == null) {
					output.append(" ");
				} else {
					output.append(disc.ascii());
				}
			}

			output.append("\n");
		}

		return output.toString();
	}

}