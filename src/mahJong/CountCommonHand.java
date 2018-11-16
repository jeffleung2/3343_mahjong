package mahJong;

public class CountCommonHand implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.addPoint(1);
		pointsAccumulator.addName("Common Hand ");
	}

}
