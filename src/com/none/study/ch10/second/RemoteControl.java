package com.none.study.ch10.second;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void seMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		}else {
			System.out.println("무음해제합니다");
		}//if end
	}
	
	static void changeBatter() {
		System.out.println("건전지를 교체를 교환합니다");
	}

}
