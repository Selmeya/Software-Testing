package simpleinterest;
import java.util.Scanner;

public class SI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float s, e, l, sinterest; 
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter the Principal : "); 
        s = scan.nextFloat(); 
        System.out.print("Enter the Rate of interest : "); 
        e = scan.nextFloat(); 
        System.out.print("Enter the Time period : "); 
        l = scan.nextFloat(); 
        scan.close(); 
        double interest = (s * e * l) / 100; 
        System.out.print("Simple Interest is: " +interest); 

	}

}
