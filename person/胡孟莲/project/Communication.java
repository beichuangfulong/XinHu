package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Communication extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
	@Test(description="内部通讯")
	public void test8(){
		webtest.click("xpath=//span[@class='spanactive']");
		webtest.click("xpath=//td[text()='个人中心']");
		webtest.click("xpath=//td[text()='内部通讯录']");
		webtest.click("xpath=/html/body/table/tbody/tr/td[3]/div/div[4]/div/div[2]/div/table/tbody/tr/td[3]/table/div[2]/div/table/tbody/tr[3]/td[11]");
		webtest.type("xpath=//textarea[@class='content']","发送消息给小乔");
		webtest.click("xpath=//td[text()='发送']");
	}

}
