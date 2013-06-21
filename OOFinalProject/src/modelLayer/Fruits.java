package modelLayer;

import java.util.ArrayList;

import factory.Fruit;
// Fruits contain the arraylist of fruits 
// which will show in the view
public class Fruits {
	private ArrayList<Fruit> fruits;
	
	public Fruits(){
		this.fruits = new ArrayList<Fruit>();
	}

	public ArrayList<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(ArrayList<Fruit> fruits) {
		this.fruits = fruits;
	}
}
