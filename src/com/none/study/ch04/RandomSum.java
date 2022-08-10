package com.none.study.ch04;

public class RandomSum {

	public static void main(String[] args) {
		
		double min = 1;
		double max = 100;
		int random = (int)((Math.random()*(max-min)) + min);
		int random2 = (int)((Math.random()*(max-min)) + min);
		
		System.out.println(random);
		System.out.println(random2);
		
		System.out.println(Math.abs(random-random2));
		
		int sum = 0;
		
		for(int i=1;i<Math.abs(random-random2);i++ ) {
			if(random>random2) {
				sum=(random2+i)+sum;
			}else if(random<random2){
				sum=(random+i)+sum;
			}else {
				System.out.println(0);
			}//if end
		}//for end
			System.out.println(sum);
		
			
			
		
		
		
	}//main() end
}//class end
