package date_0929;

public class Car1Test {

	public static void main(String[] args) {
//		Car1 c1 = new Car1();// 객체가 생성되는 시점에 생성자가 호출 됨.
//		                   
//		c1.color = "red";
//		c1.gearType = "Auto";
//		c1.door = 4;
//		
//		System.out.println(c1.color);
//		System.out.println(c1.gearType);
//		System.out.println(c1.door);
//		
//		               //  ┌ 매개 변수가 있는 생성자가 있을 때, ()에 인자가 없이 객체를 만들고 싶을 땐 
//		               //  │ class에서 기본생성자를 명시적으로(임의로) 선언(만들어)해준다.
//		Car1 c2 = new Car1( );
//		
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//		System.out.println(c2.door);
		                  // ┌기본 생성자가 생략되고 매개변수가 있는 생성자가 최초로 존재할 시 ()안에는 반드 시 인자가 있어야 됨
		Car1 c3 = new Car1("red");
		System.out.println(c3.color);
		System.out.println(c3.gearType);
		System.out.println(c3.door);
	
	
		Car1 c4 = new Car1("blue" , "auto");
		System.out.println(c4.color);
		System.out.println(c4.gearType);
		System.out.println(c4.door);
	
		System.out.println();
		
		Car1 c5 = new Car1("yellow" , "auto" , 3);
		System.out.println(c5.color);
		System.out.println(c5.gearType);
		System.out.println(c5.door);
	}
	

}
