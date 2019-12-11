package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
@Listeners(ApiListener.class)
public class AddXsjh extends BaseTest{
	public void InitDemo() {
		//进入客户模块
		webtest.click("xpath=//span[@pmenuid='63']");
		//点击销售机会
		webtest.click("id=menu_list_num73");
		//点击我的销售机会
		webtest.click("id=menu_list_num110");
	}
	@Test(description="添加百度客户")
	public void AddXsjh1() throws InterruptedException {		
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//选择客户
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='百度']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
        //选择来源
		webtest.click("xpath=//select[@name='laiyuan']");
		webtest.click("xpath=//option[@value='主动来访']");
		//输入金额为100
		webtest.type("name=money","100");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("百度"));	
	}
	@Test(description="不选择客户")
	public void AddXsjh2() throws InterruptedException {	
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("客户不能为空"));	
	}
	@Test(description="不选择来源")
	public void AddXsjh3() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//选择客户
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='百度']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		      
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("客户类型不能为空"));	
	}
}
