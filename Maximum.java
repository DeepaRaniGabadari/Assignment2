package Com.Cogent.Assignment2;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		int a,b,c;
		
		  System.out.println("Enter Three Numbers:");
	      Scanner sc = new Scanner(System.in);
	 
	      a = sc.nextInt();
	      b = sc.nextInt();
	      c = sc.nextInt();
	 
	      if ( a >= b && a >= c )
	    	  
	         System.out.println(a+" is maximum number");
	      
	      else if ( b >=a && a >=c )
	    	  
	         System.out.println(b+" is maximum number");
	      
	      else 
	         System.out.println(c+" is maximum number");
	}
}
	      
