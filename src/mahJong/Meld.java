package mahJong;

public class Meld extends Combination{	
	public Meld(Tile firstTile, Tile secondTile, Tile thirdTile, MeldState state) {
		super(firstTile, secondTile, "meld");
		this.addTiles(thirdTile);
		this.setMeldState(state);
//		this.state = "meld";
	}
	
	public Meld(Tile firstTile, Tile secondTile, MeldState state) {
		super(firstTile, secondTile, "meld");
		this.setMeldState(state);
	}
	
//	public 
}
