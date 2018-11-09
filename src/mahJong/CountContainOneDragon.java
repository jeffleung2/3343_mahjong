package mahJong;

public class CountContainOneDragon implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
		pointsAccumulator.setPoint(1);
		pointsAccumulator.setName("Contain One Dragon ");
		
	}

}
