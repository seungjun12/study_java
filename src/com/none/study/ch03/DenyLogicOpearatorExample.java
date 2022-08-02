package com.none.study.ch03;

public class DenyLogicOpearatorExample {

	public static void main(String[] args) {

		boolean play = true;
		System.out.println(play);
		
		play=!play;
		System.out.println(play);
		
		play=!play;
		System.out.println(play);
		
		int j=3;
		if(!(j==3)) {
			System.out.println("3이 아님");
		}else {
			System.out.println("3임");
		}//if end
		
	}//main() end
}//class end
