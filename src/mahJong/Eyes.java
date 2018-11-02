package mahJong;

public class Eyes extends Combination{

	public Eyes(Tile firstTile, Tile secondTile) {
		super(firstTile, secondTile);
		state = "eyes";
		meldType = 0;
	}
	
	public Tile getTile(int i)
	{
		if(i == 0)return firstTile;
		else if(i == 1)return secondTile;
		return null;
	}
	public Tile getFirstTile()
	{
		return firstTile;
	}
	
	public Tile getSecondTile()
	{
		return secondTile;
	}
}
