package Com.Cogent.Assignment2;

import java.io.*;
import java.util.Scanner;

public class CylinderVolume 
{
	public static void main(String args[])
	{
		double radius,height;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Radius: ");
		radius=sc.nextDouble();
		System.out.println("Enter The Height: ");
		height=sc.nextDouble();
		
		double volume=Math.PI*radius*radius*height;
		System.out.println("Volume Of The Cylinder is: " +volume);
	}
}
