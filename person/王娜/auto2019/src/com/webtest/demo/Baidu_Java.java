package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Baidu_Java extends BaseTest{

	@Test
	public void baidu() {
		webtest.open("https://www.baidu.com/");
	
		webtest.type("name=wd", "java");
		webtest.click("id=su");

	}
}
