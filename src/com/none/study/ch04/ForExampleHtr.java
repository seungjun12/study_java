package com.none.study.ch04;

public class ForExampleHtr {

	public static void main(String[] args) {
		
		//1
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
		System.out.println("-----------------------------");
		
		//2
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}//if end
				}else {
					System.out.print("*");
				}//if end
			}//for end
			System.out.println();
		}//for end
		
		//3
		

		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
