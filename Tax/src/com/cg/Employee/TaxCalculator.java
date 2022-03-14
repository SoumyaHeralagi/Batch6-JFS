package com.cg.Employee;

public class TaxCalculator {
	public String emp_Name;
	public boolean isIndian;
	public String calculateTax(String emp_Name,boolean isIndian,int emp_Sal) {
		if (isIndian == false) throw new Exception ("some error message");
		try{
		    if (isIndian == false)
		        throw new NotIndianException();
		}
		catch (NotIndianException exception)
		{
		    System.out.println(exception + "");        
		}
		
		
		
		if (emp_Name==null)
		{
			return "EmployeeNameInvalidException";
		}
	}

}
