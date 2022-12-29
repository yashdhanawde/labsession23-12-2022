package yash;
import java.util.Scanner;

public class Main2 {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    StringBuilder sb = new StringBuilder("");
	    System.out.println("Enter a name"); 
	     sb.append(sc.nextLine().toUpperCase());			
			sb.reverse();
		System.out.println("Reversed Data is:"+sb);
	    	
	  }

}
