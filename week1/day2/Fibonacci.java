package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// To generate the Fibonacci series of range 8: 0, 1, 1, 2, 3, 5, 8, and 13
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		System.out.println(n1+"\n"+n2);
		
		for (int i = 0; i<=5; i++) {
		 
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
