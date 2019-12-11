package com.edu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchApply2 extends BaseTest {
	
	public void initDemo() {
		//进入流程模块
		webtest.click("xpath=//span[@pmenuid='40']");
		//点击经我处理	
		webtest.click("id=menu_list_num62");
	}
	
	@Test
	public void SearchApply201() throws InterruptedException {
		initDemo();
		//点击待审核
		webtest.click("xpath=//button[text()='待审核']");
		//搜索框输入
		webtest.type("xpath=//input[contains(@id,'key')]","信呼客服");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
		//搜索框清空后输入
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]","张飞");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
	}
	
	@Test
	public void SearchApply202() throws InterruptedException {
		initDemo();
		//点击已审核
		webtest.click("xpath=//button[text()='已审核']");
		//搜索框输入
		webtest.type("xpath=//input[contains(@id,'key')]","张飞");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
		//点击操作
		webtest.click("xpath=//*[contains(@id,'tbody')]/tr[1]/td[10]/a");
		//点击评论
		webtest.click("xpath=//*[contains(@id,'rockmenuli')]/ul/li[3]");
		//输入评论
		webtest.type("id=confirm_input", "好");
		//点击确定
		webtest.click("id=confirm_btn1");
	}
	
	@Test
	public void SearchApply203() throws InterruptedException {
		//点击全部状态
		webtest.click("xpath=//button[text()='全部状态']");
		//搜索框输入
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]","HF-20191127-0002");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
		//点击操作
		webtest.click("xpath=//*[contains(@id,'tbody')]/tr/td[10]/a");
		//点击作废申请
		webtest.click("xpath=//*[contains(@id,'rockmenuli')]/ul/li[4]");
		//输入评论
		webtest.type("id=confirm_input", "作废");
		//点击确定
		webtest.click("id=confirm_btn1");
	}
}
