package zoo.model.animal;

public class Pig extends Animal {
	public Pig(String name) {
		super(name);
	}

	public String noise() {
		return "Oink oink!";
	}
}
