package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DeleteSessionRecord extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
	@Test(description="删除我的会话记录")
	//删除我的会话记录
	public void test1(){
		webtest.click("xpath=//span[@class='spanactive']");
		//个人中心
		webtest.click("xpath=//td[text()='个人中心']");
		//我的会话记录
		webtest.click("xpath=//td[text()='我的会话记录']");
		//选中记录
		webtest.click("xpath=/html/body/table/tbody/tr/td/div/div]");
		//点击删除
		webtest.click("xpath=//td[text()='删除']");
		//点击确定
		webtest.click("xpath=//td[text()='确定']");
	}
	
}