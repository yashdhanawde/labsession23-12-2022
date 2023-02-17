package com.hibernate.studenthibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         
         SessionFactory factory = cfg.buildSessionFactory();
         
         
         
         // create a new student and laptop
         Student student1 = new Student();
         student1.setId(1);
         student1.setName("Yash");
         
         Laptop laptop1 = new Laptop();
         laptop1.setId(15);
         laptop1.setModel("12quzesda");
         laptop1.setBrand("hp");
         
         
         Student student2 = new Student();
         student2.setId(2);
         student2.setName("Anish");
         
         Laptop laptop2 = new Laptop();
         laptop2.setId(16);
         laptop2.setModel("16qresydf");
         laptop2.setBrand("Asus");
         
         
         Student student3 = new Student();
         student3.setId(3);
         student3.setName("Deppak");
        
         Laptop laptop3 = new Laptop();
         laptop3.setId(17);
         laptop3.setModel("14gfajk");
         laptop3.setBrand("Dell");
         
         // establish the one-to-one relationship between the student and laptop
         student1.setLaptop(laptop1);
         laptop1.setStudent(student1);
         
         student2.setLaptop(laptop2);
         laptop2.setStudent(student2);
         
         
         student3.setLaptop(laptop3);
         laptop3.setStudent(student3);
     	
     	Session session=factory.openSession(); 
     	//begin the transaction
     	Transaction t=session.beginTransaction();
     	session.save(student1);
     	session.save(laptop1);
     	session.save(student2);
     	session.save(laptop2);
     	session.save(student3);
     	session.save(laptop3);
     	t.commit();
     	session.close();
     	factory.close();
     }
    }

