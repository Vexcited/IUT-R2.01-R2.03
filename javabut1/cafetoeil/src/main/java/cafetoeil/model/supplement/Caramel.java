package cafetoeil.model.supplement;

import cafetoeil.model.Boisson;

public class Caramel extends IngredientSupplementaire {
	public Caramel(Boisson boisson) {
		this.boisson = boisson;
	}

	@Override
	public String description() {
		return boisson.description() + ", Caramel";
	}

	@Override
	public double prix() {
		return boisson.prix() + .15 ;
	}
}
