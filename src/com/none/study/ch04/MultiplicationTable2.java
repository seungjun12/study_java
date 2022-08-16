package com.none.study.ch04;

public class MultiplicationTable2 {

	public static void main(String[] args) {
		
		//2단 출력
		
		/*for(int i=1 ; i<=9 ; i++) {
			System.out.println("2*" +i +"="+(2*i));
		}//for end
*/		
		//////////////////////////////////////////////////////
		System.out.println("-----------------------------------------");
		//구구단 출력
		
		for(int i=2; i<=9; i=i+1) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"=" +(i*j));
				if(j==9) {
					System.out.println("------------------------------");
				}
			}
			
		}//for end

	}//main() end
}//class end
