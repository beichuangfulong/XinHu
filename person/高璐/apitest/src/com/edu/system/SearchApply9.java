package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply9 extends LoginDemo{

	public void initDemo() {
		//进入流程模块
		webtest.click("xpath=//span[@pmenuid='40']");
		//点击我的申请	
		webtest.click("id=menu_list_applymy");
	}
	@Test
	public void SearchApply() throws InterruptedException {
		initDemo();
		//点击选择模块下拉框
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//选择任务
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[2]/option[1]");
		//点击已审核
		webtest.click("xpath=//button[text()='已审核']");
		//搜索框输入
		webtest.type("xpath=//input[contains(@id,'key')]","XW-20170406-0001");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
		//点击操作
		webtest.click("xpath=//*[contains(@id,'tbody')]/tr/td[10]/a");
		//点击评论
		webtest.click("xpath=//*[contains(@id,'rockmenuli')]/ul/li[3]");
		//输入评论
		webtest.type("id=confirm_input", "好");
		//点击确定
		webtest.click("id=confirm_btn1");
	}
	
/*	@Test
	public void SearchApply1() throws InterruptedException {
		SearchApply();
		//选中
		webtest.click("xpath=//tbody[contains(@id,'tbody')]/tr");
		//选择详情
		webtest.click("xpath=//button[contains(@id,'xiang')]");
		//输入说明
		webtest.type("id=other_explain","ok");
		//点击提交
		webtest.click("id=spage_btn");
	}*/
}
