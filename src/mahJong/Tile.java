package mahJong;

public class Tile {
	char suit; // H = 番子 T = 筒子 S = 索子 M = 萬子
	char rank; // 
	
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
