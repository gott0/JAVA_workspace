package com.package3;

public class D {
	C c = new C(10);
	//E e = new E(30); //error: 생성자가 private하기 때문(같은 패키지라도 접근이 안됨)
	F f = new F(30);
	


	void printD() {
		System.out.println(c.c);
		f.printF();
		f.f = 30;
	}
}
