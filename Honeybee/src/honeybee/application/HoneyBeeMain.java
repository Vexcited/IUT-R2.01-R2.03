package honeybee.application;

import java.util.ArrayList;
import honeybee.gui.Console;
import honeybee.model.Drone;
import honeybee.model.Queen;
import honeybee.model.Worker;
import honeybee.model.HoneyBee;

public class HoneyBeeMain {

	public static void main(String[] args) {
		collectionOfHoneyBees();
	}
	
	private static void collectionOfHoneyBees () {
		Console.title("Collection of honeybees");
		ArrayList<HoneyBee> honeybees = new ArrayList<>();
		honeybees.add(new Queen("Mellifera"));
		honeybees.add(new Worker("Maya"));
		honeybees.add(new Worker("Marguerite"));
		honeybees.add(new Worker("Propolis"));
		honeybees.add(new Drone("Willy"));
		honeybees.add(new Drone("Didier"));
		
		for (HoneyBee bee : honeybees) {
			Console.message(bee.doYourJob());
		}

		Console.message(Console.SEPARATOR_LINE);

		for (HoneyBee bee : honeybees) {
			Console.message(bee.fly());
		}
	}
	
	private static void arrayOfHoneyBees () {
		Console.title("Array of honeybees");

		HoneyBee[] bees = new HoneyBee[6];
		bees[0] = new Queen("Mellifera");
		bees[1] = new Worker("Maya");
		bees[2] = new Worker("Marguerite");
		bees[3] = new Worker("Propolis");
		bees[4] = new Drone("Willy");
		bees[5] = new Drone("Didier");

		for (HoneyBee bee : bees) {
			Console.message(bee.doYourJob());
		}

		Console.message(Console.SEPARATOR_LINE);

		for (HoneyBee bee : bees) {
			Console.message(bee.fly());
		}
	}

	private static void someHoneyBees() {
		Console.title("Some honeybees");

		HoneyBee queen = new Queen("Mellifera");
		HoneyBee firstWorker = new Worker("Maya");
		HoneyBee secondWorker = new Worker("Marguerite");
		HoneyBee thirdWorker = new Worker("Propolis");
		HoneyBee firstDrone = new Drone("Willy");
		HoneyBee secondDrone = new Drone("Didier");

		Console.message(queen.doYourJob());
		Console.message(firstWorker.doYourJob());
		Console.message(secondWorker.doYourJob());
		Console.message(thirdWorker.doYourJob());
		Console.message(firstDrone.doYourJob());
		Console.message(secondDrone.doYourJob());

		Console.message(Console.SEPARATOR_LINE);

		Console.message(queen.fly());
		Console.message(firstWorker.fly());
		Console.message(secondWorker.fly());
		Console.message(thirdWorker.fly());
		Console.message(firstDrone.fly());
		Console.message(secondDrone.fly());
	}

}