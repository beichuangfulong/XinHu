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


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;

@Listeners(ApiListener.class)
public class Demo1 {
	@Test
	public void t1() {
		System.out.println("hello");
		
	}
//	@Test
//	public void t2() {
//		Assert.assertEquals(1, 2);
//		
//	}

}
