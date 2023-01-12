package date_0928;
import java.util.Scanner;

public class ArrayMaxTest {

	public static void main(String[] args) {
		// 1. ArrayMax 객체를 생성한다. o
		// 2. 생성된 객체의 배열에 1~100사이 값을 랜덤하게 저장한다. o
		// 3. 메소드를 정의한다.(베열의 최대값을 구해서 반환되도록 한다.)
		// 4. 반환된 출력 값 출력

		ArrayMax am = new ArrayMax();
                //└참조변수(객체변수): 보통 객체, 주소값을 가진 변수, 변수의 타입이 기본형이 아닌것들은 모두 참조 변수
		for (int i = 0; i < am.arr.length; i++) {
			am.arr[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i : am.arr) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		

		int lastmax = Max(am.arr);
		System.out.println("max= "+lastmax);
	}

	static int Max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	} //쌤 답
} 
