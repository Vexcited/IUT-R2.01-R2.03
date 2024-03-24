
public class Bandit extends PersonnageFarWest {
	private final int taille;
	private boolean estEnPrison;
	
	public Bandit(String prenom, String nom, int taille) {
		super(prenom, nom);
		this.taille = taille;
		this.estEnPrison = false;
	}
	
	public void faireUnBraquage() {
		// TODO
	}
	
	public void mettreEnPrison() {
		this.estEnPrison = true;
	}
	
	public void libererDePrison() {
		this.estEnPrison = false;
	}
	
	public String decrire() {
		String situation = this.estEnPrison ? "en Prison" : "Libre";
		return super.decrire() + " Je mesure " + this.taille + " cm et je suis " + situation;
	}
}
