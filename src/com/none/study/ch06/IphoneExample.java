package com.none.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {

		Iphone iphone = new Iphone();
		
		System.out.println(iphone.name);
		System.out.println(iphone.name2[3]);
		
		iphone.sj();
		
		
		/////////////////////////////////
		Car car = new Car();
		
		System.out.println("car.name:"+car.name);
		System.out.println(car.name2[1]);
		
		
		//////////////////////////////////
		Bag bag = new Bag();
		
		System.out.println(bag.name);
		
		///////////////////////////////////
		car.name="소나타";
		System.out.println("car.name:"+car.name);
		
	}//main() end
}//class end
