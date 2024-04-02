package zoo.application;

import zoo.model.ZooGarden;
import zoo.model.animal.*;
import zoo.model.visitor.*;

public class ZooMain {

	private static final String LINE = "-----------------";

	public static void main(String[] args) {

		Pig peppa = new Pig("Peppa");
		Pig george = new Pig("George");
		Lion simba = new Lion("Simba");
		Lion sarabi = new Lion("Sarabi");
		Duck donald = new Duck("Donald");
		Duck riri = new Duck("Riri");
		Duck fifi = new Duck("Fifi");
		Duck loulou = new Duck("Loulou");

		ZooGarden zoo = new ZooGarden();
		zoo.add(george, sarabi, donald, simba, riri, fifi, loulou, peppa);

		System.out.println(LINE);
		System.out.println("Noise due to animals");
		System.out.println(LINE);
		zoo.makeNoise();

		zoo.add(new Adult());
		zoo.add(new Adult());
		zoo.add(new Baby());
		zoo.add(new Baby());
		zoo.add(new Toddler(3));
		zoo.add(new SchoolAge(8));
		zoo.add(new Teenager(15));
		System.out.println(LINE);
		System.out.println("Welcome Visitors !");
		System.out.println(LINE);
		zoo.sayHello();

		System.out.println(LINE);
		System.out.println("Overall noise in zoo");
		System.out.println(LINE);
		zoo.makeNoise();

		System.out.println(LINE);
		System.out.println("Zoo Revenue");
		System.out.println(LINE);
		Integer globalRevenue = zoo.detailRevenue();
		System.out.println(LINE);
		System.out.println("Global Revenue : " + globalRevenue + " Euros");
		System.out.println(LINE);

	}

}