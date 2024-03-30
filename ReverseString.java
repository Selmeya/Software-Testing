package strreverse;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        char[] charArray = inputString.toCharArray();
        int start = 0;
        int end = inputString.length() - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String reversedString = new String(charArray);

        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);

	}

}
