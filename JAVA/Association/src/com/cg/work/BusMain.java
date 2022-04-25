package com.cg.work;

public class BusMain {

	public static void main(String[] args) {
		Bus bus = new Bus("Shree Travels");
		Passenger psg = new Passenger("Sneha", 52);
		System.out.println(psg.getPassengerName() + " with seat number " + psg.getPassengerId()
		+ " is a passenger of " + bus.getBusName());

	}

}
