package com.none.study.ch03;

public class ConditionalOperationExample {

	public static void main(String[] args) {
			
		int score = 85;
		
		String grade = score> 90 ? "A등급" : "B등급";
		System.out.println("grade: "+ grade);
		
		System.out.println("------------------------");
		
		if(score>90) {
			System.out.println("grade: A등급");
		}else {
			System.out.println("grade: B등급");
		}//if end
		
		
	}//main() end
}//class end
