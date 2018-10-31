package mahJong;

import java.lang.reflect.Array;

public class Calculator {
	//test
	
	public boolean isPureOneSuit(String mahJong[], char target) {
		return false;
	}
	
	public static void main(String args[]) {
//		String[] input = new String[] {"O1","O2","O3","L1","L2","L3","M3","M3","M3","M1","M1","M1","M2","M2"};
//		String[] input = new String[] {"H1","H2","H3","H1","H2","H3","H4","H4","H4","H5","H5","H5","H6","H6"};
		String[] input = new String[] {"H2","H2","H2","H1","H1","H1","H4","H4","H4","H5","H5","H5","H6","H6"};
		
		boolean isValidInput = new CheckValid().isValidInput(input);
		
		if(!isValidInput) {
			System.out.println("InValid Input");
		} else {
//			int point = 0;
			System.out.println("Hello");
			Win win = new MakeWin(input).getWin();
			
			System.out.println(win.win.get(2).getState());
			System.out.println(win.win.get(2).getSuit());
			
			System.out.println(MJUtil.isPureOneSuit(win.getWin()));
			System.out.println(MJUtil.isAllHonorSuit(win.getWin()));
		}
	}
	
}
