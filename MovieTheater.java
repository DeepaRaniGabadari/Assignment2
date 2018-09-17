package Com.Cogent.Assignment2;
import java.io.*;
import java.util.Scanner;

public class MovieTheater 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.of Attendees:" );
	int a=sc.nextInt();
	double profit = (5*a)-(a*0.5+20);
	System.out.println("The Income of The Show:" +profit);
	}
	

}
