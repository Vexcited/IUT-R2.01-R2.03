
public class Position {
	private final Integer x;
	private final Integer y;
	
	public Position(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	public Integer x() {
        return this.x;
    }
	
	public Integer y() {
        return this.y;
    }
	
	@Override
	public String toString() {
		return "Position [x=" + this.x + ", y=" + this.y + "]";
	}
}
