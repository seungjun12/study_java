package com.none.study.ch07.third;

public class ComputerExample {

	public static void main(String[] args) {

//		int r=10;  왜 쓰신거지?
		
		Calculator calculator = new Calculator();
		
		System.out.println("원면적: "+ calculator.areaCircle(2));
		
		Computer computer = new Computer();
		
		System.out.println("원면적: "+ computer.areaCircle(2));
		
		
	}//main() end
}//class end
