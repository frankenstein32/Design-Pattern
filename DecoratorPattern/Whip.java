package DecoratorPattern;

/**
 * @author RASHID
 *
 * @date Mar 17, 2018
 */

public class Whip extends CodimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		
		return this.beverage.getDescription()+" ,Whip";
	}

	@Override
	public double cost() {
		
		return beverage.cost()+ .10;
	}

}
