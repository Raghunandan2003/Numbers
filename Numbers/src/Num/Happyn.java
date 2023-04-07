package Num;
import java.util.Scanner;
public class Happyn {

	public static void main(String[] args) {
		
	
	    int n;
		int r;
		int num=12;
//	      Scanner sc = new Scanner(System.in);
//	       System.out.print("Enter number=");
//	        num= sc.nextInt();

	        while (num > 9)
	        	
	        {
	        	int sum=0;
	            while (num > 0)
	            {
	                r = num % 10;
	                sum = sum + (r * r);
	                num = num / 10;
	            }
	            num = sum;
	          
	        }
	
	        if (num == 1 || num==7)
	        {
	            System.out.println("Happy Number");
	        }
	        else
	        {
	            System.out.println("Not Happy Number");
	        }
	}   
	}

	

	

