package mahJong;

public class Meld extends Combination{
	
	
	private Tile thirdTile;
	
	
	public Meld(Tile firstTile, Tile secondTile, Tile thirdTile) {
		super(firstTile, secondTile);
		this.thirdTile = thirdTile;
		this.state = "meld";
	}
	
	public Tile getTile(int i)
	{
		if(i == 0)return firstTile;
		else if(i == 1)return secondTile;
		else if(i == 2)return thirdTile;
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
	
	public Tile getThirdTile()
	{
		return thirdTile;
	}
	
//	public 
}
