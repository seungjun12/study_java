package com.none.study.ch06;

public class Board {

	//field 
	String name;
	int hits;
	boolean use;
	
	//기본생성자 함수
	Board(){
		
	}
	
	Board(String name){
		this.name=name;
	}
	
	Board(String name,int hits){
		this.name=name;
		this.hits=hits;
	}
	
	Board(String name,boolean use){
		this.name=name;
		this.use=use;
	}
	
	Board(String name, int hits, boolean use){
		this.name=name;
		this.hits=hits;
		this.use=use;
	}

	
}//class end
