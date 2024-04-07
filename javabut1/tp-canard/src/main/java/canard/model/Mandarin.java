package canard.model;

import canard.model.cancan.Cancan;
import canard.model.vol.VolerAvecDesAiles;

public class Mandarin extends Canard {
	public Mandarin (String nom) {
		super(nom, new VolerAvecDesAiles(), new Cancan());
	}

	@Override
	public String afficher () {
		return "Je suis un vrai mandarin";
	}
}
