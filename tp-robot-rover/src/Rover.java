
public class Rover {
	private Position position;
	private Direction direction;
	
	public Rover(Position position, Direction direction) {
		this.position = position;
		this.direction = direction;
	}
	
	public Rover(Integer x, Integer y, Direction direction) {
		this(new Position(x, y), direction);
	}
	
	public Rover() {
	    this(new Position(0, 0), Direction.NORTH);
	}
	
	public void move() {
		switch (this.direction) {
		case NORTH:
			this.position = new Position(this.position.x(), this.position.y() + 1);
			break;
		case EAST:
			this.position = new Position(this.position.x() + 1, this.position.y());
			break;
		case SOUTH:
			this.position = new Position(this.position.x(), this.position.y() - 1);
			break;
		case WEST:
			this.position = new Position(this.position.x() - 1, this.position.y());
			break;
		}
	}
	
	public void turnLeft() {
		switch (this.direction) {
		case NORTH:
			this.direction = Direction.WEST;
			break;
		case EAST:
			this.direction = Direction.NORTH;
			break;
		case SOUTH:
			this.direction = Direction.EAST;
			break;
		case WEST:
			this.direction = Direction.SOUTH;
			break;
		}
	}
	
	public void turnRight() {
		switch (this.direction) {
		case NORTH:
			this.direction = Direction.EAST;
			break;
		case EAST:
			this.direction = Direction.SOUTH;
			break;
		case SOUTH:
			this.direction = Direction.WEST;
			break;
		case WEST:
			this.direction = Direction.NORTH;
			break;
		}
	}
	
	public String getLocation() {
		return "at position (x=" + this.position.x() + ", y=" + this.position.y() + ") towards the " + this.direction;
	}

	@Override
	public String toString() {
		return "Rover [position=" + this.position + ", direction=" + this.direction + "]";
	}

	public Position getPosition() {
		return this.position;
	}

	public Direction getDirection() {
		return this.direction;
	}
}
