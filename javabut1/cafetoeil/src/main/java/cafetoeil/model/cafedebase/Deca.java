package cafetoeil.model.cafedebase;

import cafetoeil.model.Boisson;

public class Deca implements Boisson {

	@Override
	public String description() {
		return "Café déca";
	}

	@Override
	public double prix() {
		return 1.05;
	}
}
