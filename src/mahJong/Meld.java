package mahJong;

public class Meld extends Combination{
	
	
	Tile thirdTile;
	
	
	public Meld(Tile firstTile, Tile secondTile, Tile thirdTile) {
		super(firstTile, secondTile);
		this.thirdTile = thirdTile;
		this.state = "meld";
	}
	
	
//	public 
}
