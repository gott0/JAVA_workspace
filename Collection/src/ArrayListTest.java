import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList(); //순서대로 , 중복가능
//		
//		list.add("1");// 참조형으로 넣어야된다. (String은 참조형)
//		list.add("1");//중복
//		list.add(new integer(1)); //wrapper(기본형-> 참조형)
//		list.add("2");
//		list.add(2); // 기본형은 원랜 안 되는데 오브젝트 타입은 형변환이 되므로 이렇게 적어도 된다.
		   // └기본 오브젝트 타입
//		
//		list.add("1");  //String -> Object 형변환이 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
		
//		String str = (String)list.get(0); //Object -> String
//		System.out.println(str);
		
//		int sum = 0;
//		
//		for(Object obj : list) {
//			String str = (String)obj;
//			System.out.println(str);
//			int num = Integer.parseInt(str);
//			sum += num;       // └ 문자열 -> 숫자
//		}
//		
//		System.out.println("sum= " +sum);
//		
//		                //  ┌ArrayList의 배열 크기(범위) , length로는 안됨
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i)); //12345
//		}                          // └ (ArrayList구조에서 읽어오는 메소드)
//		
//		list.remove(3); // 4를 지움
//		
//		for(int i=0;i<list.size();i++) { 
//			System.out.println(list.get(i)); //1235
//		}
//		
//		
//		System.out.println("=========");
		
		
		
//		Stack st = new Stack();   
//		                           //  |  ┌─>
//		                           //  V  | 
//		st.push("1");              // |  3  |
//		st.push("2");              // |  2  |
//		st.push("3");              // |  1  |
//		                           // └-----┘  Stack의 자료구조 : 1-2-3 순서로 채워지고 3-2-1순서로 비워진다
//		
//		try {                        // ┌스텍에서 하나씩 불러와서 스텍을 하나씩 비워주는 메소드(Stack구조에서 읽어오는 메소드) 
//		System.out.println((String) st.pop());
//		System.out.println((String) st.pop());
//		System.out.println((String) st.pop());
//		System.out.println((String) st.pop());
//		}catch(EmptyStackException e) {
//			System.out.println("Stack이 비어있습니다.");  //예외처리
//		}
		
		
//		while(!st.empty()){
//			System.out.println((String) st.pop());
//		}

//		ArrayList list = new ArrayList();
//
//		
//		list.add("1");  
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//				
//		//iterator (반복자 패턴)
//		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()){ //데이터 존재 유무 확인
//			String str = (String)it.next(); // 값을 가지고 오는 역할
//			System.out.println(str);
//		}
				
				
     //제네릭 : 컬렉션 객체의 데이터 타입을 한정한다.
		
		//ArrayList<E> list = new ArrayList<>();
//		ArrayList<String> list = new ArrayList<String>();
//
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		list.get(0);
//		
//		Iterator<String> it = list.iterator();
//		
//		while(it.hasNext()){ 
//			String str = it.next(); 
//			System.out.println(str);
//		}
		
		
	
    //Set : 순서 X, 중복X
	
//		HashSet set = new HashSet();
//		// └ hash: 가장 데이터를 빨리 찾을 수 있는 데이터 구조        ┐
//		// └ Set : 순서없이 데이터를 받으면서 중복을 허락하지 않음 ┘ 둘이 합쳐짐
//		
//		set.add("1"); //String 타입
//		set.add("2");
//		set.add("1"); //String 타입
//		set.add("4");
//		set.add(new Integer(1)); //데이터 타입이 달라서 중복으로 치지 않음 (int 타입)
//		
//		System.out.println(set);
		
//		for(Object obj : set) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
//		HashSet<String> set = new HashSet<String>();
//		set.add("1"); 
//		set.add("2");
//		set.add("1"); 
//		set.add("4");
//		set.add("5");
//		
//		Iterator<String> it = set.iterator();
//
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
		
		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int[][] bingo = new int [5][5];
//		
//		for(int i=0; set.size() < 25; i++) {
//			set.add((int)(Math.random()*50)+1);
//		}
//		
//		//System.out.println(set);
//		
//		ArrayList list = new ArrayList(set); // 셔플기능
//		Collections.shuffle(list);           //   " 
//		
//		Iterator<Integer> it = list.iterator();
//		
//		for(int i=0; i<bingo.length; i++) {
//			for(int j=0; j<bingo[i].length; j++) {
//				bingo[i][j] = it.next();
//			}
//		}
//		
//		for(int i=0; i<bingo.length; i++) {
//			for(int j=0; j<bingo[i].length; j++) {
//				System.out.print(bingo[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		//TreeSet : 반드시 값으로 사용되는 해당 클래스 안에는 정렬 조건이 오버라이딩 되어있어야한다.
		//implements Comparable (integer, String ....)
		
//		TreeSet<Integer> set = new TreeSet<Integer>(); //TreeSet = 값이 정렬되어진다.
//		set.add(new Integer(2));
//		set.add(2);
//		set.add(5);
//		set.add(1);
//		set.add(4);
//		set.add(3);
//		
//		System.out.println(set);
//		
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			Integer intg = (Integer)it.next();
//			System.out.println(intg);
//		}
		
		
		
		TreeSet<Student> set = new TreeSet<Student>();
		
		Student s1 = new Student("kim",1,1,10,10,10);
		Student s2 = new Student("pim",3,1,10,10,10);
		Student s3 = new Student("aim",6,1,10,10,10);
		Student s4 = new Student("sim",9,1,10,10,10);
		Student s5 = new Student("fim",4,1,10,10,10);

		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Iterator<Student> it = set.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.toString());
		}
	}
	/*
	<제네릭>
	1. 제네릭이란?
	- 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
	- 클래스를 정의 할 때는 info의 데이터 타입을 확정하지 않고 인스턴스를 생성할 때 데이터 타입을 지정하는 기능이 제네릭

	2. 제네릭을 사용하는 이유
	컴파일 단계에서 오류가 검출된다.
	중복의 제거와 타입 안전성을 동시에 추구

	3. 제네릭의 특성
	- 복수의 제네릭: 복수의 제네릭을 사용할 때는 <T, S>와 같은 형식을 사용한다. 여기서 T와 S 대신 어떠한 문자를 사용해도 된다. 하지만 묵시적인 약속(convention)이 있기는 하다.- 기본 데이터 타입과 제네릭: 제네릭은 참조 데이터 타입에 대해서만 사용할 수 있다. 기본 데이터 타입에서는 사용할 수 없다. new Integer는 기본 데이터 타입인 int를 참조 데이터 타입으로 변환해주는 역할을 한다. 이러한 클래스를 래퍼(wrapper) 클래스라고 한다.

	4. 제네릭의 생략
	5. 메소드에 적용
	6. 제네릭의 제한
	- extends
	제네릭으로 올 수 있는 데이터 타입을 특정 클래스의 자식으로 제한할 수 있다.
    */
}