package mahJong;

public class Tile {
	private char suit; // H = 番子 T = 筒子 S = 索子 M = 萬子
	private int rank; // 
	
	public Tile (String tile) {
		this.suit = tile.charAt(0);
		this.rank = Integer.parseInt(Character.toString(tile.charAt(1)));
	}
	
	public char getSuit() {
		return this.suit;
	}
	
	public int getRank() {
		return this.rank;
	}
}
