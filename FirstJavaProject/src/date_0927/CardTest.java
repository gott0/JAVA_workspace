package date_0927;

public class CardTest {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.number = 1;
		c1.kind = "hart";
		
		Card c2 = new Card();
		c2.number = 3;
		c2.kind = "spade";
		
		System.out.println(c1.number);
		System.out.println(c1.kind);
		
		System.out.println(c2.number);
		System.out.println(c2.kind);
		
		System.out.println(Card.height);
		System.out.println(Card.width);
		
//		System.out.println(Card.cv); // 클래스명 +"."+스테틱 변수로 출력 시
//		                             // 스테틱 변수 값이 출력 됨
//		                             // 생성하지 않아도 사용가능 하다는 뜻 
//		Card c1 = new Card();
//		c1.iv = 10;
//		
//		Card c2 = new Card();
//		c2.iv = 20;
//		
//		System.out.println("c1.iv = " + c1.iv);
//		System.out.println("c2.iv = " + c2.iv);
//		
//		System.out.println("c1.cv = " + c1.cv);
//		System.out.println("c2.cv = " + c2.cv);
//
//		c1.cv = 80; // c1에서 static int cv = 100;을
//		            // 80;으로 바꿧다. 그랬더니 c2에서도 바뀜
//		            // static 변수는 공유되고 있다는 뜻
//		
//		System.out.println("c1.cv = " + c1.cv);
//		System.out.println("c2.cv = " + c2.cv);
//		
//		Card.cv = 200;// 앞선 방법과 같은 행위 더 간소화 됨(스테틱 변수 값을 바꾼다)
//		              // cv : 100 -> 80 -> 200
//		
//		System.out.println("c1.cv = " + c1.cv);
//		System.out.println("c2.cv = " + c2.cv);
	}

}
