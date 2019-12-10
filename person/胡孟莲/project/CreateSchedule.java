package com.webtest.project;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CreateSchedule extends BaseTest{
	@Test//(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public void login(String name,String pwd) {
		System.out.println(name+pwd);
		webtest.open("http://localhost:9090/?m=login");
		webtest.type("name=admin", name);
		webtest.type("xpath=//input[@type='password']", pwd);
		webtest.click("class=webbtn");
	}
	@Test(description="新增日程")
	//新增日程
	public void test2(){
		webtest.click("xpath=//span[@class='spanactive']");
		//点击单据提醒
		webtest.click("xpath=//td[text()='单据提醒']");
		//点击单据提醒设置
		webtest.click("xpath=//td[text()='单据提醒设置']");
		//选中一条单据提醒设置记录，点击右侧的操作
		webtest.click("xpath=//td[text()='']");
		//选择评论
		webtest.click("xpath=//td[text()='评论']");
		//输入评论
		webtest.type("xpath=//textarea[@class='input']", "输入评论的内容");
		//点击确定
		webtest.click("xpath=//td[text()='确定']");
	}
}
