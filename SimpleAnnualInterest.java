package Com.Cogent.Assignment2;

import java.util.Scanner;

public class SimpleAnnualInterest 
{
public static void main(String[] args) 
{
		double p,t,r;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the principal : ");
        p= sc.nextDouble();
		
        System.out.print("Enter the time : ");
        t= sc.nextDouble();
        
        System.out.print("Enter the rate : ");
        r= sc.nextDouble();
        
        double interest;
		interest=(p*t*r)/12;
		System.out.print("The interest is : "+interest);
	}
        
        

	}


