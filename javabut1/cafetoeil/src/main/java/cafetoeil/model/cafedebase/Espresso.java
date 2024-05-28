package cafetoeil.model.cafedebase;

import cafetoeil.model.Boisson;

public class Espresso implements Boisson {

	@Override
	public String description() {
		return "Espresso";
	}

	@Override
	public double prix() {
		return 1.99;
	}
}
