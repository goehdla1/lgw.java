package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex02;

public class Ex02_Test {
	Ex02 t2;

	@Before
	public void before() {
		t2 = new Ex02();
	}

	@Test
	public void test() {
		int res = t2.mul(5, 10);
		assertEquals(50, res);
	}

	@After
	public void after() {
	}
}
