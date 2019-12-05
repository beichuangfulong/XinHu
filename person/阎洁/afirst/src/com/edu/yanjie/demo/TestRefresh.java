package com.edu.yanjie.demo;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class TestRefresh extends BaseTest  {
	@Test
	public void doTest() throws InterruptedException {
		 //打开网页
			webtest.open("http://localhost:8888/xinhu_utf8_v1.5.9");
			//登录
			webtest.type("name=adminuser", "admin");
			webtest.type("xpath=//input[@type='password']", "123456");
			webtest.click("name=button");
			//进入系统模块
			webtest.click("xpath=//span[@pmenuid='1']");
			//点击基础管理
			webtest.click("id=menu_down_isons_num220");
			//点击公司单位
			webtest.click("id=menu_list_company");
			refreshPage();
		
	}
	

}
