package mahJong;

public class Meld extends Combination{	
	
	public Meld(Tile firstTile, Tile secondTile, Tile thirdTile) {
		super(firstTile, secondTile, "meld", 0);
		this.addTiles(thirdTile);
//		this.state = "meld";
	}
	
//	public 
}
