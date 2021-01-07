package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

//	create list here and also method to add to the list 

	List<Vehicle> GarageList = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		GarageList.add(v);
	}

	public void removeVehicle(Vehicle v) {
		GarageList.remove(v);
	}

	public void emptyGarage(Vehicle v) {

		GarageList.removeAll(GarageList); // remove all elements from self

	}

	public void calculatebill() {
		int bill = 0;
		for (Vehicle v : GarageList) {

			if (v instanceof Car) {
				bill = v.getPower() * 1000;

				System.out.println(bill);

			} else if (v instanceof Boat) {
				bill = v.getPower() * 1000;
				System.out.println(bill);
			}

			else
				bill = v.getPower() * 1000;
			System.out.println(bill);
		}

	}

}
