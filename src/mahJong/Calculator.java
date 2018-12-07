package mahJong;

public class Calculator {
	
	private String[] input;
	private int status;
	private boolean isChecked;
	private boolean isTracked;
	
	public Calculator(String[] input)
	{
		this.input = input;
	}
	public void checkValid()
	{
		if(!isChecked)
		{
			CheckValid checkValid = new CheckValid();
			if(!checkValid.isValidInput(input))
				status = 1;
			else if(MJUtil.isThirteenOrphans(input))
				status = 3;
			else if(!checkValid.isWinHand(input))
				status = 2;
			isChecked = true;
		}
	}
	public void startTracking()
	{
		if(!isTracked)
		{
			Win win = new MakeWin(input).getWin();
			WinTracker wintracker = WinTracker.getInstance();
			wintracker.createPointsAccumulator();
			wintracker.setWin(win.getWin());
			wintracker.startTracking();
			isTracked = true;
		}
	}
	public int getWinPoint()
	{
		checkValid();
		switch(status)
		{
			case 1:return -1;
			case 2:return -2;
			case 3:return 13;
			default:return getPoint();
		}
	}
	
	public int getPoint()
	{
		startTracking();
		return WinTracker.getPointsAccumulator().getPoint();
	}
	
	public String getWinName()
	{
		checkValid();
		switch(status)
		{
			case 1:return "InValid Input";
			case 2:return "Input could not form a legal hand";
			case 3:return "Thirteen Orphans";
			default:return getName();
		}
	}
	
	public String getName()
	{
		startTracking();
		return WinTracker.getPointsAccumulator().getName();
	}
}
