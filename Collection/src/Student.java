import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student implements Comparable {

	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAvg() {
		return getTotal() / 3.0f;
	}

	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return this.ban - tmp.ban;  // 오름차순 // 0:같은 값 , 양수 : 앞에 값이 큰 값 , 음수: 뒷에 값이 큰 값
			//return tmp.ban - this.ban;  // 내립차순 
		}
		
		return -1;
	}
}