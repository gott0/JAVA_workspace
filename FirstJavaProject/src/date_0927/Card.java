package date_0927;

public class Card {
	//속성
	//멤버 변수(자동초기화): 
    //   인스턴스 변수 - ex) int age - 인스턴스(객체)마다 변수값 변한다.
	//   클래스(스태틱)변수 - ex) static int size
	//                      필요에 따라서 선언과 동시에 초기화 한다.
	//                      객체 생성없이 사용가능하다.(인스턴스 생성없이 클래스에 저장 가능) 
	//                      **공유되어진다. 
    //                      인스턴스(객체)에 따라서 변하지 않는 값이 필요한 경우.
	//                          - 인스턴스(객체)마다 변수값 고정.
	//                            (but.메인 함수에서 임의로 변환 가능)
    //                                ex) class에서 설정 >> static int cv = 100;
	//                                    main에서 변환   >> Card.cv = 200;
	//                                    결국 "static int cv = 200;"이 됨
	
	//	int iv;
//	static int cv = 100;
	
//	void channel() {
//		int x; //지역변수 (강제 초기화): 클래스 안의 블록(중괄호) 안에서  적용되는 변수.
//	}
	
	//카드의 속성 : 숫자, 모양, 크기 (높이,넓이),...
	int number;   // 인스턴스 변수
	String kind;  // 인스턴스 변수
	static int height = 100; //스태틱 변수
	static int width = 80;   //스태틱 변수
}
