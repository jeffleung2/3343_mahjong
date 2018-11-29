package mahJong;

public class CountAllTriplet implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.addName("All in Triplet");
		pointsAccumulator.addPoint(3);
	}

}
