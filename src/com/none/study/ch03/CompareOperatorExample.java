package com.none.study.ch03;

public class CompareOperatorExample {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 30;
		
		boolean result = (num1==num2);
		System.out.println(result);//true
		
		boolean result2 = (num1!=num2);
		System.out.println(result2);//false
		
		boolean result3 = (num1<num2);
		System.out.println(result3);//false
		
		boolean result4 = (num1<=num2);
		System.out.println(result4);//true
		
		boolean result5 = (num1>num2);
		System.out.println(result5);//false
		
		boolean result6 = (num1>=num2);
		System.out.println(result6);//true
	}//main() end
}//class end
