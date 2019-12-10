package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class LoginDemo extends BaseTest {

	@Test
	public void LoginDemo1() throws InterruptedException {
			webtest.open("http://localhost:8016");
			//µÇÂ¼
			webtest.type("name=adminuser", "admin");
			webtest.type("xpath=//input[@type='password']", "zyl521");
			webtest.click("name=button");
		}
}
