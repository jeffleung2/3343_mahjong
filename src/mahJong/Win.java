package mahJong;

import java.util.ArrayList;

public class Win {
	ArrayList <Combination> win = new ArrayList<>();
	
	public Win(Combination firstMeld, 
			Combination secondMeld, 
			Combination thirdMeld,
			Combination fourthMeld,
			Combination eyes
			) {
		this.win.add(firstMeld);
		this.win.add(secondMeld);
		this.win.add(thirdMeld);
		this.win.add(fourthMeld);
		this.win.add(eyes);
	}
	
	public ArrayList<Combination> getWin() {
		return win;
	}
}
