package com.none.study.ch04;

public class ForExample {

	public static void main(String[] args) {
		
		//1
		for(int i=1;i<=5;i++) {
			System.out.println("***********");
		}//for end
		
		System.out.println("----------------------------");
		
		//1 선생님
		
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		//2
		for(int i=1 ;i<=5 ;i++) {
			if(i>=2 && i<=4) {
				System.out.println("*        *");
			}else {
				System.out.println("**********");
			}//if end
		}//for end
		
		System.out.println("-------------");
		
		//2 선생님
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}//if end
				}else {
					System.out.print("*");
				}//if end
			}
			System.out.println();
		}
		
		//3
/*망한 버전
 		int a=1;
		int b=2;
		int c=3;
		int d=4;
		int e=5;
		int f=6;
		int g=7;
		int h=8;
		int i=9;
		
		for(a=1;a<=9;a++) {
			for(b=2;b<=9;b++) {
				for(c=3;c<=9;c++) {
					for(d=4;d<=9;d++) {
						for(e=5;e<=9;e++) {
							for(f=6;f<=9;f++) {
								for(g=7;g<=9;g++) {
									for(h=8;h<=9;h++) {
										for(i=9;i<=9;i++) {
											System.out.println(a b c d e f g h i);
										}
									}
								}
							}
						}
					}
				}
			}
		}
*/

		for(int i=1;i<=10;i++) {
			if(i==1) {
				System.out.println(1);
			}else if(i==2) {
				System.out.println(12);
			}else if(i==3) {
				System.out.println(123);
			}else if(i==4) {
				System.out.println(1234);
			}else if(i==5) {
				System.out.println(12345);
			}else if(i==6) {
				System.out.println(123456);
			}else if(i==7) {
				System.out.println(1234567);
			}else if(i==8) {
				System.out.println(12345678);
			}else if(i==9) {
				System.out.println(123456789);
			}else {
				System.out.println("1 3 5 7 90");
			}//if end
		}//for end
		
		//3-1
		
		System.out.println("--------------------------");
		
		String a ="";
		
		for(int b=1;b<=10;b++) {
			if(b==10) {
				a="";
				for(int c=1;c<=10;c++) {
					if(c==10) {
						a+="0";
					}else {
						if(c%2==1) {
							a+=Integer.toString(c);
						}else {
							a+=" ";
						}//if end
					}//if end
				}//for end
				System.out.println(a);
			}else {
				a+=Integer.toString(b);
				System.out.println(a);
			}//if end
		}//for end
		
		System.out.println("--------------------------------");
		
		//3 선생님 버전
		
		for(int i=1 ;i<=10 ; i++) {
			if(i==10) {
				for(int j=1;j<=i;j++) {
					if(j%2==1) {
						System.out.print(j);
					}else {
						System.out.print(" ");
					}//if end
				}//for end
				System.out.println("0");
			}else {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}//for end
				System.out.println();
			}//if end
		}
				
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() end
}//class end
