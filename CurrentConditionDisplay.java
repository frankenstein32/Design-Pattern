package Observer_Pattern;

/**
 * @author RASHID
 *
 * @date Mar 17, 2018
 */

public class CurrentConditionDisplay implements DisplayElement,Observers{

	float temp;
	float humid;
	float pressure;
	 private  Subject WeatherData ;
	 
	  public CurrentConditionDisplay(Subject WeatherData) {
		
		  this.WeatherData = WeatherData;
		  WeatherData.registerObserver(this);
	}
 	@Override
	public void update(float temp, float humid, float pressure) {
		
 		this.temp = temp;
 		this.humid = humid;
 		this.pressure = pressure;
 		
 		display();
		
	}

	@Override
	public void display() {
	
		System.out.println("Current Conditions\n"+"Temp: "+this.temp+" degrees"+"\nHumidity: "+this.humid+"\nPressure: "+this.pressure+" Pascal");
		
	}

	
	
}
