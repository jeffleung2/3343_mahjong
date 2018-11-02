package mahJong;

public class Calculator {
	//test
	
	public boolean isPureOneSuit(String mahJong[], char target) {
		return false;
	}
	
	public static void main(String args[]) {
//		String[] input = new String[] {"O1","O2","O3","L1","L2","L3","M3","M3","M3","M1","M1","M1","M2","M2"};
//		String[] input = new String[] {"H1","H2","H3","H1","H2","H3","H4","H4","H4","H5","H5","H5","H6","H6"};
//		String[] input = new String[] {"H2","H2","H2","H1","H1","H1","H4","H4","H4","H5","H5","H5","H6","H6"};
//		String[] input = new String[] {"M1", "M1", "M1", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9", "M2", "M2"}; // Valid 9chain case 2
//		String[] input = new String[] {"M1", "M1", "M1", "M3", "M3", "M3", "M6", "M7", "M8", "M9", "M9", "M9", "M2", "M2"}; // Invalid 9 chain case
//		String[] input = new String[] {"M1", "M1", "M1", "M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9"}; // Valid 9chain case 1
//		String[] input = new String[] {"M1", "M2", "M3", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9", "M1", "M1"}; // Valid 9chain case 3
		String[] input = new String[] {"M1", "M1", "M1", "M2", "M3", "M4", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9"}; // Valid 9chain case 4
//		String[] input = new String[] {"M1", "M1", "M1", "M2", "M3", "M4", "M6", "M7", "M8", "M9", "M9", "M9", "M5", "M5"}; // Valid 9chain case 5


		System.out.println(input.length);
		boolean isValidInput = new CheckValid().isValidInput(input);
		
		if(!isValidInput) {
			System.out.println("InValid Input");
		} else {
//			int point = 0;
			System.out.println("Valid Input");
			Win win = new MakeWin(input).getWin();
			
			System.out.println(win.getWin().get(2).getState());
			System.out.println(win.getWin().get(2).getSuit());
			
			System.out.println(MJUtil.isNineChains(win.getWin()));
			System.out.println(MJUtil.isPureOneSuit(win.getWin()));
			System.out.println(MJUtil.isAllHonorSuit(win.getWin()));
		}
	}
	
}
