package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class EnterPersonalDocmentEdit extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
	@Test(description="进入个人资料编辑页面")
	public void test4(){
		webtest.click("xpath=//span[@class='spanactive']");
		//点击个人中心
		webtest.click("xpath=//td[text()='']");
		//点击个人资料
		webtest.click("xpath=//td[text()='个人资料']");
		//点击详情
		webtest.click("xpath=//td[text()='详情']");
		//点击编辑
		webtest.click("xpath=//td[text()='编辑']");
		//选中个人资料记录
		webtest.click("xpath=/html/body/table/tbody/tr/td[3]/div/div[5]/div/div[6]/div[3]/div/table/tbody]");
		//点击编辑
		webtest.click("xpath=//td[text()='编辑']");
		//点击详情
		webtest.click("xpath=//td[text()='详情']");
		//点击操作V
		webtest.click("xpath=//td[text()='操作V']");
		//点击编辑
		webtest.click("xpath=//td[text()='编辑']");
	}

}
