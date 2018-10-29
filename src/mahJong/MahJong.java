package mahJong;

import java.lang.reflect.Array;

public class MahJong {
	
	public boolean isPureOneSuit(String mahJong[], char target) {
		return false;
	}
	
	public static void main(String args[]) {
		boolean isValidInput = new CheckValid().isValidInput(
				new String[] {"O1","O2","O3","L1","L2","L3","M3","M3","M3","M2","M2"});
		
		if(!isValidInput) {
			System.out.println("InValid Input");
		} else {
			int point = 0;
			System.out.println("Hello");
//			if()
		}
	}
	
}
