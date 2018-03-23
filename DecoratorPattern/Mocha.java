package DecoratorPattern;

/**
 * @author RASHID
 *
 * @date Mar 17, 2018
 */

public class Mocha extends CodimentDecorator {

	Beverage beverage;
	
    public Mocha(Beverage beverage) {
		
    	this.beverage = beverage;
		
	}
    
	@Override
	public String getDescription() {
		
		return ( this.beverage.getDescription()+" ,Mocha ");
	}

	@Override
	public double cost() {
		
		return beverage.cost() + .20;
	}

}
