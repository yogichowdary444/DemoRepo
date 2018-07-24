package com.automation.mq;

public class A {
	
	public void m1(){
		
		System.out.println("m1");
	}
	
	static void m2(){
		A a = new A();
		a.m1();
		
	}

}
