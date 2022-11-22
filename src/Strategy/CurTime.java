//Context class
public class CurTime {
	private TimeStrategy timeStrategy;
	public void choiceStrategy(TimeStrategy strategy) {
		this.timeStrategy = strategy;
	}
	
	public void choice() {
		/*if(timeStrategy ==null) {
			timeStrategy = new Dinner();
		}*/
		timeStrategy.execute();
	}
}
