package mahJong;

public class CountAllOrphans implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.setPoint(13);
		pointsAccumulator.setName("All Orphans ");
	}

}
