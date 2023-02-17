package com.hibernate.studenthibernate;


	import javax.persistence.*;

	@Entity
	@Table(name = "laptops")
	public class Laptop {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
	    @Column(name = "brand")
	    private String brand;
	    
	    @Column(name = "model")
	    private String model;
	    
	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "student_id", referencedColumnName = "id")
	    private Student student;
	    
	    // constructors, getters and setters
	    
	    public Laptop() {
	        
	    }
	    
	    public Laptop(String brand, String model) {
	        this.brand = brand;
	        this.model = model;
	    }
	    
	    // getters and setters
	    
	    public int getId() {
	        return id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public String getBrand() {
	        return brand;
	    }
	    
	    public void setBrand(String brand) {
	        this.brand = brand;
	    }
	    
	    public String getModel() {
	        return model;
	    }
	    
	    public void setModel(String model) {
	        this.model = model;
	    }
	    
	    public Student getStudent() {
	        return student;
	    }
	    
	    public void setStudent(Student student) {
	        this.student = student;
	    }
	    
	}


