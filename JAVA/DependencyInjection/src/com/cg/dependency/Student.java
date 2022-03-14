package com.cg.dependency;

public class Student {

	private int id;
	private String studentName;

	//  Setter injection
	//	public void setId(int id) {
	//		this.id = id;
	//	}
	//	public void setStudentName(String studentName) {
	//		this.studentName = studentName;
	//	}


	//Constructor injection


	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public Student(int id) {
		this.id = id;
	}

	public void displayStudentInfo() {
		System.out.println("Student name is :"+studentName+" and the id is:"+ id);
	}
}
