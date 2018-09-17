package Com.Cogent.Assignment2;

import java.util.Scanner;

public class CalcucateNetPay 
{
	public static void main(String[] args)
	{
		int days,hours,ot,lh;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of working days in a Year: ");
		days=sc.nextInt();
		System.out.println("Enter the no.of working hours in a Day: ");
		hours=sc.nextInt();
		System.out.println("Enter the no.of hours worked on Overtime:  ");
		ot=sc.nextInt();
		System.out.println("Enter the no.of hours taken Leave: ");
		lh=sc.nextInt();
		
		double gross=((days*hours)+ot-lh)*12;
		System.out.println("Gross Pay: " +gross);
		double tax= gross*0.15;
		System.out.println("Tax: " +tax);
		double netpay=gross-tax;
		System.out.println("Net Pay: " +netpay);
	}
}
