package mahJong;

public class CountSmallWinds implements Counter{

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.setPoint(13);
		pointsAccumulator.addName("Small Winds");
	}

}
