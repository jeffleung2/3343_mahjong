package mahJong;

public class CountAllHonorTiles implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.setName("All Honor Tiles");
		pointsAccumulator.setPoint(13);
	}

}
