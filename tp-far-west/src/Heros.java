
public class Heros extends PersonnageFarWest {
	private final Cheval cheval;
	private final String profession;
	
	public Heros(String prenom, String nom, String profession, Cheval cheval) {
		super(prenom, nom);
		this.profession = profession;
		this.cheval = cheval;
	}
	
	public void monter(Cheval cheval) {
		// TODO
	}
	
	public void attraper(Bandit bandit) {
		// TODO
	}

	public String decrire () {
		return super.decrire() + " Je suis " + this.profession + " et mon cheval est " + this.cheval.decrire();
    }
}
