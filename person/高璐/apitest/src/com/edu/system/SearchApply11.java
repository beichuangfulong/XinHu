package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply11 extends LoginDemo{

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
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_now')");
		//选择截止日期
		webtest.click("xpath=//*[@id=\"div_enddt\"]/input");
		webtest.click("xpath=//*[contains(@id,'rockdatepicker_table']/table/tbody/tr[3]/td[4]");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_queding')");
		//输入内容
		webtest.type("xpath=//*[@id=\"div_content\"]/textarea","好好生活");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent("19880416"+"zyloooong"+"zylstudio"));				
	}
	
/*	@Test(description="新增外出出差的申请")
	public void AddApply2() {
		InitDemo();
		//点击外出出差
		webtest.click("xpath=//a[@onclick=\"openinput('外出出差','waichu',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//输入地址
		webtest.type("xpath=//*[@id=\"div_address\"]/input", "南二环东路20号");
		//选择外出时间
		webtest.click("xpath=//*[@id=\"div_outtime\"]/input");
//		webtest.click("xpath=//*[contains(@id,'rockdatepicker_now']");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_now')");
		//选择预计回岗
		webtest.click("xpath=//*[@id=\"div_intime\"]/input");
		webtest.click("xpath=//*[contains(@id,'rockdatepicker_table']/table/tbody/tr[3]/td[4]");
		webtest.click("xpath=//input[contains(@id,'rockdatepicker_queding')");
		//输入外出理由
		webtest.type("xpath=//*[@id=\"div_reason\"]/input","好好工作");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent("19880416"+"zyloooong"+"zylstudio"));				
	}
*/	
}
