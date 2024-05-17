package warcardgame.model.material;

public enum Suit {
	CLUBS("\u2663"), DIAMONDS("\u2666"), HEARTS("\u2665"), SPADES("\u2660");

	private final String code;

	private Suit(String code) {
		this.code = code;
	}

	public String code() {
		return this.code;
	}
}