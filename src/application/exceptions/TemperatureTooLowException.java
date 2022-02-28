package application.exceptions;

public class TemperatureTooLowException extends TemperatureOutOfRangeException {
	//name of exception classes end in Exception
	
	public TemperatureTooLowException(String message) {
		super(message);
	}

}
