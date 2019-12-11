package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
@Listeners(ApiListener.class)
public class AddPayment extends BaseTest{
	public void InitDemo() {
		//进入客户模块
		webtest.click("xpath=//span[@pmenuid='63']");
		//点击付款单
		webtest.click("id=menu_list_num118");
		//点击我的付款单
		webtest.click("id=menu_list_num107");
	}
	@Test(description="添加收款单")
	public void AddPayment1() throws InterruptedException {		
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//选择客户
		webtest.click("class=webbtn");
		webtest.click("xpath=//input[@xname='百度']");
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		//选择项目类型
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='1']");
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
	public void AddPayment2() throws InterruptedException {	
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("客户名称不能为空"));	
	}
	@Test(description="不选择类型")
	public void AddPayment3() throws InterruptedException {
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
		assertTrue(webtest.isTextPresent("类型不能为空"));	
	}
	@Test(description="不输入金额")
	public void AddPayment4() throws InterruptedException {
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
		//选择项目类型
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='1']");
	
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("金额必须大于0"));	
	}
}

