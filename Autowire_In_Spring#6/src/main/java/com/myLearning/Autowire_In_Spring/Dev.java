package com.myLearning.Autowire_In_Spring;

public class Dev {
	
	private Computer com;
	
	public Dev() {
		System.out.println("Dev Constructor");
	}

	public void setCom(Computer com) {  //Setter Injection
		this.com = com;
	}
	
	public void build() {
		System.out.println("Working on awesome Project");
		com.compile();
	}

}
