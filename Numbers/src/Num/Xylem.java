package Num;
import java.util.Scanner;
public class Xylem {
	public static void main(String[] args) {
		
		int number=12345;
        int temp = number; 
	    int OuterSum=0; 
	    int InnerSum=0; 
	    
	    while(temp != 0) 
	    {
	        if(temp == number || temp < 10)  
	            
	            OuterSum = OuterSum + temp % 10;  
	        else  
	            InnerSum = InnerSum + temp % 10;
	        temp = temp / 10;  
	    }
	    if(OuterSum==InnerSum)
	    {
	        System.out.println(number+" is a Xylem number");
	    }
	    else
	    {
	        System.out.println(number+" is a Phloem number");
	    }
	    }
	
	}


