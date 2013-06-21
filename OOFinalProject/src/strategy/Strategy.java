package strategy;
//strategy is to define various game level 
// getSpeed return the speed that the fruit move
// isHasBomb return whether this strategy has bomb
public interface Strategy {
	public int getSpeed();
	public boolean isHasBomb();
}
