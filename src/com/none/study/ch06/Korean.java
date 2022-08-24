package com.none.study.ch06;

public class Korean {

	String name="";
	String ssn="";
	int age=1;
	
	Korean(String name,String ssn){
		this.name=name;
		this.ssn=ssn;
	}
	
	Korean(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	//기본생성자 함수
	public Korean() {
		
	}
	
	static String nationality="대한민국";
	
	static int staticTest(int a) {
		return a+5;
	}
	
	
	// static 이 아니라 객체를 생생 해줘야 한다
	int test() {
		Arithmetic arithmetic = new Arithmetic();
		arithmetic.aaa(1);
		return 1;
	}
	
	//static이라 객체 생성x
	public void tese1() {
		Arithmetic.staticTest();
	}
	
}//class end
