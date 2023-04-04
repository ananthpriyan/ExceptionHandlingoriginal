package org.exceptionhandle;

public class PrintStackTraceExample {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);	
		}
		catch (Exception e) {
			
			System.out.println("dont divide number by zero");
			// to print the Exception in the system generated format
			e.printStackTrace();
			//to get the message of the Exception
			String message = e.getMessage();
			System.out.println(message);
		}
		finally {
			System.out.println("Exception is Handled");
		}
		System.out.println(5);
	}
}
