package DecoratorPattern;

/**
 * @author RASHID
 *
 * @date Mar 17, 2018
 */

public abstract class Beverage {

	String Description ;
	
	public Beverage() {
		Description = "Unknown Beverage";
	}
	
	public String getDescription() {
		return Description;
	}
	
	public abstract double cost();
}
