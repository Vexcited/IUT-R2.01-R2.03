package gameboard.model.material.array2d;

import gameboard.model.material.Constants;
import gameboard.model.material.Disc;
import gameboard.model.material.IGameBoard;
import gameboard.model.material.Position;

public class GameBoard2D implements IGameBoard {

	Disc[][] discs;

	public GameBoard2D() {
		this.discs = new Disc[Constants.ROWS][Constants.COLUMNS];
	}

	public Disc[][] discs() {
		return discs;
	}

	@Override
	public boolean isDiscAt(Position position) {
        return this.discAt(position) != null;
    }

	@Override
	public boolean isEmpty() {
		return this.howManyDiscsOnBoard() == 0;
	}

	@Override
	public boolean put(Position position, Disc disc) {
		if (isDiscAt(position)) return false;
		this.discs[position.row() - 1][position.column() - 1] = disc;
		return true;
	}

	@Override
	public void clear() {
		for (int i = 0; i < Constants.ROWS; i++) {
			for (int j = 0; j < Constants.COLUMNS; j++) {
				this.discs[i][j] = null;
			}
		}
	}

	@Override
	public int howManyDiscsOnBoard() {
		int count = 0;

		for (int i = 0; i < Constants.ROWS; i++) {
			for (int j = 0; j < Constants.COLUMNS; j++) {
				if (this.discs[i][j] != null) {
					count++;
				}
			}
		}

		return count;
	}

	@Override
	public Disc discAt(Position position) {
		return this.discs[position.row() - 1][position.column() - 1];
	}

	@Override
	public Disc removeDiscAt(Position position) {
		Disc disc = discAt(position);
		this.discs[position.row() - 1][position.column() - 1] = null;
		return disc;
	}

	@Override
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
