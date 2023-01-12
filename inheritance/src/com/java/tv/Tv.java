package com.java.tv;
//import com.java.print.Print; //사용하려는 클래스의 패키지가 다른 경우 import를 이용해 가져올 수 있다.
//import com.java.print.Print3D; // 단 사용하려는 클래스의 모든 멤버가  public으로 바꿔줘야 됨
//import com.java.print.*; // 패키지 전체의 클래스를 쓸 경우 .*을 써준다
//컨트롤+쉬프트+"o" (자동 import 단축기)

import com.java.print.Print3D; //자동 import 단축기를 이용한 경우

public class Tv { //상속과 포함을 같이 하는 경우

//	Print print = new Print(10,20); // 포함관계
//	                        //인스턴스 멤버 변수
	
	Print3D print = new Print3D(10,20,30);
	
	
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDwon() {--channel;}
	
}
