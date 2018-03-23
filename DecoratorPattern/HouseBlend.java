package DecoratorPattern;

/**
 * @author RASHID
 *
 * @date Mar 17, 2018
 */

public class HouseBlend extends Beverage{

	public HouseBlend() {
		
		Description = "House Blend";
	}

	@Override
	public double cost() {
		
		return .89;
	}
}
