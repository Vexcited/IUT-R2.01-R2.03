package warcardgame.model.material;

public enum Rank {
	ACE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"),
	JACK("J"), QUEEN("Q"), KING("K");

	private final String code;

	private Rank(String code) {
		this.code = code;
	}

	public String code() {
		return this.code;
	}
}