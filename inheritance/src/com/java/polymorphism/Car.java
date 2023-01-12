package com.java.polymorphism;

public class Car {
	String color;
	int door;

	void driver() {
		System.out.println("drive gogo");
	}

	void stop() {
		System.out.println("stop");
	}

   //*다형성(polymorphism)이란 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미합니다.
	// 매개변수 Car 타입으로 정의
	// Car -> Car,FireEngine,Ambulance 자식타입 객체를 값으로 받을 수 있다.
	void doWork(Car c) { // 매개변수를 활용한 객체의 다형성

		// c.water(); - error // 'water();'는  FireEngine클래스에만 존재하는 메소드
		                      // 따라서 현재의 Car타입 변수로는 사용 할 수 없다. 
                              // 사용하려면 FireEngine타입 변수를 사용 해야됨 
                              // (부모클래스 타입은 자식 클래스의 객체를 값으로 받을 순 있지만
		                      // 자식클래스의 메소드를 사용 할 순 없다.) 
		                      // = instanceof를 이용하여 객체 타입 확인 후 강제형변환하여 사용한다.
		
		// instanceof
		// 객체의 타입을 확인한다.
		if (c/* (참조변수) */ instanceof FireEngine /* 클래스이름(알고 싶은 타입) */) {
			FireEngine fe = (FireEngine) c;
			fe.water();
		} else if (c instanceof Ambulance) {
			Ambulance ab = (Ambulance) c;
			ab.siren();
		}

	}
}
