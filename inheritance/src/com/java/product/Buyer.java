package com.java.product;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) { // Tv, Computer, Audio 자식타입 객체를 값으로 받을 수 있다.(Product가 타입의 공통분모개념)
		if(money < p.price) {
			System.out.println("금액이 부족합니다.");
			return;			
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
				System.out.println(p.toString()+"구매완료");
	}
	
	
}

//Product p = new Tv() // 사용 가능한 멤버 갯수 2개
//Tv t = new Tv()      // 사용 가능한 멤버 갯수 2개