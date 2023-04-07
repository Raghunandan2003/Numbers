package Num;

import java.util.Scanner;

public class Hapy {
	
	
	 
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter the no..");
	    	int n=sc.nextInt();
	    	 if (n == 1 || n == 7)
	    	 {
	    		 System.out.println("its happy no");
	    	 }
	    	 
	    	 
		        int sum = n;
		        int x = n;
		 
		        while(sum > 9) {
		            sum = 0;
		 
		            while (x > 0) {
		                int d = x%10;
		                sum =sum+ d*d;
		                x=x/10;
		            }
		            if (sum == 1)
		            {
		            	System.out.println("its a happy no");
		            
		            }
		              
		            x = sum;
		        }
		         if(sum == 7)
		        {
		        	System.out.println("its not a happy no");
		        
		    }
	   }
	    
	
}

