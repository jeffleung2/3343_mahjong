package mahJong;

public class CountGreatWinds implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.setPoint(13);
		pointsAccumulator.addName("Great Winds");
	}

}
