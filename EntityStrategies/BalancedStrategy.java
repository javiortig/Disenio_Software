package EntityStrategies;

public class BalancedStrategy implements Strategy {
	@Override
	public strategyType getStrategy(boolean debug) {
		if(debug) {
			System.out.println("Now on a BALANCED Strategy");
		}
		return strategyType.BALANCED;
	}
}
