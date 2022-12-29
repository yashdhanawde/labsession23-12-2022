package yash;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Password"); 
	     String password = sc.nextLine(); 

	    System.out.println("Enter Confirm Password"); 
	     String confirm = sc.nextLine(); 
	   if(password.equals(confirm )){
	     System.out.println("Your Password Matched");
	}
		else   {
	  	System.out.println("Your  Password doesn't Matched");
	}

}
}
