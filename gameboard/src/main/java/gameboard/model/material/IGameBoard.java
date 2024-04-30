package gameboard.model.material;

public interface IGameBoard {
	
	boolean isDiscAt(Position position);
	public boolean isEmpty();
	public boolean put(Position position, Disc disc);
	public void clear();
	public int howManyDiscsOnBoard();
	public Disc discAt(Position position);
	public Disc removeDiscAt(Position position);
	public String toAscii();	
	
	public Object discs();


}
