package date_0929;

public class FuncStatic {
	int iv;
	static int cv;

	// 멤버 메소드 :인스턴스 메소드
	//            └┌ -인스턴스 변수, 클래스 변수 모두 사용 가능
	//             └ -인스턴스 메소드, 클래스 메소드  모두 사용 가능
	//         클래스(static) 메소드
	//            └┌ -객체생성없이 사용가능
	//             └ -클래스 변수,클래스 메소드만 사용가능

	void instanceMethod() {
		System.out.println("instanceMethod() call");
		iv = 10;  // 자신의 클래스 안에 정의 된 멤버들은 서로 가져와서 사용할 수 잇다. but~!
		cv =20;
		
		System.out.println("iv = "+iv);
		System.out.println("cv = "+cv);
		
		staticMethod(); // 가능
	}

	static void staticMethod() {
		System.out.println("staticMethod() call");
		//iv = 30;  // 메모리 할당 시점이 static 멤버들 보다 이후이기 때문에 사용할 수 없다. 
	     	        //   └(스태틱 메소드에서 인스턴트 변수 사용 불가) 
		cv = 40;
		
		System.out.println("cv = "+cv);
		
		//instanceMethod(); //인스턴스 메소드 사용 불가능 (생성 시점이 다르기 때문)
	}

	
	
	
	// 4개의 멤버 (2개의 변수, 2개의 메소드)
}
