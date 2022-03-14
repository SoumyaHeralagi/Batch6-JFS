package com.cg.junittesting;

public class MainAccount {

	public static void main(String[] args) {
		Account a1 =new Account("1001","Soumya");
		Account a2 =new Account("1002","Sahana",10000);
		System.out.println(a1);
		System.out.println(a2);
		
		//int balanace =a1.credit(300000);
		//balance=a1.debit()

	}

}
