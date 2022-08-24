package com.none.study.ch06;

public class BoardExample {

	public static void main(String[] args) {
		
		Board board1=new Board();
		
		System.out.println("초기값");
		System.out.println(board1.name);
		System.out.println(board1.hits);
		System.out.println(board1.use);

		System.out.println("---------------");
		///////////////////////////////////////////
		Board board2=new Board("승준");
		
		System.out.println("board2.name:"+board2.name);
		System.out.println("board2.hits:"+board2.hits);
		System.out.println("board2.use:"+board2.use);
		
		System.out.println("----------------------");
		//////////////////////////////////////////////
		Board board3=new Board("동건",20);
		
		System.out.println("board3.name:"+board3.name);
		System.out.println("board3.hits:"+board3.hits);
		System.out.println("board3.use:"+board3.use);
		
		System.out.println("-------------------------");
		////////////////////////////////////////////////
		Board board4=new Board("철수",true);
		
		System.out.println("board4.name:"+board4.name);
		System.out.println("board4.hits:"+board4.hits);
		System.out.println("board4.use:"+board4.use);
		
		System.out.println("-------------------------");
		///////////////////////////////////////////////////
		Board board5=new Board("영미",500,false);
		
		System.out.println("board5.name:"+board5.name);
		System.out.println("board5.hits:"+board5.hits);
		System.out.println("board5.use:"+board5.use);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
