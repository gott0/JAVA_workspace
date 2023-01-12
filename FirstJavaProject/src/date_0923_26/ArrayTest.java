package date_0923_26;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//배열 : 동일한 타입의 변수를 여러개 정의 하는 것

//		int a,b,c,d,e;
//		a = 10;
//		b = 20;
//		c = 30;
//		d = 40;
//		e = 50;
	
//		int[] arr; // 배열의 선언
//		arr = new int[5]; //배열의 생성 - 이때 "5"는 배열의 갯수                                       ┐
//		                                                              │ 
//		int[] arr = new int[5]; // 선언과 생성을 한번에 하는 방식.               │(3가지 동일)
//	                                                                  │   
//		int[] arr = {10,20,30,40,50}; // 선언과 생성과 위치값 설정을 한번에 한 방식   ┘

		
//		arr[0] = 10;
//		// 이때 "0"은 인덱스 번호(index, 위치값)을 나타낸다. 
//		// |10|20|30|40|50|...| |
//		//  0  1  2  3  4      n   => index N(0부터시작)	
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
//		System.out.println(arr[0]); //10을 출력
//		System.out.println(arr[1]); //20
//		System.out.println(arr[2]); //30
//		System.out.println(arr[3]); //40
		
//		char[] cArr = new char[4];
//		char[] cArr = {'G','o','o','d'};  // 문자도 가능
//		
//		cArr[0] = 'G';
//		cArr[1] = 'o';
//		cArr[2] = 'o';
//		cArr[3] = 'd';
//	
//		System.out.println(cArr[0]);
	
//		String[] str = {"java","jsp","DB"}; //문자열도 가능
//		
//		System.out.println(str[1]);
//		str[2] = "html"; //치환가능
//		System.out.println(str[2]);
		
		
//		int x = 10;
//		int y;
//		
//		y = x;

		       //이때 arr1은 배열들(1,2,3,4,5)이 위치한 주소 값을 나타내는 변수 (배열변수는 주소값이다) 
//		int[] arr1 = {1,2,3,4,5};  
//		int[] arr2;
//		
//		arr2 = arr1; // 주소값이 같음
//	                System.out.println(arr1[0]); 	
//	                System.out.println(arr2[0]); // 같은 인덱스에 있으므로 같은 값의 데이터 출력 
//		
//	               arr2[3] = 10;
//	               System.out.println(arr1[3]);
//	               System.out.println(arr2[3]);
		
		
		//배열의 활용
		//순차처리
		//반복문 - 배열은 대게 반복문을 사용한다
		
//		int [] arr = new int[10]; // => 배열의 크기(갯수) = "10"
//		
//	    //쓰기
//		for (int i=0; i < arr.length; i++) // arr.length => 배열의 크기값을 나타냄 (여기서는 배열의 크기가 '10'이다)
//			// 배열에 사용되는 i값은 대게  0으로 지정 (index값이 0부터 시작하기 때문, 그렇다고 항상 0은 아님)
//			arr[i] = 1;  // |1|1|1|1|1|
//	                     //  0 1 2 3 4 = i
//	
//	    //읽기
//	    for (int i=0; i < arr.length; i++) {
//		   System.out.println(arr[i]);
//	    }
	    
//	    int arr[] = new int[10];
//	    
//	    for(int i=0; i< arr.length; i++) { //i= 0,1,2,3,4,5,6,7,8,9
//	    	arr[i] = i+1; // ex) arr[2] = 3
//	    }// 여기서 i는 배열의 index(위치)값을 의미한다, 그 위치값에 해당하는 배열은 i+1이다.
//	    for(int i=0; i< arr.length; i++) {
//	    	System.out.println(arr[i]); // 따라서  배열 arr[i]을 출력하면  (1~10)의 결과 출력됨	    	
//	    }
//	    
//	    int sum = 0; // 배열의 합 구하기
//	    for (int i=0; i< arr.length; i++) {  // 프로그래밍에선 우항의 계산이 선행되어 좌항의 답이 된다.
//	    	sum += arr[i]; // => sum = sum + arr[i] => sum = sum + (i+1)
//	    }  //sum = arr[i]의 합 = (i+1)들의 합 =>    //i = 00 01 02 03 04 05 06 07 08 09
//	    System.out.println(sum);             //i+1 = 01 02 03 04 05 06 07 08 09 10
//	                                      //sum= (0) 01 03 06 10 15 21 28 35 45 55                                               
//		
//	    int odd = 0; //홀수
//	    int even = 0; //짝수
//	    for(int i=0; i< arr.length; i++) {
//	    	if(arr[i] % 2 == 1) {
//	    		odd+= arr[i];  //홀수들의 합
//	    	} else { 
//	    		even += arr[i]; //짝수들의 합
//	    	}
//	    }
//	    System.out.println(odd);
//	    System.out.println(even);
		
		
	  //배열을 이용한 향상된  for문의 활용	
