package EntityStrategies;

public class AggressiveStrategy implements Strategy {

	@Override
	public strategyType getStrategy(boolean debug) {
		if(debug) {
			System.out.println("Now on a AGGRESSIVE Strategy");
		}
		return strategyType.AGGRESSIVE;
	}
	
}
