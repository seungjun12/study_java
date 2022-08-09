package com.none.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {

		int num = 1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다");
				break;
			case 2:
				System.out.println("2번이 나왔습니다");
				break;
			default:
				System.out.println("1도 2도 아닌 정수 입니다.");
				break;
		}//switch end

		String position ="사원";
		
		
		switch(position) {
		case "사원":
			System.out.println("연봉은 5,000입니다");
			break;
		case "대리":	
			System.out.println("연봉은 6,000입니다");
			break;
		default:
			System.out.println("연봉은 4,000입니다");
			break;
		}	
		
		
		
		
	}//main() end
}//class end