//		for (변수(아무렇게 설정 가능): 배열의 변수명) {
//			실행문
//		}
	//ex)
//		int[]arr = {1,2,3,4,5};
//		for(int i : arr) { //arr[] (배열의 갯수)만큼 (배열값)이 순차적으로  i에 대입된다.
//			System.out.println(i);
//		}
//		
//		int sum = 0;
//		for(int i : arr) {
//			sum+= i; // 배열의 값들의 합을 코드를 단순화 하여 계산할 수 있음
//			System.out.println(sum);
//		}
		
//		String[] str = {"사과" , "딸기" , "포도"};
//		for(String s:str) { //변수의 타입은 배열의 변수 타입과 동일해야된다
//			System.out.println(s);
//		}
		
	    //Q 해당 배열을 사용하여 난수 1~100사이값 중 10개를 배열의 값으로 초기화 한다.
		//  배열의 값을 출력한다.
		//  참고 - 난수 공식 
		//   (int)(Math.random() * 난수의 갯수(난수의 최대값 - 난수의 최소값 + 1)) + 난수의 최소값
		
//		int[] arr = new int[10];
//		
//		for(int i=0; i<arr.length;i++) {
//			int ran = (int)(Math.random() * 100);
//			arr[i] = ran;
//		}
//		for (int i=0; i<arr.length;i++) {
//			System.out.println(arr [i]);
//		}
//		System.out.println("===========");
//		//배열 안에서의 가장 큰 값 구하기.
//		//배열 안에서의 가장 작은 값도 구하기.
//		int max = arr[0]; //임의로 배열의 첫번째 값을 최대갓으로 설정한다.
//		int min = arr[0];
//		
//		for(int i= 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//				} else if(min > arr[i]) { min = arr[i];					
//				}
//			}
//		System.out.println("max= " + max+" , "+"min= "+min);
	
