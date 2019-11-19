package com.webtest.demo;

import static org.testng.Assert.assertTrue;
import com.webtest.core.ApiListener;
import com.webtest.core.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ApiListener.class)
public class LoginTest extends BaseTest {
	@Test	
	public void loginSuccess() {
		webtest.open("http://localhost/xinhu");
		//文本框输入
		webtest.type("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "123456");
		webtest.click("name=button");
		assertTrue(webtest.isTextPresent("管理员"));
		
	}
	@Test
	public void loginFail() {
		webtest.open("http://localhost/xinhu");
		//文本框输入
		webtest.type("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "abcdef");
		webtest.click("name=button");
		assertTrue(webtest.isTextPresent("管理员"));
		
	}

}
