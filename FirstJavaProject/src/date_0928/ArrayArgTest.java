package date_0928;

public class ArrayArgTest {

	public static void main(String[] args) {
//		ArrayArg ay = new ArrayArg(); 
//		ay.x = 10;
//		ay.arr[0] = 1;
//		ay.arr[1] = 2;
//		ay.arr[2] = 3;
//		ay.arr[3] = 4;
//		ay.arr[4] = 5;
//		
//		for(int i : ay.arr) {
//			System.out.println(i); //arr[0] = 1
//		}
//		change(ay.arr);
//		
//		for(int i : ay.arr) {
//			System.out.println(i); //arr[0] = 100
//		}
//	}
//
//	static void change(int[] arr) { // arr 지역변수이기 때문에 이름이 같아도 상관없음
//	   arr[0] = 100;                // class의 int[] arr의 주소값이 대입 됨(배열은 참조변수) 
//	   System.out.println("change()="+arr[0]);
		
//           ===========================================================
		
		ArrayArg ay = new ArrayArg(); 
		ay.x = 10;
		ay.arr[0] = 1;
		ay.arr[1] = 2;
		ay.arr[2] = 3;
		ay.arr[3] = 4;
		ay.arr[4] = 5;
		
		for(int i : ay.arr) {
			System.out.println(i); //arr[0] = 1
		}
		
		int[] arr2 = change(ay.arr);
		for(int i : arr2){
			System.out.println(i);
		}
		
	  } 
	
	static int[] change(int[] arr) {
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*10;
		}
		
		int[] arr2;
		arr2 = arr;
		
		return arr2;
	}
}
