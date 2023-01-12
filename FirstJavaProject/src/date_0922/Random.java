package date_0922;
import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
//		 Scanner sc = new Scanner(System.in);
//		
//		int sel;
//		
//		while (true) { // truw = 무한반복문
//			System.out.println("번호를 선택하세요");
//			System.out.println("1.빨강 2.녹색 3.파랑 4.종료");
//			sel = sc.nextInt();
//			
//			if(sel == 1) {
//				System.out.println("빨강 선택");
//			}else if(sel == 2) {
//				System.out.println("녹색 선택");
//			}else if(sel == 3) {
//				System.out.println("파랑 선택");
//			}else if(sel == 4) {
//				break;
//				
//			}
//		}
		
		//난수(랜덤)
		//Math.random()  //난수  r의 범위 = (0.0 <= r < 1.0) -> 0.0 ~ 0.99999999...

		//System.out.println(Math.random());

		//Math.random() * 10 // 0.0 ~ 9.999...
		//(int)(Math.random() * 10) // 0 ~ 9
		//(int)(Math.random() * 10) + 1 // 1 ~ 10
		//System.out.println((int)(Math.random() * 10) + 1);
		
		
	// [난수 공식]	
	// (int)(Math.random() * 난수의 갯수(난수의 최대값 - 난수의 최소값 + 1)) + 난수의 최소값
		
	//ex) 1 ~3 까지의 난수
	//	(int)(Math.random() * 3) + 1
		
		
		//Q 내가 이길 때까지 진행하는 가위 바위 보 게임
		        // 내가 win 
				// 내가 lose
				// 둘이 tie
//		int com;
//		int me;
//			
//		Scanner sc = new Scanner (System.in);
//		
//	while (true) {
//			com = (int)(Math.random() * 3) + 1;
//			System.out.println("1.가위 2.바위 3.보: ");
//			me = sc.nextInt();
//			
//			System.out.println("com = "+com+" , "+"me= "+me);			
//		
//	if((me==1 && com==3) || (me==2 && com==1) || (me==3 && com==2)) {
//		System.out.println("내가 win");
//		횟수++;
//		System.out.println("이긴 횟수: "+ 횟수 +"회");
//		if(횟수 == 3) {break;}
//		}
//	 else if ((me==1 && com==1) || (me==2 && com==2) || (me==3 && com==3)) {
//		System.out.println("둘이 tie");}
//		else if ((me==1 && com==2) || (me==2 && com==3) || (me==3 && com==1)) {
//			System.out.println("내가 lose"); 
//			}
//	          }  // (나의 답)
		
//		int com;
//		int me;
//		int cou = 0; // 몇번 이겼는지 카운트 메모리를 저장하기 위해 추가한 변수 
//			
//		Scanner sc = new Scanner (System.in);
//			
//		int chall = 0; //도전횟수
//		
//		
//		while (true) {
//			
//			chall++;
//			if(chall == 4) {
//				System.out.println("3번의 기회를 다 소진함");
//				break;}
//			
//				
//				com = (int)(Math.random() * 3) + 1;
//				System.out.println("1.가위 2.바위 3.보: ");
//				me = sc.nextInt();
//				
//				
//				System.out.println("com = "+com+" , "+"me= "+me);
//				
//				int result = com - me;
//						
//				if (result == -1 || result == 2) {
//					System.out.println("내가 win");
//					cou++; // 내가 이겼을 때 cou 횟수가 늘어남 
//					System.out.println("이긴 횟수: "+ cou +"회");
//					if(cou == 1) {break;} //cou 값이 3이 되면 멈춤
//		        } else if (result == 0) {
//					System.out.println(" tie");
//				}else {System.out.println("내가 lose");
//			}
//		}	//(선생님 답)
		    //3번 이기면 멈추기로 수정해보기
		    //3번의 도전 기회 중 한번만 이기면 끝나게 수정해보기

	}

}