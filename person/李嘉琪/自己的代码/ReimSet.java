package com.webtest.xinhu.reim;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;

public class ReimSet extends BaseTest{
	@DataProvider(name="data1")
	public static Object[][] data() throws IOException {
		ExcelDataProvider dataProvider = new ExcelDataProvider();
		return dataProvider.getTestDataByExcel("D:\\java\\java\\auto2019\\auto2019\\src\\data\\test.xlsx", "Sheet1");
	}
	public void InitDemo() {
		webtest.click("xpath=//span[@title='REIM即时通信']");
		webtest.click("id=confirm_btn1");
		webtest.switchWidow(1);
		webtest.max();
	}
	@Test(description="打开设置提醒")
	public void setDemo1() {
		InitDemo();
		webtest.click("xpath=//span[@title='设置']");
		assertTrue(webtest.isTextPresent("[开启]"));
	}
	@Test(description="创建会话",dataProvider ="data1")
	public void setDemo2(String a1) {
		webtest.click("id=syscogshow_cancel");
		webtest.click("xpath=//div[@title='会话/群']");
		webtest.click("xpath=//span[@title='创建会话']");
		webtest.type("id=confirm_input", a1);
		webtest.click("id=confirm_btn1");
		assertTrue(webtest.isTextPresent(a1));
	}
	@Test(description="刷新reim页面")
	public void setDemo3() {
		webtest.click("xpath=//span[@title='刷新']");
		assertTrue(webtest.isTextPresent("暂无消息"));
	}
	@Test(description="组织机构模块功能是否正常")
	public void setDemo4() {
		webtest.click("xpath=//div[@title='组织结构']");
		webtest.click("xpath=//div[@onclick='reim.showdept(5,2)']");
		webtest.click("xpath=//div[@onclick='reim.openuserzl(5)']");
		webtest.click("id=userziliao_btn0");
		webtest.switchWidow(1);
		webtest.click("xpath=//a[@title='close']");
		assertTrue(webtest.isTextPresent("管理层"));
}
}
