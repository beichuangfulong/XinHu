package com.webtest.xinhu;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Log extends BaseTest{
//
//	@BeforeClass
//	//登录
//	public void login() {
//		webtest.open("http://localhost:9999/?m=login");
//		webtest.type("name=adminuser", "admin");
//		webtest.type("xpath=//input[@type='password']", "123456");
//		webtest.click("class=webbtn");
//	}
	
	@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9999/?m=login");
		webtest.type("name=adminuser", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}

	
	@Test
	//修改系统背景色
	public void changeColor() {
		webtest.click("xpath=//*[@id=\"indexuserl\"]");
		webtest.click("xpath=/html/body/div[1]/div/ul/li[4]");
		webtest.click("xpath=//*[@id=\"content_style\"]/div/table/tbody/tr[2]/td[3]/label/div");
		webtest.click("xpath=/html/body/table/tbody/tr/td[3]/div/div[4]/div/div[2]/div/table/tbody/tr[3]/td/input");

		
	}
	
	@AfterClass
	//退出
	public void logout() {
		webtest.click("xpath=//span[@id=\"indexuserl\"]");
		webtest.click("xpath=//li[@temp=5]");
		webtest.click("xpath=//*[@id=\"confirm_btn1\"]");
		
	}
}
