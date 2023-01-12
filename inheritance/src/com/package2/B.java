package com.package2;

import com.package3.F;

public class B extends F{

	public int b;

	public B(int b) {
		super(10);
		this.b = b;
	}
	
	public void printB() {
		System.out.println(b);
		System.out.println(f);
		printF(); //B와 F는 다른 패키지이지만 
		          //상속구조에 있으면 부모 클래스의 접근제어가 
		          //protected일 시 예외적으로 접근가능 
	}
}