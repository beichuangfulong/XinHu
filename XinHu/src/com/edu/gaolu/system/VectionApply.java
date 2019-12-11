package com.edu.gaolu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class VectionApply extends BaseTest{
	
//新增外出出差	
	
	public void InitDemo() {
		//进入流程模块
		webtest.click("xpath=//span[@pmenuid='40']");
		//点击流程申请
		webtest.click("id=menu_list_num42");		
	}
	
	@Test(description="新增外出出差的申请")
	public void AddApply1() {
		InitDemo();
		//点击外出出差
		webtest.click("xpath=//a[@onclick=\"openinput('外出出差','waichu',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//输入地址
		webtest.type("xpath=//*[@id=\"div_address\"]/input", "南二环东路20号");
		//选择外出时间
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_happendt\"]/input");
		//选择预计回岗
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_intime\"]/input");
		//输入外出理由
		webtest.type("xpath=//*[@id=\"div_reason\"]/input","好好工作");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent(""));				
	}
	
	@Test(description="新增已存在的外出出差的申请")
	public void AddApply2() {
		//点击外出出差
		webtest.click("xpath=//a[@onclick=\"openinput('外出出差','waichu',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//输入地址
		webtest.type("xpath=//*[@id=\"div_address\"]/input", "南二环东路20号");
		//选择外出时间
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_happendt\"]/input");
		//选择预计回岗
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_intime\"]/input");
		//输入外出理由
		webtest.type("xpath=//*[@id=\"div_reason\"]/input","好好工作");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent(""));				
	}
	
	@Test(description="新增未填写外出理由的外出出差的申请")
	public void AddApply3() {
		//点击外出出差
		webtest.click("xpath=//a[@onclick=\"openinput('外出出差','waichu',0)\"]");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//输入地址
		webtest.type("xpath=//*[@id=\"div_address\"]/input", "南二环东路20号");
		//选择外出时间
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_happendt\"]/input");
		//选择预计回岗
		webtest.runJs2("arguments[0].removeAttribute('readonly')", "xpath=//*[@id=\"div_intime\"]/input");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
		//检验是否添加成功
//		assertTrue(webtest.isTextPresent(""));				
	}
}
