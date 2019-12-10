//package com.edu.test;
//
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.edu.core.ApiListener;
//
//@Listeners(ApiListener.class)
//public class Demo1 {
//	@Test
//	public void t1() {
//		System.out.println("hello");
//	}
//
//}
package com.edu.test;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;

@Listeners(ApiListener.class)
public class Demo1 {
//	@Test
//	public void t1() {
//		System.out.println("hello");
		
//	}
//	@Test
//	public void t2() {
//		Assert.assertEquals(1, 2);
//		
//	}

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
