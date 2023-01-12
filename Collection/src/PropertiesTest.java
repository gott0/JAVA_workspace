import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		//Properties : key , value -> String만 사용 가능
//		Properties prop = new Properties();
//
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
		
//		String value = prop.getProperty("myid");
//		System.out.println(value);
		
//		Enumeration e = prop.propertyNames();		
//		
//		while(e.hasMoreElements()) { //값을 체크하는 역
//			String element = (String)e.nextElement(); // key값
//			String value = prop.getProperty(element); // value값
//			System.out.println(value);
//		}
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("input.txt"));
		}catch(IOException e) {
			System.out.println("지정한 파일이 없습니다.");
			System.exit(0); //프로그램 강제 종료
		} //파일을 불러 올 때 생기는 예외 미리 처리하는 작업 
		
		String name = prop.getProperty("name"); // Hong kil Dong
		String[] data = prop.getProperty("data").split(","); 
		                                     //    └ ,로 나뉘어진 값을 쪼개서  반환
		int max = 0;
		int min = 0;
		int sum = 0;
		

//		이름
//		max
//		min
//		sum
//		평균
		 
		//문자열 -> 숫자 : Integer.parseInt(문자열)
		//숫자 -> 문자열 : String.valurOf(숫자)
		
		for(int i=0; i<data.length; i++) {
			int value = Integer.parseInt(data[i]); // 문자열을 숫자로 바꾸는 작업
			
			if( i== 0) {
				max = min = value;
			}
			
			if(max < value) {
				max = value;
			}else if (min>value) {
				min= value;
			}
			
			sum += value;
			
			
			double avg = (double)sum / data.length;
			
			System.out.println(name);
			System.out.println(max);
			System.out.println(min);
			System.out.println(sum);
			System.out.println(avg);
			
		}
		
		
		
		
		
		
		
		
	}//main end

}