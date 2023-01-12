package date_0927;

public class Tv {//부모클래스 : 여러 자식클래스를 갖는다.
    //         단일 상속만 가능하다.(부모클래스는 하나만 가질 수 있다.)	

	//속성
	//크기,전원버튼,채널,볼륨,인터넷,...,모델,제조년도,제조사
	//기능(행위)
	//전원on/off,채널 up/down, 볼륨up/down,...
	
	boolean power;//전원버튼 (2가지 행위)        ┐
	public int channel; //채널  = 상속 자식 클래스의 패키지가 다르기 때문에 public을 앞에 붙여준다.
//	int channel; //채널 (정수로 된 채널)          |
	int volume; //볼륨 (정수로 된 볼륨 범위)        |        
	String color; //색상 (문자열로 나타내는 색상)    |//이런 변수를
	String model; //모델                                              |//'멤버변수'라고 함
	int year;    //제조년도                                          |
	String company;     //제조사                             ┘
	
	public void Power() { //전원 on/off ,  = 상속 자식 클래스의  패키지가 다르기 때문에 public을 앞에 붙여준다.
		power = !power;
	}
	
	public void channelUp() { //채널 up/down
		channel++;
	}
	
    public void channelDown() { //채널 up/down
    	channel--;
	}
    
    void volumnUp() { //볼륨 up/down
    	volume++;
    }
    
    void volumnDown() { //볼륨 up/down
    	volume--;
	}
    
    void showInfo() {
    	System.out.println(model);
    	System.out.println(year);
    	System.out.println(company);
    }
    
}
