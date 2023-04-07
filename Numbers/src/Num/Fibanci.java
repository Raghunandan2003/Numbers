package Num;

public class Fibanci {
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		int n=5;
		
		for (int i = 1; i <=n ; i++) {
			
			if(i==n)
			{
			System.out.println(a);	
			}
			c=a+b;
			a=b;
			b=c;
			
		}
		
	}

}
