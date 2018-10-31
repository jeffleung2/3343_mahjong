package mahJong;

public class Eyes extends Combination{

	public Eyes(Tile firstTile, Tile secondTile) {
		super(firstTile, secondTile);
		state = "eyes";
		meldType = 0;
	}
	
}
