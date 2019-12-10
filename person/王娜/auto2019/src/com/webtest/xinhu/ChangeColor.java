package com.webtest.xinhu;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class ChangeColor extends BaseTest{
//	更换系统主题

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
		webtest.click("xpath=//div[starts-with(@id,'rockmenuli_')]/ul/li[4]");
		webtest.click("xpath=//*[@id=\"content_style\"]/div/table/tbody/tr[2]/td[1]/label/input");
		webtest.click("xpath=//*[@id=\"content_style\"]/div/table/tbody/tr[3]/td/input");

	}
	
	@AfterClass
	//退出
	public void logout() {
		webtest.click("xpath=//span[@id=\"indexuserl\"]");
		webtest.click("xpath=//li[@temp=5]");
		webtest.click("xpath=//*[@id=\"confirm_btn1\"]");
		
	}
}
