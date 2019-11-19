package com.edu.core;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ApiListener.class)
public class LoginTest extends BaseTest {
	@Test	
	public void loginSuccess() {
		webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9");
		//文本框输入
		webtest.type("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "123456");
		webtest.click("name=button");
		assertTrue(webtest.isTextPresent("管理员"));
		
	}
	@Test
	public void loginFail() {
		webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9");
		//文本框输入
		webtest.type("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "abcdef");
		webtest.click("name=button");
		assertTrue(webtest.isTextPresent("管理员"));
		
	}
	

}
