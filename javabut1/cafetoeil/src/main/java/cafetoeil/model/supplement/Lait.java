package cafetoeil.model.supplement;

import cafetoeil.model.Boisson;

public class Lait extends IngredientSupplementaire {
    public Lait(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String description() {
        return boisson.description() + ", Lait";
    }

    @Override
    public double prix() {
        return boisson.prix() + .10;
    }
}
