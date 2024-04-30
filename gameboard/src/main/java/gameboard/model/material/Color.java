package gameboard.model.material;

public enum Color {
	RED("R"), YELLOW("Y");

	private final String ascii;

	Color(String ascii) {
		this.ascii = ascii;
	}

	public final String ascii() {
		return this.ascii;
	}
	
	

}
