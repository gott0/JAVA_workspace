package com.java.print;

public class Print {

	public int x;
	public int y;
	
//	Print (){
//		super();   //Object 클래스의 생성자를 호출
//	}// - 기본생성자일 경우
	
   // ┌ 다른 패키지의  Tv클래스에서 현재의 클래스를 사용(포함)하기 위해 앞에 public을 붙여줘야된다.
	public Print(int x, int y) {
		this.x = x;
		this.y = y;
	} // - 기본생성자가 아닐 경우
	
	public String getLocation() {
		return "x: "+ x +", y: "+ y;
		
	}
}
