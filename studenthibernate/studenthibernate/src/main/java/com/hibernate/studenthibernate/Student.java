package com.hibernate.studenthibernate;

	import javax.persistence.*;

	@Entity
	@Table(name = "students")
	public class Student {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
	    @Column(name = "name")
	    private String name;
	    
	    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	    private Laptop laptop;
	    
	    // constructors, getters and setters
	    
	    public Student() {
	        
	    }
	    
	    public Student(String name) {
	        this.name = name;
	    }
	    
	    // getters and setters
	    
	    public int getId() {
	        return id;
	    }
	    
	    public void setId1(int id) {
	        this.id = id;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public Laptop getLaptop() {
	        return laptop;
	    }
	    
	    public void setLaptop(Laptop laptop) {
	        this.laptop = laptop;
	    }

		public void setId(int i) {
			// TODO Auto-generated method stub
			
		}
	    
	}


