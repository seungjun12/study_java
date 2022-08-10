package com.none.study.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1 ; i<=10 ; i++ ) {
			System.out.println(i);
			sum+=i;
		}
		
		System.out.println(sum);
		
		double min = 1;
		double max = 45;
		int random = (int)((Math.random()*(max-min)) + min);
		System.out.println(random);
		
	}//main() end
}//class end
