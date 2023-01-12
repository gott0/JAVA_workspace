package date_0929;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath ma = new MyMath();
		
		int sum1 = ma.add(2,3);
		System.out.println(sum1);
		
		long sum2 = ma.add(2L,6L);
		System.out.println(sum2);
		
		int[] arr = {1,2,3,4,5};
		int sum3 = ma.add(arr);
		System.out.println(sum3);
	}

}