//	   난수를 이용해서 0~9 값으로 초기화한다.
//	   배열 안에 0~9가 각각 몇개씩 나오는지 결과도출.
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) {
//			int ran = (int)(Math.random() * 10);
//			 arr[i] = ran;
//		} 
//		for (int i=0; i<arr.length;i++) {
//			System.out.print(arr [i]+" , ");
//		}
//	   
//		//int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0; //같은 타입 변수를 배열로 바꿔준다
//		int[] cntArr = new int [10]; //기본값으로 자동 초기화 (int[] cntArr = 0)
//		
//		for (int i=0; i<arr.length;i++) {
//			//for(int j = 0; j<arr.length;j++) {
//			//if(arr[i] == j){
//				//cntArr[j]++;
//			cntArr[arr[i]]++; //위의 식을 이렇게 간소화 할 수 있다.
//		//arr[i]의  i번째 인덱스의 배열 값을 cntArr[i]의 인덱스 번호로 사용.
//	    //만약 i번째 인덱스의 배열 값이랑 동일한 값이 있을 경우 ++(증가연산자)에 의해 
//		//"cntArr[i]"의 배열값이 1씩 늘어난다. 그럼 결국 "cntArr[i]"의 배열값이 해당 i의 카운트 값이 된다. }
//			
//				System.out.println();
//		 }
//				
//				for (int i=0; i<cntArr.length;i++) {
//					System.out.println(i+" - "+cntArr[i]);
//				}
		
			
			//위의 식을 배열을 사용하지 않았을 경우...
//		    int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;
//				
//			for (int i=0; i<arr.length;i++) {			
//			if(arr[i] == 0) {
//				n0++;
//			}else if(arr[i] == 1) {
//				n1++;
//			}else if(arr[i] == 2) {
//				n2++;
//			}else if(arr[i] == 3) {
//				n3++;
//			}else if(arr[i] == 4) {
//				n4++;
//			}else if(arr[i] == 5) {
//				n5++;
//			}else if(arr[i] == 6) {
//				n6++;
//			}else if(arr[i] == 7) {
//				n7++;
//			}else if(arr[i] == 8) {
//				n8++;
//			}else if(arr[i] == 9) {
//				n9++;
//			}
//
//		System.out.println();
//		System.out.println(0+ "=" + n0);
//		System.out.println(1+ "=" + n1);
//		System.out.println(2+ "=" + n2);
//		System.out.println(3+ "=" + n3);
//		System.out.println(4+ "=" + n4);
	    
		
		//Q = 점수에 따라 몇등인지 구하시오
//				int[] score = {60,70,80,90,75,85,95,50,45,30};
//				int[] rank = {1,1,1,1,1,1,1,1,1,1};
//				
//				for(int i=0; i<score.length;i++) {
//				    for(int j=0; j<score.length;j++) {
//				    	if(score[i] < score[j]) {
//				    		rank[i]++;
//				    	}
//				   }
//				}
//				for(int i=0; i<rank.length;i++){
//					System.out.println(score[i] +"점은 "+rank[i]+"등 입니다.");
//				}
				
		
				
//				     score[0]         rank[0]  ->  1등으로 가정(기준값 설정)
//				score[0] < score[0]   rank[0]  ->  1  
//				score[0] < score[1]   rank[0]  ->  2
//				score[0] < score[2]   rank[0]  ->  3
//				score[0] < score[3]   rank[0]  ->  4
//				score[0] < score[4]   rank[0]  ->  5
//				score[0] < score[5]   rank[0]  ->  6
//				score[0] < score[6]   rank[0]  ->  7
//				score[0] < score[7]   rank[0]  ->  7
//				score[0] < score[8]   rank[0]  ->  7
//				score[0] < score[9]   rank[0]  ->  7
//				
//				score[1] < score[0]   rank[0]  ->  1
//				score[1] < score[1]   rank[0]  ->  1
//				score[1] < score[2]   rank[0]  ->  2
//				score[1] < score[3]   rank[0]  ->  3
//				score[1] < score[4]   rank[0]  ->  4
//				score[1] < score[5]   rank[0]  ->  5
//				score[1] < score[6]   rank[0]  ->  6
//				score[1] < score[7]   rank[0]  ->  6
//				score[1] < score[8]   rank[0]  ->  6
//				score[1] < score[9]   rank[0]  ->  6						

				// 고정값이 있고 그에 따라 비교 = 중첩  for문 사용(구구단 형성 문제 참고)
		
	   //정렬 : 오름 (작은 수 -> 큰 수,(1,2,3,4,5)) 
		//     내림 (큰 수 -> 작은 수,(5,4,3,2,1))
		 
//		int[] arr = {2,4,1,5,3}; 
//
//	   //무작위로 재배치
//		for(int i=0; i<arr.length*5;i++) {
//			int x = (int)(Math.random()*5); 
//			int y = (int)(Math.random()*5);
//			
//			int tmp;
//			tmp = arr[x];
//			arr[x] = arr[y];
//			arr[y] = tmp;
//		}
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[i]+" , ");
//		}
		
	   //스왑
//		int tmp;
//		
//		tmp = arr[1];
//		arr[1] = arr[3];
//		arr[3] = tmp;     //이렇게 temp를 이용하여 바꿔주는 것을 스왑(swap)이라고 한다.
//		
//		int x = 10;
//		int y = 20;
//		int tmp = 0;
//		
//		tmp = x;
//		x = y;
//		y = tmp;
	
     //Q1 
//		int[] arr = {2,4,1,5,3}; // 순서대로 재배치하고 싶을 때
//		
//		for(int i=0; i<arr.length;i++) {
//			for(int j=i + 1; j<arr.length;j++){ //(요부분 주의 쌤게 더 괜찮은 것 같음)
//				if(arr[i] > arr[j]) {
//					int tmp;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[i]+" , ");
//		} // 선생님 답
		
