package Factory;

/**
 * This is the client of the factory.
 * It goes to PizzaFactory to get instances of Pizza.
 * @author adriansotosuarez
 *
 */
public class PizzaStore {
	
	PizzaFactory factory;
	
	public PizzaStore(PizzaFactory myFactory) {
		
		this.factory = myFactory;
		
	}
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		pizza = factory.createPizza(type);
		pizza.prepare();
		return pizza;
		
	}

}
