package mahJong;

import java.util.ArrayList;

public class MJUtil {
	// 清一色, change name -> isAllOneSuit
	public static boolean isAllOneSuit(ArrayList<Combination> win) {
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
	//九子連環, change name -> isNineGate
	public static boolean isNineGate(ArrayList<Combination> win)
	{
		int[] count = {0,0,0,0,0,0,0,0,0};
		if(!isAllOneSuit(win))return false;
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
		return true;
	}
	//大三元
	public static boolean isBigDragon(ArrayList<Combination> win)
	{
		boolean[] redGreenWhite = new boolean[3];
		for(int i = 0, l = win.size()-1;i < l;i++)
		{
			if(win.get(i).getTile(0).getSuit() == 'H' && win.get(i).getTile(0).getRank() >= 5)redGreenWhite[win.get(i).getTile(0).getRank()-5] = true;
		}
		for(int i = 0;i < 3;i++)
			if(!redGreenWhite[i])
				return false;
		return true;
	}
	//小三元
	public static boolean isSmallDragon(ArrayList<Combination> win)
	{
		boolean[] redGreenWhite = new boolean[3];
		for(int i = 0, l = win.size();i < l;i++)
		{
			if(win.get(i).getTile(0).getSuit() == 'H' && win.get(i).getTile(0).getRank() >= 5)
				redGreenWhite[win.get(i).getTile(0).getRank()-5] = true;
		}
		for(int i = 0;i < 3;i++)
			if(!redGreenWhite[i])
				return false;
		return true;
	}
	//全么九 , change name -> isAllOrphans
	public static boolean isAllOneOrNine(ArrayList<Combination> win)
	{
		for(Combination c:win)
			if((c.getMeldType() != 2 && c.getMeldType() != 0) || c.getTile(0).getSuit() == 'H' ||
			(c.getTile(0).getRank() != 1 && c.getTile(0).getRank() != 9))
				return false;
		return true;
	}
	
	public static boolean isAllTriplet(ArrayList<Combination> win) {
		int count = 0;
		for (Combination c: win) {
			count+=c.getMeldType();
		}
		if(count == 8) {
			return true;
		}
		return false;
	}
	
	public static boolean isCommonHand(ArrayList<Combination> win) {
		int count = 0;
		for (Combination c: win) {
			count+=c.getMeldType();
//			System.out.println(c.getMeldType());
//			System.out.println(count);
		}
//		System.out.println(count);
		if(count == 4) {
			return true;
		}
		return false;
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
	//大四喜 , change name -> isGreatWinds
	public static boolean isGreatWinds(ArrayList<Combination> win)
	{
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (win.get(i).getSuit() == 'H')
			{
				if (win.get(i).getTile(0).getRank() == 1)
					count++;
				else if (win.get(i).getTile(0).getRank() == 2)
					count++;
				else if (win.get(i).getTile(0).getRank() == 3)
					count++;
				else if (win.get(i).getTile(0).getRank() == 4)
					count++;
			}
			else 
			{
				return false;
			}
		}
		if (count != 4)
		{
			return false;
		}
		return true;
	}
	//小四喜, change name -> isSmallWinds
	public static boolean isSmallWinds(ArrayList<Combination> win)
	{
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (win.get(i).getSuit() == 'H')
			{
				if (win.get(i).getTile(0).getRank() == 1)
					count++;
				else if (win.get(i).getTile(0).getRank() == 2)
					count++;
				else if (win.get(i).getTile(0).getRank() == 3)
					count++;
				else if (win.get(i).getTile(0).getRank() == 4)
					count++;
			}
		}
		if (count != 3)
		{
			return false;
		}
		else if (win.get(4).getTile(0).getSuit() == 'H' && win.get(4).getTile(0).getRank() < 5)
			return true;
		else 
			return false;
	}
	
	public static boolean isMixOneSuit(ArrayList<Combination> win) {
		String suit="";
		for (Combination c: win) {
			if (!suit.contains(c.getSuit()+""))
			suit += c.getSuit();
		}
		if (suit.length() > 2) {
			return false;
		}
		else if (suit.length() == 2 && !suit.contains("H")) {
			return false;
		}
		else {	// Assume all one suit is not possible in this method
			return true;
		}
	}
	
	public static boolean isAllOrphans(ArrayList<Combination> win) { 
		for (Combination c: win) {
			if (c.getTile(0).getRank() != 1 && c.getTile(0).getRank() != 9)
			return false;
		}
		return true;
	}
	
	public static boolean isMixOrphans(ArrayList<Combination> win) {
		for (Combination c: win) {
			if (!(c.getSuit()+"").equals("H")) {
				if (c.getTile(0).getRank() != 1 && c.getTile(0).getRank() != 9)
					return false;
			}
		}
		return true;
	}
	
	public static int countDragons (ArrayList<Combination> win) {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (win.get(i).getSuit() == 'H')
			{
				if (win.get(i).getTile(0).getRank() == 5)
					count++;
				else if (win.get(i).getTile(0).getRank() == 6)
					count++;
				else if (win.get(i).getTile(0).getRank() == 7)
					count++;
			}
		}
//		if (count == 3)
//		{
//			return 8;
//		}
//		else if (count == 2) {
//			if (win.get(4).getTile(0).getSuit() == 'H' && win.get(4).getTile(0).getRank() > 4) {
//				return 5;
//			}
//			else 
//				return 2;
//		}
//		else if (count == 1)
//			return 1;
//		return 0;
		return count;
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
