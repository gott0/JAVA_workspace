package date_0927;

public class TimeTest {

	public static void main(String[] args) {
		
		//Time t1,t2,t3; //동일한 타입 한번에 선언 가능.
		Time[] time = new Time[3];//Time이라는 타입으로 
		                          //배열을 이용해 3개의 변수 생성

		
//		t1 = new Time();
//		t1.hour = 10;
//		t1.minute = 29;
//		t1.second = 33;
//		
//		t2 = new Time();
//		t2.hour = 3;
//		t2.minute = 45;
//		t2.second = 11;
//		
//		t3 = new Time();
//		t3.hour = 5;
//		t3.minute = 15;
//		t3.second = 53;
//		
//		       ||
//		       \/
//		      
		for (int i=0; i<time.length;i++) {
			time[i] = new Time();
		}
		//time[0] = new Time();
		time[0] .hour = 10;
		time[0] .minute = 29;
		time[0] .second = 33;
		
		//time[1]  = new Time();
		time[1] .hour = 3;
		time[1] .minute = 45;
		time[1] .second = 11;
		
		//time[2]  = new Time();
		time[2] .hour = 5;
		time[2] .minute = 15;
		time[2] .second = 53;
		
//		System.out.println(time[0].hour+"시"+time[0].minute+"분"+time[0].second+"초");
//		System.out.println(time[1].hour+"시"+time[1].minute+"분"+time[1].second+"초");
//		System.out.println(time[2].hour+"시"+time[2].minute+"분"+time[2].second+"초");
		
		for (Time t : time) {
			System.out.println(t.hour+"시 "+t.minute+"분 "+t.second+"초");
			
		}
	}

}
