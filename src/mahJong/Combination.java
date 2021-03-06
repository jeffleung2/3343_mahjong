package mahJong;

import java.util.ArrayList;

public class Combination {
	private ArrayList<Tile> tiles;
	private char suit;
	private int meldType;
	private MeldState meldState;
	// 2 : triplet
	// 1 : sequence
	public Combination()
	{
		tiles = new ArrayList<>();
	}
	public Combination(Tile firstTile, Tile secondTile, String state) {
		tiles = new ArrayList<>();
		tiles.add(firstTile);
		tiles.add(secondTile);
		this.suit = firstTile.getSuit();
	}
	public void addTiles(Tile tile)
	{
		tiles.add(tile);
	}
	public int getTilesSize()
	{
		return tiles.size();
	}
	
	public char getSuit() {
		return suit;
	}
	

	public MeldState getMeldState() {
		return meldState;
	}
	public void setMeldState(MeldState meldState) {
		this.meldState = meldState;
	}
	public Tile getTile(int i)
	{
//		if(tiles.size() == i)return null; // Array out of bound
		return tiles.get(i);
	}
}
