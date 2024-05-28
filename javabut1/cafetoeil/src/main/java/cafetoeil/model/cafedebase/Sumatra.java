package cafetoeil.model.cafedebase;

import cafetoeil.model.Boisson;

public class Sumatra implements Boisson {
    @Override
    public String description() {
        return "Sumatra";
    }

    @Override
    public double prix() {
        return .99;
    }
}
