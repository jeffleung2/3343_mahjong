package testcase;

import org.junit.Test;

import mahJong.CheckValid;
import mahJong.MJUtil;
import mahJong.MakeWin;

import static org.junit.Assert.*;

public class UnitTesting {
	@Test
	public void test_Mahjong_ThirteenOrphan()
	{
		String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), true);
	}
	
	@Test
	public void test_Mahjong_ThirteenOrphan2()
	{
		String[] input = new String[]{"M9", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	
	@Test
	public void test_Mahjong_AllOneSuit()//AllOneSuit(Unit Testing)
	{ 
		String[] input = new String[] {"M1", "M2", "M3", "M2", "M3", "M4", "M5", "M6", "M7", "M9", "M9", "M9", "M4", "M4"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isAllOneSuit(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_AllOneSuit2()//AllOneSuit(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "M2", "M3", "M2", "M3", "M4", "M5", "M6", "M7", "M9", "M9", "M9", "M4", "M4"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isAllOneSuit(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_AllHonorSuit()//AllHonorSuit(Unit Testing)
	{ 
		String[] input = new String[] {"H1", "H1", "H1", "H3", "H3", "H3", "H4", "H4", "H4", "H5", "H5", "H5", "H6", "H6"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isAllHonorSuit(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_AllHonorSuit2()//AllHonorSuit(Unit Testing)
	{ 
		String[] input = new String[] {"M1", "M1", "M1", "H3", "H3", "H3", "H4", "H4", "H4", "H5", "H5", "H5", "H6", "H6"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isAllHonorSuit(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_NineGate()//Nine Gate(Unit Testing)
	{ 
		String[] input = new String[]{"M1", "M1", "M1", "M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9"};
		MJUtil mj = new MJUtil();
		assertEquals(mj.isNineGate(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_NineGate2()//Nine Gate(Unit Testing)
	{ 
		String[] input = new String[]{"M1", "M1", "M1", "M2", "M2", "M2", "M3", "M3", "M3", "M7", "M8", "M9", "M9", "M9"};
		MJUtil mj = new MJUtil();
		assertEquals(mj.isNineGate(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_BigDragon()//Big Dragon(Unit Testing)
	{ 
		String[] input = new String[] {"M1", "M1", "M1", "H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "M2", "M2"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isBigDragon(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_BigDragon2()//Big Dragon(Unit Testing)
	{ 
		String[] input = new String[] {"M1", "M1", "M1", "H4", "H4", "H4", "H6", "H6", "H6", "H7", "H7", "H7", "M2", "M2"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isBigDragon(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_SmallDragon()//Small Dragon(Unit Testing)
	{ 
		String[] input = new String[] {"H4", "H4", "H4", "H5", "H5", "H5", "H6", "H6", "H6", "M1", "M1", "M1", "H7", "H7"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isSmallDragon(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_SmallDragon2()//Small Dragon(Unit Testing)
	{ 
		String[] input = new String[] {"H4", "H4", "H4", "H3", "H3", "H3", "H6", "H6", "H6", "M1", "M1", "M1", "H7", "H7"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isSmallDragon(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_IsAllTriplet2()//IsAllTriplet(Unit Testing)
	{ 
		String[] input = new String[] {"H4", "H4", "H4", "H3", "H3", "H3", "H6", "H6", "H6", "M1", "M1", "M1", "H7", "H7"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isAllTriplet(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_IsAllTriplet()//IsAllTriplet(Unit Testing)
	{ 
		String[] input = new String[] {"H4", "H4", "H4", "H5", "H5", "H5", "H6", "H6", "H6", "M1", "M2", "M3", "H7", "H7"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isAllTriplet(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_IsCommonHand()//IsCommonHand(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T2", "T3", "T2", "T3", "T4", "T5", "T6", "T7", "T7", "T8", "T9", "T4", "T4"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isCommonHand(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_IsCommonHand2()//IsCommonHand(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T1", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T7", "T8", "T9", "T4", "T4"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isCommonHand(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_IsGreatWind()//IsGreatWind(Unit Testing)
	{ 
		String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "H4", "H4", "H4", "H3", "H3", "H3", "T8", "T8"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isGreatWinds(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_IsGreatWind2()//IsGreatWind(Unit Testing)
	{ 
		String[] input = new String[] {"H7", "H7", "H7", "H2", "H2", "H2", "H4", "H4", "H4", "H3", "H3", "H3", "T8", "T8"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isGreatWinds(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_IsSmallWind()//IsSmallWind(Unit Testing)
	{ 
		String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "H4", "H4", "H4", "H7", "H7", "H7", "H3", "H3"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isSmallWinds(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_IsSmallWind2()//IsSmallWind(Unit Testing)
	{ 
		String[] input = new String[] {"H7", "H7", "H7", "H2", "H2", "H2", "H4", "H4", "H4", "H3", "H3", "H3", "T8", "T8"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isSmallWinds(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_IsMixOneSuit()//IsMixOneSuit(Unit Testing)
	{ 
		String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "H4", "H4", "H4", "H5", "H5", "H5", "T8", "T8"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isMixOneSuit(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_IsMixOneSuit2()//IsMixOneSuit(Unit Testing)
	{ 
		String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "M4", "M4", "M4", "H5", "H5", "H5", "T8", "T8"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isMixOneSuit(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_IsAllOrphans()//IsAllOrphans(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T1", "T1", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isAllOrphans(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_IsAllOrphans2()//IsAllOrphans(Unit Testing)
	{ 
		String[] input = new String[] {"T2", "T2", "T2", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isAllOrphans(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_IsMixOrphans()//IsMixOrphans(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T1", "T1", "T9", "T9", "T9", "S1", "S1", "S1", "H6", "H6", "H6", "M1", "M1"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isMixOrphans(new MakeWin(input).getWin().getWin()), true);
	}
	
	@Test
	public void test_Mahjong_IsMixOrphans2()//IsMixOrphans(Unit Testing)
	{ 
		String[] input = new String[] {"T2", "T2", "T2", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isMixOrphans(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_Invalid()//Invalid(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T1", "T1", "T9", "T9", "T9", "S1", "S1", "S1", "H6", "H6", "H6", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isValidInput(input), true);
	}
	
	@Test
	public void test_Mahjong_Invalid2()//Invalid(Unit Testing)
	{ 
		String[] input = new String[] {"T2", "T2", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isValidInput(input), false);
	}
	
	@Test
	public void test_Mahjong_Invalid3()//Invalid(Unit Testing)
	{ 
		String[] input = new String[] {"T0", "T2", "T2", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isValidInput(input), false);
	}
	
	@Test
	public void test_Mahjong_Invalid4()//Invalid(Unit Testing)
	{ 
		String[] input = new String[] {"T2", "T2", "T2", "T2", "T2", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isValidInput(input), false);
	}
	@Test
	public void test_Mahjong_IsWinHand()//IsWinHand(Unit Testing)
	{ 
		String[] input = new String[] {"T2", "T2", "T2", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isWinHand(input), true);
	}
	@Test
	public void test_Mahjong_IsWinHand2()//IsWinHand(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T2", "T4", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isWinHand(input), false);
	}
}