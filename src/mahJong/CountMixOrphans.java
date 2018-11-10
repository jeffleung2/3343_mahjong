package mahJong;

public class CountMixOrphans implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.addPoint(1);
		pointsAccumulator.addName("Mix Orphans ");
	}

}
