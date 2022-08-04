package com.none.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {

	int a =65;
	
	if(a>=65 & a<=90) {
		System.out.println("65보다 크거나 같고 90보다 작거나 같습니다");
	}//if end
	
	if(a>=65 && a<=90) {
		System.out.println("65보다 크거나 같고 90보다 작거나 같습니다");
	}//if end

	/////////////////////////////////////////////////////////////
	System.out.println("------------------------------");
	
	if(a>=65 || a<=90) {
		System.out.println("둘다참");
	}//if end
	
	if(a>=65 | a<=90) {
		System.out.println("한개만 참");
	}//if end
	
	if(a>=66 || a<=50) {
		System.out.println("둘다 틀려서 이글이 나오면 안됨");
	}//if end
	
	/////////////////////////////////////////////////////////////////
	System.out.println("------------------------------");
	
	if(a>=65 ^ a<=90) {
		System.out.println("둘다 맞아서 나오면 안됨");
	}//if end
	
	if(a>=66 ^ a<=50) {
		System.out.println("둘다 틀려서 이글이 나오면 안됨");
	}//if end
	
	if(a>=65 ^ a<=50) {
		System.out.println("하나만 맞아서 이글은 나와야됨");
	}//if end
	
	
	}//main() end
}//class end
