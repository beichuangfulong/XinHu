package com.webtest.xinhu.reim;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;


public class TestDemo extends BaseTest{

	@Test(description="组织机构模块功能是否正常")
	public void setDemo3() throws InterruptedException {
		webtest.click("xpath=//span[@pmenuid='7']");
		webtest.click("id=menu_list_num17");
		webtest.click("xpath=//td[@row='0']");
		webtest.click("xpath=//i[@class='icon-trash']");
		webtest.click("xpath=//i[@class='icon-ok']");
}
}
