public class NYStylePizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
	if (item.equals("queijo")) {
		
		pizza = new CheesePizza(ingredientFactory);
		pizza.setName("Pizza de queijo no Estilo de Nova York");
		
	} else if (item.equals("vegetariana")) {
		
		pizza = new VeggiePizza(ingredientFactory);
		pizza.setName("Pizza vegetariana no Estilo de Nova York");
		
	} else if (item.equals("mariscos")) {
		
		pizza = new ClamPizza(ingredientFactory);
		pizza.setName("Pizza de mariscos no Estilo de Nova York");
		
	} else if (item.equals("calabresa")) {
		
		pizza = new PepperoniPizza(ingredientFactory);
		pizza.setName("Pizza de queijo no Estilo de Nova York");
	}
	return pizza;
	}
}
