package mahJong;

import java.util.ArrayList;

public class CountAllInTriplet implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.addName("All in Triplet ");
		pointsAccumulator.addPoint(3);
	}

}
