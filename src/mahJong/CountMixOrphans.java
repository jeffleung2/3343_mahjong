package mahJong;

public class CountMixOrphans implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
		pointsAccumulator.addPoint(1);
		pointsAccumulator.addName(" mix orphans");
	}

}
