package com.none.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// 강제 형변환  : casting : (원하는 형) 변수명 

		double doubleValue = 1234567;
		System.out.println("doubleValue:" + doubleValue);
		
		double doubleValue2 = 1234567891;  //7자리 이상인 경우에는 e로 표현됨
		System.out.println("doubleValue2:" + doubleValue2);
		
		//float 변수에 double 대입
		float floatValue = (float) doubleValue;
		System.out.println("floatValue:" + floatValue);
		
		long longValue = (long) floatValue;
		System.out.println("longValue:" + longValue);
		
		int intValue = (int) longValue;
		System.out.println("intValue:" + intValue);
		
		short shortValue = (short)intValue;
		System.out.println("shortValue:" + shortValue);
		
		byte byteValue =(byte)shortValue;
		System.out.println("byteValue:" + byteValue);
		
		
		//int ---> String
		int intValue2 = 123;
		String StringValue = Integer.toString(intValue, intValue2);
		System.out.println(StringValue);
		
		/* 선생님이 해주신거 */
		String stringValue = String.valueOf(intValue2);
		System.out.println(stringValue);
		
		//String --->int
		String StringValue2 = "123";
		int intValue3 = Integer.parseInt(StringValue2);
		System.out.println(intValue3);

		
	}//main() end
}//class end
