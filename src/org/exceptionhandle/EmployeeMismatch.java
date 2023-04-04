package org.exceptionhandle;

public class EmployeeMismatch {
	
	public static void main(String[] args) throws EmployeeSalaryMismatch {
		
		String s="2167";
		
		if (s.startsWith("28")) {
			
			System.out.println("My team");	
			
		} else {
			
			System.out.println("Not my team");
			
			throw   new EmployeeSalaryMismatch();
		}
		
		System.out.println("Salary is credited");
	}

}
