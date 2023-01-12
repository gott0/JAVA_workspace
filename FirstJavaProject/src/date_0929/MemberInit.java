package date_0929;

public class MemberInit {
	
	//멤버변수
	//초기화 진행 순서: 자동초기화 - 명시초기화 - 초기화 블럭 - 생성자에 의한 초기화
	int x;
	int y;
	static int cv = 100;
	static int count;

	{ //인스턴스 초기화 블럭 (객체가 생성될 때마다 호출)
		System.out.println("인스턴스 초기화 블럭");
		x = 10;
		y = 20;
	}
	
	static { //static 초기화 블럭 (객체 생성 시 딱 한번만 호출)
		System.out.println("static 초기화 블럭");
		count = 1000;
	}
	
	MemberInit(int x, int y){ //인스턴스 메소드
		System.out.println("생성자의 호출");
		this.x = x;
		this.y = y;
		
	}
	
	
	//(멤버변수의 초기화를 위한 방법들)
}
