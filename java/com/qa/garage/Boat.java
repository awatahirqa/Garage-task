package com.qa.garage;

public class Boat extends Vehicle {
	public int topspeed;
	public String propeller;
	
	
	
	public Boat(String colour, String enginesize, String transmission, String fuel, int power, int topspeed,
			String propeller) {
		super(colour, enginesize, transmission, fuel, power);
		this.topspeed = topspeed;
		this.propeller = propeller;
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
	public int getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}

	public String getPropeller() {
		return propeller;
	}

	public void setPropeller(String propeller) {
		this.propeller = propeller;
	}

	@Override
	public String toString() {
		return "Boat [topspeed=" + topspeed + ", propeller=" + propeller + ", colour=" + colour + ", enginesize="
				+ enginesize + ", transmission=" + transmission + ", fuel=" + fuel + ", power=" + power + "]";
	}
	
	
	
}
