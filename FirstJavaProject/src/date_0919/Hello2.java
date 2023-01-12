package date_0919;

public class Hello2 { //클래스명은 항상 대문자로 시작

	public static void main(String[] args) {
		System.out.print("Hello World!!2");
		System.out.print("Hi~~");
	
		System.out.println(); //줄바꿈(println)
		
		System.out.println("Hello World!!2");
		System.out.println("Hi~~");
		
		System.out.printf("%d\n", 10);  // 숫자 (printf) => 데이터 타입이 정수(byte,short.int,long)일 때 "%d", 실수(float,double)일 때 "%f"
		System.out.printf("%d\n", 20); 	
		System.out.printf("제 나이는 %d살 입니다.\n",30); // (예시)
		
		System.out.printf("%s", "안녕하세요\n");  // 문자(printf) => 데이터 타입이 Char일 때 "%c" , String일 때 "%s"
			
//		%d	정수형 출력
//		%f	실수형 출력
//		%s	문자형 출력
//		%c	문자열 출력
//		%n	줄 바꿈
//		%b	boolean 출력
		
		
		System.out.println("자동완성"); // syso + ctrl + space => 자동완성
		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		드레그 + Ctrl + /  =>  여러줄 주석 처리 
	}

}
