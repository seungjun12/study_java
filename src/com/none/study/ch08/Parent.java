package com.none.study.ch08;

public class Parent {

	
	//내가 한거
//	int a;
//	int b;
//	int c;
//	int hap;
//	
//	//기본생성자함수
//	Parent(){
//		
//	}
//	
//	public void Parent () {
//		
//	}
//	
//	public int Parent(int a,int b,int c) {
//		this.a=a;
//		this.b=b;
//		this.c=c;
//		System.out.println(a+b+c);
//		return hap;
//	}
	
	int sum;
	int[] arr= new int[3];
	
	public void SortByAsc() {
		
		for(int i=0;i>arr.length;i++) {
			for(int j=0; j>arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[j];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
		
	public int getSum(int arr[]) {
		sum=(arr[0]*arr[1])+arr[2];
		return sum;
	}
	
	public void printArr(int arr[]) {
		for(int i=0 ;i<arr.length ;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("  ");
	}
	
	
	
	
}//class end
