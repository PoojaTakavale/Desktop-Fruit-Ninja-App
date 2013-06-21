package strategy;

//level1 is the second level of this game. 
//it contain 2 member variables
//hasBomb means whether this is bomb in this level
//speed define the speed for the fruit to move
public class Level2 implements Strategy {
	
	private boolean hasBomb;
	private final int speed = 3;
	
	public Level2(){
		hasBomb = true;
	}
	public boolean isHasBomb() {
		return hasBomb;
	}
	public int getSpeed(){
		return speed;
	}
}
