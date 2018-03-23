package DecoratorPattern;

/**
 * @author RASHID
 *
 * @date Mar 17, 2018
 */

public class DarkRoast extends Beverage{

	public DarkRoast() {
		Description = "DarkRoast";
	}

	@Override
	public double cost() {
		
		return .99;
	}
}
