package com.none.study.ch12.first;

import java.awt.Toolkit;

public class BeepPrintExample1 {

public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	 //소리를 내기 위한객체
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		for(int i=0; i<5; i++) {
			System.out.println("12");
			try { Thread.sleep(100); } catch(Exception e) {}
		}
	}
}
