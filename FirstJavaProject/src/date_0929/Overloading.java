package date_0929;

public class Overloading {
	// 오버로딩: 같은 이름의 메소드를 중복하여 정의하는 것
    //  1.메소드의 이름을 동일하게 정의한다.
    //  2.단 매개변수의 타입 또는 갯수는 달라야한다.
    //  3.리턴타입과는 무관하다.(리턴값만을 다르게 갖는 오버로딩은 작성 할 수 없다)
    //  4.객체의 다형을 구현한 형식.
                		
    void add() {}

    void add(int x) {}//이름이 같으면 안되지만 매개변수로 구분해 줌

    void add(long l) {}//이름이 같으면 안되지만 매개변수의 타입으로 구분해 줌

    void add(int x, int y) {}
                		
    void add(int x, long y) {}
                		
    void add(long x, int y) {} //매개변수 타입의 자리가 바껴도 가능
                		
    //int add() {}  -> 리턴타입은 달라도 구분이 안됨 (void - int)
                		
 }
