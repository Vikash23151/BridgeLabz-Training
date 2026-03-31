package aero_vigil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input in this format <FlightNumber>:<FlightName>:"
				            +"<PassengerCount>:<CurrentFuelLevel>");
		String[] details=sc.nextLine().trim().split(":");
		FlightUtil util=new FlightUtil();
		try {
			util.validateFlightNumber(details[0]);
			util.validateFlightName(details[1]);
			util.validatePassengerCount(Integer.parseInt(details[2]), details[1]);
			double fuelToFill = util.calculateFuelToFillTank(details[1], Double.parseDouble(details[3]));
			System.out.println("Fuel required to fill the tank: "+fuelToFill+" litres");
		}catch(InvalidFlightException e) {
			System.out.println(e.getMessage());
		}
	}

}
