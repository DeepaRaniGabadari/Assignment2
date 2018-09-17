package Com.Cogent.Assignment2;
import java.util.*;

public class CreditCard 
{
	public static void main(String [] arg)
	    {
	        Scanner sc = new Scanner(System.in);
	        double gross,tax;
	        
	        System.out.println("Enter The Amount:");
	        gross=sc.nextDouble();
	        
	        if(gross<=240)
	            tax=(gross/100)*0.0;
	        
	        else if(241>=480)
	            tax=(gross/100)*15.0;
	        
	        else
	            tax=(gross/100)*28.0;
	            
	        System.out.println("Tax Owed is = "+tax);
	    }

}
