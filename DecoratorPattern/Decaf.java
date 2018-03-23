package DecoratorPattern;

/**
 * @author RASHID
 *
 * @date Mar 17, 2018
 */

public class Decaf extends Beverage {

	public Decaf() {
		Description = "Decaf";
	}
	@Override
	public double cost() {
		
		return 1.05;
	}

}
