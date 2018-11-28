package mahJong;

public class Tile {
	private char suit; // H = 番子 T = 筒子 S = 索子 M = 萬子
	private int rank; // H1 = 東, H2 = 南, H3 = 西, H4 = 北, H5 = 中, H6 = 發, H7 = 白
	
	public Tile (String tile) {
		this.suit = tile.charAt(0);
		this.rank = Integer.parseInt(tile.substring(1));
	}
	
	public char getSuit() {
		return this.suit;
	}
	
	public int getRank() {
		return this.rank;
	}
}
