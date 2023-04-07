package Num;

public class Duck {
	public static void main(String[] args) {
		

		
		int n=8150;
		
		System.out.println(n);
		int res=0;
          int count=0;		
		while(n>0)
		{
			
			res=n%10;
			n=n/10;
			if(res==0)
			count=count+1;
			
		}
		
		if(count>0)
		{
			System.out.println("its duck no");
		}
		else
		{
			System.out.println("its not a duck n");
		}
	}

}
