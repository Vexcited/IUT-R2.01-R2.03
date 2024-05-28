package cafetoeil.model.supplement;

import cafetoeil.model.Boisson;

public class Chocolat extends IngredientSupplementaire {
	public Chocolat(Boisson boisson) {
		this.boisson = boisson;
	}

	@Override
	public String description() {
		return boisson.description() + ", Chocolat";
	}

	@Override
	public double prix() {
		return boisson.prix() + .20;
	}
}
