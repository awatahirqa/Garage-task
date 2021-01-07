package com.qa.garage;

public class Car extends Vehicle {
	public int nofwheels;
	public int topspeed;
	
	
	
	

	
	
	public Car(String colour, String enginesize, String transmission, String fuel, int power, int nofwheels,
			int topspeed) {
		super(colour, enginesize, transmission, fuel, power);
		this.nofwheels = nofwheels;
		this.topspeed = topspeed;
		
	}


	
	public void colour(String colour) {
		
		this.colour = colour;
		
	}
	public void enginesize (String enginesize) {
	
	this.enginesize = enginesize;}
	public void transmission (String transmission) {
		this.transmission = transmission;
	}
	public void fuel(String fuel) {
		this.fuel = fuel;
	}
	public void power(int power) {
		this.power = power;
	}

	public int getNofwheels() {
		return nofwheels;
	}


	public void setNofwheels(int nofwheels) {
		this.nofwheels = nofwheels;
	}


	public int getTopspeed() {
		return topspeed;
	}


	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}


	public String getTransmission() {
		return transmission;
	}


	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}


	@Override
	public String toString() {
		return "Car [nofwheels=" + nofwheels + ", topspeed=" + topspeed + ", transmission=" + transmission + ", colour="
				+ colour + ", enginesize=" + enginesize + ", fuel=" + fuel + ", power=" + power + "]";
	}


	

}
