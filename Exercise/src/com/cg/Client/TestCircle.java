package com.cg.Client;
import com.cg.Model.Circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(2.0,"blue");
		System.out.println("readius is "+c1.getRadius());
		System.out.println("color is "+c1.getColor());
		System.out.println("area is "+c1.getArea());
	}

}
