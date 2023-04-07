package Num;

import java.util.Scanner;

public class Pow {
public static void main(String[] args) {
	

	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num..");
	int n=sc.nextInt();
	System.out.println("Enter power no..");
	int p=sc.nextInt();
	int res;
	res=(int)Math.pow(n, p);
	
	System.out.println(res);
	
}
}