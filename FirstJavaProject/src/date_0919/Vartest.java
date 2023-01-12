package date_0919;

public class Vartest {

	public static void main(String[] args) {
		//(숫자, 문자,문자열  // 날짜,이미지,동영상)
		
		//변수 : 값을 저장하는 공간, 값을 변경할 수 있다.
		//변수의 선언 =>> 자료형 변수명; 
		
        //숫자: 정수 , 실수
        //  ㄴ정수: byte, short, int, long
		//  ㄴ실수: float, double
	
		//문자: 문자, 문자열
		//  ㄴ문자: char
		//  ㄴ문자열: string
		
		//논리 : boolean
		
		byte b;
		b = 10;
		System.out.println(b);
		
		b = 20;
		System.out.println(b);
		
//		int i;
//		i = 10;
//		System.out.println(i);
		
		int x;
		int y;   // 타입이 같다는 전제 하에  =>> int x,y,z; 로 쓸 수 있음
		int z;
		                            // int x=10.y=20.z=30; 처럼 둘을 일체화 할 수 있다
		x=10;
		y=20;    // 값이 같다면 =>> x,y,z = 10; 으로도 쓸 수 있다.
		z=30;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		long l =10L; //접미사인 L은 선택적으로 붙이면 됨
		
		
//		char c; // 컴퓨터는 문자를 숫자로 인식하기 때문에 엄연히 따지면 정수형 타입이다.
//		c = 'a';
//		System.out.println(c);
//		
//		char c2 =  '가';
//		System.out.println(c2);
		
		System.out.println();
		
		char c= 'A'; //컴퓨터 언어로 "A"는 "65"
		int i = c;
		System.out.printf("%c\n",c); // 문자로 인식되어 출력값이 문자
		System.out.printf("%d\n",i); // 숫자(정수)로 인식되어 출력값이 숫자  
		
		char c1,c2;
		c1='A'; // 65
		c2='B'; //66
		System.out.println(c1 +c2); // 'A' + 'B'[타입은 문자지만 연산이 적용됬기 때문에 쌍따옴표(")가 없을 시 숫자로 인식되어 출력.]
		 // 'A' =>> 65, 'a' =>> 96, '0'->48 
		
		String str = "A";
		String str2 = "abc";
		
		System.out.println(str);
		System.out.println(str2);
		System.out.printf("%s\n",str);
        System.out.printf("%s\n", str2);
		
		float f = 3.14f; // float의 경우 접미사( F,f )는 필수.
		System.out.println(f);
		System.out.printf("%f\n",f);
		System.out.printf("%.3f\n",f); // 소수점이 너무 길면 퍼센트기호 뒤에  ".x"를 붙이면  소수점 x자릿수까지 보여줌
		
		double d=3.14; // 타입이 double일 때 접미사d는 필수가 아니라 선택이다
		System.out.println(d);
		System.out.printf("%.2f",d);  

		//자료형의 기본타입
		//정수: int
		//실수: double
		
		boolean b1;
		b1=true;
		System.out.println(b1);
		b1=false;
		System.out.println(b1);
		
		
		
		//변수의 기본 값 ㄱ
		
//		boolean => false
//		byte => 0
//		short => 0
//		int => 0
//		long => 0L
//		
//		char => '' // 칸 벌림 하면 안됨
//		
//		float => 0.0f
//		double => 0.0d
//		
//		String => null, "" // 칸 벌림 상관없음
		
		
//		리터널 : 변수에 사용되는 값.			
		}

}
