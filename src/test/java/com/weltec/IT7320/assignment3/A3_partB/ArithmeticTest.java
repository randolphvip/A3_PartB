package com.weltec.IT7320.assignment3.A3_partB;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArithmeticTest {
	Arithmetic obj =null;
	int x,y, expect, actual;
	@Before
	public void setUp() throws Exception {
		obj = new Arithmetic(10,12);
		actual=obj.add(x, y);
		expect= x+y;
	}
	@Test
	public final void test2() {
		assertEquals(expect,actual);
		assertEquals(expect,actual);
	}
	@Test
	public final void test3() {
		assertEquals(expect,actual);
	}
	@Test
	public final void test4() {
		assertEquals(expect,actual);
	}
	@Test
	public final void test5() {
		assertEquals(expect,actual);
	}
	@Test
	public final void test6() {
		assertEquals(expect,actual);
	}
	@Test
	public final void test7() {
		assertEquals(expect,actual);
	}
	@Test
	public final void test8() {
		assertEquals(expect,actual);
	}


	@After
	public void tearDown() throws Exception {
		Arithmetic obj =null;
	}

	
}
