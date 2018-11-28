package mahJong;

public class Calculator {
	
	private String[] input;
	
	private Counter winHand;
	
	public Calculator(String[] input) {
		this.input = input;
	}

	public int getWinPoint() {
		CheckValid checkValid = new CheckValid();
		if(!checkValid.isValidInput(input)) {
			return -1;
		}
		
		if(MJUtil.isThirteenOrphans(input) ){
			return 13;
		}
		
		boolean isWinHand = checkValid.isWinHand(input);
		if(!isWinHand) {
			return -2;
//			System.out.println("Input could not form a legal hand");
		} else {
//			System.out.println("Is a legal Hand Type");
			Win win = new MakeWin(input).getWin();
			
			WinTracker wintracker = WinTracker.getInstance();
			wintracker.createPointsAccumulator();
			wintracker.setWin(win.getWin());
			wintracker.startTracking();
			
//			System.out.println(WinTracker.getPointsAccumulator().getPoint());
			
			return WinTracker.getPointsAccumulator().getPoint();
		}
//		return 0;	
	}
	
	public String getWinName() {
		CheckValid checkValid = new CheckValid();
		if(!checkValid.isValidInput(input)) {
			return "InValid Input";
		}
		if(MJUtil.isThirteenOrphans(input) ){
			return "Thirteen Orphans";
		}
		boolean isWinHand = checkValid.isWinHand(input);
		if(!isWinHand) {
//			System.out.println("Input could not form a legal hand");
			return "Input could not form a legal hand";
		} else {
//			System.out.println("Is a legal Hand Type");
			Win win = new MakeWin(input).getWin();
			
			WinTracker wintracker = WinTracker.getInstance();
			wintracker.createPointsAccumulator();
			wintracker.setWin(win.getWin());
			wintracker.startTracking();
			
//			System.out.println(WinTracker.getPointsAccumulator().getName());
			return WinTracker.getPointsAccumulator().getName();
		}
	}
	//test
//	public static void main(String args[]) {
//		String[] input = new String[] {"O1","O2","O3","L1","L2","L3","M3","M3","M3","M1","M1","M1","M2","M2"};
//		String[] input = new String[] {"H1","H2","H3","H1","H2","H3","H4","H4","H4","H5","H5","H5","H6","H6"};
//		String[] input = new String[] {"H2","H2","H2","H1","H1","H1","H4","H4","H4","H5","H5","H5","H6","H6"};
//		String[] input = new String[] {"M1", "M1", "M1", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9", "M2", "M2"}; // Valid 9chain case 2
//		String[] input = new String[] {"M1", "M1", "M1", "M3", "M3", "M3", "M6", "M7", "M8", "M9", "M9", "M9", "M2", "M2"}; // Invalid 9 chain case
//		String[] input = new String[] {"M1", "M1", "M1", "M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9"}; // Valid 9chain case 1
//		String[] input = new String[] {"M1", "M2", "M3", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9", "M1", "M1"}; // Valid 9chain case 3
//		String[] input = new String[] {"M1", "M1", "M1", "M2", "M3", "M4", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9"}; // Valid 9chain case 4
//		String[] input = new String[] {"M1", "M1", "M1", "M2", "M3", "M4", "M6", "M7", "M8", "M9", "M9", "M9", "M5", "M5"}; // Valid 9chain case 5
//		String[] input = new String[] {"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H7"}; // Valid 9chain case 5
//		String[] input = new String[] {"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"}; // Valid 9chain case 5
//		String[] input = new String[] {"M1", "M1", "M1", "M2", "M3", "M4", "M3", "M3", "M3", "M4", "M4", "M4", "M5", "M5"}; // Valid 9chain case 5
//		String[] input = new String[] {"H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "M4", "M4", "M4", "M5", "M5"}; // Valid 9chain case 5
//		String[] input = new String[] {"T1", "T2", "T3", "T1", "T2", "T3", "T2", "T3", "T4", "T6", "T7", "T8", "T5", "T5"}; // Valid 9chain case 5
//		String[] input = new String[] {"H5", "H5", "H5", "M6", "M6", "M6", "H7", "H7", "H7", "M4", "M4", "M4", "M5", "M5"}; // 癟��疑把��〡純螞衛級﹦�兩��冕純螞衛捍阬�
//		String[] input = new String[] {"H5", "H1", "H2", "H3", "H4", "M6", "H7", "H7", "H7", "M4", "M6", "M4", "M5", "M5"}; // 
//		String[] input = new String[] {"H5", "H5", "H5", "H3", "H3", "H3", "T7", "T7", "T7", "M4", "M4", "M4", "M5", "M5"}; //  疆�級﹦�純螞衛級ˍ￣胼簣 矇�蕭簿聶翻
//		String[] input = new String[] {"M1", "M2", "M3", "M4", "M5", "M6", "M2", "M3", "M4", "M7", "M8", "M9", "H5", "H5"}; // 癟��疑把�￣純螞衛純螞衛荔蕭簞疆�蜆乒�壅胼簣
//		String[] input = new String[] {"H5", "H5", "H5", "M9", "M9", "M9", "H6", "H6", "H6", "H7", "H7", "H7", "M1", "M1"}; //
//		String[] input = new String[] {"H5", "H5", "H5", "M9", "M9", "M9", "H6", "H6", "H6", "H7", "H7", "H7", "M5", "M5"}; //
//		String[] input = new String[] {"H5", "H5", "H5", "M1", "M2", "M3", "H6", "H6", "H6", "H7", "H7", "H7", "T1", "T1"}; //
//		
//		
//		String[] input = new String[] {"M1", "M1", "M1", "M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9"}; // Valid 9chain case 1
//		Calculator calculator = new Calculator(input);
//		int point = calculator.getWinPoint();
//		String name = calculator.getWinName();
//		new CheckValid();
//		if(!CheckValid.isValidInput(input)) {
//			System.exit(1);
//		}
//		if(MJUtil.isThirteenOrphans(input) ){
//			System.out.print(13);
//			System.exit(0);
//		}
//		boolean isWinHand = CheckValid.isWinHand(input);
//		if(!isWinHand) {
//			System.out.println("Input could not form a legal hand");
//		} else {
//			System.out.println("Is a legal Hand Type");
//			Win win = new MakeWin(input).getWin();
//			
//			WinTracker wintracker = WinTracker.getInstance();
//			wintracker.createPointsAccumulator();
//			wintracker.setWin(win.getWin());
//			wintracker.startTracking();
//			WinTracker.getPointsAccumulator().printString();
//		}
//	}
//	
}
