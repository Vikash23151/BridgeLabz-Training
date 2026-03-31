package aero_vigil;

public enum AirlineName {
	SPICEJET(396,200000),VISTARA(615,300000),INDIGO(230,250000),AIRARABIA(130,150000);
	
	private final int maxCapacity;
	private final double maxFuelCapacity;
	
	AirlineName(int maxCapacity, double maxFuelCapacity){
		this.maxCapacity=maxCapacity;
		this.maxFuelCapacity=maxFuelCapacity;
	}
	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	
	public double getMaxFuelCapacity() {
		return maxFuelCapacity;
	}
	
	public boolean isPassengerCapacityValid(int capacity) {
		return capacity>0 && capacity<=maxCapacity;
	}
	
	public boolean isCurrentFuelLevelValid(double capacity) {
		return capacity>=0 && capacity<=maxFuelCapacity;
	}
	
	public static AirlineName from(String input) throws InvalidFlightException {
		if(input==null) {
			throw new InvalidFlightException("The flight name cannot be null");
		}
		try {
			return AirlineName.valueOf(input.trim().toUpperCase());	
		}catch(IllegalArgumentException e) {
			throw new InvalidFlightException("The flight name "+input+" is invalid");
		}
	}
}
