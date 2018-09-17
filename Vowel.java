package Com.Cogent.Assignment2;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		char c;
		
		  System.out.println("Enter Character:");
	      Scanner sc = new Scanner(System.in);
	 
	      c = sc.next().charAt(0);
	      
	     // if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
	               // || c == 'U') 
           //{
	           // System.out.println(c + " is Vowel");
	        //} 
	                //else {
	            //System.out.println(c + " is Consonant");
	        //}/
	      
	     
	        switch(c)
	        {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	            case 'A':
	            case 'E':
	            case 'I':
	            case 'O':
	            case 'U':
	            {
	                System.out.print("Vowel");
	                break;
	            }
	            default:
	            System.out.print("Consonant");
	        }

	}

}
