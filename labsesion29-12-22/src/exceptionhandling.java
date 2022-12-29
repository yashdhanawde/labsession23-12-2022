import java.util.Scanner;
public class exceptionhandling {
	 public static void main(String[ ] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter your Age:");
		 int age=sc.nextInt();
		 //To Throw Exception if the age is below 18
		 if(age<18) {
			 throw new ArithmeticException("Your age is not correct.");
		    }
		//if age i above 18
		 else{
			 System.out.println("You are eligible to vote");
		 }
	 }
	 }
