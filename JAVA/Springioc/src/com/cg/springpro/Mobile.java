package com.cg.springpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		
//		Airtel airtel =new Airtel();
//		airtel.calling();
//		airtel.data();
	
//		Sim sim =new Airtel();
//		sim.calling();
//		sim.data();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config file loaded");
		
//		Airtel air = (Airtel)context.getBean("airtel");
//		air.calling();
//		air.data();
		
//		Vodaphone voda = context.getBean("vodaphone",Vodaphone.class);
//		voda.calling();
//		voda.data();
		
		Sim sim= context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
	}

}
