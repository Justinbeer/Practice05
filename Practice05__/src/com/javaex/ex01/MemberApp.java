package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.setId("jws");
		m1.setName("정우성");
		m1.setPoinit(50000);
		m1.memberInfo();
		
		Member m2 = new Member();
		m2.setId("yjs");
		m2.setName("유재석");
		m2.setPoinit(30000);
		m2.memberInfo();
		
		Member m3 = new Member();
		m3.setId("lhr");
		m3.setName("이효리");
		m3.setPoinit(40000);
		m3.memberInfo();
		
		
	}

}
