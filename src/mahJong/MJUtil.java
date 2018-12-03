package mahJong;

import java.util.ArrayList;

public class MJUtil {
	
	
	public boolean isAllOneSuit(ArrayList<Combination> win) {
		char suit = win.get(0).getSuit();
		for (Combination c: win) {
			if (c.getSuit() != suit) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isAllHonorSuit(ArrayList<Combination> win) {
		for (Combination c: win) {
			if (c.getSuit() != 'H') {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isThirteenOrphans(String[] input)
	{
		Combination win = new Combination();
		for(String s:input)
		{
			win.addTiles(new Tile(s));
		}
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
			else haveSort[win.getTile(i).getRank()-1] = true; 
		}
		for(boolean b:haveHonours)
			if(!b)return false;
		if(!haveMan[0] || !haveMan[8] || !haveTung[0] || !haveTung[8] || !haveSort[0] || !haveSort[8])return false;
		return true;
	}
	
	
	public boolean isNineGate(ArrayList<Combination> win)
	{
		int[] count = {0,0,0,0,0,0,0,0,0};
//		if(!isAllOneSuit(win))return false;
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
				Meld e = (Meld)win.get(i);
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
	
	
	public boolean isBigDragon(ArrayList<Combination> win)
	{
		boolean[] redGreenWhite = new boolean[3];
		for(int i = 0, l = win.size()-1;i < l;i++)
		{
			if(isDragonTiles(win.get(i)))redGreenWhite[win.get(i).getTile(0).getRank()-5] = true;
		}
		for(int i = 0;i < 3;i++)
			if(!redGreenWhite[i])
				return false;
		return true;
	}
	
	public boolean isSmallDragon(ArrayList<Combination> win)
	{
		boolean[] redGreenWhite = new boolean[3];
		for(int i = 0, l = win.size();i < l;i++)
		{
			if(isDragonTiles(win.get(i)))
				redGreenWhite[win.get(i).getTile(0).getRank()-5] = true;
		}
		for(int i = 0;i < 3;i++)
			if(!redGreenWhite[i])
				return false;
		return true;
	}
	
	public boolean isAllTriplet(ArrayList<Combination> win) {
		int count = 0;
		for (Combination c: win) {
			count+=c.getMeldState().getState();
		}
		if(count == 8) {
			return true;
		}
		return false;
	}
	
	public boolean isCommonHand(ArrayList<Combination> win) {
		int count = 0;
		for (Combination c: win) {
			count+=c.getMeldState().getState();
//			System.out.println(c.getMeldType());
//			System.out.println(count);
		}
//		System.out.println(count);
		if(count == 4) {
			return true;
		}
		return false;
	}
	
//	public static int isAllTripletOrAllSequence (ArrayList<Combination> win) {
//		int count = 0;
//		for (Combination c: win) {
//			count+=c.getMeldType();
//		}
//		switch (count) {
//			case 4: return 1; 
//			case 8: return 3; 
//			default: return 0;
//		}
//	}
	

	public boolean isGreatWinds(ArrayList<Combination> win)
	{
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (isWindTiles(win.get(i)))
				count++;
		}
		if (count != 4)
		{
			return false;
		}
		return true;
	}
	
	public boolean isSmallWinds(ArrayList<Combination> win)
	{
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (isWindTiles(win.get(i)))
				count++;
		}
		if (count != 3)
		{
			return false;
		}
		else if (isWindTiles(win.get(4)))
			return true;
		else 
			return false;
	}
	
	public boolean isMixOneSuit(ArrayList<Combination> win) {
		String suit="";
		for (Combination c: win) {
			if (!suit.contains(c.getSuit()+""))
			suit += c.getSuit();
		}
		if (suit.length() != 2) {
			return false;
		}
		else { 
			if (!suit.contains("H")) {
				return false;
			}
			return true;
		}
	}
	
	public boolean isAllOrphans(ArrayList<Combination> win) { 
		for (Combination c: win) {
			if (c.getTile(0).getRank() != 1 && c.getTile(0).getRank() != 9)
			return false;
		}
		return true;
	}
	
	public boolean isMixOrphans(ArrayList<Combination> win) {
		for (Combination c: win) {
			if (!(c.getSuit()+"").equals("H")) {
				if (c.getTile(0).getRank() != 1 && c.getTile(0).getRank() != 9)
					return false;
			}
		}
		return true;
	}
	
	public int countDragons (ArrayList<Combination> win) {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (isDragonTiles(win.get(i)))
			count++;
			
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
	
	public boolean isWindTiles(Combination comb) {
		return comb.getSuit() == 'H' && comb.getTile(0).getRank() < 5 ;
	}
	
	public boolean isDragonTiles(Combination comb) {
		return comb.getSuit() == 'H' && comb.getTile(0).getRank() > 4;
	}
	
}
