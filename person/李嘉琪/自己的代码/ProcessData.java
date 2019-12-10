package com.webtest.xinhu.reim;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ProcessData extends BaseTest{
	public void InitDemo() {
		webtest.click("xpath=//span[@pmenuid='7']");
		webtest.click("id=menu_list_num24");
	}
	@Test(description="数据新增")
	public void dataAdd1() throws InterruptedException {
		InitDemo();
		webtest.doubleClick("xpath=//td[@row='0']");
		webtest.click("xpath=//i[@class='icon-plus']");
		webtest.type("xpath=//input[@name='name']", "哈哈");
		webtest.type("xpath=//input[@name='num']", "嘿嘿");
		webtest.click("xpath=//input[@name='sort']");
		webtest.click("xpath=//i[@class='icon-save']");
		assertTrue(webtest.isTextPresent("哈哈"));
	}
	@Test(description="数据新增只填名称")
	public void dataAdd2() throws InterruptedException {
		webtest.doubleClick("xpath=//td[@row='0']");
		webtest.click("xpath=//i[@class='icon-plus']");
		webtest.type("xpath=//input[@name='name']", "略略略");
		webtest.click("xpath=//input[@name='sort']");
		webtest.click("xpath=//i[@class='icon-save']");
		assertTrue(webtest.isTextPresent("略略略"));
	}
	@Test(description="数据删除")
	public void dataDelete() throws InterruptedException {
		webtest.doubleClick("xpath=//td[@row='12']");
		webtest.click("xpath=//i[@class='icon-trash']");
		webtest.click("xpath=//i[@class='icon-ok']");
		assertTrue(webtest.isTextPresent("人事选项"));
	}
}
