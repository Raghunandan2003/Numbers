package Num;

import java.util.Scanner;

public class Ducks {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int n=sc.nextInt();
	
	
	int res=0;
      int count=0;		
	while(n>0)
	{
		
		res=n%10;
		//n=n/10;
		if(res==0) {
		count=count+1;
		}
		n=n/10;
		
	}
	
	if(count>0 && res==0)
	{
		System.out.println("its duck no");
	}
	else
	{
		System.out.println("its not a duck n");
	}
}



}

