package week1.day2;

public class PrintOddEvenNumbers {

	public static void main(String[] args) {
		// Print numbers from 1 to 10 and also if it's Odd or Even
		
		for (int i = 1; i <= 10; i++) {
			
			if (i%2==1) {
				System.out.println("The number " +i + " is Odd");
			}else {
				System.out.println("The number " +i + " is Even");
			}
	
		}

	}

}
