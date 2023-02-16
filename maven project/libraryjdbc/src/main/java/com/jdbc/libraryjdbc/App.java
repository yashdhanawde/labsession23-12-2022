package com.jdbc.studentjdbc;


public class App 
{
   public static void insert() {
		
	Connection con;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Yash@602");
	
	String q= "insert into books (bid, bookname, writername) values (?,?,?)";
	//statement
	PreparedStatement pstmt=con.prepareStatement(q);
	//user input
	Scanner sc =new Scanner(System.in);
	int bid;
	System.out.println("Enter bid:");
	bid=sc.nextInt();
	String bname;;
	System.out.println("Enter bname:");
	bname=sc.next();
	String name;
	System.out.println("Enter writername:");
	name=sc.next();
	
	
	
	pstmt.setInt(1, bid);

	pstmt.setString(2, bname);

	pstmt.setString(3, name);

	//execute Statement
	pstmt.executeUpdate();
	System.out.println("Data inserted Sucessfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	 public static void update() {
		 Connection con;
		 try {//connection statement
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Yash@602");
		
		 
			String b= "UPDATE books SET bookname = ?, writername = ? WHERE bid = ?";
	//statement
			PreparedStatement pstmt=con.prepareStatement(b); 
	//user input
			Scanner sc =new Scanner(System.in);
			int id;
			System.out.println("Enter bid you want to update:");
			id=sc.nextInt();
			System.out.println("Enter bname:");
			String bname;
			bname=sc.next();
			System.out.println("Enter writername ");
			String name=sc.next();
			pstmt.setString(1,bname);
			pstmt.setString(2,name);
			pstmt.setInt(3,id);
			pstmt.execute();} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	 }public static void delete() {
		 Connection con;
		 try {//connection statement
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Yash@602");
		
		 String a= "delete from books where bid=?";
	//statement
			PreparedStatement pstmt=con.prepareStatement(a); 
	//user input
		
			Scanner sc =new Scanner(System.in);
			int id;
			System.out.println("Enter bid you want to delete:");
			id=sc.nextInt();
			pstmt.setInt(1,id);
			pstmt.execute();
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
	 } public static void show() {
		 Connection con;//try catch block
			try {//connection statement
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Yash@602");
		//statement	
			
		 PreparedStatement st = con.prepareStatement("select * from Books");
			ResultSet rs = st.executeQuery(); // executing query
	    	while(rs.next()) {
	    		System.out.println("BookID: "+rs.getInt(1)+" "+"Bookname: "+rs.getString(2)+" "+"Author: "+rs.getString(3));
	    		
	    	}
			con.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
				
	}

	 //main method
		
    public static void main( String[] args )
    { int oid;
    do {
    	
    	 Scanner sc=new Scanner(System.in);
    	    System.out.println("Enter a no of operation you want to perform 1 for insert,2 for update,3 for delete,4 for show");
    	 oid=sc.nextInt();
	//switch case
    	 switch (oid) {
    	 case 1:
    		 insert();
    		 break;
    	 case 2:
    		 update();
    		 break;
    	 case 3 :
    		 delete();
    		 break;
    	 case 4:
    		 show();
    		 break;
    }
    
    }while(oid<4);
System.out.println("You exited Sucessfully");
}
    
}
