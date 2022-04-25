package com.cg.work;

public class Passenger {

	private String name;
	private int seatId;

	Passenger(String name, int seatId)
	{
		this.name = name;
		this.seatId = seatId;
	}

	public String getPassengerName()
	{
		return this.name;
	}

	public int getPassengerId()
	{
		return this.seatId;
	}

}
