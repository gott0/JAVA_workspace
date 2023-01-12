package com.package1;

import com.package3.E;

public class A extends E{

	public int a;

	public A(int a) {
		super(10); //E의 생성자가 private하기 때문에 호출 불가
		this.a = a;
	}
	
	public void printA() {
		System.out.println(a);
	}
}