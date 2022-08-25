package com.none.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//부모클래스 객체 생성 함수 호출
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		cellPhone.powerOff();
		cellPhone.bell();
		cellPhone.sendVoice("안녕하세요");
		cellPhone.receiveVoice("넵ㅎㅎ");
		cellPhone.hangUp();
		
		//자식클래스 객체 생성 함수 호출
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("13pro","black",12);
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(16);
		dmbCellPhone.turnOffDmb();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(19);
		dmbCellPhone.turnOffDmb();
		
	}//main() end
}//class end
