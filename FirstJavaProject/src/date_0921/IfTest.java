package date_0921;
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		//조건문 : 실행문장을 선택적으로 실행
		//if, switch ~ case
		//if(조건식(true or false)){실행문}
		 
//		int age = 15;
//		if(age >= 20) {
//			System.out.println("성인입니다.");
//		} else {System.out.println("미성년입니다.");
//		}
		 
//		int num =10;
//		if (num % 2 == 1) {
//			System.out.println("홀수");
//		} else {System.out.println("짝수");
//		}
		 
//		int score = 85;
//		if (score >= 90) {
//			System.out.println("A학점");
//		} else if (score >= 80) {
//			System.out.println("b학점");
//		} else if (score >= 70) {
//			System.out.println("c학점");
//		} else if (score >= 60) {
//			System.out.println("d학점");
//		} else if (score < 60) {
//			System.out.println("F학점");
//		} else {//마지막   else는 필수는 아님.
//			System.out.println("조건 부합 x");
//		}
		 
		
//		int x =6;
//		if(x % 2 == 0) {
//			if(x %3 == 0) {
//				System.out.println("x는 2와 3의 공배수");
//			}
//		}
//		     //둘은 같은 코드
//		if(x % 2 == 0 && x % 3 == 0) {
//			System.out.println("x는 2와 3의 공배수");
//		}
		
		
//		switch(비교값) {  //등가연산(==) 1:1비교
//		 case 값1: 실행문;
//		 break;
//		 case 값1: 실행문;
//		 break;
//		 case 값1: 실행문;
//		 break;
//		 default: 실행문;
//		 }
		
//		int sel = 8;
//		switch(sel) { //숫자,문자,문자열    *실수는 사용 불가
//		 case 1: System.out.println("1번 선택");
//		 break;
//		 case 2: System.out.println("2번 선택");
//		 break;
//		 case 3: System.out.println("3번 선택");
//		 break;
//		 default: System.out.println("조건에 부합x");
//		 }
		
		
		 Scanner sc= new Scanner(System.in);
		  System.out.println("첫번째 숫자 입력: ");
		  int num1 = sc.nextInt();
		  System.out.println("두번째 숫자 입력: ");
		  int num2 = sc.nextInt();
		  
		  sc.nextLine(); // 숫자 다음에 문자열이 올 때 버퍼에 남은 대항문자(/n) 제거용
		  
		  System.out.println("연산자를 입력하세요: (+.-,*,/)");
		  String op = sc.nextLine();
		  
		  switch(op) {
		  case "+": System.out.println(num1 + num2);
		  break;
		  case "-": System.out.println(num1 - num2);
		  break;
		  case "*": System.out.println(num1 * num2);
		  break;
		  case "/": System.out.println(num1 / num2);
		  break;
		  default: System.out.println("연산불가"); 
		  }
		  

	}

}
