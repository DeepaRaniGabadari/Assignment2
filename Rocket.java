package Com.Cogent.Assignment2;
import java.util.*;
public class Rocket 
{
	public static void main(String[] args) 
	{
	System.out.println("Enetr The Time in Seconds:");
	Scanner sc=new Scanner(System.in);
	double time=sc.nextDouble();
	double acc;
	double g=9.8;
	acc=g;
	double vel=acc*time;
	double h=(vel*time)/2;
	System.out.println("The Height is:"+(h/1000));
	}


}
