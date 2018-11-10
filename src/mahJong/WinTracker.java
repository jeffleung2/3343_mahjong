package mahJong;

import java.util.ArrayList;

public class WinTracker {
	
	private static ArrayList<Combination> win;
	private static PointsAccumulator pointsAccumulator;
	private static WinTracker instance = new WinTracker();
	
	private WinTracker(){};
	
	public static WinTracker getInstance() {
		return instance;
	}
	
	public void setWin(ArrayList<Combination> win) {
		WinTracker.win = win;
	}
	
	public void createPointsAccumulator() {
		WinTracker.pointsAccumulator = new PointsAccumulator();
	}
	
	public static PointsAccumulator getPointsAccumulator() {
		return WinTracker.pointsAccumulator;
	}
	
	public void startTracking() {
		if(MJUtil.isAllOneSuit(win)) {
			new CountAllOneSuit().count();
			checkAllHonorSuit();
		} else {
			checkGreatWinds();
		}
	}

	private void checkAllHonorSuit() {
		if(MJUtil.isAllHonorSuit(win)) {
			new CountAllHonorSuit().count();
		} else {
			checkAllTriplet(true);
		}
	}

	private void checkAllTriplet(boolean isAllOneSuit) {
		if(isAllOneSuit) {
			if(MJUtil.isAllTriplet(win)) {
				new CountAllTriplet().count();
			} else {
				checkCommonHand();
			}
		} else {
			if(MJUtil.isAllTriplet(win)) {
				new CountAllTriplet().count();
				checkAllOrphans();
			} else {
				checkCommonHand();
			}
		}
	}

	private void checkAllOrphans() {
		if(MJUtil.isAllOrphans(win)) {
			new CountAllOrphans().count();
		} else {
			checkisMixOrphans();
		}
		
	}

	private void checkisMixOrphans() {
		if(MJUtil.isMixOrphans(win)) {
			new CountMixOrphans().count();
		}
	}

	private void checkCommonHand() {
		if(MJUtil.isCommonHand(win)) {
			new CountCommonHand().count();
		}
	}
	
	private void checkGreatWinds() {
		if(MJUtil.isGreatWinds(win)) {
			new CountGreatWinds().count();
		} else {
			checkSmallWinds();
		}
	}

	private void checkSmallWinds() {
		if(MJUtil.isSmallWinds(win)) {
			new CountSmallWinds().count();
		} else {
			checkBigDragon();
		}	
	}

	private void checkBigDragon() {
		if(MJUtil.isBigDragon(win)) {
			new CountBigDragon().count();
			checkMixOneSuit();
		} else {
			checkSmallDragon();
		}
		
	}

	private void checkMixOneSuit() {
		if(MJUtil.isMixOneSuit(win)) {
			new CountMixOneSuit().count();
			checkAllTriplet(false);
		} else {
			checkAllTriplet(false);
		}
		
	}
	
	private void checkSmallDragon() {
		if(MJUtil.isSmallDragon(win)) {
			new CountSmallDragon().count();
			checkAllTriplet(false);
		} else {
			checkContainDragon();
		}
	}

	private void checkContainDragon() {
		if(MJUtil.countDragons(win) == 2) {
			new CountContainTwoDragon().count();
			checkMixOneSuit();
		} else if (MJUtil.countDragons(win) == 1) {
			new CountContainOneDragon().count();
			checkMixOneSuit();
		} else {
			checkMixOneSuit();
		}
		
	}
	

}