//		for(int i=0; i<arr.length;i++) {
//			for(int j=0; j<arr.length;j++){
//				if(arr[i]<arr[j]) {
//					int tmp = 0;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[i]+" , ");
//		} 나의 답 
		
		
      //Q2
		//실행결과
		
		//김연아 메달 10개 1등
		//홍길동 메달 3개 2등
		//손흥민 메달 2개 3등
		
//		String[] name = {"홍길동", "손흥민" , "김연아"};
//		int[] meDal = {3,2,10};
//		
//		for(int i=0; i<meDal.length;i++) {
//			for(int j=0; j<meDal.length;j++) {
//				if(meDal[i] > meDal[j]) {
//					int tmp = 0;
//					tmp = meDal[i];
//					meDal[i] = meDal[j];
//					meDal[j] = tmp;}
//				}
//		} for(int i=0; i<name.length;i++) {
//		System.out.println(name[i]+" 메달"+meDal[i]+"개 "+(i+1)+"등");
//		} // 나의 답 = 틀렷음!!
	
//		String[] name = {"홍길동", "손흥민" , "김연아"};
//		int[] meDal = {3,2,10};
//		
//		for (int i=0; i<meDal.length;i++) {
//			for(int j=i+1; j<meDal.length;j++) {
//				if(meDal[i] < meDal[j]) {
//					int tmp = 0;
//					tmp = meDal[i];
//					meDal[i] = meDal[j];
//					meDal[j] = tmp;
//					
//					String nTmp;
//					nTmp = name[i];
//					name[i] = name[j];
//					name[j] = nTmp;		
//					}
//			}
//		} for(int i=0; i<name.length;i++) {
//			System.out.println(name[i]+" 메달"+meDal[i]+"개 "+(i+1)+"등");
//		}// 선생님 답

	//배열 - 1차원
	//   - 다차원(2차원) -정방형(열의 크기가 동일) , 비정방형(열의 크기가 다른경우)
		
//		int[][] score;
//		score = new int[5][3];  // [행(가로)][열(세로)] 
		
//		int[][] score = new int[5][3]; // 선언 방식 일체화
		
//		int[][] score = { //직접 배열을 집어넣을 수 있다.
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15}
//		};
		
		
//		score[0][0] = 1;    //      ┌─  열   ─┐
//		score[0][1] = 2;    //   ┌ |0,0|0,1|0,2|
//		score[0][2] = 3;    //   │ |1,0|   |   |
//		                    //   행  |2,0|   |   |   
//		score[1][0] = 4;    //   │ |3,0|   |   | 
//		score[1][1] = 5;    //   └ |4,0|   |4,2|
//		score[1][2] = 6;
//
//		score[4][2] = 15;
//		
//				System.out.println(score[0][0]);
//				System.out.println(score[0][1]);
//				System.out.println(score[0][2]);
//				
//				System.out.println(score[4][2]);
		
//		for(int i = 0; i<5;i++) { //행        -  for을 이용한 중첩반복문
//			for(int j = 0; j<3;j++) { //열
//				System.out.print(score[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		
//		score.length : 행의 크기
//		score[0].length : 첫번째 행의 열의 크기    =>   score[i].length : 열의 크기
		
		
//				int[][] score = { //직접 배열을 집어넣을 수 있다.
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15}
//		};
//						
//		for(int i = 0; i<score.length;i++) { // 행의 크기(범위)
//			for(int j = 0; j<score[i].length;j++) { // score[i]의 열의 크기(범위)
//				System.out.print(score[i][j]+ " ");
//				}
//			System.out.println();
//		}
//		
//				for ( int[] i : score) {
//					for ( int j : i) {
//						System.out.println(j + "  ");
//					}
//					System.out.println("========");
//				}
//				System.out.println();
				
				
		

