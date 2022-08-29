package com.none.study.ch08;

public class Son extends Parent{

	int hap;

	@Override
	public int getSum(int[] arr) {
		hap=arr[0]*arr[1]+arr[2]+10;
		return hap;
	}

	

	
}//class end
