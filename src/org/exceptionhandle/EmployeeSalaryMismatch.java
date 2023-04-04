package org.exceptionhandle;

public class EmployeeSalaryMismatch extends Exception {
	
	@Override
	public String getMessage() {
		
		String msg="Employee not my team";
		return msg;
		
	}

	
	
	
}
