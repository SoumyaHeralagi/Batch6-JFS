package com.cg.demo;

public class PersonMain {

	public static void main(String[] args) {
		Student s1 = new Student("Soumya", "Bangalore");
		s1.addCourseGrade("Java", 97);
		s1.addCourseGrade("python", 68);
		s1.printGrades();
		System.out.println("Average is " + s1.getAverageGrade());

	}

}
