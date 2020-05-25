package com.ict.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.test;

public class Test_Main {
	test t1;

	@Before
	public void Before() {
		System.out.println("실행 클래스를 객체 생성하자.");
		t1 = new test();
	}

	@Test
	public void addTest() {
		int res = t1.add(10, 20);
		assertEquals(30, res);
	
		res = t1.sub(20, 10);
		assertEquals(4, res);
	
	}

	@After
	public void after() {
		System.out.println("테스트 실행 후 메소드 실행.");
	}
}
