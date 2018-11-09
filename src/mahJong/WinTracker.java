package mahJong;

import java.util.ArrayList;

public class WinTracker {
	
	private static ArrayList<Combination> win;
	private static WinTracker instance = new WinTracker();
	
	private WinTracker(){};
	
	public static WinTracker getInstance() {
		return instance;
	}
	
	public void setWin(ArrayList<Combination> win) {
		WinTracker.win = win;
	}
	
	public void startTracking() {
		if(MJUtil.isAllOneSuit(win)) {
			new CountAllOneSuit().count();
			checkAllHonorSuit();
		} else {
			
		}
	}

	private void checkAllHonorSuit() {
		if(MJUtil.isAllHonorSuit(win)) {
			new CountAllHonorSuit().count();
		} else {
			
			checkAllTriplet();
		}
	}

	private void checkAllTriplet() {
		if(MJUtil.isAllTriplet(win)) {
			new CountAllTriplet().count();
		} else {
			
		}
		
	}
	

}
