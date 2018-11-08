package mahJong;

import java.util.ArrayList;

public class PointsAccumulator {
	
	private int point = 0;
	private ArrayList<Combination> win;
	private String name = "chicken win";
	
	public PointsAccumulator(Win win) {
		this.win = win.getWin();
		checkAllOneSuit();
	}
	
	public void printString() {
		System.out.println("Points: " + point);
		System.out.println("Name: " + name);
	}
	
	private void checkAllOneSuit() {
		if(MJUtil.isAllOneSuit(win)) {
			checkAllHonorSuit();
		} else {
			checkGreatWinds();
		}
	}

	private void checkAllHonorSuit() {
		if(MJUtil.isAllHonorSuit(win)) {
			point = 13;
			name = "All Honor Suit";
		} else {
			checkAllOneSuitAllTriplet();
		}
	}

	private void checkAllOneSuitAllTriplet() {
		if(MJUtil.isAllTriplet(win)) {
			point = 10;
			name = "All one Suit All Tripe";
		} else {
			checkAllOneSuitAllSequence();
		}
	}

	private void checkAllOneSuitAllSequence() {
		if(MJUtil.isAllSequence(win)) {
			point = 8;
			name = "All one Suit All Sequence";
		} else {
			checkNineGate();
		}
	}

	private void checkNineGate() {
		if(MJUtil.isNineGate(win)) {
			point = 13;
			name = "Nine Gate";
		} else {
			point = 7;
			name = "All one Suit";
		}
	}

	private void checkGreatWinds() {
		if(MJUtil.isGreatWinds(win)) {
			point = 13;
			name = "Great Winds";
		} else {
			checkSmallWind();
		}
	}
	
	private void checkSmallWind() {
		if(MJUtil.isSmallWinds(win)) {
			point = 13;
			name = "Small Winds";
		} else {
			checkBigDragon();
		}
	}

	private void checkBigDragon() {
		if(MJUtil.isBigDragon(win)) {
			checkBigDragonMixOneSuit();
		} else {
			checkSmallDragon();
		}
	}

	private void checkSmallDragon() {
		if(MJUtil.isSmallDragon(win)) {
			checkSmallDragonMixOneSuit();
		} else {
			checkMixOneSuit();
		}
		
	}
	
	private void checkSmallDragonMixOneSuit() {
		if(MJUtil.isMixOneSuit(win)) {
			checkSmallDragonMixOneSuitAllTriplet();
		} else {
			checkMixOneSuit();
		}
	}

	private void checkSmallDragonMixOneSuitAllTriplet() {
		if(MJUtil.isAllTriplet(win)) {
			point = 11;
			name = "Small Dragon Mix One Suit All Triplet";
		} else {
			point = 8;
			name = "Small Dragon Mix One Suit";
		}
	}

	private void checkBigDragonMixOneSuit() {
		if(MJUtil.isMixOneSuit(win)) {
			checkBigDragonMixOneSuitAllTriplet();
		} else {
			point = 11;
			name = "Big Dragon Mix One Suit";
		}
	}

	private void checkBigDragonMixOneSuitAllTriplet() {
		if(MJUtil.isAllTriplet(win)) {
			point = 13;
			name = "Big Dragon Mix One Suit All Triplet";
		}
	}
	
	private void checkMixOneSuit() {
		if(MJUtil.isMixOneSuit(win)) {
			checkMixOneSuitAllTriplet();
		} else {
			
		}
	}

	private void checkMixOneSuitAllTriplet() {
		if(MJUtil.isAllTriplet(win)) {
			
		}
		
	}
	
	
	
}
