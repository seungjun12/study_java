package com.none.study.ch04;

import java.util.Random;

public class RandomSum2 {

	public static void main(String[] args) {
		
		double num1 = 1.;
		double num2 = 100.;
		
		int sum = 0, min = 0, max = 0;
		
		int random1 = (int) ((Math.random()*(num2-num1))+num1);
		int random2 = (int) ((Math.random()*(num2-num1))+num1);
		
		if(random1>random2) {
			max=random1;
			min=random2;
		}else {
			max=random2;
			min=random1;
		}//if end
		
		System.out.println("min:"+min + "max:" +max);
		
		for(int i=min+1;i<max;i++) {
			sum+=i;
		}
		
		System.out.println("total:"+sum);
		
	}//main() end
}//class end
