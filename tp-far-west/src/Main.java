
public class Main {

	public static void main(String[] args) {
		Cheval jollyJumper = new Cheval("Jolly Jumper", "appaloosa");
		System.out.println(jollyJumper.decrire());
		
		Heros luckyLuke = new Heros("Lucky", "Luke", "cow-boy", jollyJumper);
		System.out.println(luckyLuke.decrire());
		
		Bandit joeDalton = new Bandit("Joe", "Dalton", 150);
		System.out.println(joeDalton.decrire());
		joeDalton.mettreEnPrison();
		System.out.println(joeDalton.decrire());
		joeDalton.libererDePrison();
		System.out.println(joeDalton.decrire());
	}

}
