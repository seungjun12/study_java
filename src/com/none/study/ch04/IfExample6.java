package com.none.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 3;
		int c = 7;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a가 가장 크다");
				if(b>c) {
					System.out.println("c가 가장 작다");
				}else {
					System.out.println("b가 가장 작다");
				}
			}
		}else if(b>a) {
			if(b>c) {
				System.out.println("b가 가장 크다");
				if(a>c) {
					System.out.println("c가 가장 작다");
				}else {
					System.out.println("a가 가장 작다");
				}
			}
		}else if(c>a) {
			if(c>b) {
				System.out.println("c가 가장 크다");
				if(a>b) {
					System.out.println("b가 가장 작다");
				}else {
					System.out.println("a가 가장 작다");
				}
			}
		}else {
			System.out.println("모두 같다");
		}
		
		//선생님 버전
		
		if(a!=b && b!=c && c!=a) {
			if(a>b && a>c) {
				System.out.println("a가 최댓값");
			}else if(b>a && b>c) {
				System.out.println("b가 최댓값");
			}else {
				System.out.println("c가 최댓값");
			}
			if(a<b && a<c) {
				System.out.println("a가 최솟값");
			}else if(b<a && b<c) {
				System.out.println("b가 최솟값");
			}else {
				System.out.println("c가 최솟값");
			}
		}else {
			System.out.println("적어도 2개의 동일한 정수가 존재합니다. 수정해 주세요");
		}
		
			
			
	}//main() end
}//class end
