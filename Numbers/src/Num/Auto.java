package Num;

public class Auto {
	public static void main(String[] args) {
		
		int i=145;
		int n1=i;
		int fact=1;
		int sum=0;
	while(i!=0)
	{ 
		i=i%10;
		fact=fact*i;
		sum=sum+fact;
		
		i=i/10;
	}
		
	System.out.println(sum);
	}
}
