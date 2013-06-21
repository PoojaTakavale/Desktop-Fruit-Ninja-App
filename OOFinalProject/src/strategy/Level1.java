package strategy;

// level1 is the first level of this game. 
// it contain 2 member variables
// hasBomb means whether this is bomb in this level
// speed define the speed for the fruit to move
public class Level1 implements Strategy{
	private boolean hasBomb;
	private final int speed = 1;
	
	public Level1(){
		hasBomb = false;
	}
	public boolean isHasBomb() {
		return hasBomb;
	}
	public int getSpeed(){
		return speed;
	}
}
