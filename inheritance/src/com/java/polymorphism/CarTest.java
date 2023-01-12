package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {
//		FireEngine f = new FireEngine();
//		Ambulance ab = new Ambulance();
		
		//다형성을 적용한 객체생성
		//참조형의 형변환(참조할 수 있는 멤버의 갯수가 변한다.)*
//		Car car = null;
//		FireEngine fe = new FireEngine(); // 참조변수는 주소값을 공유
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe; // '자동형변환' : Car 타입 = FireEngine 타입(부모=큰타입, 자식=작은 타입 - '상속구조에서 가능')
//		          // double = int (앞에 있는 데이터 타입이 크면 가능하다 - 값의 범위에 의한)
//		//car.water(); error - 내부적으로 형변환이 일어나 변수가 Car타입이 되므로 FireEngine의 멤버를 사용할 수 없다.
//		car.stop();
//		fe2 = (FireEngine)car; // 작은 타입(fe2)에 큰 타입(car)을 적용 시킬땐 '강제형변환'시행
//		fe2.water();
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance(); //자식
		
		Car car = new Car(); //부모
		car.doWork(fe);
		car.doWork(ab);
	}

}
