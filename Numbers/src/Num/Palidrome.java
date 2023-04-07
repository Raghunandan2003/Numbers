package Num;

public class Palidrome {
	public static void main(String[] args) {
		
		boolean flag=false;
		int n=1234;
		int s=n;
		int rem;
		int sum=0;
		
		
		while(n!=0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			flag=true;
			
			
		}
		if(flag==true) {
		System.out.println(sum);
	    	
	    
	    }
		
	}
}



