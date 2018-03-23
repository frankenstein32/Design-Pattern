package DecoratorPattern;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author RASHID
 *
 * @date Mar 17, 2018
 */

public class StarBuzzCoffee {

	public static void main(String[] args) {

		Beverage beverage = new Espresso();

		System.out.println("Discription: " + beverage.getDescription() + "\nCost " + beverage.cost());

		Beverage beverage2 = new DarkRoast();

		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);

		System.out.println("Discription " + beverage2.getDescription() + "\nCost " + beverage2.cost());
	}

}
