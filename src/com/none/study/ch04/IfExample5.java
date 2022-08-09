package com.none.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {
		
		int a=0;
		
		if(a%2==0) {
			System.out.println("a는 짝수 입니다");
		}else {
			System.out.println("a는 홀수 입니다");
		}

		
		if(a!=0) {
			if(a%2==0) {
				System.out.println("a는 짝수 입니다");
			}else {
				System.out.println("a는 홀수 입니다");
			}
		}else {
			System.out.println("a는 0 입니다");
		}
		
		
		
		
	}//main() end
}//class end
