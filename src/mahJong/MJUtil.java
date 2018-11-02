package mahJong;

import java.util.ArrayList;

public class MJUtil {
	// 清一色
	public static boolean isPureOneSuit(ArrayList<Combination> win) {
		char suit = win.get(0).getSuit();
		for (Combination c: win) {
			if (c.getSuit() != suit) {
				return false;
			}
		}
		return true;
	}
	//字一色
	public static boolean isAllHonorSuit(ArrayList<Combination> win) {
		for (Combination c: win) {
			if (c.getSuit() != 'H') {
				return false;
			}
		}
		return true;
	}
	//十三么
	public static boolean isThirteenOrphans(Combination win)
	{
		boolean[] haveHonours = new boolean[7];
		boolean[] haveMan = new boolean[9];
		boolean[] haveTung = new boolean[9];
		boolean[] haveSort = new boolean[9];
		int tileSize = win.getTilesSize();
		if(win.getTile(tileSize-1).getRank() != win.getTile(tileSize-2).getRank() ||
		win.getTile(tileSize-1).getSuit() != win.getTile(tileSize-2).getSuit()) // check Eyes
			return false;
		for(int i = 0, l = win.getTilesSize();i < l;i++)
		{
			if(win.getTile(i).getSuit() == 'H')haveHonours[win.getTile(i).getRank()-1] = true;
			else if(win.getTile(i).getSuit() == 'M')haveMan[win.getTile(i).getRank()-1] = true;
			else if(win.getTile(i).getSuit() == 'T')haveTung[win.getTile(i).getRank()-1] = true;
			else if(win.getTile(i).getSuit() == 'S')haveSort[win.getTile(i).getRank()-1] = true; 
		}
		for(boolean b:haveHonours)
			if(!b)return false;
		if(!haveMan[0] || !haveMan[8] || !haveTung[0] || !haveTung[8] || !haveSort[0] || !haveSort[8])return false;
		return true;
	}
	//九子連環
	public static boolean isNineChains(ArrayList<Combination> win)
	{
		int[] count = {0,0,0,0,0,0,0,0,0};
		if(!isPureOneSuit(win))return false;
		for(int i = 0;i < win.size();i++)
		{
			if(i != win.size()-1)
			{
				Meld m = (Meld)win.get(i);
				for(int j = 0;j < 3;j++)
					count[m.getTile(j).getRank()-1] ++;
			}
			else
			{
				Eyes e = (Eyes)win.get(i);
				for(int j = 0;j < 2;j++)
					count[e.getTile(j).getRank()-1] ++;
			}
		}
		if((count[0] > 3 && count[8] > 3) || // the amount of 1 and 9 cannot be 4 at the same time
				count[0] < 3 || count[8] < 3) // the amount of 1 and 9 cannot less than 3 at the same time
			return false;
		for(int i :count)
			if(i == 0)
				return false;
//		if(win.get(0).getClass().getName() !== 'Triplet')return false;
		return true;
	}
	public static int isAllTripletOrAllSequence (ArrayList<Combination> win) {
		int count = 0;
		for (Combination c: win) {
			count+=c.getMeldType();
		}
		switch (count) {
			case 4: return 1; 
			case 8: return 3; 
			default: return 0;
		}
	}
	
//	public static int isBigFourHappiness(ArrayList<Combination> win) {
//		boolean hasEastMeld;
//		boolean hasSouthMeld;
//		boolean hasWestMeld;
//		boolean hasNorthMeld;
//		for (Combination c: win) {
//			count+=c.getMeldType();
//		}
//	}
}
