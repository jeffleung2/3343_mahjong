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
	public void test_Mahjong_NineGate3()//Nine Gate(Unit Testing)
	{ 
		String[] input = new String[]{"M2", "M2", "M2", "M3", "M4", "M5", "M3", "M3", "M3", "M7", "M8", "M9", "M9", "M9"};
		MJUtil mj = new MJUtil();
		assertEquals(mj.isNineGate(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_NineGate4()//Nine Gate(Unit Testing)
	{ 
		String[] input = new String[]{"M1", "M1", "M1", "M1", "M2", "M3", "M9", "M9", "M9", "M7", "M8", "M9", "M8", "M8"};
		MJUtil mj = new MJUtil();
		assertEquals(mj.isNineGate(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_NineGate5()//Nine Gate(Unit Testing)
	{ 
		String[] input = new String[]{"M2", "M2", "M2", "M3", "M4", "M5", "M3", "M3", "M3", "M7", "M8", "M9", "M6", "M6"};
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
//		String[] input = new String[] {"H7", "H7", "H7", "H2", "H2", "H2", "H4", "H4", "H4", "H6", "H6", "H6", "T8", "T8"};
		MJUtil mj = new MJUtil();
		assertEquals(mj.isSmallWinds(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_IsSmallWind3()//IsSmallWind(Unit Testing)
	{ 
//		String[] input = new String[] {"H7", "H7", "H7", "H2", "H2", "H2", "H4", "H4", "H4", "H3", "H3", "H3", "T8", "T8"};
		String[] input = new String[] {"H7", "H7", "H7", "H2", "H2", "H2", "H4", "H4", "H4", "H6", "H6", "H6", "T8", "T8"};
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
//		String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "M4", "M4", "M4", "H5", "H5", "H5", "T8", "T8"}; 
		String[] input = new String[] {"M1", "M1", "M1", "M2", "M2", "M2", "M4", "M4", "M4", "M5", "M5", "M5", "T8", "T8"}; 
		MJUtil mj = new MJUtil();
		assertEquals(mj.isMixOneSuit(new MakeWin(input).getWin().getWin()), false);
	}
	
	@Test
	public void test_Mahjong_IsMixOneSuit3()//IsMixOneSuit(Unit Testing)
	{ 
		String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "M4", "M4", "M4", "H5", "H5", "H5", "T8", "T8"}; 
//		String[] input = new String[] {"M1", "M1", "M1", "M2", "M2", "M2", "M4", "M4", "M4", "M5", "M5", "M5", "T8", "T8"}; 
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
	public void test_Mahjong_Invalid5()//Invalid(Unit Testing)
	{ 
		String[] input = new String[] {"T", "T2", "T2", "T2", "T2", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isValidInput(input), false);
	}
	
	@Test
	public void test_Mahjong_Invalid6()//Invalid(Unit Testing)
	{ 
		String[] input = new String[] {"TA", "T2", "T2", "T2", "T2", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isValidInput(input), false);
	}
	
	@Test
	public void test_Mahjong_Invalid7()//Invalid(Unit Testing)
	{ 
		String[] input = new String[] {"A8", "H8", "H8", "T2", "T2", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isValidInput(input), false);
	}
	
	@Test
	public void test_Mahjong_Invalid8()//Invalid(Unit Testing)
	{ 
		String[] input = new String[] {"H0", "H8", "H8", "T2", "T2", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isValidInput(input), false);
	}
	
	@Test
	public void test_Mahjong_Invalid9()//Invalid(Unit Testing)
	{ 
		String[] input = new String[] {"H8", "H8", "H8", "T2", "T2", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
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
	
	@Test
	public void test_Mahjong_IsWinHand3()//IsWinHand(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T2", "T3", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isWinHand(input), true);
	}
	
	@Test
	public void test_Mahjong_IsWinHand4()//IsWinHand(Unit Testing)
	{ 
		String[] input = new String[] {"T2", "T4", "T5", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isWinHand(input), false);
	}
	
	@Test
	public void test_Mahjong_IsWinHand5()//IsWinHand(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T2", "T3", "T8", "T8", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isWinHand(input), false);
	}
	
	@Test
	public void test_Mahjong_IsWinHand6()//IsWinHand(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T2", "T3", "S1", "S1", "S1", "S9", "S9", "S9", "M8", "T8", "T9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isWinHand(input), false);
	}
	
	@Test
	public void test_Mahjong_IsWinHand7()//IsWinHand(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T2", "T3", "S1", "S1", "S1", "M8", "M8", "T9", "S9", "S9", "S9", "M1", "M1"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isWinHand(input), false);
	}
	
	@Test
	public void test_Mahjong_IsWinHand8()//IsWinHand(Unit Testing)
	{ 
		String[] input = new String[] {"T1", "T2", "T3", "S1", "S1", "S1", "M8", "M8", "M8", "S9", "S9", "S9", "T1", "M2"}; 
		CheckValid check = new CheckValid();
		assertEquals(check.isWinHand(input), false);
	}
	
	@Test
	public void test_Mahjong_ThirteenOrphans1()// suit same, rank different
	{  
		String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H6", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	 
	@Test
	public void test_Mahjong_ThirteenOrphans2()//suit different, rank same
	{ 
		String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "M7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	 
	@Test
	public void test_Mahjong_ThirteenOrphans3() { // suit different, rank different
		String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "M6"};
		assertEquals(MJUtil.isThirteenOrphans(input), false); 
	}
	 
	@Test
	public void test_Mahjong_ThirteenOrphans5() { // no S1
		String[] input = new String[]{"M1", "S9", "T1", "T9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	 
	@Test
	public void test_Mahjong_ThirteenOrphans6() { // no S9
		String[] input = new String[]{"S1", "M9", "T1", "T9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	 
	@Test
	public void test_Mahjong_ThirteenOrphans7() {  // no M1
		String[] input = new String[]{"S1", "S9", "T1", "T9", "S1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	@Test
	public void test_Mahjong_ThirteenOrphans8() {  // no M9
		String[] input = new String[]{"M1", "S9", "T1", "T9", "M1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	@Test
	public void test_Mahjong_ThirteenOrphans9() { // no T1
		String[] input = new String[]{"M1", "S9", "M1", "T9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	@Test
	public void test_Mahjong_ThirteenOrphans10() {  // no T9
		String[] input = new String[]{"M1", "S9", "T1", "M9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	@Test
	public void test_Mahjong_ThirteenOrphans11() {  // no S
		String[] input = new String[]{"A1", "M9", "T1", "M9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	 
	@Test
	public void test_Mahjong_ThirteenOrphans12() { // No S
		String[] input = new String[]{"M1", "M9", "T1", "T9", "T1", "T9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	
	@Test
	public void test_Mahjong_ThirteenOrphans13() { // No H1
		String[] input = new String[]{"M1", "M9", "T1", "T9", "T1", "T9", "H2", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	
	@Test
	public void test_Mahjong_ThirteenOrphans14() { // No H2
		String[] input = new String[]{"M1", "M9", "T1", "T9", "T1", "T9", "H1", "H1", "H3", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	
	@Test
	public void test_Mahjong_ThirteenOrphans15() { // No H3
		String[] input = new String[]{"M1", "M9", "T1", "T9", "T1", "T9", "H1", "H1", "H2", "H5", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	
	@Test
	public void test_Mahjong_ThirteenOrphans16() { // No H4
		String[] input = new String[]{"M1", "M9", "T1", "T9", "T1", "T9", "H1", "H2", "H3", "H5", "H5", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	
	@Test
	public void test_Mahjong_ThirteenOrphans17() { // No H5
		String[] input = new String[]{"M1", "M9", "T1", "T9", "T1", "T9", "H1", "H2", "H3", "H4", "H4", "H6", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	
	@Test
	public void test_Mahjong_ThirteenOrphans18() { // No H6
		String[] input = new String[]{"M1", "M9", "T1", "T9", "T1", "T9", "H1", "H2", "H3", "H5", "H4", "H7", "H7", "H7"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
	
	@Test
	public void test_Mahjong_ThirteenOrphans19() { // No H7
		String[] input = new String[]{"M1", "M9", "T1", "T9", "T1", "T9", "H1", "H2", "H3", "H5", "H4", "H6", "H6", "H6"};
		assertEquals(MJUtil.isThirteenOrphans(input), false);
	}
}