package com.none.study.ch04;

public class IfExample {

	public static void main(String[] args) {

		int score = 80;
		
		if(score>=90) {
			System.out.println("A");
		} else {
			System.out.println("A는 아닙니다.");
		}
		
		int score2 = 70;
		
		if(score2>=90) {
			if(score2>=97) {
				System.out.println("A+학점입니다");
			}else if(93<=score2 & score2 <= 96) {
				System.out.println("A학점입니다");
			}else {
				System.out.println("A-학접입니다");
			}
		}else if(80<= score2 && score2 <90 ) {
			System.out.println("B학점입니다");
			
		}else if(70<= score2 && score2 <80) {
			System.out.println("C학점입니다");
			
		}else if(60<= score2 && score2 <70) {
			System.out.println("D학점입니다");
			
		}else {
			System.out.println("F학점입니다");	
		}//if end
		

		
		

	}//main() end
}//class end
