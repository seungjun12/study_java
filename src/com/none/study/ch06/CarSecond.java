package com.none.study.ch06;

public class CarSecond {

	String color="red";
	int cc = 1500;
	String name ="아반때";
	
	
	CarSecond(String name){
		this.name=name;
	}
	
	CarSecond(String name,int cc){
		this.name=name;
		this.cc =cc;
	}
	
	CarSecond(String name,int cc,String color){
		this.name=name;
		this.cc=cc;
		this.color=color;
	}
	
	//기본생성자
	CarSecond(){
		
	}
	
	
}//class end
