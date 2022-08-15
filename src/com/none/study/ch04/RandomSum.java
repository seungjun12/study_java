package com.none.study.ch04;

public class RandomSum {

	public static void main(String[] args) {
		
		/*double min = 1;
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
			System.out.println(sum);*/
		
			
		//////////////////////////////////////////////////////
		System.out.println("---------------------------------");
		
		//잘한 분들꺼 버전
		
		//1~100 사이의 랜덤 정수 2개를 발생시켜 두 수 사이의 합을 구하라
		
		double num1 = 1.;
		double num2 = 100.;
		
		int sum = 0, min = 0, max = 0;
		
		int random1 = (int) ((Math.random()*(num2-num1))+num1);
		int random2 = (int) ((Math.random()*(num2-num1))+num1);
		
		if(random1<random2) {
			max=random2;
			min=random1;
		}else {
			max=random1;
			min=random2;		
		}//if end
		
		System.out.println("min:" +min+ "," +"max:" +max);
		
		for(int i= min+1; i<=max-1;i++) {
			sum+=i;
			System.out.println(i+":"+sum);
		}//for end
		
		System.out.println("total:" + sum);
		
	}//main() end
}//class end
