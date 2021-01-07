package com.qa.garage;

public class Vehicle {

	public String colour;
	public String enginesize;
	public String transmission;
	public String fuel;
	public int power;

	public Vehicle(String colour, String enginesize, String transmission, String fuel, int power) {
		super();
		this.colour = colour;
		this.enginesize = enginesize;
		this.transmission = transmission;
		this.fuel = fuel;
		this.power = power;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getEnginesize() {
		return enginesize;
	}

	public void setEnginesize(String enginesize) {
		this.enginesize = enginesize;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", enginesize=" + enginesize + ", transmission=" + transmission + ", fuel="
				+ fuel + ", power=" + power + "]";
	}

}
