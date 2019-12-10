package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SearchSessionRecord extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
	@Test(description="搜索我的会话记录")
	public void test6(){
		webtest.click("xpath=//td[text()='个人中心']");
		webtest.click("xpath=//td[text()='我的会话记录']");
		webtest.type("xpath=//input[@placeholder='消息内容']","信息");
		
	}

}
