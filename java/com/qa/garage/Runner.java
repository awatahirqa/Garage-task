package com.qa.garage;

public class Runner {

	public static void main(String[] args) {


	
	Car BMW = new Car("Blue","4L","Manual","Petrol",450,4,170);
	Boat Speedboat = new Boat("White","3000cc","Automatic","Petrol",250,90,"3 Blade");
	Motorcycle Kawasaki = new Motorcycle("Black","1000cc","Manual","Petrol",200,2,180);
	
	
	Garage garage = new Garage();
	
	
	garage.addVehicle(BMW);
	garage.addVehicle(Speedboat);
	garage.addVehicle(Kawasaki);
}
}