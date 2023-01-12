package date_0929;

public class Car1 {
	//속성
	String color;
	String gearType;
	int door;
	
	//생성자: 멤버변수(인스턴스)를 초기화 한다.
	//      클래스의 이름과 동일하게 작성한다. (대소문자도 같게)
	//      객체를 생성하는 시점에 한번만 호출되어진다.
	//      기본생성자는 생략 가능.(다른 생성자가 없을 떄)
	//      생성자 오버로딩 
	//      모든 클래스는 생성자를 포함하안다
	//      this / this() 활용 가능 - [static 메소드에서는 this사용 불가능]
	
	
//	  Car1(){  //생성자
//		color = "blue";
//		gearType = "manual"; //실행문
//		door = 3;
//	}// => 기본생성자(역할 없을 시 생략)
//	
//         // ┌이렇게 매개 변수가 있을 시 기본 생성자가 아니게 된다.
//	  Car1(String c){  
//		color = c;
//	}
//	
//    Car1(String c, String g){  
//    	color = c;
//    	gearType = g;
//	}
//	           // ┌ 임상 시 변수 c에 대입되는 정확한 데이터를 유추하기 힘들 수 있다.
	           // │ 여기서 color의 데이터를 받기 때문에 알아보기 편하도록 변수명을 color라고 조정 시 
	           // │ 지역변수와 멤버변수의 변수명이 같아진다.그를 방지하기 위해 this.를 앞에 붙여 멤버변수임을 나타내준다.
//    Car1(String c, String g, int d){  
//    	color = c;
//    	gearType = g;
//    	door = d;
//	}// 오버로딩 가능
  
	
//	this활용: (바로 위에 언급된 문제점 해결가능)
//	
//	            // ┌지역변수
//    Car1(String color){  
//		this.color = color;
//	}    //  └ 멤버변수  => 지역변수와 멤버변수의 이름이 같기 때문에
//       //             "this."을 앞에 붙여 구분 (this는  멤버변수의 셋팅)  
//    
//    Car1(String color,String gearType){  
//		this.color = color;
//		this.gearType = gearType;
//	}
//    
//    Car1(String color,String gearType,int door){  
//    	this.color = color;
//		this.gearType = gearType;
//		this.door = door;
//	}
    
    
//	this() 활용: 
	
    Car1(String color){  
		this(color ,"Auto");  // this() => 다른 생성자의 호출
		//this.color = color;
	} 
    
    Car1(String color,String gearType){  
    	this(color,gearType,4);
    	//this.color = color;
		//this.gearType = gearType;
	}
    
    Car1(String color,String gearType,int door){  
    	this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
  
    //호출: 함수를 사용하기 위해 인자를 전달한다는 의미
    
    //따라서 위의 예시의 경우 제일 상위의 두 함수만 놓고 봤을 때  (color ,"Auto")가 (String color,String gearType)를 호출
    //그로인해 (color,gearType,4)로 도출되어 실직적인 값은 (color,"Auto",4)가 된다
    
	//메소드
	
}
