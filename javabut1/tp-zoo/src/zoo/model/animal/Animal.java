package zoo.model.animal;

import zoo.model.Noisy;

public abstract class Animal implements Noisy {
	protected String name;
	
	protected Animal(String name) {
		this.name = name;
    }
	
	
	public String name() {
		return this.name;
	}
}
