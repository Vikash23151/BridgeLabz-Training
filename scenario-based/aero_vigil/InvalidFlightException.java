package aero_vigil;

public class InvalidFlightException extends Exception {
	private static final long serialVersionUID=1L;
	public InvalidFlightException(String msg) {
		super(msg);
	}
}
