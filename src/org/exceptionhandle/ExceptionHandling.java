package org.exceptionhandle;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		// ExceptionHandling with try and Catch
		try {
			
			System.out.println(3/0);
		} 
		catch (NullPointerException e) {
			
			System.out.println("Dont divide by zero");
		}
		catch(Exception e)
		             {
			System.out.println("dont / by zero");
		}
		finally {
			System.out.println("Exception is Handled");
		}
		System.out.println(4);
	}
}
