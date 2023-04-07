package Num;

import java.util.Scanner;

public class Npower {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num..");
		int n=sc.nextInt();
		System.out.println("Enter power no..");
		int p=sc.nextInt();
		int res=1;
		
		for (int i = 1; i <=p; i++) {
			res=n*res;
		}
		System.out.println(res);
		
		
		int c=(int)Math.pow(5, 2);
		
		System.out.println(c);
		
	
	}

}
