package com.none.study.ch5;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week abc;
		
		Week xyz;
		
		abc = Week.SUNDAY;
		
		System.out.println("Week.FRIDAY:" +Week.FRIDAY);
		System.out.println("abc:" + abc);
		
//		Strign name =abc;
		String name =abc.name(); //String 으로 쓸 수 있게 만들어 준다
		System.out.println("name:"+name);
		
		int ordinal = abc.ordinal();
		System.out.println("ordinal:"+ordinal);
		
		xyz=Week.SATURDAY;
		
		int result1=abc.compareTo(xyz);
		int result2=xyz.compareTo(abc);
		
		System.out.println(result1);
		System.out.println(result2);
		
		Week[] days =Week.values();
		
		int index=0;
		for(Week day: days) {
			System.out.println(index + ": day :"+day);
			index++;
		}

	}//main() end
}//class end
