package strcompare;
import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the username: ");
        String firstString = scanner.nextLine();
        
        System.out.print("Re-enter the username: ");
        String secondString = scanner.nextLine();
        
        scanner.close();
        
        if(firstString.equals(secondString)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

	}

}
