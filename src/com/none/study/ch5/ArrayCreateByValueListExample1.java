package com.none.study.ch5;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		int[] score = {88,99,45,86,34};
		
		int sum=0;
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}

		double averege = sum/5;
		
		System.out.println("5명의 평균:" +averege);
		
		
	}//main() end
}//class end
