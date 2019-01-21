package CallButton;

/**
 * Author: Thomas Tavarez
 * Date: 1/12/19
 * Program Name: Tavarez_Seat
 * Purpose: To simulate using a call button to call an attendant  
 */
public class Tavarez_Seat {
	
	// keeps track of the seat light
	private boolean light;
	private String name;
	
	/**
	 * Initialize the class with the seat light off
	 * @param name Name of the person in the seat
	 */
	public Tavarez_Seat(String name) {
		light = false;
		this.name = name;
	}
	 /**
	  * Turns the light on
	  */
	public void turnLightOn() {
		this.light = true;
		System.out.println(this.name + " turned on their light.");
	}
	
	/**
	 *  Sees if the seat light is on
	 * @return A boolean to see if the light is on
	 */
	public boolean isLightOn() {
		return light ? true : false;
	}
	
	/**
	 * Turns the seat light off
	 */
	public void turnLightOff() {
		light = false;
	}
}
