package CallButton;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Thomas Tavarez
 * Date: 1/12/19
 * Program Name: Tavarez_Plane
 * Purpose: To simulate using a call button to call an attendant  
 */
public class Tavarez_Plane {

	/**
	 * Main entry point
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Lists of seats on the plane
		Tavarez_Seat seat1 = new Tavarez_Seat("Bob");
		Tavarez_Seat seat2 = new Tavarez_Seat("Karen");
		Tavarez_Seat seat3 = new Tavarez_Seat("Michael");
		Tavarez_Seat seat4 = new Tavarez_Seat("Joanne");
		Tavarez_Seat seat5 = new Tavarez_Seat("Dave");
		
		// Create our attendant with the list of seats
		List<Tavarez_Seat> seats = Arrays.asList(seat1, seat2, seat3, seat4, seat5);
		Tavarez_Attendent flightAttendant = new Tavarez_Attendent(seats);
		
		// Simulate people turning on lights and attendant turning off the lights
		seat1.turnLightOn();
		flightAttendant.turnOffSeatLights();
		
		seat2.turnLightOn();
		seat4.turnLightOn();
		flightAttendant.turnOffSeatLights();
	}
}
