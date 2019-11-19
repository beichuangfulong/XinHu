package com.webtest.demo;

import com.webtest.core.BaseTest;

public class Admin_Login  extends BaseTest{
	
	@Test
	public void testLogin() {
		//打开页面
		webtest.open("http://www.roqisoft.com/zhsx/");
		//文本框输入
		webtest.type("name=username", "humenglian");
		webtest.type("name=password", "123456");
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("退出"));
	}

	private void assertTrue(boolean textPresent) {
		// TODO Auto-generated method stub
		
	}

}
