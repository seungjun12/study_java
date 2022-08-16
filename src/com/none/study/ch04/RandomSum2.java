package com.none.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {
		
		/*double num1 = 1.;
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
		
		System.out.println("total:"+sum);*/
		
		//////////////////////////////////////////////////////
		
		double num1=0.;
		double num2=100.;
		
		int random1 = (int) ((Math.random()*(num2-num1))+num1);
		int random2 = (int) ((Math.random()*(num2-num1))+num1);
		
		System.out.println("random1:"+random1);
		System.out.println("random2:"+random2);
		
		System.out.println("두수 절대값:"+Math.abs(random1-random2));
	
		int sum=0;
		
		for(int i=1;i<Math.abs(random1-random2);i++) {
			if(random1>random2) {
				sum=(random2+i)+sum;
			}else if(random2>random1){
				sum=(random1+i)+sum;
			}else {
				System.out.println("두수가 같다");
			}//if end
		}//for end
	
		
		System.out.println("total:" +sum);
	
	
	
	
	}//main() end
}//class end
