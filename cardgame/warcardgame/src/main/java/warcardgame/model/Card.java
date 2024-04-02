package warcardgame.model;

import java.util.Objects;

public class Card {
	
	private final Rank rank;
	private final Suit suit;
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public Rank rank() {
		return this.rank;
	}

	public Suit suit() {
		return this.suit;
	}

	public String toText() {
		return this.rank.code() + this.suit.code();
	}

	public String toString() {
		return this.rank + " of " + this.suit;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

}

