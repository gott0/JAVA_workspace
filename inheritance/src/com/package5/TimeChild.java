package com.package5;

import com.package4.Time;

public class TimeChild extends Time {
	void printAll() {
		//System.out.println(hour);
		//System.out.println(nanosec);
		System.out.println(min); //protected   //상속 관점에서는 protected와 public만 가능.
		System.out.println(sec); // public
	}
}
