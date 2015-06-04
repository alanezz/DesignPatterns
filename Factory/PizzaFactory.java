package Factory;

/**
 * This is the factory where we create pizzas.
 * It should be the only part of our app that refers to
 * concrete pizza classes.
 * @author adriansotosuarez
 *
 */
public class PizzaFactory {
	
	// This method is often declared statically.
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		}
		else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		return pizza;
	}

}
