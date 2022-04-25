package com.cg.model;

import java.util.ArrayList;
import java.util.List;

public class CompoMain {

	public static void main(String[] args) {
		// Creating the Objects of Class room class.   
	     ClassRoom a1 = new ClassRoom("Technical", 601);   
	     ClassRoom a2 = new ClassRoom("Business", 602);   
	     ClassRoom a3 = new ClassRoom("Economics", 603);  
	     
	        // making the list of Class rooms.   
	        List<ClassRoom> act = new ArrayList<ClassRoom>();   
	        act.add(a1);   
	        act.add(a2);   
	        act.add(a3);  
	        
	        // Creating the Object of department class. 
	        Department d = new Department(act); 
	        
	        // making the list of Class rooms in department.   
	        List<ClassRoom> arlist = d.getClassRoomsInDepartment();   
	        for (ClassRoom a : arlist) {   
	            System.out.println(a.subject + " Class room with id " + a.id);   
	        }  
	        

	}

}
