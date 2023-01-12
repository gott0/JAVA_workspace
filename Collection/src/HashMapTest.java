import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		       //  ┌key: 중복 안 됨
		       //  |      ┌value: 중복가능(int타입도 가능하지만 제네릭으로 String고정)
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // key 중복 시 항상 마지막 key의 value가 출력 됨
		
		//keySet() : 키값 전체를 반환한다.
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
//        └ keySet()으로 반환 된 키값들을 읽어온다.(keySet()은 키값을 분류,iterator()은 그런 키값들을 읽는 역할)
		
		/*Iterator는 자바의 컬렉션 프레임워크에서 컬렉션(Set, List, Map)에 저장되어 있는 요소들을 읽어오는 방법을 표준화한 것이다.
		  
		  hasNext() : 읽어올 요소가 남아있는지 확인하는 메소드이다. 요소가 있으면 true, 없으면 false
		     next() : 다음 데이터를 반환한다.
		   remove() : next()로 읽어온 요소를 삭제한다.*/
	
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		
		for(String key: map.keySet()){// 향상된 for문을 활용한 방법
			System.out.println(key);
		}
		
		System.out.println("=====================");
		
		//values() : values 전체를 반환한다.
		Collection<String> values = map.values();
		Iterator<String> itV = values.iterator();

		while(itV.hasNext()) {
			String value = itV.next();
			System.out.println(value);
		}
		
		System.out.println("=====================");
		
		       // ┌ key,value를 모두 반환  = Map.Entry<>
		Set<Map.Entry<String,String>> entry = map.entrySet();
		Iterator<Map.Entry<String,String>> itE = entry.iterator();
		
		while(itE.hasNext()) {     //  ┌ key, value의 주소값
			Map.Entry<String, String> ent = itE.next();
			String key = ent.getKey();
			String value = ent.getValue();
			
			System.out.println("[key]" + key +", [value]" + value);
		}
		
		System.out.println("=====================");

		for(Map.Entry<String, String> ent : map.entrySet()){ // 향상된 for문을 활용한 방법
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]" + key +", [value]" + value);
		}
		
//		System.out.println(map);
//		
//		Scanner sc = new Scanner (System.in);
//		
//		while(true) {
//			System.out.println("아이디 입력: ");
//			String id = sc.next();
//			
//			System.out.println("비번 입력: ");
//			String password = sc.next();
//			
//			//get(key) -> value값 반환
//			//get("myid") -> "1234"
//			//containKey(key) -> 존재유무 확인(truw,false)
//			
//			if(!map.containsKey(id)) {
//				System.out.println("아이디가 존재하지 않습니다. 다시입력");
//				continue;
//			}else {   //┌value을 받아옴(문자열)
//				if(!(map.get(id)).equals(password)) { // => String타입의 비교는 .equals()사용
//					System.out.println("비번이 존재하지 않습니다. 다시입력");
//				}else {
//					System.out.println("로그인 성공");
//					break;
//				}
//			}
//		} //while end
		
//		map.remove("myid");
//		System.out.println(map);
		
		
		
		
		/*Iterator

		- Vector<E>, ArrayList<E>,LinkedList<E> 가 상속받는 인터페이스 
		-리스트 구조의 컬렉션에서 요소의 순차검색을 위한 메소드 포함
		- iterator()를 호출하면 iterator 객체 반환
		-자바의 컬렉션에 저장되어 있는 요소들을 읽어오는 방법의 인터페이스
		즉 쉽게 컬렉션으로부터 정보를 얻어내는 인터페이스 이다.
	 
		iterator를 쉽게 비유한 것이 있다.
		-우리가 책을 보관하는 책장(컬렉션)이 있고, 그곳에는 책(컬렉션 안에 들어갈 객체)이 있다.
		-이 책장은 도서관 사서(iterator)가 관리한다. 
		-사서는 단순 무식한 녀석이라 책장 처음부터 끝까지 한번에 하나씩 밖에 못가져 온다. 

		iterator method
		1) hasNext(): 다음 요소에 읽어 올 요소가 있는지 확인 하는 메소드 있으면 true, 없으면 false 를 반환한다.
		2) next(): 다음 요소를 가져온다. 
		3) remove(): next()로 읽어온 요소를 삭제한다.
		메소드의 호출 순서는 hasNext() -> next() -> remove() 이다.*/
		
	} //main end

}//class end