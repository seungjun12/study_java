package com.none.study.ch02;

public class CharExample {

	public static void main(String[] args) {
		//
		char c1 ='A';       //문자를 저장
		char c2 =65;		//십진수르 저장	
		char c3 ='\u0041';	// 16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		char c4 ='가';		//문자를 저장
		char c5 =44032;		//십진수로 저장
		char c6 ='\uac00';	//16진수로 저장
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

	}//main() end
}//class end
