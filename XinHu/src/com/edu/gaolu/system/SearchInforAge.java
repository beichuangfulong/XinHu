package com.edu.gaolu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchInforAge extends BaseTest {
	
//知识信息管理	

	public void initDemo() {	
		//进入资源模块
		webtest.click("xpath=//span[@pmenuid='19']");
		//点击知识信息管理
		webtest.click("id=menu_list_num134");
	}
	
	@Test(description="搜索知识信息")
	public void AddKnow1() throws InterruptedException {
		initDemo();
		//搜索框输入
		webtest.type("xpath=//input[@class='form-control']","嗯呐");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
	}
	
	@Test(description="新增知识")
	public void AddKnow2() throws InterruptedException {
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//输入标题
		webtest.type("xpath=//*[@id=\"div_title\"]/input", "知识");
		//选择对应分类
		webtest.click("xpath=//*[@id=\"div_typeid\"]/select/option[2]");
		//输入排序
		webtest.type("xpath=//*[@id=\"div_sort\"]/input", "1");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
	}
	
	@Test(description="新增未填写排序的知识")
	public void AddKnow3() throws InterruptedException {
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//输入标题
		webtest.type("xpath=//*[@id=\"div_title\"]/input", "知识");
		//选择对应分类
		webtest.click("xpath=//*[@id=\"div_typeid\"]/select/option[2]");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
	}
	
	@Test(description="新增未填写标题的知识")
	public void AddKnow4() throws InterruptedException {
		//点击新增
		webtest.click("xpath=//button[@class='btn btn-primary']");
		//点击进入frame
		webtest.enterFrame("openinputiframe");
		//选择对应分类
		webtest.click("xpath=//*[@id=\"div_typeid\"]/select/option[2]");
		//输入排序
		webtest.type("xpath=//*[@id=\"div_sort\"]/input", "1");
		//点击保存
		webtest.click("id=AltS");
		//离开frame页面
		webtest.leaveFrame();
	}
	
}
