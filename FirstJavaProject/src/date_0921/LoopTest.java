package date_0921;
import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		//반복문 : 실행문을 여러번 동작하게 한다.
		//for, while, do-while
		
//		for(초기값;조건식;증감식) {
//			실행문
//		}
		
//		for(int i = 0; i<10; i++) { // 0,1,2,3,4,5...,9
//			System.out.println(i+"hello");
//		}
		
//		                  //i=i+2
//		for (int i=0; i<10; i+=2) { // 0,2,4,6,8
//			System.out.println(i+"hello");
//		}
		
//		for(int i = 10; i > 0; i--) { // 10,9,8,...,1
//			System.out.println(i+"hello");
//		}
		
		
//		for(;true;) { //무한반복문
//			System.out.println("hello");
//		}
		
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
	
		
		//Q - 1~10 사이의 정수 값 중에 짝수 출력
//		    for (int i = 1; i <= 10; i++) {
//		       	if(i * 2 <= 10) {System.out.println(i * 2);
//			    } //내 답안
			
//		    for (int i = 1; i <= 10; i++) {
//			    if(i % 2 == 0) {System.out.println(i);
//			    } // 선생님 답안
			

		 // 1 + 2 + 3 +...+ 10 => 55
			
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i; // => sum += i;
////			0      0    1
////			3      1    2
//		}
//			System.out.println(sum);
		
		
		//Q - 1 ~ 10까지의 정수 중에 홀수의 합과 짝수의 합을 각각 구해서 출력.
		
//		int sum = 1;
//		for ( i=1; i<=10; i++) {					
//			System.out.println("홀수합: "); // 실패...ㅠ
			
		
//		int odd = 0; //홀수  //초기값을 "1"로 둿을 경우엔 2부터 더하는 식이 되므로 "0"으로 초기값 설정. 
//		int even = 0; // 짝수
//		
//		for (int i=1; i<=10; i++) {
//			if (i % 2 == 1) {odd += i;
//		} else {even += i;}
//		}
//		System.out.println("홀수합 : "+ odd);
//		System.out.println("짝수합 : "+ even); //선생님 답(구하는 출력 값이 2개 따라서 그에 해당하는 두개의 변수값을 만듦)
		
		
//		초기값
//		while(조건식) {
//			실행문
//			증감식
//		}
		
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int i = 10;
//		while (i > 0) {
//			System.out.println(i);
//			i--;		
//		}
	
//		int sum = 0;
//		int i = 1;
//		while (i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
	
		
//	   //while 무한반복
//		while(true) {System.out.println("hello");
//		}
//		
//	   //응용
//		boolean flag = true;  //무한 반복 중 조건에 닿으면 멈추게하기 위해 적용
//		int cnt = 0;
//		while(flag) {
//		cnt++;
//		System.out.println(cnt);
//		if(cnt > 100) { flag = false;}
//		}
		
//	   //중첩 for 문
//		for() { // n번 실행                 (전체반복 횟수(실행문 반복 횟수)는 n x m)
//			for() { // m번 실행
//				실행문
//			}
//				
//		}
//		int k = 1;
//		
//		for(int i=0; i<5; i++){ //밖의 초기값 변수와 안의 초기값 변수가 같으면 안 됨!
//			for(int j=0; j<5; j++) {
//				System.out.println(k++);
//			}
//		}         
//		i -> 0 0 0 0 0 1 1 1 1 1 ...4 4 4 4 4 (i값 고정
//		j -> 0 1 2 3 4 0 1 2 3 4 ...0 1 2 3 4 (j값 먼저 변함
		
//		ex) 구구단 활용
//		for(int i=2;i<=9;i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"x"+j+"="+i*j);
//			}
//			System.out.println("===");
//		}
	
//		ex) 구구단 활용 (옆으로 찍힘)
//		for(int i=1;i<=9;i++) {
//			for(int j =2; j<=9;j++) {
//				System.out.print(+j+"x"+i+"="+j*i+" ");
//			} System.out.println();	
//			}
		
		
//	   //while 중첩
//		초기값1
//		while(조건식) {
//			초기값2
//			while(조건식) { 
//				실행문
//				증감식2
//			}
//		     증감식1}
		
//		int k=1;
//		int i=0;
//		while (i<5) {
//			int j=0;
//			while(j<5) {
//				System.out.println(k++);
//				j++;
//			}
//			i++;
//		}
		
	
	//ex) while을 이용한 구구단
		
//		int i = 2;
//		while(i<=9) {
//			int j = 1;
//			while(j<=9) {System.out.println(i+"x"+j+"="+i*j);
//			j++;
//			}
//			i++;
//		}

