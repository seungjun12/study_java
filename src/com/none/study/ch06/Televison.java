package com.none.study.ch06;

public class Televison {

	public static String company ="samsung";
	public static String model="oled";
	public static String info;
	
	String version ="1.0";
	
	
	//이것이 바로 static 블록!
	static {
		info= company+" " +model;
	}
	
	
}//class end
