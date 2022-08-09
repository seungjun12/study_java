package com.none.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		
		int grade = 4;
		int cost = 10000;
		double salesCost = 0.;
		
		switch(grade) {
			case 1:
				salesCost = cost*(1-0.05);
				System.out.println("정가:" + cost + "일반등급의 할인가:" +(int) salesCost +"입니다");
			break;
			case 2:
				salesCost = cost*(1-0.1);
				System.out.println("정가:" + cost + "브론즈등급의 할인가:" +(int) salesCost +"입니다");
			break;
			case 3:
				salesCost = cost*(1-0.15);
				System.out.println("정가:" + cost + "실버등급의 할인가:" +(int) salesCost +"입니다");
			break;
			case 4:
				salesCost = cost*(1-0.2);
				System.out.println("정가:" + cost + "골드등급의 할인가:" +(int) salesCost +"입니다");
			break;
			default :
				salesCost = cost*(1-0.027);
				System.out.println("정가:" + cost + "플래티넘등급의 할인가:" +(int) salesCost +"입니다");
			
		}
		
		
		
	}//main() end
}//class end
