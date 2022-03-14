package com.cg.springpro;

public class Jio implements Sim {
	
//	public Airtel() {
//		System.out.println("airtel constructor is calling");
//	}

	@Override
	public void calling() {
		System.out.println("calling using jio sim");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using jio sim");
		
	}

}
