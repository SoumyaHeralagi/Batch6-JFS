package com.cg.model;

import java.util.List;

public class Department {
	
	private String name;
    //list of activity rooms in a department.   
    private List<ClassRoom> ar; 
    
    Department(List<ClassRoom> ar)  
    {  
        this.ar = ar;  
    }   
    
    // Getting total number of colleges  
    public List<ClassRoom> getClassRoomsInDepartment()   
    {   
        return ar;   
    }   

}
