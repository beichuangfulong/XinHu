package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchSubApply extends BaseTest{

	public void initDemo() {
		//进入流程模块
		webtest.click("xpath=//span[@pmenuid='40']");
		//点击我的下属申请	
		webtest.click("id=menu_list_num44");
	}
		
	@Test
	public void SearchSubApply1() throws InterruptedException {
		initDemo();
		//点击待审核
		webtest.click("xpath=//button[text()='待审核']");
		//点击已审核
		webtest.click("xpath=//button[text()='已审核']");
		//点击未通过
		webtest.click("xpath=//button[text()='未通过']");
		//点击已作废
		webtest.click("xpath=//button[text()='已作废']");
		//点击待提交
		webtest.click("xpath=//button[text()='待提交']");
		//点击全部状态
		webtest.click("xpath=//button[text()='全部状态']");
	}
	
	@Test
	public void SearchSubApply2() throws InterruptedException {
		//点击全部状态
		webtest.click("xpath=//button[text()='全部状态']");
		//搜索框输入
		webtest.type("xpath=//input[contains(@id,'key')]","KA-20160826-0001");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
		//搜索框清空后输入
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]","张飞");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
		//搜索框清空后输入
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]","信呼客服");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");	
	}
}
