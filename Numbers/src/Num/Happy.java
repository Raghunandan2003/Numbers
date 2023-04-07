package Num;

import java.util.Scanner;

public class Happy {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
	//	System.out.println("enter the no");
		int su=0;
		while(true)
		{
			int sum=0;
		
		while(n>0)
		{
			
			int res=n%10;
			sum=res*res+sum;
			n=n/10;
		}
	       n=sum;
		
		if(n==1)
		{
			System.out.println("its happy no");
			break;
			
			
		}
		else
		{
			System.out.println("Its not a happy no");
		}
		
		}
	}
}