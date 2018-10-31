package mahJong;

public class Combination {
	
	Tile firstTile;
	Tile secondTile;
	String state;
	char suit;
	int meldType;
	// 2 : triplet
	// 1 : sequence
	
	public Combination(Tile firstTile, Tile secondTile) {
		this.firstTile = firstTile;
		this.secondTile = secondTile;
		this.suit = firstTile.getSuit();
	}
	
	public String getState() {
		return this.state;
	}
	
	public char getSuit() {
		return suit;
	}
	

	public int getMeldType() {
		return meldType;
	}
	
}
