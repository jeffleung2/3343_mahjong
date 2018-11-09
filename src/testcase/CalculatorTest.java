package testcase;

import mahJong.Calculator;
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

}
