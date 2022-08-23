package com.none.study.ch06;

public class Arithmetic {
	
	int a=12;
	int b=3;
	
	//덧셈
	public int sumReturn (int a, int b) {
		int sum=0;
		sum=a+b;
		return sum;		
	}//sumReturn() end
	
	//뺄셈
	public int minusReturn(int a,int b) {
		int minus=0;
		minus=a-b;
		return minus;
	}//minusReturn() end
	
	//곱셈
	public int multiplication(int a,int b) {
		int multiplication=0;
		multiplication=a*b;
		return multiplication;
	}//multiplication() end
	
	//나눗셈
	public int division(int a,int b) {
		int division=0;
		division=a/b;
		return division;
	}//division() end
	
	//나머지
	public int remainder(int a,int b) {
		int remainder=0;
		remainder=a%b;
		return remainder;
	}//remainder() end
	
	public void say(int a) {
		System.out.println("값은:"+a);
	}
	
	
	
	///////////////////////////////////////////////
	
	public String name(String name1,String name2) {
		String name="";
		name=name1+name2;
		return name;
	}
	
	public void hap(String name3) {
		System.out.println(name3);
	}
	
}//class end
