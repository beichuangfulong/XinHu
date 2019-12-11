package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class MeetingApply extends BaseTest {
	
//会议申请
	
	public void initDemo() {
		//进入流程模块
		webtest.click("xpath=//span[@pmenuid='40']");
		//点击流程申请
		webtest.click("id=menu_list_num42");		
	}
	
	@Test(description="新增会议的申请")
	public void AddApplyRepair1() throws InterruptedException{
		
		initDemo();
		//点击维修报修
		webtest.click("xpath=//a[@onclick=\"openinput('通知公告','gong',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//输入标题
		webtest.type("name=title","紧急通知");
		//选择类型名称
		webtest.click("name=typename");
		webtest.click("xpath=//*[@id=\"div_typename\"]/select/option[2]");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent(""));				
	}
	
	@Test(description="添加已存在的会议申请")
	public void AddApplyRepair2() {
		//点击维修报修
		webtest.click("xpath=//a[@onclick=\"openinput('通知公告','gong',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//输入标题
		webtest.type("name=title","紧急通知");
		//选择类型名称
		webtest.click("name=typename");
		webtest.click("xpath=//*[@id=\"div_typename\"]/select/option[2]");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
	//	assertTrue(webtest.isTextPresent("新增成功"));				
	}
	
	@Test(description="不填写标题")
	public void AddApplyRepair3() {
		initDemo();
		//点击维修报修
		webtest.click("xpath=//a[@onclick=\"openinput('通知公告','gong',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//点击保存
		webtest.click("id=AltS");
		
	}
}
