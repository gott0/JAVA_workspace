package date_0929;

public class OverloadingTest {

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		
		ol.add();
		ol.add(3);
		ol.add(3L); // L을 추가해 long인 매개변수를 가진 함수 호출
		ol.add(2,3);
		ol.add(2,3L);
		ol.add(2L,3);
		
		System.out.println(3);  //int
		System.out.println('C'); //char
		System.out.println("abc"); //String
	}

}
