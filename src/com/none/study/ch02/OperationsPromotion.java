package com.none.study.ch02;

public class OperationsPromotion {

	public static void main(String[] args) {
		//
		byte byteValue =12;
		byte byteValue2 = 12;
//		byte byteValue3 = byteValue+byteValue2;
		int intValue = byteValue+byteValue2;
		System.out.println(intValue);

		////////////////////////////////////////////
		
		short shortValue =12;
		short shortValue2=12;
		int intValue2 =shortValue+shortValue2;
		System.out.println(intValue2);
		
		//////////////////////////////////////////////
		
		int intValue3 = 12;
		int intValue4 = 12;
		int intValue5 = intValue3+intValue4;
		System.out.println(intValue5);
		
		//////////////////////////////////////////////
		
		long longValue = 12;
		long longValue2 = 12;
		long longValue3= longValue+longValue2;
		System.out.println(longValue3);
		
		//////////////////////////////////////////////
		
		float floatValue =12.f;
		float floatValue2 =12.f;
		float floatValue3 =floatValue+floatValue2;
		System.out.println(floatValue3);
		
		/////////////////////////////////////////////
		
		double doubleValue = 12.;
		double doubleValue2 = 12.;
		double doubleValue3 = doubleValue+doubleValue2;
		System.out.println(doubleValue3);

		//byte byteValue4=byteValue+intValue; 큰놈 더하기 작은놈 은 큰놈이다
		int byteValue4=byteValue+intValue;
		int intValue6=byteValue+intValue;
		System.out.println(intValue6);
		System.out.println(byteValue4);
		
//		int intValue7 =intValue +doubleValue;
		double doubleValue4 = intValue + doubleValue;
		System.out.println(doubleValue4);
		
		
		
		
	}//main() end
}//class end
