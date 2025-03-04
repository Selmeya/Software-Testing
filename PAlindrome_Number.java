package palindromenumber;
import java.util.Scanner;
public class PAlindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        int originalNumber = number;
	        int reversedNumber = 0;
	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        if (originalNumber == reversedNumber) {
	            System.out.println(originalNumber + " is a palindrome number.");
	        } else {
	            System.out.println(originalNumber + " is not a palindrome number.");
	        }
	}

}
