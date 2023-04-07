package Num;

public class Perfect {
	public static void main(String[] args) {
		
		int n=6;
		int res=0;
		boolean flag=false;
		
		for (int i = 1; i < n; i++) {
			{
				if(n%i==0)
				{
					res=res+i;
				}
				
			}
		}
			if(n==res)
			{
				System.out.println("perfect no...");
			}
			else
			{
				System.out.println("its not perfect no..");
			}
			
		}
		
		
	}


