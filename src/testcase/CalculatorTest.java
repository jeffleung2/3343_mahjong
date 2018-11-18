package testcase;

import mahJong.Calculator;
import mahJong.MJUtil;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	
	@Test
	 public void test_Mahjong_Invalid0() { // Invalid Input Test Case(mahJong.length != 14)
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(0, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
    }
	
	 @Test
	 public void test_Mahjong_Invalid1() { // Invalid Input Test Case(mahJong.length != 14)
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(0, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	
	 @Test
	 public void test_Mahjong_Invalid2() { // Invalid Input Test Case(!isValidTile)
		 String[] input = new String[] {"A5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(0, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid3() { // Invalid Input Test Case(!sameMahJongLessThanFour)
		 String[] input = new String[] {"H5", "H5", "H5", "H5", "H5", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(0, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid4() { //Invalid Input Test Case 
		 String[] input = new String[] {"H5", "H5", "H5", "H5", "H5", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(0, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid5() { //Invalid Input Test Case 
		 String[] input = new String[] {"M0", "M0", "M0", "H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(0, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid6() { //Invalid Input Test Case 
		 String[] input = new String[] {"M10", "M10", "M10", "H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(0, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid7() { //Invalid Input Test Case 
		 String[] input = new String[] {"T1", "T1", "T1", "H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T3"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(0, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllHonorSuit1() { //AllHonorSuit
		 String[] input = new String[] {"H1", "H1", "H1", "H3", "H3", "H3", "H4", "H4", "H4", "H5", "H5", "H5", "H6", "H6"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("All Honor Suit ", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllOneSuit1() { //AllOneSuit
		 String[] input = new String[] {"M1", "M2", "M3", "M2", "M3", "M4", "M5", "M6", "M7", "M9", "M9", "M9", "M4", "M4"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(7, point);
		 String name = calculator.getWinName();
		 assertEquals("All One Suit ", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllOneSuit2() { //AllOneSuit
		 String[] input = new String[] {"T1", "T2", "T3", "T2", "T3", "T4", "T5", "T6", "T7", "T7", "T8", "T9", "T4", "T4"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(8, point);
		 String name = calculator.getWinName();
		 assertEquals("All One Suit Common Hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllOrphans1() { //AllOrphans
		 String[] input = new String[] {"T1", "T1", "T1", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("All Orphans ", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllTriplets1() { //AllTriplets
		 String[] input = new String[] {"M8", "M8", "M8", "T2", "T2", "T2", "S4", "S4", "S4", "T7", "T7", "T7", "H3", "H3"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(3, point);
		 String name = calculator.getWinName();
		 assertEquals("chicken handAll in Triplet ", name);
     }
	 
	 @Test
	 public void test_Mahjong_BigDragon1() { //BigDragon
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(8, point);
		 String name = calculator.getWinName();
		 assertEquals("Big Dragon ", name);
     }
	 
	 @Test
	 public void test_Mahjong_CommonHand1() { //Common Hand
		 String[] input = new String[] {"M1", "M2", "M3", "M1", "M2", "M3", "T1", "T2", "T3", "S4", "S5", "S6", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(1, point);
		 String name = calculator.getWinName();
		 assertEquals("chicken handCommon Hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_ContainOneDragon1() { //Contain One Dragon
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "T1", "T2", "T3", "S4", "S5", "S6", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(1, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain One Dragon ", name);
     }
	 
	 @Test
	 public void test_Mahjong_ContainTwoDragon1() { //Contain Two Dragon
		 String[] input = new String[] {"H5", "H5", "H5", "H6", "H6", "H6", "T1", "T2", "T3", "S4", "S5", "S6", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(2, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain Two Dragon ", name);
     }
	 
	 @Test
	 public void test_Mahjong_ContainGreatWinds1() { //Contain Great Winds
		 String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "H4", "H4", "H4", "H3", "H3", "H3", "T8", "T8"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("Great Winds", name);
     }
	 
	 @Test
	 public void test_Mahjong_MixOneSuit1() { //Mix One Suit
		 String[] input = new String[] {"T1", "T2", "T3", "T2", "T3", "T4", "T5", "T6", "T7", "H1", "H1", "H1", "T4", "T4"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(3, point);
		 String name = calculator.getWinName();
		 assertEquals("Mix One Suit ", name);
     }
	 
	 @Test
	 public void test_Mahjong_ContainMixOrphans1() { //Contain Mix Orphans
		 String[] input = new String[] {"T1", "T1", "T1", "S1", "S1", "S1", "M9", "M9", "M9", "H1", "H1", "H1", "H5", "H5"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(4, point);
		 String name = calculator.getWinName();
		 assertEquals("chicken handAll in Triplet Mix Orphans ", name);
     }
	 
	 @Test
<<<<<<< .merge_file_a07976
	 public void testNineChain() { // All in Triplets
		 String[] input = new String[] {"M1", "M1", "M1", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9", "M2", "M2"}; // Valid 9chain case 2
=======
	 public void test_Mahjong_SmallDragon1() { //Small Dragon
		 String[] input = new String[] {"H5", "H5", "H5", "H7", "H7", "H7", "S6", "S7", "S8", "M5", "M5", "M5", "H6", "H6"}; //
>>>>>>> .merge_file_a15244
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(5, point);
		 String name = calculator.getWinName();
		 assertEquals("Small Dragon", name);
     }
	 
	 @Test
	 public void test_Mahjong_SmallWind1() { //Contain Small Wind
		 String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "H4", "H4", "H4", "S7", "S8", "S9", "H3", "H3"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
<<<<<<< .merge_file_a07976
		 assertEquals("Nine Gate ", name);
         }
=======
		 String name = calculator.getWinName();
		 assertEquals("Small Winds", name);
     }
	 
	 @Test
>>>>>>> .merge_file_a15244
	 public void testThirteenOrphans()
	 {
		 // suit same, rank different
		 String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H6", "H7"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void testThirteenOrphans2()
	 {
		 //suit different, rank same
		 String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "M7"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void testThirteenOrphans3()
	 {
		 // suit different, rank different
		 String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "M6"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void testThirteenOrphans4()
	 {
		 // suit same, rank same
		 String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 assertEquals(true, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void testThirteenOrphans5()
	 {
		 // no S1
		 String[] input = new String[]{"M1", "S9", "T1", "T9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 
	 @Test
	 public void testThirteenOrphans6()
	 {
		 // no S9
		 String[] input = new String[]{"S1", "M9", "T1", "T9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void testThirteenOrphans7()
	 {
		 // no M1
		 String[] input = new String[]{"S1", "S9", "T1", "T9", "S1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void testThirteenOrphans8()
	 {
		 // no M9
		 String[] input = new String[]{"M1", "S9", "T1", "T9", "M1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void testThirteenOrphans9()
	 {
		 // no T1
		 String[] input = new String[]{"M1", "S9", "M1", "T9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void testThirteenOrphans10()
	 {
		 // no T9
		 String[] input = new String[]{"M1", "S9", "T1", "M9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void testThirteenOrphans11()
	 {
		 // no S
		 String[] input = new String[]{"A1", "M9", "T1", "M9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
<<<<<<< .merge_file_a07976
=======
	 
>>>>>>> .merge_file_a15244
}
