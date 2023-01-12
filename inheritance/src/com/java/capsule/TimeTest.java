package com.java.capsule;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(3.14);
		//t.hour = 48;   //0~23
		t.setHour(48);
		System.out.println(t.getHour());
		
	}
	
	//상속 : extends
	//다형성 : 오버로딩, 오버라이딩 , 상속을 활용
	//캡슐화(데이터보호): 접근제어자(private)
}
