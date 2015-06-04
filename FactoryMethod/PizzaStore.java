package FactoryMethod;

/**
 * Now this class is our abstract creator.
 * It defines abstract factory method that the subclasses
 * implement to produce products.
 * @author adriansotosuarez
 *
 */
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		return pizza;
		
	}
	
	// Factory method. It produces products.
	public abstract Pizza createPizza(String type);

}
