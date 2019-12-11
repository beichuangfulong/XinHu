package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
@Listeners(ApiListener.class)
public class AddCustomer extends BaseTest{
	public void InitDemo() {
		//进入客户模块
		webtest.click("xpath=//span[@pmenuid='63']");
		//点击客户
		webtest.click("id=menu_list_num64");
		//点击我的客户
		webtest.click("id=menu_list_num112");
	}
	@Test(description="添加名称111的客户")
	public void AddCustomer1() throws InterruptedException {		
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");

		//输入名称为111
		webtest.type("name=name","111");
		//选择客户类型
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='互联网']");
		//选择来源
		webtest.click("xpath=//select[@name='laiyuan']");
		webtest.click("xpath=//option[@value='网上开拓']");
		//输入地址为111
		webtest.type("name=address","111");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("111"));	
	}
	@Test(description="不添加名称")
	public void AddCustomer2() throws InterruptedException {	
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("名称不能为空"));	
	}
	@Test(description="不选择客户类型")
	public void AddCustomer3() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称为111
		webtest.type("name=name","111");
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("客户类型不能为空"));	
	}
	@Test(description="不选择来源")
	public void AddCustomer4() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称为111
		webtest.type("name=name","111");
		//选择客户类型
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='互联网']");
		
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("来源不能为空"));	
	}
	@Test(description="不选择地址")
	public void AddCustomer5() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称为111
		webtest.type("name=name","111");
		//选择客户类型
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='互联网']");
		//选择来源
		webtest.click("xpath=//select[@name='laiyuan']");
		webtest.click("xpath=//option[@value='网上开拓']");
		//点击保存
		webtest.click("id=AltS");
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("地址不能为空"));	
	}
}
