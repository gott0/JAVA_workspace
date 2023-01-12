package date_0920;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); //(System.in) => 키보드로 입려하려는 값!이라고 생각하기.
//		      //sc는 변수라 식별자를 이므이로 정함
//		System.out.print("정수 하나를 입력하세요:");
//		int num = sc.nextInt();
//		System.out.println("입력하신 정수는" + num);
//		
//		System.out.print("실수 하나를 입력하세요:");
//		double d = sc.nextDouble();           // A-> 버퍼(정수or실수 + /n) ->B  => 정수or실수만 출력 /n(대행문자) 잔여.
//	
//		System.out.println(d);
//		
//		 sc.nextLine(); // 숫자를 먼저 입력한 경우 이 코드를 중간에 삽입해야됨! => 버퍼에 남아 있는 /n(대행문자)을 소비시킨다.
//		                // 그렇지 않으면 /n을 문자로 인식하여 문자출력이 끝남.
//		System.out.print("문자를 입력하세요:");
//		String str = sc.nextLine();
//		System.out.println("입력하신 문자는 "+str);
		
//샘플링
		
		System.out.println("이름, 도시, 나이, 체중, 결혼 여부를 빈칸으로 분리하세요");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.print("이름은"+name+",");
		
		String city = sc.next();
		System.out.print("도시는"+city+",");
		
		int age = sc.nextInt();
		System.out.print("나이는"+age+"살,");
		
		double weight = sc.nextDouble();
		System.out.print("체중은" + weight+"Kg,");
		
		boolean marry = sc.nextBoolean();
		System.out.println("결혼여부는"+marry+"입니다."); //*boolean 다시 해보기
		
	     sc.close();
	}

}
