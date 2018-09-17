package Com.Cogent.Assignment2;

import java.util.Scanner;
public class AreaOfSquare {

	public static void main(String[] args) {
		
        double l, area,p;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Area of Square : ");
        area= sc.nextDouble();
		
        l =Math.sqrt(area);
       
		
        System.out.print("Length of the Square is: " +l);
        
        p = 4*l;
        System.out.print("\nPerimeter of the Square is: " +p);
    }
}

		
