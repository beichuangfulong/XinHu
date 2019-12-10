package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class EmailSettings extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	
	@Test(description="邮箱设置")
	public void test7(){
		webtest.click("xpath=//span[@class='spanactive']");
		webtest.click("xpath=//td[text()='邮件']");
		webtest.click("xpath=//td[text()='邮箱设置']");
		//输入我邮箱
		webtest.type("xpath=/html/body/div/div[2]/form/table/tbody/tr/td[2]/input","2724702423@qq.com");
		//输入我邮箱密码
		webtest.type("xpath=/html/body/div/div[2]/form/table/tbody/tr[2]/td[2]/input", "123456");
		webtest.click("xpath=//td[text()='确定']");
		
	}

}
