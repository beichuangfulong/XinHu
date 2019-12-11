package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class VjobDailyApply extends BaseTest{

//新增工作日报
	
	public void InitDemo() {
		//进入流程模块
		webtest.click("xpath=//span[@pmenuid='40']");
		//点击流程申请
		webtest.click("id=menu_list_num42");		
	}
	
	@Test(description="新增工作日报的申请")
	public void AddApply1() {
		InitDemo();
		//点击工作日报
		webtest.click("xpath=//a[@onclick=\"openinput('工作日报','daily',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//选择日期
		webtest.click("xpath=//*[@id=\"div_dt\"]/input");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_table')]/table/tbody/tr[3]/td[4]");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_queding')");
		//输入内容
		webtest.type("xpath=//*[@id=\"div_content\"]/textarea","好好生活");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent(""));				
	}
	
	@Test(description="新增已申请过的工作日报的申请")
	public void AddApply2() {
		InitDemo();
		//点击工作日报
		webtest.click("xpath=//a[@onclick=\"openinput('工作日报','daily',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//选择日期
		webtest.click("xpath=//*[@id=\"div_dt\"]/input");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_table')]/table/tbody/tr[3]/td[4]");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_queding')");
		//输入内容
		webtest.type("xpath=//*[@id=\"div_content\"]/textarea","好好生活");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent(""));				
	}
	
	@Test(description="新增未填写内容的工作日报的申请")
	public void AddApply3() {
		InitDemo();
		//点击工作日报
		webtest.click("xpath=//a[@onclick=\"openinput('工作日报','daily',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//选择日期
		webtest.click("xpath=//*[@id=\"div_dt\"]/input");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_table')]/table/tbody/tr[3]/td[4]");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_queding')");
		//输入内容
		webtest.type("xpath=//*[@id=\"div_content\"]/textarea","好好生活");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent(""));				
	}
	
}
