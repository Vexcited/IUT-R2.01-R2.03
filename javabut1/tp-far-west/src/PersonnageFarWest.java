
abstract class PersonnageFarWest {
	protected String prenom;
	protected String nom;
  
	public PersonnageFarWest(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}
  
	public void tirerAuPistolet () {
		// TODO
	}
	
	public String decrire() {
		return this.prenom + " " + this.nom + "!";
	}
}
