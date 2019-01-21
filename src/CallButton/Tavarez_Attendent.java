package CallButton;

import java.util.List;

/**
 * Author: Thomas Tavarez
 * Date: 1/12/19
 * Program Name: Tavarez_Attendant
 * Purpose: To simulate using a call button to call an attendant  
 */
public class Tavarez_Attendent {

	// The seats the attendant is in charge of
	List<Tavarez_Seat> assignedSeats;
	
	/**
	 * Initializes the attendant with a list of seats to watch
	 * @param seats Lists of seats the attendant is watching
	 */
	public Tavarez_Attendent(List<Tavarez_Seat> seats) {
		this.assignedSeats = seats;
	}
	
	/**
	 * Turns off all of the seat lights the attendant is watching
	 */
	public void turnOffSeatLights() {
		for(Tavarez_Seat s : assignedSeats) {
			s.turnLightOff();
		}
		
		System.out.println("Attendant turned off all lights.");
	}
}
