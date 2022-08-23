package com.none.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
		
		int resultAdd =arithmetic.sumReturn(3, 5);
		int resultMinus =arithmetic.minusReturn(3, 5);
		int resultMultiplication =arithmetic.multiplication(3, 5);
		int resultDivison =arithmetic.division(3, 5);
		int resultRemainder =arithmetic.remainder(3, 5);
		
		
		arithmetic.say(resultAdd);
		arithmetic.say(resultMinus);
		arithmetic.say(resultMultiplication);
		arithmetic.say(resultDivison);
		arithmetic.say(resultRemainder);
		
		/////////////////////////////////////
		
		String resultName =arithmetic.name("박박", "승준");
		
		arithmetic.hap(resultName);
		

	}//main() end
}//class end
