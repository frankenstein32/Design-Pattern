package DecoratorPattern;

/**
 * @author RASHID
 *
 * @date Mar 17, 2018
 */

public class SteamedMilk extends CodimentDecorator {

	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
	
		return beverage.Description+" ,Steamed Milk";
	}

	@Override
	public double cost() {
		
		return beverage.cost()+.10;
	}

}
