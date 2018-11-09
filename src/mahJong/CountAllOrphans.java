package mahJong;

public class CountAllOrphans implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
		pointsAccumulator.setPoint(13);
		pointsAccumulator.setName("All Orphans");
	}

}
