package yash;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter First string"); 
	     String str1= sc.nextLine(); 

	    System.out.println("Enter Second String"); 
	     String str2 = sc.nextLine(); 
	   if(str1.contains(str2 )){
	     System.out.println("String 1 Contains string 2");
	}
		else   {
	  	System.out.println("String 1  do not contain string 2");
	}

}
}
