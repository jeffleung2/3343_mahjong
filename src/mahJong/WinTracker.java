package mahJong;

import java.util.ArrayList;

public class WinTracker {
	
	private static ArrayList<Combination> win;
	private static PointsAccumulator pointsAccumulator;
	private static WinTracker instance = new WinTracker();;
	private static MJUtil mjUtil;
	
	private WinTracker(){
		mjUtil = new MJUtil();
	};
	
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
		if(mjUtil.isAllOneSuit(win)) {
			new CountAllOneSuit().count();
			checkAllHonorTiles();
		} else {
			checkGreatWinds();
		}
	}

	private void checkAllHonorTiles() {
		if(mjUtil.isAllHonorSuit(win)) {
			new CountAllHonorTiles().count();
			if(mjUtil.isGreatWinds(win))new CountGreatWinds().count();
			else if(mjUtil.isSmallWinds(win))
			{
				new CountSmallWinds().count();
			}
		} else {
			checkNineGate();
		}
	}
	
	private void checkNineGate() {
		if(mjUtil.isNineGate(win)) {
			new CountNineGate().count();
		} else {
			checkAllTriplet(true);
		}
	}

	private void checkAllTriplet(boolean isAllOneSuit) {
		if(isAllOneSuit) {
			if(mjUtil.isAllTriplet(win)) {
				new CountAllTriplet().count();
			} else {
				checkCommonHand();
			}
		} else {
			if(mjUtil.isAllTriplet(win)) {
				new CountAllTriplet().count();
				checkAllOrphans();
			} else {
				checkCommonHand();
			}
		}
	}

	private void checkAllOrphans() {
		if(mjUtil.isAllOrphans(win)) {
			new CountAllOrphans().count();
		} else {
			checkisMixOrphans();
		}
		
	}

	private void checkisMixOrphans() {
		if(mjUtil.isMixOrphans(win)) {
			new CountMixOrphans().count();
		}
	}

	private void checkCommonHand() {
		if(mjUtil.isCommonHand(win)) {
			new CountCommonHand().count();
		}
	}
	
	private void checkGreatWinds() {
		if(mjUtil.isGreatWinds(win)) {
			new CountGreatWinds().count();
		} else {
			checkSmallWinds();
		}
	}

	private void checkSmallWinds() {
		if(mjUtil.isSmallWinds(win)) {
			new CountSmallWinds().count();
		} else {
			checkBigDragon();
		}	
	}

	private void checkBigDragon() {
		if(mjUtil.isBigDragon(win)) {
			new CountBigDragon().count();
			checkMixOneSuit();
		} else {
			checkSmallDragon();
		}
		
	}

	private void checkMixOneSuit() {
		if(mjUtil.isMixOneSuit(win)) {
			new CountMixOneSuit().count();
			checkAllTriplet(false);
		} else {
			checkAllTriplet(false);
		}
		
	}
	
	private void checkSmallDragon() {
		if(mjUtil.isSmallDragon(win)) {
			new CountSmallDragon().count();
//			checkAllTriplet(false);
			checkMixOneSuit();
		} else {
			checkContainDragon();
		}
	}

	private void checkContainDragon() {
		if(mjUtil.countDragons(win) == 2) {
			new CountContainTwoDragon().count();
			checkMixOneSuit();
		} else if (mjUtil.countDragons(win) == 1) {
			new CountContainOneDragon().count();
			checkMixOneSuit();
		} else {
			checkMixOneSuit();
		}
		
	}
	

}
