package vote;
import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int age,i;
		 Scanner n=new Scanner(System.in);
		 System.out.print("enter your age:");
		 age=n.nextInt();
		 if(age>=18)
		 {
		   System.out.print("You are eligible to vote");
		 }
        else
 	     {
        	i=18-age;
		    System.out.print("You are allowed to vote after"+i+"years ");
		 }

	}

}
