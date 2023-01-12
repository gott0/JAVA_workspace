package date_0928;

public class Func {

	//메소드(함수) : 객체의 기능을 구현한다.
	               // ┌() 안은 생략가능
//	리턴타입 메소드명 ([매개변수1,매개변수2,...,]){
//		실행문장
//		[return 값]
//	}			
	
	//리턴타입 : void,기본자료형,참조형
	//메소드명 : 낙타 표기법
	//매개변수 : int x, double d, Tv t
	//return: 리턴타입이 void가 아닌 경우에 사용한다.
	
	void add() {   //메소드의 선언부(시그니처)
		System.out.println(2+3);  // 메소드의 구현부
	}
	
	void add2(int x, int y){
		System.out.println(x+y);
	}
   //┌ return이 사용 될 땐 void를 변수의 타입으로 바꿔준다
	int add3(int x, int y){ //매개변수 int x,y도 지역변수
		int sum = x + y; //sum = 지역변수
		return sum; // 결과값을 반환해준다.
	}
	
	int sub(int x, int y){
		int sub = x - y; 
		return sub; 
	}
	
	int mul(int x, int y){
		int mul = x * y;
		return mul; 
	}
	
	double div(double x, double y){
		double div = x / y; 
		return div; 
	}
	
	void test(int x,int y) {
		
		if(x<y) {
			System.out.println("함수의 종료");
			return; // 함수의 즉시 종료 (함수 타입에 관계없이 - void도 상관없음)
		}
		
		int result = x+y;
		System.out.println(result);
	}
	
	int test2(int x, int y) {
		
		int result;
		
		if(x>y) {
			result = x; 
		}else {
			result =  y; // 가능하다면  return구문을 최소한으로 사용하기!
		}
		return result;
	} //리턴 사용 시 조건에 해당하지 않는 경우도 설정을 해줘야 됨.
	
	
	void call1() { //같은 클래스 내에서도 함수를 호출 할 수 있다.
		System.out.println("call1");	
		call2();
	}
	
	void call2() {
		System.out.println("call2");	
		call3();
	}
	
	void call3() {
		System.out.println("call3");		
	}
	
}

