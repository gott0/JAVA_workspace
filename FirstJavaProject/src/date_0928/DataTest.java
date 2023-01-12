package date_0928;

public class DataTest {

	public static void main(String[] args) {

		Data d = new Data(); // 객체 생성

//		d.x = 10;
//		System.out.println(d.x); // 10
//
//		change(d.x); // 1000           ┐ 함수에 대입 된 d.x와 (= 복사 된 도 다른 d.x값)
//		System.out.println(d.x); // 10 ┘ 출력되는 d.x는 다르다 => 함수가 출력 값에 영향을 주지 않음.
//
//	}
//
//	// ┌change = 메소드명
//	static void change(int x) {// 여기의 x는 지역변수이기에 복사된 d.x의 값이라고 보면 됨.
//		x = 1000;
//		System.out.println("change() : " + x);
//	}

//                   =================================================

		d.x = 10;
		System.out.println(d.x); // 10

		change(d); // change() : 1000

		System.out.println(d.x); // 1000

	}                   // ┌같은 class타입이므로 같은 주소값을 공유하게 됨.
                       //┌ └때문에 함수의 해당 주소의 값이  10->1000으로 바뀌었고 이는 출력 값에 영향을 줌. 
	static void change(Data d) {// 참조변수: 매개변수 Data는 주소값을 받는다(매개변수 :이어준다)
		d.x = 1000; // └ 참조형변수의 경우 :같은 class 타입인 경우 or 배열
		System.out.println("change() : " + d.x);
	}  //*매개변수 :함수 호출 시  전달 된 인수를 함수 내부에서 사용할 수 있게 하는 변수.
         
//                 ======================================================	

//	   Data d =new Data(); // ex) 임의의 주소값 ox100
//	   d.x = 10;
//	
//	   Data d2 = copy(d);
//	   
//	   System.out.println(d.x);  // 10
//	   System.out.println(d2.x); // 10
//	
//	}
//	
//	static Data copy(Data d) {// Data d = 주소값
//		
//		Data tmp = new Data();
//		tmp.x = d.x;
//		
//		return tmp; // 리턴 타입은  Data 따라서 tmp를 리턴
//	}

	   // 매개변수에 따른 분류
	//call by value(기본형): 8가지 (boolean, char, byte, short, int, long, float, double)
	//call by reference(참조형): 기본형 8가지를 제외한  나머지

}