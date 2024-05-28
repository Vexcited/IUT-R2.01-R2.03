package cafetoeil.model.supplement;

import cafetoeil.model.Boisson;

public class Chantilly extends IngredientSupplementaire {
	public Chantilly(Boisson boisson) {
		this.boisson = boisson;
	}

	@Override
	public String description() {
		return boisson.description() + ", Chantilly";
	}

	@Override
	public double prix() {
		return boisson.prix() + .10;
	}
}
