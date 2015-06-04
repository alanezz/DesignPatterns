package FactoryMethod;

public class pucPizzaStore extends PizzaStore {
	// This class is a concrete creator.
	
	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new pucCheesePizza();
		}
		else if(type.equals("pepperoni")) {
			pizza = new pucPepperoniPizza();
		}
		return pizza;


	}

}
