package codeconversion;
import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        String octalNumber = Integer.toOctalString(decimalNumber);

        System.out.println("Binary equivalent: " + binaryNumber);
        System.out.println("Octal equivalent: " + octalNumber);

	}

	
	
	
	
	
	
	
}
