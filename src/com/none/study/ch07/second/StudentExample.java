package com.none.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {

		//명시적 생성자를 사용하여 객체를 생성하고
		
		Student student=new Student("박승준","abc",1);
		Student student2=new Student("장동건","bca");
		
		//모든 필드를 출력하시요

		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
		
		student.say();
		student2.say();
		
		Student student3 = new Student();
		student3.say();
		
		
	}//main() end
}//class end
