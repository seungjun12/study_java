package com.none.study.ch04;

public class IfExample4 {

	public static void main(String[] args) {
		
		int x=-2;
		int y=-3;
		
		if(x>0) {
			if(y>0) {
				System.out.println("1사분면");
			}else {
				System.out.println("4사분면");
			}
		}else {
			if(y>0) {
				System.out.println("2사분면");
			}else {
				System.out.println("3사분면");
			}
		}
		
				

	}//main() end
}//class end
