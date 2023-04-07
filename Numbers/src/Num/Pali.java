package Num;

public class Pali {
public static void main(String[] args) {
	

    int num = 444;
    int reverse = 0;
    int remainder;
    
    int or = num;
    
    
    while (num != 0) {
      remainder = num % 10;
      reverse= reverse * 10 + remainder;
      num =num/ 10;
    }
    
  
    if (or== reverse) {
      System.out.println(or+ " is Palindrome.");
    }
    else {
      System.out.println(or + " is not Palindrome.");
    }
  }

}

