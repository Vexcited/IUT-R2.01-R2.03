
public class Cheval {
	private final String nom;
	private final String race;

	public Cheval(String nom, String race) {
		this.nom = nom;
		this.race = race;
	}
	
	public String decrire () {
		return this.nom + " de race " + this.race;
	}
}
