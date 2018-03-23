package DecoratorPattern;

/**
 * @author RASHID
 *
 * @date Mar 17, 2018
 */

public class Espresso extends Beverage{

	public Espresso() {
		Description = "Espresso";
	}
	
	@Override
	public double cost() {
		
		return 1.99;
		
	}

	
}
