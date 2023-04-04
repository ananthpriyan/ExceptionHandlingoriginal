package org.exceptionhandle;

public class NestedTry {
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		String s=null;
		try {     //outer try
			System.out.println(4/4);
			
			try {    //innertry
				
				char charAt = s.charAt(0);
			} catch (NullPointerException e) {  //inner catch
				
				System.out.println("Dont try fetch value from null String");
				
			}
			finally {  //inner finally
				
				System.out.println("inner finally : Exception is handled");
			}
		} 
		catch (Exception e) {      //outer try
			System.out.println("dont try to get value from null string");
		}
		System.out.println(7);
	}
	
	

}
