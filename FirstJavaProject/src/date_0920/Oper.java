package date_0920;

public class Oper {

	public static void main(String[] args) {
		//산술연산자
		//+,-,*,/(몫),%(나머지)
//
//		int x = 5;
//		int y = 2;
//		
//		System.out.println(x/y);
//		System.out.println(x%y);
		
		
		//상수  - 변경이 불가
//		final double PI = 3.14; // 상수명은 대문자로 쓰기로 약속하기도 함 
//		  //변수 앞에  final을 추가하면 상수가 됨.
//		System.out.println(PI);
		
		//형변환(자료형 or 데이터타입)
		// int -> double
		//boolean은 제외
		//-----------------------------------> 자동형변환
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//     char(2)       <
        //               강제형변환     <-------------------------------------
		
		
//		byte b = 85;
//		int i = b;     //자동형변환 - 문제x
		
		
//		int i = 85;
//		byte b = (byte)i;  //강제형변환
//		          //괄호 안에 변화타입 기입

//		int i = 300;
//		byte b = (byte)i; // 300이지만 결과값이 44가 나옴, 강제형변환 시 (값의 손실) 발생
//		
//		System.out.println(b);
		
//		double d = 3.14;
//		int i = (int)d;
//		System.out.println(i); // 결과값이 3이 나옴 소수점자리가 손실됨.
		
//		int i = 3;
//		double d = i;
//		System.out.println(d);
		
		
//		byte b = 65;
//		char c = (char)b; //결과값이  'A'가 나옴
//		System.out.println(c);
		
//		int x = 10;
//		int y = 20;
//		int result = x + y;   //30
	
		
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = b1 + b2; // 자동형의 승격 : int 보다 작은 타입은 연산과정 중 자동으로 int로 바뀜
//          //byte b = int + int           		
//		byte result =(byte)(b1 + b2); //or (byte)b1 + (byte)b2
		                
      //*연산 시 자동형변환*
//		 byte + byte -> int + int
//		 byte + short -> int + int
//		 char + byte -> int + int
		
//	    int + long -> long + long
//     	int + float -> float+ float
//		float + double -> double + double	
		
		
//		int x = 5;
//		int y = 2;
//		double result = x/y; //2.0
//		double result = x%y; //1.0
//		System.out.println(result);
		
//		int x = 3;
//		int y = 5;
//		//double result = x / y; //0 
//		double result =(double) x / y; //0.6
//		System.out.println(result);
		

//		String str = "java";
//		double ver = 1.8;
//		String result = str + ver; // "java" + "1.8" -> "java1.8"
//		System.out.println(result);
		
//      ** String + anytype => String
//		 String + double => String + String => String
				
		    
      // + => 산술, 연결,부호

	   //증감연산자 : 값을 1 증가, 값을 1 감소
		// ++ , --
		// 변수에만 사용가능
		//전치 , 후치

//		int x = 10;
//		++x;  // x++ (단독으로 사용될 땐 둘은 큰 차이가 없다.)
//		System.out.println(x);
//		x++;
//		System.out.println(x);
//		--x;
//		System.out.println(x);
//		x--;
//		System.out.println(x);
		
//		 int x = 10;
//		 int y = 0;
		 
//		 y = ++x + 10; // ++이 수선순위가 가장 높기 때문에 먼저 적용(계산)되고 식 진행.
//		 System.out.println("x= " + x + "," + "y= " + y );  // x(++x) = 11 , y = 21
		 
//		 y = x++ + 10; // x(++x) = 11 , y = 20
//		 System.out.println("x= " + x + "," + "y= " + y );
		 
		 //전위(전치)연산자 => ++x , --x : x를 1 증가 or감소하고 증감된 값 반환
		 //후위(후치)연산자 => x++ , x-- : x를 1 증가 or감소하고 증감 전의 값 반환
		 
		 
		//대입연산자
		 //변수에 사용되는 연산
		 // = , += , -= , *= , /= , <<= , |= , ....  (=은 항상 오른족)
				 
//		 int x = 10;
//		 x += 10; // x = x + 10
//		 System.out.println(x);
//		 
//		 x -= 10; // x= x - 10
//		 System.out.println(x);
//		 
//		 x *= 2;
//		 System.out.println(x);

	   //비교연산자
		// < , > , <= , >= , == , !=
		// truf , false가 결과로 나온다

//		int x = 10;
//		int y = 20;
//		
//		System.out.println(x < y);
//		System.out.println(x >= y);
//		System.out.println(x == y);
//		System.out.println(x != y);
		
		
	   //논리연산자
		// &&(and) , ||(or) , !(not)
		// 두가지 이상의 조건을 확인할 때 사용.
		
		
//		int x = 10;
//		int y = 20;
//		int z = 30;
//		
//  		System.out.println(x == 10);
//  		System.out.println(y == 20); // ex) 이 두가지를 한번에 하기 위해 아래와 같이 시행
//		
//		System.out.println(x == 10 && y == 20);  // true && true  => true
//		System.out.println(x == 10 && y == 30);  // true && false => false
//		System.out.println(x == 50 && y == 30);  // false && false => false
//		System.out.println(x == 10 && y == 20 && z == 40);
//		
//		  !true -> false
//		  !false -> true
//		
//		System.out.println(!(x==10));   
//		
//		System.out.println(3.45 <= 2);    // double <= int -> double <= double (연산자가 붙어서 자동 형변환) -> double
		
           
	   //조건연산자(삼항연산자)
		//   형식 ->>        조건식           ?  결과1  :  결과2
		//          (true or false) ? (true)  (false)
		
		int x =10;
		int y = 20;
		
		int result = (x>y) ? x : y;
		 // ㄴ결과값 형태로 나타내줘야되서 result 부여.
		System.out.println(result);
		
		
		//ex)
		int age = 20;
		String rs = (age >= 20) ? "성인입니다" : "미성년 입니다";	
		// ㄴ 문자열의 결과값이라 String으로 부여.
		System.out.println(rs);	
		
	
	}
	
	

}
