package EntityStrategies;

public class DefensiveStrategy implements Strategy {
	@Override
	public strategyType getStrategy(boolean debug) {
		if(debug) {
			System.out.println("Now on a DEFENSIVE Strategy");
		}
		return strategyType.DEFENSIVE;
	}
}
