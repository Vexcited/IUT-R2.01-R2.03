package honeybee.application;

import honeybee.gui.Console;
import honeybee.model.Drone;
import honeybee.model.Queen;
import honeybee.model.Worker;
import honeybee.model.HoneyBee;

public class SandBox {

	public static void main(String[] args) {
		HoneyBee mellifera = new Queen("Mellifera");
		HoneyBee maya = new Worker("Maya");
		HoneyBee willy = new Drone("Willy");
		
		Console.title("Appel à getClass de la classe Object");
		Console.message("Classe de l'objet melli : " + mellifera.getClass());
		Console.message("Classe de l'objet maya : " + maya.getClass());
		Console.message("Classe de l'objet willy : " + willy.getClass());
		
	}

}
