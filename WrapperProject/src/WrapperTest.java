public class WrapperTest {

	public static void main(String[] args) {
		// Wrapper Class : 기본형과 참조형 간 형변환(박싱,언박신) 오토박싱
		// 박싱 : 기본형 -> 참조형(Wrapper)
		// 언박싱 : 참조형 -> 기본형
		
		int i = 10;
		Integer intg = i;  // 박싱    //(Integer)i;  // new Integer(i)
		
		Integer intg2 =  new Integer(10);
		int i2 = intg2;  //언박싱
		
		System.out.println(intg2 + i2);
		
		Object obj = (Object)i;  // 오브잭트는 박싱만 가능(언박싱 불가)
		//int i3 = obj -> 언박싱 불가
		
		
		String str = "50"; // 구성에 숫자만 있을 때 가능 ex) "a50"일 경우 문자가 있으므로 불가능
		int i4 = Integer.parseInt(str); //문자열을 숫자로 바꾸는 메소드
		System.out.println(i4);
	}
}
