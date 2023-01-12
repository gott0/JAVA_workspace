package com.java.capsule;

public class Time {
	private int hour;
	private int minute;
	private int second;
    // └다른 클래스에서는 불러오지 못 하지만,같은 클래스에선 가능
	// getter/setter메소드를 활용하면 다른 클래스에서 불러오기가 가능
	final double PI;
	//└상수(값을 변경 할 수 없는 데이터)로 만들기 위해 'final' 앞에 붙인다.
	//상수의 경우 변수를 대문자로 (개발자규칙)
	//상수 생성자를 통한 초기화 가능
	public Time(double pI) {
		super();
		PI = pI;
	}
	
	
  //getter / setter 메소드
	public int getHour() { //가져(읽어)오는 거
		return hour;
	} 

	public void setHour(int hour) { //만드는 거
		if(hour < 0 || hour > 23) {
			System.out.println("유효하지 않은 값입니다.");
			return;
		}// 시간 외의 숫자 기입 시 해당 문구 출력 = 유효성검증
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(minute < 0 || minute > 23) {
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(second < 0 || second > 23) {
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
		this.second = second;
	}
	// => source - generate getter and setter 메뉴로 만들 수도 잇음
	
	
	
	//getter메소드 /setter메소드 만들기
	
//         // ┌리턴을 위해 변수 타입과 같게 해준다.
//	public int getHour() { //get,set 뒤에는 변수이름을 붙이고 변수이름의 첫글자는 대문자로 해서 메소드명을 짓는다.(규칙)
//		return hour;		
//	}
//	      //┌리턴하지 않으니 타입을 맞출 필요 없음
//	public void setHour(int hour) {
//		this.hour = hour; //└변수 타입을 멤버변수와 맞춰준다.
//	}
//	
//	public int getMinute() {
//		return minute;		
//	}
//	
//	public void setMinute(int minute) {
//		this.minute = minute;
//	}
//	public int getSecond() {
//		return second;		
//	}
//	
//	public void setSecond(int second) {
//		this.second = second;
//	}
}