package Num;

import java.util.Iterator;

public class Arm {  
	
	public static void main(String[] args) {
		
		int a[]= {1,4,6,3,1,6,8};
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				
				if(a[j]> a[j+1])
				{
			      temp=a[j];
			      a[j]=a[j+1];
			      a[j+1]=temp;
					
					
					
				}
			}
		}
		for (int i : a) {
			
		
	System.out.print(" "+i);

}
	}
}
