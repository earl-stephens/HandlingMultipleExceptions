package application;

import application.exceptions.TemperatureOutOfRangeException;

public class Thermostat {
	public void setTemperature (double temperature) throws TemperatureOutOfRangeException {
		setMachineTemperature(temperature);
		System.out.println("Setting temperature to " + temperature);
	}

	public void setMachineTemperature(double temperature) throws TemperatureOutOfRangeException{
		if(temperature < 0 || temperature > 35) {
			throw new TemperatureOutOfRangeException("Temperature out of range");
		}
	}
}
