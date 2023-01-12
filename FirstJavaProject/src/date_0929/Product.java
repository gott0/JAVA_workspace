package date_0929;

public class Product { 
	static int count = 0;
	int serial;
	
	{
		++count;
		serial = count;
	} //객체 생성 때마다 실행 됨

} // 만들어진 객체의 수 알아내는 코드 !! 꼭 기억하기!
