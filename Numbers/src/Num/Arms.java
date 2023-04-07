package Num;

public class Arms {
	public static void main(String[] args) {
		
		int n=153;
		int temp=n;
		int sum=0;
		int count=0;
	
		
		while(temp>0)
		{
			count++;
			temp=temp/10;
			
		}
		System.out.println(count);
	    int tem=n;
		while(tem>0)
		{
			int n1=n/10;
			int p=1;
			for (int i = 0; i <=temp; i++) {
				sum=sum+p;
				int n2=tem/10;
				
			}
		}
		System.out.println(sum);
		if(n==sum)
		{
			System.out.println(sum);
			//System.out.println("its arm strong");
			
			
		}
		
		
		
	}
}



