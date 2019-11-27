package com.edu.yanjie.system.basicmangement.company;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.yanjie.core.BaseTest;

public class AddCompany extends BaseTest {
	
	public void InitDemo() {
		//点击基础管理
		webtest.click("id=menu_down_isons_num220");
		//点击公司单位
		webtest.click("id=menu_list_company");
	}
	@Test(description="添加名称呵呵哒的公司")
	public void AddCompany1() {
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称为呵呵哒
		webtest.type("name=name","呵呵哒");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("呵呵哒"));				
	}
	@Test(description="不添加名称")
	public void AddCompany2() {
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//点击保存
		webtest.click("id=AltS");
		assertTrue(webtest.isTextPresent("名称不能为空"));			
	}
	@Test(description="添加已存在的名称为呵呵哒的公司")
	public void AddCompany3() {
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称
		webtest.type("name=name","呵呵哒");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
//		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("名称已存在"));				
	}
	@Test(description="添加名称<script>alert('xss攻击攻击')</script>的公司")
	public void AddCompany4() {
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称
		webtest.type("name=name","<script>alert('xss攻击攻击')</script>");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("<script>alert('xss攻击攻击')</script>"));				
	}
	@Test(description="添加名称个数为200个的公司")
	public void AddCompany5() {
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称
		webtest.type("name=name","1234567890"
				+ "1234567891"
				+ "1234567892"
				+ "1234567893"
				+ "1234567894"
				+ "1234567895"
				+ "1234567896"
				+ "1234567897"
				+ "1234567898"
				+ "1234567899"
			);
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("1234567890"
				+ "1234567891"
				+ "1234567892"
				+ "1234567893"
				+ "1234567894"
				+ "1234567895"
				+ "1234567896"
				+ "1234567897"
				+ "1234567898"
				+ "1234567899"
				));				
	}
	@Test(description="添加名称个数为200个的公司")
	public void AddCompany6() {
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称
		webtest.type("name=name","1234567890"
				+ "1234567891"
				+ "1234567892"
				+ "1234567893"
				+ "1234567894"
				+ "1234567895"
				+ "1234567896"
				+ "1234567897"
				+ "1234567898"
				+ "1234567899"
				+"1234567890"
				+ "1234567891"
				+ "1234567892"
				+ "1234567893"
				+ "1234567894"
				+ "1234567895"
				+ "1234567896"
				+ "1234567897"
				+ "1234567898"
				+ "1234567899");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent("1234567890"
				+ "1234567891"
				+ "1234567892"
				+ "1234567893"
				+ "1234567894"
				+ "1234567895"
				+ "1234567896"
				+ "1234567897"
				+ "1234567898"
				+ "1234567899"
				+"1234567890"
				+ "1234567891"
				+ "1234567892"
				+ "1234567893"
				+ "1234567894"
				+ "1234567895"
				+ "1234567896"
				+ "1234567897"
				+ "1234567898"
				+ "1234567899"));				
	}
	@Test(description="添加名称含有特殊字符（enter 空格和@·？）的公司")
	public void AddCompany7() {
		InitDemo();
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入iframe
		webtest.enterFrame("openinputiframe");
		//输入名称
		webtest.type("name=name",""
				+ "& @·？");
		//点击保存
		webtest.click("id=AltS");
		//离开iframe页面
		webtest.leaveFrame();
		//检验是否添加成功
		assertTrue(webtest.isTextPresent(""
				+ "& @·？"));				
	}



}
