package Com.Cogent.Assignment2;

import java.util.Scanner;

public class SumOfSquare {

	public static void main(String[] args) {
		int sum = 0,sum1 = 0,sum2=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		int sq=i*i;
		sum=sum+sq;
		}
		System.out.println("Sum of the Squares: "  +sum);
		
		for(int i=1;i<=n;i++)
		{
		sum1=sum1+i;
		}
		sum2=sum1*sum1;
		System.out.println("Square Of Sum is: " +sum2);
		
		int diff=0;
		if(sum>sum2)
		{
		diff=sum-sum2;
		}
		else
		{
		diff=sum2-sum;
		}
		System.out.println("The Difference of Sum Of Squares and Square of Sum Is: " +diff);
		
		


	}

}
