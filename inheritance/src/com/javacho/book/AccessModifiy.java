package com.javacho.book;

import com.package2.B;
import com.package3.E;

public class AccessModifiy {

	public static void main(String[] args) {
	//*접근제어자
		//private < default < protected < public
		//public : 모든 패키지 경로에서 사용가능
		//protected : 같은 패키지 또는 상속받는(자녀클래스) 관계에 있는 다른 패키지에서 사용가능
		//default : 같은 패키지
		//private : 클래스 내에서만 사용가능
		
		//클래스: public , default
		//변수: public , protected , default , private
		//생성자: public , protected , default , private
		//메소드: public , protected , default , private
		//단 지역변수는 사용불가.
		
		//public한 경우에만 패키지와 상관없이 생성과 상속이 가능하다.
		//단, protected는 상속에 의해 다른 패키지에서 사용이 가능함.
		
		//(따라서 생성자와 private한 요소들은 상속이 불가능하다.)
		
		
		B b = new B(10);
		//C c = new C(10); //error: 생성자가 default하기 때문(public으로 안 바꿔줘서)
		//E e = new E(30); //error: 생성자가 private하기 때문
		//F f = new F(50); // error: 생성자가 private하기 때문
		
	}
}