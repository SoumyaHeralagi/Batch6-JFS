package com.cg.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args){

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s = context.getBean("student",Student.class);
		s.displayStudentInfo();

     	Student s1 = context.getBean("dilip",Student.class);
     	s1.displayStudentInfo();
     	
     	Student s2 = context.getBean("student2",Student.class);
     	s2.displayStudentInfo();
		/*
		 * Student pam = context.getBean("stu", Student.class);
		 * pam.displayStudentInfo();
		 */


	}
}
