// abstract factory design pattern
// this is the interface for factory
// it contain a make Fruit method which make fruit base on strategy
package factory;

import strategy.Strategy;

public interface AbstractFactory {

	public Fruit makeFruit( Strategy strategy );
}
