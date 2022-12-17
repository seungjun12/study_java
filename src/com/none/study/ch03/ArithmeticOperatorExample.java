package com.none.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1+v2;
		System.out.println("result1:" +result1);//7

		int result2 = v1-v2;
		System.out.println("result2:" +result2);//3

		int result3 = v1*v2;
		System.out.println("result3:" +result3);//10

		int result4 = v1/v2;
		System.out.println("result4:" +result4);//2

		int result5 = v1%v2;
		System.out.println("result5:" +result5);//1
		
		double result6=v1/v2;
		System.out.println("result6:" + result6);
	
		double result7=(double)v1/v2;
		System.out.println("result7:" + result7);
		
		////////////////////////////////////////////////
		
		double a = 5./3;
		double b = 5./8;
		double c = a-b;
		double d = 49./5;
		double dap= c*d;
		System.out.println("1번 정답은" +dap);
		
		double e =11./6.;
		double f = 3.25-e;
		double g = 12./17;
		double h = f*g;
		/* System.out.println(h); */
		double dap2= 5.-h;
		System.out.println("2번 정답은" +dap2);
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
	
		average("홍길동",60,70,85,90,45);
		average("박박박",50,75,70,60,70);
		average("김김김",55,60,64,58,90);
		average("이이이",80,70,63,88,78);
	}//main() end
	
	public static void sum(int x, int y, int z) {
		System.out.println(x + "+" + y + "+" + z + "=" + (x+y+z));
	}//sum() end
	
	public static void average(String name,int eng ,int mat ,int phy,int mus, int ath) {
		double result = (double)(eng+mat+phy+mus+ath)/5;
		System.out.println("이름:"+name+"  평균:" +result);
	}//hap end


}//class end
