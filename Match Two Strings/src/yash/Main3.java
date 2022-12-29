package yash;


interface Printable {
	   void display();
	}
	interface Calculate {
	   int  cal(int X);
	}
	class Yash implements Printable, Calculate {
	   public void display() {
	      System.out.print("square of a number:");
	   }
	   public int cal(int b) {
	      return b*b;
	   }
	}
	class Calcube implements Printable, Calculate {
		   public void display() {
		      System.out.print("Cube of a number: ");
		   }
		   public int cal(int b) {
		     return b* b *b;
		   }
		   public class Main3 {
	public static void main(String args[]) {
		Yash cs = new Yash();
		cs.display();
		System.out.println(cs.cal(8));
		
		Calcube cc = new Calcube();
		cc.display();
		System.out.println(cc.cal(8));
	    }
}
	}
