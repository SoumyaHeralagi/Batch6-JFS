package com.Practice;

public class Ractangle {
	private float length;
	private float width;
	
	public Ractangle() {
		length=1.0f;
		width=1.0f;
	}
	public Ractangle(float length,float width) {
		this.length=length;
		this.width=width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*length+2*width;
		
	}
	public String toString() {
		 return "Ractangle[length=" + length + ",width=" + width + "]";
	}

}
