package zoo.model;
import java.util.ArrayList;

import zoo.model.animal.Animal;
import zoo.model.visitor.Baby;
import zoo.model.visitor.Visitor;

public class ZooGarden {

	private ArrayList<Animal> animals;
	private ArrayList<Visitor> visitors;

	public ZooGarden() {
		this.animals = new ArrayList<>();
		this.visitors = new ArrayList<>();
	}

	public void add(Animal... animals) {
		for (Animal animal : animals) {
			this.animals.add(animal);
		}
	}

	public void add(Visitor visitor) {
		visitors.add(visitor);
	}

	public void makeNoise() {
		for (Animal animal : animals) {
			System.out.println(animal.name() + " : " + animal.noise());
		}
		
		for (Visitor visitor : visitors) { 
			if (visitor instanceof Baby baby)
				System.out.println(baby.noise());
		}
	}

	public void sayHello() {
		for (Visitor visitor : visitors) {
			System.out.println(visitor.sayHello());
		}
	}

	public Integer detailRevenue() {
		Integer revenue = 0;
		for (Visitor visitor : visitors) {
			System.out.println(visitor.whoAmI() + " : " + visitor.priceOfTicket() + " Euros");
			revenue = revenue + visitor.priceOfTicket();
		}

		return revenue;
	}

}