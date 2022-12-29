import java.util.Scanner;

public class Exceptionhandaling1 {
	public static void main(String[ ] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter your first no:");
		 int i=sc.nextInt();
		 System.out.println("Enter your second no:");
		 int j=sc.nextInt();
		 
		 try {
			 int k=i/j;
			 System.out.println("Ans:"+k);
			 
		 }
		 catch(Exception e) {
			 System.out.println("Exception Occured");
		 }
	}
}
