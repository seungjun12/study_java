package com.none.study.ch04;

public class IfExample {

	public static void main(String[] args) {

		int score = 80;
		
		if(score>=90) {
			System.out.println("A");
		} else {
			System.out.println("A는 아닙니다.");
		}
		
		int score2 = 91;
		
		if(score2>=90) {
			if(score2>=97) {
				System.out.println("A+학점입니다");
			}else if(92>=score2) {
				System.out.println("A-학점입니다");
			}else {
				System.out.println("A학접입니다");
			}
		}else if(80<= score2 && score2 <90 ) {
			System.out.println("B학점입니다");
			if(score2>=87) {
				System.out.println("B+학점입니다");
			}else if(score2<=92) {
				System.out.println("B-학점입니다");
			}else {
				System.out.println("B학점입니다");
			}
		}else if(70<= score2 && score2 <80) {
			System.out.println("C학점입니다");
			if(score2>=77) {
				System.out.println("C+학점입니다");
			}else if(score2<=72) {
				System.out.println("C-학점입니다");
			}else {
				System.out.println("C학점입니다");
			}
		}else if(60<= score2 && score2 <70) {
			System.out.println("D학점입니다");
			if(score2>=67) {
				System.out.println("D+학점입니다");
			}else if(score2<=62) {
				System.out.println("D-학점입니다");
			}else {
				System.out.println("D학점입니다");
			}
		}else {
			System.out.println("F학점입니다");	
		}
		

		
		

	}//main() end
}//class end
