package com.edu.gaolu.system;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class SearchApply1 extends BaseTest {

	public void initDemo() {
		//进入流程模块
		webtest.click("xpath=//span[@pmenuid='40']");
		//点击我的申请	
		webtest.click("id=menu_list_applymy");
	}
	
	@Test
	public void SearchApply101() throws InterruptedException {
		initDemo();
		//点击选择模块下拉框
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//选择物品领用
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[1]/option[1]");
		//点击待审核
		webtest.click("xpath=//button[text()='待审核']");
		//搜索框输入
		webtest.type("xpath=//input[contains(@id,'key')]","CD-20191202-0001");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");	
	}
	
	@Test
	public void SearchApply102() throws InterruptedException {
		initDemo();
		//点击选择模块下拉框
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//选择维修报修
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[1]/option[5]");
		//输入空值
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]", "");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
		//点击已作废
		webtest.click("xpath=//button[text()='已作废']");
		//搜索框输入
		webtest.type("xpath=//input[contains(@id,'key')]","WX-20191204-0001");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");	
	}
	
	@Test
	public void SearchApply103() throws InterruptedException {
		initDemo();
		//点击选择模块下拉框
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//选择请假条
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[3]/option[1]");
		//输入空值
		webtest.typeAndClear("xpath=//input[contains(@id,'key')]", "");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
		//点击已审核
		webtest.click("xpath=//button[text()='已审核']");
	}
	
}
