
public class Main {
	
	public static void turnRight() {
		Rover viper = new Rover();
		System.out.println("--------------------------");
		System.out.println("Test cases about turnRight");
		System.out.println("--------------------------");
		System.out.println("viper is actually " + viper.getLocation());
		
		System.out.println("viper is turning right");
		viper.turnRight();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning right");
		viper.turnRight();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning right");
		viper.turnRight();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning right");
		viper.turnRight();
		System.out.println("now" + viper.getLocation());
	}
	
	public static void turnLeft() {
		Rover viper = new Rover();
		System.out.println("--------------------------");
		System.out.println("Test cases about turnLeft");
		System.out.println("--------------------------");
		System.out.println("viper is actually " + viper.getLocation());
		
		System.out.println("viper is turning left");
		viper.turnLeft();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning left");
		viper.turnLeft();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning left");
		viper.turnLeft();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning left");
		viper.turnLeft();
		System.out.println("now" + viper.getLocation());
	}
	
	public static void turnLeftAndMove() {
		Rover viper = new Rover();
		System.out.println("--------------------------");
		System.out.println("Test cases about turnLeft and move");
		System.out.println("--------------------------");
		System.out.println("viper is actually " + viper.getLocation());
		
		System.out.println("viper is turning left");
		viper.turnLeft();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is moving twice");
		viper.move();
		viper.move();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning left");
		viper.turnLeft();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is moving once");
		viper.move();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning left");
		viper.turnLeft();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is moving twice");
		viper.move();
		viper.move();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning left");
		viper.turnLeft();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is moving once");
		viper.move();
		System.out.println("now" + viper.getLocation());
	}
	
	public static void turnRightAndMove() {
		Rover viper = new Rover();
		System.out.println("--------------------------");
		System.out.println("Test cases about turnRight and move");
		System.out.println("--------------------------");
		System.out.println("viper is actually " + viper.getLocation());
		
		System.out.println("viper is turning right");
		viper.turnRight();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is moving twice");
		viper.move();
		viper.move();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning right");
		viper.turnRight();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is moving once");
		viper.move();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning right");
		viper.turnRight();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is moving twice");
		viper.move();
		viper.move();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is turning right");
		viper.turnRight();
		System.out.println("now" + viper.getLocation());
		
		System.out.println("viper is moving once");
		viper.move();
		System.out.println("now" + viper.getLocation());
	}
	
	public static void createInstances() {
		Rover viper = new Rover();
		System.out.println("viper is actually " + viper.getLocation());
		System.out.println(viper.getPosition());
		System.out.println(viper.getDirection());
		System.out.println(viper.toString());
		System.out.println("-----------------------");
		
		Rover python = new Rover(new Position(5, 10), Direction.EAST);
		System.out.println("python is actually " + python.getLocation());
		System.out.println(python.getPosition());
		System.out.println(python.getDirection());
		System.out.println(python.toString());
		System.out.println("-----------------------");
		
		Rover anaconda = new Rover(20, 30, Direction.SOUTH);
		System.out.println("anaconda is actually " + anaconda.getLocation());
		System.out.println(anaconda.getPosition());
		System.out.println(anaconda.getDirection());
		System.out.println(anaconda.toString());
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		Main.turnRight();
		Main.turnLeft();
		Main.turnRightAndMove();
		Main.turnLeftAndMove();
	}

}
