package com.Soumya;
import java.lang.Math;
class Main2 {
	
	public  int Add(int a,int b)
	{
		return a+b;
	}
	
	public double squareRoot(int a)
	{
		return Math.sqrt(a);
	}
	
}
public class Main{
	
	public static void main(String[] args) {
		
		Main2 obj = new Main2();
		System.out.println(obj.Add(3, 4));
		System.out.println(obj.squareRoot(4));

	}

}
