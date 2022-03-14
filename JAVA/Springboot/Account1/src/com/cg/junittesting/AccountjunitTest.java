package com.cg.junittesting;

import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AccountjunitTest {
	Account a1=new Account("435","Soumya");
	Account a2=new Account("438","Sahana",10000);
	

	@Test
	public void testGetid() {
		assertTrue(a1.getId().equals("756"));
		
		
	}

}
