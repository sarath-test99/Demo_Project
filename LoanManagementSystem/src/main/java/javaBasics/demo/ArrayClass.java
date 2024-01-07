package javaBasics.demo;

public class ArrayClass {
	
	
	public static void main(String args[]) {
		
		
//		String[] myarray = {"Hello", "World", "What" , "Are" , "You", "Doing"};
//		
//		int length  = myarray.length;
//		
//		System.out.println(length);
//		
//		
//		for(int i=0;i<6;i++) {
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
			
		System.out.println(myNumbers[1][1]);
			
			
		//}
		
		
		
	
	}
	
	public static void lengthofarray() {
		
String[] myarray = {"Hello", "World", "What" , "Are" , "You", "Doing"};
		
		int length  = myarray.length;
		
		System.out.println(length);
	}
	
	
	public static void changeArrayvalue() {
		
String[] myarray = {"Hello", "World", "What" , "Are" , "You", "Doing"};
		
//		myarray[3] ="I";
//				
//		myarray[4] = "am";
		
		String changedvalue = myarray[3];
		String changedvalue1 = myarray[4];
		String HelloValue = myarray[0];
		String WorldValue = myarray[1];
		String WhatValue = myarray[2];
		String DoingValue = myarray[5];
		
		System.out.println(HelloValue);
		System.out.println(WorldValue);
		System.out.println(WhatValue);
		System.out.println(changedvalue);
		System.out.println(changedvalue1);
		System.out.println(DoingValue);
	}
	
	
	public static void printarray() {
		
		String Str = "Hello";
		
		String[] myarray = {"Hello", "World"};
		
		int[] myintarray = {1,2,3};
		
		//System.out.println(Str);
		
		String concatvalue = myarray[0].concat(myarray[1]);
		
		System.out.println(concatvalue);
		
//		System.out.println(myarray[1]);
	//	
//		System.out.println(myintarray[2]);

	}
	

}
