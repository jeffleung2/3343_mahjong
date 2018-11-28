package mahJong;

public class CountContainTwoDragon implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.addPoint(2);
		pointsAccumulator.addName("Contain Two Dragon");
	}

}
