package week1.day2;

public class Palindrome {
	   public static void main(String[] args)
	   
	   {
	       int input=101, reverse=0, remainder, temp; 
	        temp = input;
	        for( ;input != 0; input /= 10 )
	        {
	        	remainder = input % 10; 
	           reverse= reverse* 10 + remainder;
	         } 
	       //if temp = reverse, it's a palindrome
	  
	      if (temp== reverse) 
	          System.out.println(temp + " is a palindrome."); 
	     else
	           System.out.println(temp + " is not a palindrome."); 
	       } 
	  }