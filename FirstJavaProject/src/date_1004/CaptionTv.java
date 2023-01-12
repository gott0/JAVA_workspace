package date_1004;
import date_0927.Tv;

public class CaptionTv extends Tv{//상속 : extends 뒤에 부모 클래스 이름을 적어준다
	//Tv라는 클래스로 부터 변수 7개와 메소드 6개 그리고 기본 생성자를 상속 받는다.(TV class - 변수 7개와 메소드 6개,기본 생성자가 존재 )
	
	boolean caption; // 기본값: false
	
	void displayCaption(String text) { 
		if(caption) {
			System.out.println(text);
		}
	}
}
