package com.edu.yanjie.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.yanjie.core.ApiListener;

@Listeners(ApiListener.class)
public class TestDmeo {
	@Test(description="用例1")
	public void test1() {
		assertEquals(1, 1);
	}
	@Test(description="用例2")
	public void test2() {
		assertEquals(1, 2);
	}
	@Test(description="用例3")
	public void test3() {
		assertEquals(1, 1);
	}
	@Test(description="用例4")
	public void test4() {
		assertEquals(1, 2);
	}


}
