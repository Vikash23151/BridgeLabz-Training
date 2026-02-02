package aero_vigil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FlightUtil {
	
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		String regex="^FL-[1-9][0-9]{3}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(flightNumber);
		if(matcher.matches()) {
			return true;
		}
		throw new InvalidFlightException("The flight number "+flightNumber+" is invalid.");
	}
	
	public boolean validateFlightName(String flightName) throws InvalidFlightException{
		AirlineName.from(flightName);
		return true;	
	}
	
	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
		AirlineName airlineName=AirlineName.from(flightName);
		if(!airlineName.isPassengerCapacityValid(passengerCount)) {
			throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);
		}
		return true;
	}
	
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
		AirlineName airlineName=AirlineName.from(flightName);
		if(!airlineName.isCurrentFuelLevelValid(currentFuelLevel)) {
			throw new InvalidFlightException("Invalid fuel level for "+flightName);
		}
		return airlineName.getMaxFuelCapacity()-currentFuelLevel;
	}
	
	
}
