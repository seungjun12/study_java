package com.none.study.ch04;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=9 ; i++) {
			System.out.println("2*"+i +"=" +(2*i));
		}
		
		//2단부터 9단 출력
		for(int i=2 ; i<=9; i++) {
			for(int j=1 ; j<=9 ;j=j+1) {
				System.out.println(i+"*"+j+"="+(i*j) );
			}//for end
		}//for end

	}//main() end
}//class end
