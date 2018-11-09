package mahJong;

public class CountBigDragon implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
		pointsAccumulator.setPoint(8);
		pointsAccumulator.setName("Big Dragon ");
		
	}
	
	
}