//                int num = 1;		
//				int[][] arr = new int [2][5]; // = 배열의 크지가 2x5 = 10
//				for(int i = 0; i<arr.length;i++) { // 0 1
//					for(int j = 0; j<arr[i].length;j++) { // 0,1,2,3,4
//						arr[i][j] = num++; // num++; = 1~10; 
//					}  //arr[i][j]= (i*5)+j+1;  // 1,2,3,4,5
//				}      //└ 변수 num을 주지 않을 경우         // 6,7,8,9,10
//
//				for(int[] i:arr) {
//					for(int j:i) {
//						System.out.print(j+" ");
//					}
//					System.out.println();
//				}

				
//		int [][] arr = new int[5][3];
//		for(int i = 0; i<arr.length;i++) // 0,1,2,3,4
//			for(int j = 0; j<arr[i].length;j++) {  // 0,1,2
//				arr [i][j] = (i*3)+j+1;
//			}                               //123  (j+1)
//				                            //456  ((i*3)+j+1) 
//				                            //789
//				                            //101112
//				                            //131415 
//		for (int[] i : arr ) {
//			for(int j : i) {
//				System.out.print(j + " ");
//			} System.out.println();
//			}
				
		
	/*
		*               |0,0|   |   |   |   |   *이 들어가는 위치
		**              |1,0|1,1|   |   |   |   
		***             |2,0|2,1|2,2|   |   |  
		****            |3,0|3,1|3,2|3,3|   |
		*****           |4,0|4,1|4,2|4,3|4,4| 
	     		*/	
//		char [][] star = new char[5][5]; // *은 문자라 char
//				
//		for(int i = 0; i<star.length;i++)
//			for(int j = 0; j<star [i].length;j++) {
//				if(i>=j){
//					star [i][j] = '*';
//				}
//			}
//				for(char[] i : star) {
//					for(char j : i) {
//						System.out.print(j+ " " );
//					}
//					System.out.println();
//				}
				
	
			/*
				*****
				****
				***
				**
				*
			*/
//		char [][] star = new char[5][5];
//		for (int i = 0; i<star.length;i++)
//			for(int j = 0; j<star [i].length;j++) {
//				if(i+j<=4) { 
//					star[i][j] = '*';
//				} 
//			}
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//			}System.out.println();
//		}
				
		
		/*		
		   *
		  **		
	     ***
		****
	   *****
			 */			
//		char [][] star = new char[5][5];
//		for (int i = 0; i<star.length;i++)
//			for(int j = 0; j<star [i].length;j++) {
//				if(i+j>=4) { 
//					star[i][j] = '*';
//				} 
//			}
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//			}System.out.println();
//		}
				
				
		
		/*		
		   *
		  ***		
	     *****
		*******
	   *********
			 */			
		
//		char [][] star = new char[5][9]; // 5*9=45
//		for (int i = 0; i<star.length;i++) {
//			for(int j = 0; j<star [i].length;j++) {
//				if(i+j>=4) { 
//					if(j<=i+4) {
//					star[i][j] = '*';
//					}
//				}
//			 } 
//			}for(char [] i : star) {
//				for(char j : i) {
//					System.out.print(j + " ");
//					}
//					System.out.println();
//					}	// 나의 답  
		
		
 
//		Scanner sc = new Scanner(System.in); 
//		System.out.print("행의 크기를 입력하세요: ");
//		int row = sc.nextInt();
//		int col = row * 2 - 1;
//		
//		char [][] star = new char [row][col];
//		
//		//char [][] star = new char[5][9]; 
//		for (int i = 0; i<star.length;i++) {
//		int starCnt = 2*i+1; //1,3,5,7,9
//		int starStart = star.length - (i+1);	 //4,3,2,1,0	
//			for(int j = starStart; j<starStart + starCnt; j++) {
//				star [i][j] = '*';
//			}
//			
//				}
//		for(char [] i : star) {
//					for(char j : i) {
//						System.out.print(j + " ");
//				
//			}System.out.println();
//         } // 쌤의 답

