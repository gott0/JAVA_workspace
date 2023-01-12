package date_0929;

public class FuncStaticTest {

	public static void main(String[] args) {

//		FuncStatic.cv = 20; // 스택틱한 요소들은 객체생성 없이도 사용 가능
		                    //(객체 fs 생성 전이기 때문에 클래스 네임을 붙여 호출)
//		FuncStatic.staticMethod(); // └메모리 할당 시점이 instance보다 이전이기 때문에 가능

		FuncStatic fs = new FuncStatic();

		fs.instanceMethod();
		FuncStatic.staticMethod();
      //FuncStatic.instanceMethod(); => 클래스 네임으로 인스턴스 메소드 호출 불가.
	  //	                  (클래스 네임으로 불러들일 경우 객체 생성 전의 멤버들만 가능하기 때문)
// 	
//		fs.iv = 10;
//		// fs.cv = 20;
//
//		System.out.println();
//		
//		fs.instanceMethod();
//		fs.staticMethod();

	}

}
