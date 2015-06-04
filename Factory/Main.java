package Factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaStore ps = new PizzaStore(new PizzaFactory());
		ps.orderPizza("cheese");

	}

}
