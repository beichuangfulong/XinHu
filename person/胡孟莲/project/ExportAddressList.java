package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ExportAddressList extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
	@Test(description="导出内部通讯录")
	public void test5(){
		webtest.click("xpath=//span[@class='spanactive']");
		webtest.click("xpath=//td[text()='个人中心']");
		webtest.click("xpath=//td[text()='内部通讯录']");
		webtest.click("xpath=//td[text()='导出']");
	}

}