//		=========================================

		
//		char [][] star = {
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
//				{'*','*','*','*','*'},
//				{'*','*','*','*','*'},		
//		};
//		
//		for (int i = 0; i<star.length;i++) {
//			for(int j = 0; j<star [i].length;j++) {
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
//		
//		// 'ㄴ'모양의 '*'을 90도 돌리기!! { char [][] star (i,j) => char [][] result(x,y) }
//		
////		 char [][] star (i,j)            char [][] result(x,y)
////
////		 |0,0|0,1|0,2|0,3|0,4|            |0,0|0,1|0,2|0,3|
////		 |1,0|1,1|1,2|1,3|1,4|            |1,0|1,1|1,2|1,3|
////		 |2,0|2,1|2,2|2,3|2,4|     =>     |2,0|2,1|2,2|2,3|
////		 |3,0|3,1|3,2|3,3|3,4|            |3,0|3,1|3,2|3,3|
////		                                  |4,0|4,1|4,2|4,3|
////
////		 i     j   =>   x    y
////		 0    0         0    3
////		 0    1         1    3
////		 0    2         2    3
////		 0    3         3    3
////		 0    4         4    3    =>>  x=j , y =3-1 
////		 ----------------------        의 규칙성 발견!
////		 1    0         0    2
////		 1    1         1    2
////		 1    2         2    2
////		 1    3         3    2
////		 1    4         4    2
////		 ----------------------
////		 .
////		 .		
//		
//		char [][] result = new char[star[0].length][star.length]; // 5, 4
//		
//		for (int i = 0; i<star.length;i++) {
//			for(int j = 0; j<star [i].length;j++) {
//				int x = j;
//				int y = 3-i;
//				
//				result [x][y] = star [i][j];
//			}
//		}
//		System.out.println();
//		System.out.println();
//
//		for(char[] i : result) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
//		int[][] score = {
//				{10,10,10},
//				{20,20,20},
//				{30,30,30},
//				{40,40,40},
//				{50,50,50}
//		};
//		
//		System.out.println("번호  국어  영어  수학   총점       평균");
//		
//		int sum; // 총점을 위한 변수를 하나 지정한다
//		int korTot = 0;
//		int engTot = 0;
//		int mathTot = 0;
//		
//		for (int i = 0; i<score.length;i++) {
//			
//			korTot += score[i][0];
//            engTot += score[i][1];
//			mathTot += score[i][2];
//			sum = 0;
//			System.out.print(" "+(i+1)+"  ");
//			for(int j = 0; j<score[i].length;j++) {
//				sum+= score[i][j];
//				System.out.print(" "+score[i][j]+" ");
//			}//여기까지 하면 한 학생의 총점이 계산되고
//			System.out.print("  "+sum); // 여기서 한 학생의 총점을 한번 출력한다
//			double avg = sum / (double)score [i].length; // 3.0 => score [i].length => 열의 범위
//			System.out.print("   "+avg);
//			System.out.println();
//		}
//		int totScore = korTot+engTot+mathTot;
//		System.out.println("합계"+"   "+ korTot+" "+engTot+" "+mathTot+"  "+totScore);
		
	
		
//		<실행 결과>
//		번호  국어   영어   수학  총점       평균
//		 1  10  10  10  30    10.0
//		 2  20  20  20  60    20.0
//		 3  30  30  30  90    30.0
//		 4  40  40  40  120   40.0
//		 5  50  50  50  1500  50.0
//		합계   150 150 150 450
		
		
//		//25개의 값을 구성할 수 있는 2차원 배열 생성
//		
//		int[][] bingo = new int [5][5];
//		
//		//배열의 1~50 난수를 초기화 한다.
//		for (int i=0; i<bingo.length; i++) {
//			for (int j=0; j<bingo[i].length; j++) {
//				bingo[i][j] = (int)(Math.random() * 50) + 1;
//			}
//		}
//		
//		for (int i=0; i<bingo.length; i++) {
//			for (int j=0; j<bingo[i].length; j++) {                                   
//				System.out.print(bingo[i][j] + " ");
//				}
//			System.out.println();
//		}
//		
//		//값을 입력하고 배열에 같은 값이 있으면 0으로 변경한다.
//		//배열의 모든값이 0으로 변경되면 전체반복문 종료
//		
//		Scanner sc = new Scanner(System.in);
//		boolean flage = true;
//		int num;
//		int sum = 0;
//		
//		while(flage) { 
//			System.out.println("숫자 입력: ");
//			 num = sc.nextInt();
//			 
//			 sum = 0;
//			 
//			 for (int i=0; i<bingo.length; i++) {
//					for (int j=0; j<bingo[i].length; j++) { 
//						if(bingo[i][j] == num) {
//							bingo [i][j] = 0;
//						   }
//						sum+= bingo[i][j];
//						System.out.print(bingo[i][j] + " ");
//						}
//					System.out.println();
//					}
//			 System.out.println("sum="+sum);
//			 if(sum == 0) {
//				 flage = false;
//				
//			 }
//		} 
//				System.out.println("Game Over");   		
	
		
   }
}
