package com.none.study.ch07.sixth;

public class Cat extends Animal{

	//constructor
	
	public Cat() {
		this.kind="포유류";
	}
	
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
