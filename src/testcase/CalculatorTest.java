package testcase;

import mahJong.Calculator;
import mahJong.MJUtil;
import mahJong.PointsAccumulator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	
//	 @Test
//    	 public void testFan1() { // Big Dragon
//		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
//		 Calculator calculator = new Calculator(input);
//		 int point = calculator.getWinPoint();
//		 assertEquals(8, point);
//         }
//	 
//	 @Test
//	 public void testName1() {
//		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
//		 Calculator calculator = new Calculator(input);
//		 String name = calculator.getWinName();
//		 assertEquals("Big Dragon ", name);
//	 }
//	
//	 @Test
//	 public void testFan2() { // Common Hand
//		 String[] input = new String[] {"M1", "M2", "M3", "M1", "M2", "M3", "T1", "T2", "T3", "S4", "S5", "S6", "T1", "T1"}; //
//		 Calculator calculator = new Calculator(input);
//		 int point = calculator.getWinPoint();
//		 assertEquals(1, point);
//         }
//	 
//	 @Test
//	 public void testName2() { 
//		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M1", "M1", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
//		 Calculator calculator = new Calculator(input);
//		 String name = calculator.getWinName();
//		 assertEquals("Big Dragon All in Triplet Mix Orphans ", name);
//	 }
//	
//	 @Test
//	 public void testFan3() { // All in Triplets
//		 String[] input = new String[] {"M8", "M8", "M8", "T2", "T2", "T2", "S4", "S4", "S4", "T7", "T7", "T7", "H3", "H3"}; //
//		 Calculator calculator = new Calculator(input);
//		 int point = calculator.getWinPoint();
//		 assertEquals(3, point);
//         }

	 @Test
	 public void testName3() { // All in Triplets
		 String[] input = new String[] {"M8", "M8", "M8", "T2", "T2", "T2", "S4", "S4", "S4", "T7", "T7", "T7", "H3", "H3"}; //
		 Calculator calculator = new Calculator(input);
		 String name = calculator.getWinName();
		 assertEquals("All in Triplet ", name);
         }
	 
	 @Test
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
	 public void testThirteenOrphans12()
	 {
		 // no S
		 String[] input = new String[]{"A1", "M9", "T1", "M9", "M1", "M9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"};
		 assertEquals(false, MJUtil.isThirteenOrphans(input));
	 }
}
