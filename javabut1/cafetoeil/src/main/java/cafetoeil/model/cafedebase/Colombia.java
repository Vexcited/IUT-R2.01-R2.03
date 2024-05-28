package cafetoeil.model.cafedebase;

import cafetoeil.model.Boisson;

public class Colombia implements Boisson {

	@Override
	public String description() {
		return "Pur Colombia";
	}

	@Override
	public double prix() {
		return .89;
	}
}
