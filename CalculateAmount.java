package Com.Cogent.Assignment2;

import java.util.Scanner;

public class CalculateAmount 
{
	static double display(double amt)
	{
		double r=0;
		if(amt<=1000)
			r=0.04;
		
		if(amt>1000 && amt<=5000)
			r=0.045;
		
		if(amt>5000)
			r=0.05;
		
		double interest=r*amt;
		return interest;
	}

	public static void main(String[] args) 
	{
		 
		double amt=Integer.parseInt(args[0]);
		 
		System.out.print("Interest: " +display(amt));

	}

}
