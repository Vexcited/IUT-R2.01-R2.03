package honeybee.model;

public class Drone extends HoneyBee {
	public Drone(String name) {
		super(name);
	}
	
	@Override
	public String doYourJob() {
		return super.doYourJob() + "I'm a drone, I'm going to date our Queen!";
	}
}
