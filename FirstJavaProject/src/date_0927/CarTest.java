package date_0927;

public class CarTest {

	public static void main(String[] args) {
		Car[] car = new Car[3];
		
		for(int i=0; i<car.length;i++) {
			car[i] = new Car();
		}
		
		car[0].a = "GV80";
		car[0].b = "흰색";
		car[0].c = 7;
		car[0].d = 4;
		car[0].e = 180;
		car[0].f = 100;
		car[0].g = 500;
		car[0].h = 1.8;
		car[0].i = 11.8;
		car[0].j = 5;
		
		car[1].a = "EV6";
		car[1].b = "검정";
		car[1].c = 4;
		car[1].d = 4;
		car[1].e = 180;
		car[1].f = 50;
		car[1].g = 300;
		car[1].h = 1.3;
		car[1].i = 5.6;
		car[1].j = 1;
		
		car[2].a = "콰트로포르테";
		car[2].b = "파랑";
		car[2].c = 4;
		car[2].d = 4;
		car[2].e = 221;
		car[2].f = 80;
		car[2].g = 400;
		car[2].h = 1.5;
		car[2].i = 7.4;
		car[2].j = 6;
		
		for(Car C : car) {
			System.out.println("차종:"+C.a+", 차 색:"+C.b+", 탑승인원:"+C.c+"명"+", 바퀴 수:"+C.d+"개"+"+, 최대시속:"+C.e+"Km"+", 트렁크의 크기:"+C.f+"L"+", 차의 무게:"+C.g+"Kg"+", 차의 전장:"+C.h+"m"+", 연비:"+C.i+"km/L"+", 연료통 크기:"+C.j+"L");		
		}
		
		
		

	}

}
