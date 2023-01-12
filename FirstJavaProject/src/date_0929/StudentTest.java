package date_0929;

public class StudentTest {

	public static void main(String[] args) {
		//국어 : 100
		//영어 : 60
		//수학 : 76
		Student s = new Student("홍길동",3,5,100 , 60, 76);
			
	
		
		System.out.println("이름: "+s.name);
		System.out.println("총점: "+s.getTotal());
		System.out.println("편균: "+s.getAverage());
		
	}

//	실행결과
//	
//	이름 : 홍길동
//	총점 : 236
//	평균 : 78.7(소수점 2째 자리에서 반올림)
}
