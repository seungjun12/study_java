package com.none.study.ch06;

public class TelevisonExample {

	public static void main(String[] args) {
		
		System.out.println(Televison.company);
		System.out.println(Televison.model);
		System.out.println(Televison.info);

		
		
//		System.out.println(Televison.version);
//      오류인 이유를 설명해보시오
//		static으로 안해서
//		
//		그럼 사용할려면 객체를 생성해 주어야 한다
//      ㄱㄱ
		
		Televison televison = new Televison();
		System.out.println(televison.version);
//		성공
		

	}//main() end
}//class end
