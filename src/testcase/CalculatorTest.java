package testcase;

import mahJong.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	
	@Test
	 public void test_Mahjong_Invalid0() { // Invalid Input Test Case(mahJong.length != 14 )
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1", "T1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
    }
	
	 @Test
	 public void test_Mahjong_Invalid1() { // Invalid Input Test Case(mahJong.length != 14)
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	
	 @Test
	 public void test_Mahjong_Invalid2() { // Invalid Input Test Case(!isValidTile A notT/S/M/H)
		 String[] input = new String[] {"A5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid3() { // Invalid Input Test Case(!sameMahJongLessThanFour)
		 String[] input = new String[] {"H5", "H5", "H5", "H5", "H5", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid4() { //Invalid Input Test Case(!isValidEyes) 
		 String[] input = new String[] {"T1", "T1", "T1", "H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid5() { //Invalid Input Test Case (tile.charAt(0) == 'M' $$ !rank >= 1)
		 String[] input = new String[] {"M0", "M0", "M0", "H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid6() { //Invalid Input Test Case (tile.charAt(0) == 'M' $$ !rank <= 9) 
		 String[] input = new String[] {"M10", "M10", "M10", "H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid7() { //Invalid Input Test Case (Missed character)
		 String[] input = new String[] {"H", "H8", "H8", "H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid8() { //Invalid Input Test Case (tile.charAt(0) == 'H' $$ !rank >= 1)
		 String[] input = new String[] {"H0", "H0", "H0", "H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid9() { //Invalid Input Test Case (tile.charAt(0) == 'H' $$ !rank <= 7)
		 String[] input = new String[] {"H8", "H8", "H8", "H0", "H0", "H0", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid10() { //Invalid Input Test Case(invalid character) 
		 String[] input = new String[] {"H8", "H8", "H8", "H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid11() { //Invalid Input Test Case(!isValidMeld) 
		 String[] input = new String[] {"M1", "M1", "M2", "H2", "H2", "H2", "H4", "H4", "H4", "S7", "S8", "S9", "H3", "H3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid12() { //Invalid Input Test Case(!isValidMeld) 
		 String[] input = new String[] {"H1", "H2", "H2", "H6", "H6", "H6", "H4", "H4", "H4", "S7", "S8", "S9", "H3", "H3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid13() { //Invalid Input Test Case(!isValidMeld) 
		 String[] input = new String[] {"H2", "H2", "H2", "H6", "H6", "H6", "H4", "H4", "H4", "S7", "S7", "S9", "H3", "H3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid14() { //Invalid Input Test Case(!isValidMeld) 
		 String[] input = new String[] {"H2", "H2", "H2", "H6", "H6", "H6", "H4", "H4", "H3", "S7", "S7", "S9", "H3", "H3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_Invalid15() { //Invalid Input Test Case(!isValidMeld) 
		 String[] input = new String[] {"H2", "H2", "H2", "H6", "H1", "H6", "H4", "H4", "H3", "S7", "S7", "S9", "H3", "H3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_ChickenHand1() { //ChickenHand(Unit Testing)
		 String[] input = new String[] {"H1", "H1", "H1", "T3", "T4", "T5", "M1", "M2", "M3", "H2", "H2", "H2", "S1", "S1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(0, point);
		 String name = calculator.getWinName();
		 assertEquals("Chicken Hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllHonorSuit1() { //AllHonorSuit(Unit Testing)
		 String[] input = new String[] {"H1", "H1", "H1", "H3", "H3", "H3", "H4", "H4", "H4", "H5", "H5", "H5", "H6", "H6"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 System.out.println("XXXX:"+name);
		 assertEquals("All Honor Tiles", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllOneSuit1() { //AllOneSuit(Unit Testing)
		 String[] input = new String[] {"M1", "M2", "M3", "M2", "M3", "M4", "M5", "M6", "M7", "M9", "M9", "M9", "M4", "M4"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(7, point);
		 String name = calculator.getWinName();
		 assertEquals("All One Suit", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllOneSuit2() { //AllOneSuit+Common Hand(Integration Testing)
		 String[] input = new String[] {"T1", "T2", "T3", "T2", "T3", "T4", "T5", "T6", "T7", "T7", "T8", "T9", "T4", "T4"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(8, point);
		 String name = calculator.getWinName();
		 assertEquals("All One Suit Common Hand", name);
     }
	 @Test
	 public void test_Mahjong_AllOneSuit3() { //AllOneSuit+AllinTriplets(Integration Testing)
		 String[] input = new String[] {"S1", "S1", "S1", "S2", "S2", "S2", "S3", "S3", "S3", "S4", "S4", "S4", "S5", "S5"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(10, point);
		 String name = calculator.getWinName();
		 assertEquals("All One Suit All in Triplet", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllOrphans1() { //AllOrphans(Unit Testing)
		 String[] input = new String[] {"T1", "T1", "T1", "T9", "T9", "T9", "S1", "S1", "S1", "S9", "S9", "S9", "M1", "M1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("All Orphans", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllTriplets1() { //AllTriplets(Unit Testing)
		 String[] input = new String[] {"M8", "M8", "M8", "T2", "T2", "T2", "S4", "S4", "S4", "T7", "T7", "T7", "H3", "H3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(3, point);
		 String name = calculator.getWinName();
		 assertEquals("All in Triplet", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllTriplets2() { //AllTriplets+Contain One Dragon(Integration Testing)
		 String[] input = new String[] {"H5", "H5", "H5", "T2", "T2", "T2", "S4", "S4", "S4", "T7", "T7", "T7", "H3", "H3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(4, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain One Dragon All in Triplet", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllTriplets3() { //AllTriplets+Contain Two Dragon(Integration Testing)
		 String[] input = new String[] {"H5", "H5", "H5", "H6", "H6", "H6", "S4", "S4", "S4", "T7", "T7", "T7", "H3", "H3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(5, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain Two Dragon All in Triplet", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllTriplets4() { //AllTriplets+Contain Mix Orphans(Integration Testing)
		 String[] input = new String[] {"T1", "T1", "T1", "S1", "S1", "S1", "M9", "M9", "M9", "H1", "H1", "H1", "H5", "H5"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(4, point);
		 String name = calculator.getWinName();
		 assertEquals("All in Triplet Mix Orphans", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllTriplets5() { //AllTriplets+Contain Mix Orphans+Contain One Dragon(Integration Testing)
		 String[] input = new String[] {"T1", "T1", "T1", "H6", "H6", "H6", "M9", "M9", "M9", "H1", "H1", "H1", "H5", "H5"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(5, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain One Dragon All in Triplet Mix Orphans", name);
     }
	 
	 @Test
	 public void test_Mahjong_AllTriplets6() { //AllTriplets+Contain Mix Orphans+Contain Two Dragon(Integration Testing)
		 String[] input = new String[] {"T1", "T1", "T1", "H6", "H6", "H6", "M9", "M9", "M9", "H7", "H7", "H7", "S1", "S1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(6, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain Two Dragon All in Triplet Mix Orphans", name);
     }
	 
	 @Test
	 public void test_Mahjong_BigDragon1() { //BigDragon(Unit Testing)
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(8, point);
		 String name = calculator.getWinName();
		 assertEquals("Big Dragon", name);
     }
	 
	 @Test
	 public void test_Mahjong_BigDragon2() { //BigDragon+Mix One Suit(Integration Testing)
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "M5", "M5"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(11, point);
		 String name = calculator.getWinName();
		 assertEquals("Big Dragon Mix One Suit", name);
     }
	 
	 @Test
	 public void test_Mahjong_BigDragon3() { //BigDragon+Mix One Suit+All in Triplet(Integration Testing)
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M1", "M1", "H6", "H6", "H6", "H7", "H7", "H7", "M5", "M5"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("Big Dragon Mix One Suit All in Triplet", name);
     }
	 
	 @Test
	 public void test_Mahjong_CommonHand1() { //Common Hand(Unit Testing)
		 String[] input = new String[] {"M1", "M2", "M3", "M1", "M2", "M3", "T1", "T2", "T3", "S4", "S5", "S6", "T1", "T1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(1, point);
		 String name = calculator.getWinName();
		 assertEquals("Common Hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_ContainOneDragon1() { //Contain One Dragon(Unit Testing)
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "T1", "T2", "T3", "S4", "S5", "S6", "T1", "T1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(1, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain One Dragon", name);
     }
	 
	 @Test
	 public void test_Mahjong_ContainTwoDragon1() { //Contain Two Dragon(Unit Testing)
		 String[] input = new String[] {"H5", "H5", "H5", "H6", "H6", "H6", "T1", "T2", "T3", "S4", "S5", "S6", "T1", "T1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(2, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain Two Dragon", name);
     }
	 
	 @Test
	 public void test_Mahjong_ContainGreatWinds1() { //Contain Great Winds(Unit Testing)
		 String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "H4", "H4", "H4", "H3", "H3", "H3", "T8", "T8"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("Great Winds", name);
     }
	 
	 @Test
	 public void test_Mahjong_NotContainGreatWinds1() { //Contain Great Winds(Unit Testing)
		 String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "H4", "H4", "H4", "H5", "H5", "H5", "T8", "T8"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(7, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain One Dragon Mix One Suit All in Triplet", name);
     }
	 
	 @Test
	 public void test_Mahjong_MixOneSuit1() { //Mix One Suit(Unit Testing)
		 String[] input = new String[] {"T1", "T2", "T3", "T2", "T3", "T4", "T5", "T6", "T7", "H1", "H1", "H1", "T4", "T4"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(3, point);
		 String name = calculator.getWinName();
		 assertEquals("Mix One Suit", name);
     }
	 
	 @Test
	 public void test_Mahjong_MixOneSuit2() { //Mix One Suit+Contain One Dragon(Integration Testing)
		 String[] input = new String[] {"T1", "T2", "T3", "H5", "H5", "H5", "T5", "T6", "T7", "H1", "H1", "H1", "T4", "T4"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(4, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain One Dragon Mix One Suit", name);
     }
	 
	 @Test
	 public void test_Mahjong_MixOneSuit3() { //Mix One Suit+Contain Two Dragon(Integration Testing)
		 String[] input = new String[] {"T1", "T2", "T3", "H6", "H6", "H6", "T5", "T6", "T7", "H7", "H7", "H7", "T4", "T4"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(5, point);
		 String name = calculator.getWinName();
		 assertEquals("Contain Two Dragon Mix One Suit", name);
     }
	 
	 @Test
	 public void test_Mahjong_MixOneSuit4() { //Mix One Suit+Common Hand(Integration Testing)
		 String[] input = new String[] {"T1", "T2", "T3", "T4", "T5", "T6", "T5", "T6", "T7", "T2", "T3", "T4", "H1", "H1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(4, point);
		 String name = calculator.getWinName();
		 assertEquals("Mix One Suit Common Hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_NotMixOneSuit1() { 
		 String[] input = new String[] {"T1", "T1", "T1", "T4", "T5", "T6", "T5", "T6", "T7", "T2", "T3", "T4", "M1", "M1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(0, point);
		 String name = calculator.getWinName();
		 assertEquals("Chicken Hand", name);
     }
	 
	 @Test
	 public void test_Mahjong_SmallDragon1() { //Small Dragon
		 String[] input = new String[] {"H5", "H5", "H5", "H7", "H7", "H7", "S6", "S7", "S8", "M5", "M5", "M5", "H6", "H6"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(5, point);
		 String name = calculator.getWinName();
		 assertEquals("Small Dragon", name);
     }
	 
	 @Test
	 public void test_Mahjong_SmallWind1() { //Contain Small Wind
		 String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "H4", "H4", "H4", "S7", "S8", "S9", "H3", "H3"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("Small Winds", name);
     }
	
	 @Test
	 public void test_Mahjong_SmallWind2() { //Contain Small Wind
		 String[] input = new String[] {"H1", "H1", "H1", "H3", "H3", "H3", "H4", "H4", "H4", "T5", "T6", "T7", "H2", "H2"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("Small Winds", name);
     }
	 
	 @Test
	 public void test_Mahjong_NotSmallWind1() { //Contain Small Wind
		 String[] input = new String[] {"H1", "H1", "H1", "H3", "H3", "H3", "H4", "H4", "H4", "T5", "T6", "T7", "T2", "T2"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(3, point);
		 String name = calculator.getWinName();
		 assertEquals("Mix One Suit", name);
     }
	 
	 @Test
	 public void test_Mahjong_NotSmallWind2() { //Contain Small Wind
		 String[] input = new String[] {"H1", "H1", "H1", "H3", "H3", "H3", "H4", "H4", "H4", "T5", "T6", "T7", "H6", "H6"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(3, point);
		 String name = calculator.getWinName();
		 assertEquals("Mix One Suit", name);
     }
	 
	 @Test
	 public void test_Mahjong_ThirteenOrphans1() {  // suit same, rank different
		 String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H6", "H7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
		 //assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 
	 @Test
	 public void test_Mahjong_ThirteenOrphans2() { //suit different, rank same
		 String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "M7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
		 //assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 
	 @Test
	 public void test_Mahjong_ThirteenOrphans3() { // suit different, rank different
		 String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "M6"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
		 //assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 
	 @Test
	 public void test_Mahjong_ThirteenOrphans4() { // suit same, rank same
		 String[] input = new String[]{"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("Thirteen Orphans", name);
		 //assertEquals(true, MJUtil.isThirteenOrphans(input));
	 }
	 
	 @Test
	 public void test_Mahjong_ThirteenOrphans5() { // no S1
		 String[] input = new String[]{"M1", "S9", "T1", "T9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
		 //assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 
	 @Test
	 public void test_Mahjong_ThirteenOrphans6() { // no S9
		 String[] input = new String[]{"S1", "M9", "T1", "T9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
		 //assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 
	 @Test
	 public void test_Mahjong_ThirteenOrphans7() {  // no M1
		 String[] input = new String[]{"S1", "S9", "T1", "T9", "S1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
		 //assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void test_Mahjong_ThirteenOrphans8() {  // no M9
		 String[] input = new String[]{"M1", "S9", "T1", "T9", "M1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
		 //assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void test_Mahjong_ThirteenOrphans9() { // no T1
		 String[] input = new String[]{"M1", "S9", "M1", "T9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
		 //assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void test_Mahjong_ThirteenOrphans10() {  // no T9
		 String[] input = new String[]{"M1", "S9", "T1", "M9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
		 //assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 @Test
	 public void test_Mahjong_ThirteenOrphans11() {  // no S
		 String[] input = new String[]{"A1", "M9", "T1", "M9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-1, point);
		 String name = calculator.getWinName();
		 assertEquals("InValid Input", name);
		 //assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
	 
	 @Test
	 public void test_Mahjong_ThirteenOrphans12() { // No S
		 String[] input = new String[]{"M1", "M9", "T1", "T9", "T1", "T9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(-2, point);
		 String name = calculator.getWinName();
		 assertEquals("Input could not form a legal hand", name);
		 //assertEquals(true, MJUtil.isThirteenOrphans(input));
	 }
	 
	  @Test
	 public void test_Mahjong_NineGateHand1() {  // No. of 1 = 4 : No. of 9 = 3
		 String[] input = new String[]{"M1", "M1", "M1", "M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("Nine Gate Hand", name);
	 }
	 @Test
	 public void test_Mahjong_NineGateHand2() {  // No. of 1 = 3 : No. of 9 = 3
		 String[] input = new String[]{"S1", "S2", "S3", "S4", "S5", "S6", "S6", "S7", "S8", "S9", "S9", "S9", "S1", "S1"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("Nine Gate Hand", name);
	 }
	 @Test
	 public void test_Mahjong_NineGateHand3() {  // No. of 1 = 3 : No. of 9 = 4
		 String[] input = new String[]{"T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T9", "T9", "T9", "T1", "T1"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("Nine Gate Hand", name);
	 }
	 
	 @Test
	 public void test_Mahjong_NotNineGateHand1() {  // No. of 1 = 4 : No. of 9 = 4
		 String[] input = new String[]{"T1", "T1", "T1", "T1", "T2", "T3", "T7", "T8", "T9", "T7", "T8", "T9", "T9", "T9"};
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(7, point);
		 String name = calculator.getWinName();
		 assertEquals("All One Suit", name);
	 }
	 
	 @Test
	 public void test_Mahjong_ContainGreatWinds0() { //Contain Great Winds(Unit Testing)
		 String[] input = new String[] {"H1", "H1", "H1", "H2", "H2", "H2", "H4", "H4", "H4", "H3", "H3", "H3", "H5", "H5"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("All Honor Tiles Great Winds", name);
     }
	 
	 @Test
	 public void test_Mahjong_ContainGreatWinds00() { //Contain Small Winds(Unit Testing)
		 String[] input = new String[] {"H2", "H2", "H2", "H3", "H3", "H3", "H4", "H4", "H4", "H6", "H6", "H6", "H1", "H1"}; 
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(13, point);
		 String name = calculator.getWinName();
		 assertEquals("All Honor Tiles Small Winds", name);
     }
}
