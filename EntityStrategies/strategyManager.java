package EntityStrategies;

public class strategyManager {
	Strategy strategy;
	boolean debug;
	
	public strategyManager(Strategy strategy, boolean debug){
	      this.strategy = strategy;
	      this.debug = debug;
	}
	
	public strategyType getStrategy() {
		return strategy.getStrategy(debug);
	}
}
