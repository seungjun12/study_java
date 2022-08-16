package com.none.study.ch04;

public class BreakExample {

	public static void main(String[] args) {
		
		double min=1.;
		double max=10.;
		
		while(true) {
			int random=(int)((Math.random()*(max-min))+min);
			System.out.println(random);
			if(random==5) {
				break;
			}
		}
		
		System.out.println("--------------------");
		
		for(int i=1;i<=10;i++) {
			int random2=(int)((Math.random()*(max-min))+min);
			System.out.println(i+":"+random2);
			if(random2==5) {
				break;
			}//if end
		}//for end
		
		System.out.println("--------------------------------");
		
		aa:
		for(int j=1;j<=10;j++) {
			for(int i =1;i<10;i++) {
				int random3=(int)((Math.random()*(max-min))+min);
				System.out.println(j+":"+i+":"+random3);
				if(random3==5) {
					break aa;
					//break;  //차이를 이해하여야 함
				}//if end
			}//for end
			
		}//for end
		
		
		
	}//main() end
}//class end
