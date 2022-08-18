package com.none.study.ch5;

public class ArrayInArrayExample {


	public static void main(String[] args) {

		int[][] scores = {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55,77}};
		String [] name = {"장원영","장동건","고소영","아이유","청하"};
		String [] subject = {"국어","수학","영어"};

		/*		System.out.println(scores[1][2]); //66
		System.out.println(scores[4][0]); //55
		System.out.println(scores[0][0]); //99
		System.out.println(scores[2][0]); //55
*/		
		
		//개인의 평균
		
		
		for(int i=0; i<scores.length;i++) {
			int sum=0;
			for(int j=0;j<scores[i].length;j++) {
				sum+=scores[i][j];
			}
				System.out.println(name[i]+"평균:"+(sum/3));
		}
		
		
		System.out.println("-------------------------------");
		
		//과목별 평균
		//오류가 난다 왜일까?
		
		for(int i=1;i<scores[i].length;i++) {
			int sum2=0;
			for(int j=1;j<scores.length;j++) {
				sum2+=scores[i][j];
			}
			System.out.println(subject[i]+"평균:"+(sum2/5));
		}
		
		
		//서로 점수 바꾸기

		
		
		
		
		
		
		
		
	}//main() end
}//class end
