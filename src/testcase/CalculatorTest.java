package testcase;

import mahJong.Calculator;
import mahJong.PointsAccumulator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	
	 @Test
    public void test1() {
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(8, point);
    }
	 
	 @Test
	 public void test2() {
		 String[] input = new String[] {"M1", "M2", "M3", "M1", "M2", "M3", "T1", "T2", "T3", "S4", "S5", "S6", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 int point = calculator.getWinPoint();
		 assertEquals(1, point);
    }
	 
	 @Test
	 public void test3() {
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 String name = calculator.getWinName();
		 assertEquals("Big Dragon ", name);
	 }
	 
	 @Test
	 public void test4() {
		 String[] input = new String[] {"H5", "H5", "H5", "M1", "M1", "M1", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
		 Calculator calculator = new Calculator(input);
		 String name = calculator.getWinName();
		 assertEquals("Big Dragon All Triplet Mix Orphans ", name);
	 }
	 

}
