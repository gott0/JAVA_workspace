package date_0929;

public class MemberInitTest {

	public static void main(String[] args) {
		MemberInit mi = new MemberInit(88,99); //static 초기화 블럭 -> 인스턴스 초기화 블럭 -> 생성자의 호출 순서로 호출 (출력 결과 참고)
		MemberInit mi2 = new MemberInit(101,102); // static 초기화 블럭은 객체 생성 시 한번만 실행 된다.(출력 결과 참고)

	}

}
