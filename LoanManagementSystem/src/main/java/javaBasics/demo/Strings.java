package javaBasics.demo;

public class Strings {
	
	
	public static void main(String args[]) {
		
		Strings obj = new Strings();
		
		obj.length_method();
		
		obj.upper_lower();
		
		obj.indexOfNumber();
		
		obj.stringconcat();
		
		obj.stringnumconcat();
		
		
	}
	
	
	public static void stringnumconcat() {
		String str = "Hello";
		
		String str1 = "100";
		
		
		String str2 = str+ " " +str1;
		
		
		String str3 = str1.concat(" " +str);
		
	//	String str3 = str1.concat(str);
		
	//	System.out.println(str2);
		
		System.out.println(str3);
	}
	
	public static void stringconcat() {
		
		String str = "Hello";
		
		String str1 = "World";
		
		
		String str2 = str+ " " +str1;
		
		
	//	String str3 = str1.concat(" " +str);
		
		String str3 = str1.concat(str);
		
	//	System.out.println(str2);
		
		System.out.println(str3);
	}
	
	
	public static void indexOfNumber() {
		
		String Str = "Hi HEllo How Are you Doing";
		
		int indexvalue = 	Str.indexOf("Are");
		
		System.out.println(indexvalue);
		
		
		
	}
	
	

	
	
	public static void upper_lower() {
		
		String Str = "hello world";
		
		String Uppercase = Str.toUpperCase();
		
		
		String Str1 = "JAVA WORLD";
		
		String LowerCase = Str1.toLowerCase();
		
		
		System.out.println(Uppercase);
		System.out.println(LowerCase);
	}
	
	
	public static void length_method() {
	String str = "Hello JAVA";
		
		int str1 = str.length();
		
		//System.out.println(str.length());
		
		System.out.println(str1);
	}

}
