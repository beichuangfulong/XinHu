package com.webtest.demo;

import javax.xml.xpath.XPath;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class XinHu extends BaseTest{

	@BeforeClass
	//登录
	public void login() {
		webtest.open("http://localhost:9999/?m=login");
		webtest.type("name=adminuser", "admin");
		webtest.type("xpath=//input[@type='password']", "123456");
		webtest.click("class=webbtn");
	
		
	}
//	@Test
//	//新增员工合同
//	public void test1() {
//		webtest.click("xpath=//span[@pmenuid=27]");
//		webtest.click("xpath=//*[@id=\"menu_list_num84\"]");
//		webtest.click("xpath=//*[@id=\"menu_list_num95\"]");
//		
//		webtest.click("xpath=//button[starts-with(@id,'addbtn')]");
//		
//		webtest.click("xpath=//*[@id=\"btnchange_uname\"]");
//		
//	}
	
	@Test
	//修改系统背景色
	public void test2() {
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
