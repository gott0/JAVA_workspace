package com.package5;

import com.package4.Time;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = 10;
		//t.min = 10;
		//t.nanosec = 10;
		t.sec = 10; //셍성 관점에서는 public만 가능.
	}

}
