// singleton design pattern for factory
// factory generate fruit base on strategy
package factory;

import java.util.Random;

import strategy.Level2;
import strategy.Level3;
import strategy.Strategy;


public class Factory implements AbstractFactory{

	private static final Factory factory = new Factory();
	
	private Factory(){}
	
	public static Factory getFactory(){
		return factory;
	}
//	return random fruit base on random number
	public Fruit makeFruit( Strategy strategy ){
		Random rand = new Random();
		int random = rand.nextInt(10);
		if (random < 2) {
			return new Apple( strategy.getSpeed() );
		} else if (random < 4) {
			return new Banana( strategy.getSpeed());
		} else if (random < 6) {
			return new Strawberry( strategy.getSpeed());
		} else if (random < 7) {
			return new Pineapple( strategy.getSpeed());
		} else if( (strategy instanceof Level2 || strategy instanceof Level3) && random < 9 ){
			return new Bomb( strategy.getSpeed());
		}
		return new Peach( strategy.getSpeed());
	}
	
}
