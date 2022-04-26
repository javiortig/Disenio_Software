package EntityStrategies;

public class PassiveStrategy implements Strategy{
	@Override
	public strategyType getStrategy(boolean debug) {
		if(debug) {
			System.out.println("Now on a PASSIVE Strategy");
		}
		return strategyType.PASSIVE;
	}
}
