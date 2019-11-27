package com.edu.yanjie.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.yanjie.core.ApiListener;
import com.edu.yanjie.core.BaseTest;

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
