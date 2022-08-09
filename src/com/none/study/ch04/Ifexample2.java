package com.none.study.ch04;

public class Ifexample2 {

	public static void main(String[] args) {
		
		int price = 10000;
		int grade = 4;
		
		if(grade>=5) {
			System.out.println("정가:" +price +"원" +"할인가:" +price*0.973+"원");
		}else if(4<=grade && grade<5) {
			System.out.println("정가:" +price +"원" +"할인가:" +price*0.8+"원");
			
		}else if(3<=grade && grade<4) {
			System.out.println("정가:" +price +"원" +"할인가:" +price*0.75+"원");
			
		}else if(2<=grade && grade<3) {
			System.out.println("정가:" +price +"원" +"할인가:" +price*0.9+"원");
			
		}else {
			System.out.println("정가:" +price +"원" +"할인가:" +price*0.95+"원");
			
		}//if end

	}//main() end
}//class end
