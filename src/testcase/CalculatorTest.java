package testcase;

import mahJong.Calculator;
import mahJong.PointsAccumulator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	
	 @Test
    	 public void testFan1() { // Big Dragon
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(8, point);
         }
	 
	 @Test
	 public void testName1() {
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 String name = calculator.getWinName();
		 assertEquals("Big Dragon ", name);
	 }
	
	 @Test
	 public void testFan2() { // Common Hand
		 String[] input = new String[] {"M1", "M2", "M3", "M1", "M2", "M3", "T1", "T2", "T3", "S4", "S5", "S6", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(1, point);
         }
	 
	 @Test
	 public void testName2() { 
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M1", "M1", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 String name = calculator.getWinName();
		 assertEquals("Big Dragon All in Triplet Mix Orphans ", name);
	 }
	
	 @Test
	 public void testAllInTriplets() { // All in Triplets
		 String[] input = new String[] {"M8", "M8", "M8", "T2", "T2", "T2", "S4", "S4", "S4", "T7", "T7", "T7", "H3", "H3"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 String name = calculator.getWinName();
		 assertEquals(3, point);
		 assertEquals("All in Triplet ", name);
         }

	 @Test
	 public void testName3() { // All in Triplets
		 String[] input = new String[] {"M8", "M8", "M8", "T2", "T2", "T2", "S4", "S4", "S4", "T7", "T7", "T7", "H3", "H3"}; //
		 Calculator calculator = new Calculator(input);
		 String name = calculator.getWinName();
		 assertEquals("All in Triplet ", name);
         }
	 
	 @Test
	 public void testNineChain() { // All in Triplets
		 String[] input = new String[] {"M1", "M1", "M1", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9", "M2", "M2"}; // Valid 9chain case 2
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 String name = calculator.getWinName();
		 assertEquals(13, point);
		 assertEquals("Nine Gate ", name);
         }
	 

}
