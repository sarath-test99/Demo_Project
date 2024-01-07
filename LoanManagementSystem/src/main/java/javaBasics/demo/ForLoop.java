package javaBasics.demo;

public class ForLoop {
	
	
	public static void main(String args[]) {
        int [] arr = new int [] {1, 2, 3, 4, 5,6,7,8};  

		 for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }  
		

	}
	
	public static void outerinnerloops() {
		
for (int i = 0; i < 2; i++) {
			
			System.out.println("outer loop " +i);
			
			System.out.println("java");
			
			
			for (int j = 0; j < 2; j++) {
				
				System.out.println("inner loop " +j);
				
				System.out.println("code");
			}
			
			
		}
	}
	
	
	public static void forloop1() {
		
		for (int i = 0; i < 5; i++) {
			 
			String username = "Quality";
			String Password = "Thought";
			
			
			if(username != "Quality" && Password != "Thought") {
				
				System.out.println("Username is correct");
				
				System.out.println("Password is correct");
			}
			
			else {
				
				System.out.println("Username is not correct");
				
				System.out.println("Password is not correct");
				
			}
			
			  
			  
			}
		
	}
	
	
	public static void forloop() {
		for (int i = 0; i < 5; i++) {
			 
			  
			//  int num = 0;
			  if(i<2) {
				  
				  System.out.println(i);
			  }else {
				  System.out.println("Java");
				  
			  }
			  
			  
			}
		
	}

}
