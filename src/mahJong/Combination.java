package mahJong;

import java.util.ArrayList;

public class Combination {
	private ArrayList<Tile> tiles;
	private String state;
	private char suit;
	private int meldType;
	// 2 : triplet
	// 1 : sequence
	public Combination()
	{
		tiles = new ArrayList<>();
	}
	public Combination(Tile firstTile, Tile secondTile, String state, int meldType) {
		tiles = new ArrayList<>();
		tiles.add(firstTile);
		tiles.add(secondTile);
		this.suit = firstTile.getSuit();
		this.state = state;
		this.meldType = meldType;
	}
	public void addTiles(Tile tile)
	{
		tiles.add(tile);
	}
	public int getTilesSize()
	{
		return tiles.size();
	}
// 	public String getState() {
// 		return this.state;
// 	}
	
	public char getSuit() {
		return suit;
	}
	

	public int getMeldType() {
		return meldType;
	}
	public void setMeldType(int meldType)
	{
		this.meldType = meldType;
	}
	public Tile getTile(int i)
	{
//		if(tiles.size() == i)return null; // Array out of bound
		return tiles.get(i);
	}
}
