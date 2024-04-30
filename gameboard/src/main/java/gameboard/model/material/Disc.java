package gameboard.model.material;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public final class Disc {
	public static final Disc NO =null;

	private final Color color;
	
	public Disc(Color color) {
		this.color = color;
	}

	public String ascii() {
		return color.ascii();

	}
	
	public Color color() {
		return this.color;
	}

	@Override
	public String toString() {
		return color + " disc";
	}

	
}
