package mahJong;

public class Tile {
	char suit;
	char rank;
	
	public Tile (String tile) {
		this.suit = tile.charAt(0);
		this.rank = tile.charAt(1);
	}
	
	public char getSuit() {
		return this.suit;
	}
	
	public char getRank() {
		return this.rank;
	}
}
