package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply6 extends LoginDemo{

//申请考勤机设备
	
	public void InitDemo() {
		//进入流程模块
		webtest.click("xpath=//span[@pmenuid='40']");
		//点击流程申请
		webtest.click("id=menu_list_num42");		
	}
	
	@Test(description="新增考勤机设备的申请")
	public void AddApply1() {
		InitDemo();
		//点击考勤机设备
		webtest.click("xpath=//a[@onclick=\"openinput('考勤机设备','kqjsn',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//输入设备号
		webtest.type("name=num","19880419");
		//输入设备名称
		webtest.type("name=name","zyloooong");
		//输入公司名
		webtest.type("name=company","zylstudio");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent("19880416"+"zyloooong"+"zylstudio"));				
	}
	@Test(description="添加已存在的设备申请")
	public void AddApply2() {
		//InitDemo();
		//点击考勤机设备
		webtest.click("xpath=//a[@onclick=\"openinput('考勤机设备','kqjsn',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//输入设备号
		webtest.type("name=num","19880416");
		//输入设备名称
		webtest.type("name=name","zyloooong");
		//输入公司名
		webtest.type("name=company","zylstudio");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent("新增成功"));				
	}
	
	@Test(description="不填写设备号")
	public void AddApply3() {
	//	InitDemo();
		//点击考勤机设备
		webtest.click("xpath=//a[@onclick=\"openinput('考勤机设备','kqjsn',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//点击保存
		webtest.click("id=AltS");
//		assertTrue(webtest.isTextPresent("设备号不能为空"));			
	}
}
