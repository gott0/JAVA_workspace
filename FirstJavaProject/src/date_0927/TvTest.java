package date_0927;

public class TvTest {

	int sum; //"멤버변수":class 안에서 정한 변수, 자동 기본값으로 초기화 된다.(초기화 값 필요 x)
	
	public static void main(String[] args) {
		
		int sum = 0; // "지역변수": 함수 내에서 정한 변수로서 무조건 초기화 값을 주어야 함
		
		//System.out.println(new Tv());
		//new Tv() 생성된 Tv객체의 첫번째 멤버의 주소값
		
		
		//new Tv().power = true; ┐ // 둘은 class Tv로 만들어진 
		//new Tv().channel = 10; ┘ // 서로 다른 객체이다.
		                           // 둘을 하나의 객체로 두려면 
		                           // 참조변수를 만들어야 됨
		
		Tv t = new Tv();
		//생성된 클래스의 객체의 경우 그 클래스의 이름을 타입으로 하는 변수를 둬야 됨
		//그것을 "참조변수(==주소값)"이라한다.
		t.power = true;
		t.channel = 10;
		System.out.println(t.channel);
		
		t.channelDown();
		System.out.println(t.channel);
		
		Tv t2 = new Tv();  // 'Tv t'와 ' Tv t2'는 전혀 다른 객체이다
		t2.channel = 20; 
		
		System.out.println(t.channel);
		System.out.println(t2.channel); // 서로 다른 출력값이 나옴.
		t2.channelDown();
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t2 = t; //2t의 주소값을 상실한다. (둘 다 t가 됨)
                //두 참조변수의 타입이 동일한 경우만 가능.
		System.out.println(t.channel);
		System.out.println(t2.channel);//동일한  'Tv t'의 값이 출력
		t.channelDown();
		System.out.println(t.channel);
		System.out.println(t2.channel);

	}

}
