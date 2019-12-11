package com.edu.zmj.task;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.core.ApiListener;
import com.edu.core.BaseTest;
@Listeners(ApiListener.class)
public class AddTask extends BaseTest{
	public void InitDemo() {
		//进入任务模块
		webtest.click("xpath=//span[@pmenuid='66']");
		//点击我的任务
		webtest.click("id=menu_list_num68");
	}
	@Test(description="添加名称111的任务")
	public void AddProject1() throws InterruptedException {		
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//选择类型
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='bug']");
		//选择等级
		webtest.click("xpath=//select[@name='grade']");
		webtest.click("xpath=//option[@value='低']");
		//输入标题为111
		webtest.type("name=title","111");
		//点击保存
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		assertTrue(webtest.isTextPresent("111"));	
	}
	@Test(description="不添加标题")
	public void AddProject2() throws InterruptedException {	
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//点击保存
		webtest.click("id=AltS");
		assertTrue(webtest.isTextPresent("标题不能为空"));
		//离开iframe页面

	}
	@Test(description="不选择类型")
	public void AddProject3() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入标题为111
		webtest.type("name=title","111");		
		//点击保存
		webtest.click("id=AltS");
		assertTrue(webtest.isTextPresent("类型不能为空"));
	}
	@Test(description="不选择等级")
	public void AddProject4() throws InterruptedException {
		refreshPage();
		InitDemo();		
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入标题为111
		webtest.type("name=title","111");
		//选择类型
		webtest.click("xpath=//select[@name='type']");
		webtest.click("xpath=//option[@value='bug']");
		//点击保存
		webtest.click("id=AltS");
		assertTrue(webtest.isTextPresent("等级不能为空"));
	}
}