//		// while을 이용한 구구단2
//		int i = 1;
//		while (i<=9) {
//			int j=2;
//			while(j<=9) {System.out.print(j+"x"+i+"="+j*i+" ");
//			j++;}
//			System.out.println();
//		i++;
//		}
		
		
		//for 활용
//		for(int i=0, j=10; i<10; i++,j--) {
//			System.out.println("i: "+i+" , "+"s: "+j);
//		}
		
//		int s = 0;
//		int i; // 블록 밖에서 i를 설정
//		for (i = 0; i < 10; i++,s++)//블록 밖에서 i의 타입을 설정 했으므로 int를 붙이지 않음 
//			{System.out.println("i: "+i+" , "+"s: "+s);
//		}
//		System.out.println(i); // i를 블록 밖에서 설정해주면 적용 가능
		
		
	//do-while문
		
//		초기값
//		do {
//			실행문
//			증감식
//		}while(조건식); //마지막 세미콜론 중요!
		
				
//		int i = 11;
//		do {
//			System.out.println(i);
//			i++;
//		} while(i<=10); // 조건이 맞지 않더라도 초기값은 무조건 찍힌다.
		
		
		
	//중첩
//		do {
//			do {
//				
//			}while();
//		}while();
	
		
		
	//Q 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과 출력

//		int sum = 0;
//		int tot = 0;
//		for(int i = 1; i<=10;i++) {
//			sum += i;   // sum = sum + i => (0+1) (0+1+2) (0+1+2+3) (0+1+2+3+4) => sum의 연산값들
//			tot += sum;   // sum의 연산값들을 다 더하면 됨 그것이 tot
//		}          
//		System.out.println(sum);
//		System.out.println(tot);
//	}
	
		
      //반복문의 제어
	   //break , continue
	   //조건문 안에서 사용한다.
		
//		for(int i=1; i<=10; i++){
//			if(i>5)//if라는 조건문 부여 
//			{
//				break; //반복문의 종료
//			}
//			System.out.println(i);
		
		
	

	
//		for(int i=1; i<=10; i++) {
//		if(i % 2 == 1) {
//			continue; // 조건을 실행하지 마라.
//		} System.out.println(i);
//	}      //짝수만 실행됨 (2,4,6,8,10)

                        // └둘은 같은 결과값┐

//        [비교]   for (int i = 1; i <= 10; i++) {
//		    if(i % 2 == 0) {System.out.println(i);
//		    }      //짝수만 실행됨 (2,4,6,8,10)			
//	==================================================
			
// Q 12345 -> 1+2+3+4+5 -> 15가 출력되게
		
//		Scanner sc = new Scanner (System.in);
//		int num = sc.nextInt(); //몇번 반복할지 모르는 경우 조건이 간단한  while문 쓰는게 편리. (for을 써도됨)
//		
//		int sum = 0; // 임의의 변수를 정해주고 나누기의  나머지(자릿수의 숫자)를 여기에 더해준다.
//		
//		while(num > 0) {
//			sum += num % 10;
//			num = num /10; //  => num /=10;
//		}
//		
//		System.out.println(sum);
		
		//12345 % 10 -> 5     //12345는 입력된값, 12345 % 10 -> 5 = num
		//12345 / 10 -> 1234
		//1234 % 10 -> 4
		//1234 / 10 -> 123
//		. 
//		.
//		num > 0이 될때까지
	
		//방정식 2x+4y=10의 모든 해를 구하시오. 단 , x와 y느 정수이고 각각의 범위는
		//0<=x<=10 , 0<=y<=10이다.
		
		//[실행결과]
		//x=1, y=2
		//x=3, y=1            x+2y=5
		//x=5, y=0
		
			
//		for (int x=0; x<=10; x++) {
//			for (int y=0; y<=10; y++) {
//				if(2*x+4*y == 10) {
//					System.out.println(x+" , "+y);
//				}
//			}
//		}
		
		
		// Q 1+(-2)+3+(-4)+...과 같은식으로 더해나갔을 때, 몇까지 더해야 총합이
				//100이상이 되는지 출력하세요.
				
				
//				int sum = 0;
//				int s = 1; 
//				int num =0;
//				int i;
//				for( i =1; true; i++, s=-s) { // true 덕에 무한반복문이 됨
//					num = s*i;
//					sum += num;
//					if(sum>=100) {
//						break;
//					}
//				}		System.out.println(sum+","+i);
		
		
		
		
		
    }		     
  }

