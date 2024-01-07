package javaBasics.demo;

public class WhileLoop {
	
	
	public static void main(String args[]) {
		
		
		// while (){
		
		// statements
	//}
		

		
		int i = 0;
		do {
		  System.out.println(i);
		  System.out.println("Java");
		  i++;
		}
		while (i < 5);

		
	}
	
	
	
	
	
	public static void whileloop() {
		

		int i = 0;
		
//		int i = 0;
//		while (i < 5) {
//		  //System.out.println(i);
//		  
//			System.out.println("Java");
//		  i++;
//		}
		
		while (true) {
		  //System.out.println(i);
		//	System.out.println("Java");
			
			if(i<5) {
				 i++;
				System.out.println("Code");
			}else {
				
				System.out.println("printed as per loop count" +i);
				break;
			}
			 
		}
	}
	

}
