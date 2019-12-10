package com.edu.system;

import org.testng.annotations.Test;

public class SearchApply1 extends LoginDemo {

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
		//选择物品领用
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[1]/option[1]");
		//点击选择模块下拉框
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//选择物品采购
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[1]/option[2]");
		//点击选择模块下拉框
		webtest.click("xpath=//select[contains(@id,'mode')]");
		//选择请假条
		webtest.click("xpath=//select[contains(@id,'mode')]/optgroup[3]/option[1]");
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
		//搜索框输入
		webtest.type("xpath=//input[contains(@id,'key')]","KA-20160815-0001");
		//点击搜索
		webtest.click("xpath=//button[@click='search']");
		
//		WebElement element=webtest.FindElement("xpath=//button[@click='search']");
//		assertTrue(webtest.isTextPresent("OOK"));	
	}
}
