package com.none.study.ch07.fifth;

public abstract class Phone {

	//field
	public String owner;
	
	//constructor
	public Phone() {
		
	}
	
	public Phone(String owner) {
		this.owner=owner;
	}
	
	//method
	public void turnOn() {
		System.out.println(owner +" 가 폰 전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	
}//class end
