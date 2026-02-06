package com.myLearning.ConstructorAndSetterInjectionInSpring;

public class Dev {
   private Laptop laptop;
	
	private int age;
	private int salary;
	
	public Dev() {
		System.out.println("Dev constructor");
	}
	
	public Dev(Laptop laptop) {
		this.laptop = laptop;
	}


    public Dev(int age, int salary) {
		this.age = age;
		this.salary = salary;
		System.out.println("Dev2 constructor");
	}

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
   
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void build() {
    	System.out.println("Building an awesome project");
    	laptop.compile();
    }
   
}
